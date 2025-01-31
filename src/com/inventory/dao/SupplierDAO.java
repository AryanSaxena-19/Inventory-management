package com.inventory.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import com.inventory.database.ConnectionFactory;
import com.inventory.dto.SupplierDTO;

public class SupplierDAO extends BuildTableModel {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    public SupplierDAO() {
        try {
            con = new ConnectionFactory().getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addSupplierDAO(SupplierDTO supplierdto) {
        try {
            String query = "SELECT * FROM suppliers WHERE fullname='" + supplierdto.getFullName() + "' AND location='"
                    + supplierdto.getLocation() + "' AND phone='" + supplierdto.getPhone() + "'";
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Same Supplier has already been added!");
            } else {
                addFunction(supplierdto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addFunction(SupplierDTO supplierdto) {
        try {
            String supplierCode = null;
            String oldSupplierCode = null;
            String query1 = "SELECT * FROM suppliers";
            rs = stmt.executeQuery(query1);
            if (!rs.next()) {
                supplierCode = "sup" + "1";
            } else {
                String query2 = "SELECT * FROM suppliers ORDER by sid DESC";
                rs = stmt.executeQuery(query2);
                if (rs.next()) {
                    oldSupplierCode = rs.getString("suppliercode");
                    Integer scode = Integer.parseInt(oldSupplierCode.substring(3));
                    scode++;
                    supplierCode = "sup" + scode;
                }
            }
            String q = "INSERT INTO suppliers VALUES(null,?,?,?,?)";
            pstmt = (PreparedStatement) con.prepareStatement(q);
            pstmt.setString(1, supplierCode);
            pstmt.setString(2, supplierdto.getFullName());
            pstmt.setString(3, supplierdto.getLocation());
            pstmt.setString(4, supplierdto.getPhone());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully! Now add some products..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editSupplierDAO(SupplierDTO supplierdto) {
        try {
            String query = "UPDATE suppliers SET suppliercode=?,fullname=?,location=?,phone=? WHERE suppliercode=?";
            pstmt = (PreparedStatement) con.prepareStatement(query);
            pstmt.setString(1, supplierdto.getSupplierCode());
            pstmt.setString(2, supplierdto.getFullName());
            pstmt.setString(3, supplierdto.getLocation());
            pstmt.setString(4, supplierdto.getPhone());
            pstmt.setString(5, supplierdto.getSupplierCode());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nothing updated! Click the table data first!");
        }
    }

    public void deleteSupplierDAO(String value) {
        try {
            String query = "delete from suppliers where suppliercode=?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted..");
        } catch (SQLException e) {

        }
    }

    public ResultSet getQueryResult() {
        try {
            String query = "SELECT suppliercode AS SupplierCode, fullname AS Name, location as Address, phone AS Phone FROM suppliers";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /*
     * public ResultSet getCreditSuppliersQueryResult() {
     * try {
     * String query = "SELECT * FROM suppliers WHERE credit>0";
     * rs = stmt.executeQuery(query);
     * } catch (SQLException e) {
     * e.printStackTrace();
     * }
     * return rs;
     * }
     * 
     * public ResultSet getDebitSuppliersQueryResult() {
     * try {
     * String query = "SELECT * FROM suppliers WHERE credit=0";
     * rs = stmt.executeQuery(query);
     * } catch (SQLException e) {
     * e.printStackTrace();
     * }
     * return rs;
     * }
     */
    public ResultSet getSearchSuppliersQueryResult(String searchTxt) {
        try {
            String query = "SELECT suppliercode AS SupplierCode, fullname AS Name, location as Address, phone AS Phone FROM suppliers WHERE fullname LIKE '%"
                    + searchTxt + "%' OR location '%" + searchTxt + "%' OR suppliercode LIKE '%" + searchTxt
                    + "%' OR phone LIKE '%" + searchTxt + "%'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
