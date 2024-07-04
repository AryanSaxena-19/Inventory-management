package com.inventory.dao;

import java.sql.ResultSet;
import java.sql.Statement;


public class Stocks {
    boolean flag = false;
    public boolean checkStock(String productcode, Statement stmt) {
        try {
            String query="SELECT * FROM currentstocks where productcode='"+productcode+"'";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }


    public void deleteStock(Statement stmt) {
        try {
            String q="DELETE FROM currentstocks WHERE productcode NOT IN(SELECT productcode FROM purchaseinfo)";
            String q1="DELETE FROM salesreport WHERE productcode NOT IN(SELECT productcode FROM products)";
            stmt.executeUpdate(q);
            stmt.executeUpdate(q1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
