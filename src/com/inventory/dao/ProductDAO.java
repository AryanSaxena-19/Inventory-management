
package com.inventory.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.inventory.database.ConnectionFactory;
import com.inventory.dto.ProductDTO;

public class ProductDAO {
    java.sql.Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs1 = null;
    Statement stmt1 = null;
    ResultSet rs = null;

    Stocks stocks = null;

    public ProductDAO() {
        try {
            con = new ConnectionFactory().getConnection();
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            stocks = new Stocks();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getSuppliersInfo() {
        try {
            String query = "SELECT * FROM suppliers";
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getCustomersInfo() {
        try {
            String query = "SELECT * FROM customers";
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getProductInfo() {
        try {
            String query = "SELECT * FROM currentstocks";
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getProductsName() {
        try {
            String query = "SELECT * FROM products";
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public Double getProductCostPrice(String productCodeTxt) {
        Double costPrice = null;
        try {
            String query = "SELECT costprice FROM products WHERE productcode='" + productCodeTxt + "'";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                costPrice = rs.getDouble("costprice");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return costPrice;
    }

    public Double getProductSellingPrice(String productCodeTxt) {
        Double sellingPrice = null;
        try {
            String query = "SELECT sellingprice FROM products WHERE productcode='" + productCodeTxt + "'";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                sellingPrice = rs.getDouble("sellingprice");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sellingPrice;
    }

    String supplierCode;

    public String getSupplierCode(String suppliersName) {
        try {
            String query = "SELECT suppliercode FROM suppliers WHERE fullName='" + suppliersName + "'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                supplierCode = rs.getString("suppliercode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return supplierCode;
    }


    String productCode;

    public String getProductCode(String productsName) {
        try {
            String query = "SELECT productcode FROM products WHERE productname='" + productsName + "'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                productCode = rs.getString("productcode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productCode;
    }

    String customerCode;

    public String getCustomerCode(String customersName) {
        try {
            String query = "SELECT customercode FROM customers WHERE fullName='" + customersName + "'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                customerCode = rs.getString("customercode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerCode;
    }

    public void addProductDAO(ProductDTO productdto) {
        try {
            String query = "SELECT * FROM products WHERE productname='" + productdto.getProductName()
                    + "' ANDcostprice='" + productdto.getCostPrice() + "' AND sellingprice='"
                    + productdto.getSellingPrice() + "' AND brand='" + productdto.getBrand() + "'";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Same Product has already been added1");
            } else {
                addFunction(productdto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addFunction(ProductDTO productdto) {
        try {
            String productCode = null;
            String oldProductCode = null;
            String quer1 = "SELECT * FROM products";
            rs = stmt.executeQuery(quer1);
            if (!rs.next()) {
                productCode = "prod" + "1";
            } else {
                String quer2 = "SELECT * FROM products ORDER by pid DESC";
                rs = stmt.executeQuery(quer2);
                if (rs.next()) {
                    oldProductCode = rs.getString("productCode");
                    Integer pcode = Integer.parseInt(oldProductCode.substring(4));
                    pcode++;
                    productCode = "prod" + pcode;
                }
            }
            String q = "INSERT INFO products VALUES(null, ?,?,?,?,?)";
            pstmt = (PreparedStatement) con.prepareStatement(q);
            pstmt.setString(1, productCode);
            pstmt.setString(2, productdto.getProductName());
            pstmt.setDouble(3, productdto.getCostPrice());
            pstmt.setDouble(4, productdto.getSellingPrice());
            pstmt.setString(5, productdto.getBrand());

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfukkky! Now you can purchase the product..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPurchaseDAO(ProductDTO productdto) {

        try {
            String q = "INSERT INTO purchaseinfo VALUES(null,?,?,?,?,?)";
            pstmt = (PreparedStatement) con.prepareStatement(q);
            pstmt.setString(1, productdto.getSupplierCode());
            pstmt.setString(2, productdto.getProductCode());
            pstmt.setString(3, productdto.getDate());
            pstmt.setInt(4, productdto.getQuantity());
            pstmt.setDouble(5, productdto.getTotalCost());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String productCode = productdto.getProductCode();
        if (stocks.checkStock(productCode, stmt) == true) {
            try {
                String q = "UPDATE currentstocks SET quantity=quantity? WHEREproductcode=?";
                pstmt = (PreparedStatement) con.prepareStatement(q);
                pstmt.setDouble(1, productdto.getQuantity());
                pstmt.setString(2, productdto.getProductCode());

                pstmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (stocks.checkStock(productCode, stmt) == false) {
            try {
                String q = "INSERT INTO currentstocks VALUES(?,?)";
                pstmt = (PreparedStatement) con.prepareStatement(q);

                pstmt.setString(1, productdto.getProductCode());
                pstmt.setInt(2, productdto.getQuantity());
                pstmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        stocks.deleteStock(stmt);
    }

    public void editProductDAO(ProductDTO productdto) {
        try {
            String query = "UPDATE products SET productname=?,costprice=?,sellingprice=?,brand=? WHEREproductcode=?";
            pstmt = (PreparedStatement) con.prepareStatement(query);
            pstmt.setString(1, productdto.getProductName());
            pstmt.setDouble(2, productdto.getCostPrice());
            pstmt.setDouble(3, productdto.getSellingPrice());
            pstmt.setString(4, productdto.getBrand());
            pstmt.setString(5, productdto.getProductCode());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    public void editStock(String val,int q){
        try{
            String query="SELECT * FROM currentstocks WHERE productcode = '"+val+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
                String qry = "UPDATE currentstocks SET quantity=quantity-? WHERE productcode=?";
                pstmt = (PreparedStatement) con.prepareStatement(qry);
                pstmt.setDouble(1, q);
                pstmt.setString(2, val);
                pstmt.executeUpdate();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void editSoldStock(String val,int q){
        try{
            String query="SELECT * FROM currentstocks WHERE productcode = '"+val+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
                String qry = "UPDATE currentstocks SET quantity=quantity+? WHERE productcode=?";
                pstmt = (PreparedStatement) con.prepareStatement(qry);
                pstmt.setDouble(1, q);
                pstmt.setString(2, val);
                pstmt.executeUpdate();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteProductDAO(String value){
        try{
            String query="delete from products where productcode=?";
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted..");
        }catch(SQLException  e){
            e.printStackTrace();
        }
        stocks.deleteStock(stmt);
    }
    
    
    public void deletePurchaseDAO(String value){
        try{
            String query="delete from purchaseinfo where purchaseid=?";
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted..");
        }catch(SQLException  e){
            e.printStackTrace();
        }
        stocks.deleteStock(stmt);
    }
    
    public void deleteSalesDAO(String value){
        try{
            String query="delete from salesreport where salesid=?";
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted..");
        }catch(SQLException  e){
            e.printStackTrace();
        }
        stocks.deleteStock(stmt);
    }
    
    public void sellProductDAO(ProductDTO productDTO,String username){
        int quantity=0;
        String sellDate=productDTO.getSellDate();
        String productCode=productDTO.getProductCode();
        String customersCode=productDTO.getCustomerCode();
        Double sellingPrice=productDTO.getSellingPrice();
        Double totalRevenue=productDTO.getTotalRevenue();
        int qty=productDTO.getQuantity();
        try{
            String query="SELECT * FROM currentstocks WHERE productcode='"+productDTO.getProductCode()+"'";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                productCode=rs.getString("productcode");
                quantity=rs.getInt("quantity");
            }
            if(productDTO.getQuantity()>quantity){
                JOptionPane.showMessageDialog(null,"Quantity Insufficient");
            }else if(productDTO.getQuantity()<=0){
                JOptionPane.showMessageDialog(null,"Invalid Quantity");
            }else{
                try{
                    String q="UPDATE currentstocks SET quantity=quantity-'"+productDTO.getQuantity()+"' WHERE productcode='"+productDTO.getProductCode()+"'";
                    String qry="INSERT INTO salesreport(date,productcode,customercode,quantity,revenue,soldby) VALUES('"+sellDate+"','"+productCode+"','"+customersCode+"','"+qty+"','"+totalRevenue+"','"+username+"')";
                    stmt.executeUpdate(q);
                    stmt.executeUpdate(qry);
                    JOptionPane.showMessageDialog(null,"SUCCESSFULLY SOLD");
                 }catch(Exception e){
                    e.printStackTrace();
                 }
             }
         }catch(Exception e){
                e.printStackTrace();
         } 
    }

    public ResultSet getQueryResult() {
        try {
            String query = "SELECT productcode,productname,costprice,sellingprice,brand FROM products ORDER BY pid";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }//end of method getQueryResult
   
    public ResultSet getPurchaseResult() {
        try {
            String query = "SELECT purchaseid,purchaseinfo.productcode,productname,quantity,totalcost FROM purchaseinfo INNER JOIN products ON products.productcode=purchaseinfo.productcode ORDER BY purchaseid";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }//end of method getQueryResult
    
    public ResultSet getQueryResultOfCurrentStocks() {
        try {
            String query = "SELECT currentstocks.productcode,products.productname,currentstocks.quantity,products.costprice,products.sellingprice FROM currentstocks INNER JOIN products ON currentstocks.productcode=products.productcode";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }//end of method getQueryResult
    
    public ResultSet getSalesReportQueryResult() {
        try {
            String query = "SELECT salesid,salesreport.productcode,productname,salesreport.quantity,revenue,soldby FROM salesreport INNER JOIN products ON salesreport.productcode=products.productcode";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }//end of method getQueryResult
    
     public ResultSet getSearchProductsQueryResult(String searchTxt) {
        try {
            String query = "SELECT pid,productcode,productname,costprice,sellingprice,brand FROM products WHERE productname LIKE '%"+searchTxt+"%' OR brand LIKE '%"+searchTxt+"%' OR productcode LIKE '%"+searchTxt+"%'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
     
     public ResultSet getSearchPurchaseQueryResult(String searchTxt) {
        try {
            String query = "SELECT purchaseid,purchaseinfo.productcode,productname,quantity,totalcost FROM purchaseinfo INNER JOIN products ON products.productcode=purchaseinfo.productcode WHERE purchaseinfo.productcode LIKE '%"+searchTxt+"%' OR productname LIKE '%"+searchTxt+"%' ORDER BY purchaseid";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
     
   public ResultSet getSearchSalesQueryResult(String searchTxt) {
        try {
            String query = "SELECT salesid,salesreport.productcode,productname,quantity,revenue,soldby FROM salesreport INNER JOIN products ON products.productcode=salesreport.productcode INNER JOIN customers ON customers.customercode=salesreport.customercode WHERE salesreport.productcode LIKE '%"+searchTxt+"%' OR productname LIKE '%"+searchTxt+"%' OR soldby LIKE '%"+searchTxt+"%' OR fullname LIKE '%"+searchTxt+"%' ORDER BY salesid";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
     
    public ResultSet getProductName(String pcode){
        try {
            String query = "SELECT productname FROM products WHERE productcode='"+pcode+"'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public String getProductsSupplier(int id){
        String sup=null;
        try {
            String query = "SELECT fullname FROM suppliers INNER JOIN purchaseinfo ON suppliers.suppliercode=purchaseinfo.suppliercode WHERE purchaseid='"+id+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                sup=rs.getString("fullname");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sup;
    }
    
    public String getProductsCustomer(int id){
        String cus=null;
        try {
            String query = "SELECT fullname FROM customers INNER JOIN salesreport ON customers.customercode=salesreport.customercode WHERE salesid='"+id+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                cus=rs.getString("fullname");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cus;
    }
     
    
    public String getPurchasedDate(int pur){
        String p=null;
        try {
            String query = "SELECT date FROM purchaseinfo WHERE purchaseid='"+pur+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                p=rs.getString("date");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }
    
    public String getSoldDate(int salesid){
        String p=null;
        try {
            String query = "SELECT date FROM salesreport WHERE salesid='"+salesid+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                p=rs.getString("date");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    
    public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        Vector<String> columnNames = getColumnNames(rs);
        Vector<Vector<Object>> data = tableModel(rs, columnNames);

        return new DefaultTableModel(data, columnNames);
    }//end of method DefaultTableModel


    public Vector<String> getColumnNames(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData(); //resultset ko metadata
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();

        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        return columnNames;
    }

    public Vector<Vector<Object>> tableModel(ResultSet rs, Vector<String> columnNames) throws SQLException {
        int columnCount = columnNames.size();
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();

        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));

            }
            data.add(vector);
        }
        return data;
    }

}
