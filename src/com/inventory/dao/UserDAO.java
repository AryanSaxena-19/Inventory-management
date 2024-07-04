package com.inventory.dao;

import java.io.FileInputStream;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.inventory.database.ConnectionFactory;
import com.inventory.dto.UserDTO;
import com.inventory.ui.Users;


public class UserDAO extends BuildTableModel {

    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs =null;

    public UserDAO(){
        try {
            con = new ConnectionFactory().getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addUserDAO(UserDTO userdto, String user) {
        try {
            String query = "SELECT * FROM users WHERE fullname='"+userdto.getFullName()+"' AND location='"+userdto.getLoctaion()+"' AND phone='"+userdto.getPhone()+"' AND category='"+userdto.getCategory()+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Same User has already been added !");
            }else{
                addFunction(userdto, user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addFunction(UserDTO userdto, String user){
        try {
            String username = null;
            String password = null;
            String oldUsername = null;
            String encPass = null;
            String query1 = "SELECT * FROM users";
            rs=stmt.executeQuery(query1);
            if(!rs.next()){
                username="user"+"1";
                password="user"+"1";
            }
            else{
                String query2="SELECT * FROM users ORDER by id DESC";
                rs = stmt.executeQuery(query2);
                if(rs.next()){
                    oldUsername=rs.getString("username");
                    Integer ucode = Integer.parseInt(oldUsername.substring(4));
                    ucode++;
                    username="user"+ucode;
                    password="user"+ucode;
                } 
                encPass = new Users().encryptPassword(password);
            }
            String query = "INSERT INTO users (fullname, location, phone, username, password, category) VALUES(?,?,?,?,?,?)";
            pstmt = (PreparedStatement) con.prepareStatement(query);
            pstmt.setString(1, userdto.getFullName());
            pstmt.setString(2, userdto.getLoctaion());
            pstmt.setString(3, userdto.getPhone());
            pstmt.setString(4, username);
            pstmt.setString(5, encPass);
            pstmt.setString(6, userdto.getCategory());
            pstmt.executeUpdate();
            if("ADMINISTRATOR".equals(user))
                JOptionPane.showMessageDialog(null, "New ADMINISTRATOR ADDED");
            else
                JOptionPane.showMessageDialog(null, "NEW R ADDED");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void editUserDAO(UserDTO userdto) {
        try {
            String query = "UPDATE users SET fullname=?,location=?,category=?, WHERE username=?";
            pstmt = (PreparedStatement) con.prepareStatement(query);
            pstmt.setString(1, userdto.getFullName());
            pstmt.setString(2, userdto.getLoctaion());
            pstmt.setString(3, userdto.getPhone());
            pstmt.setString(4, userdto.getCategory());
            pstmt.setString(5, userdto.getUsername());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public <FileInputStrem> void editFunction(UserDTO userdto, String imgLink, File file) {

        try {
            if(imgLink.equals("")) {

            }else{
                    String query = "UPDATE users SET fullname=?,location=?,phone=?,username=?,password=?,category=?,image=? WHERE id =?";
                    FileInputStream fis=new FileInputStream(file);
                    pstmt =(PreparedStatement) con.prepareStatement(query);
                    pstmt.setString(1, userdto.getFullName());
                    pstmt.setString(2, userdto.getLoctaion());
                    pstmt.setString(3, userdto.getPhone());
                    pstmt.setString(4, userdto.getUsername());
                    pstmt.setString(5, userdto.getPassword());
                    pstmt.setString(6, userdto.getCategory());
                    pstmt.setBinaryStream(7, fis,(int)file.length());
                    pstmt.setInt(8, userdto.getId());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Udated");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void deleteUserDAO(String value) {
        try {
            String query = "delete from users where username=?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, value);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted..");
        } catch (Exception e) {
        }
        new Users().loadDatas();
    }


    public ResultSet getQueryResult1(){
        try {
            String query = "SELECT fullname,location,phone,username,category FROM users";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getUser(String user) {
        try {
            String query = "SELECT * FROM users WHERE username='"+user+"'";
            rs=stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }


    public ResultSet getPassword(String user, String pass) {
        try {
            String query = "SELECT password FROM users WHERE username='"+user+"' AND password='"+pass+"'";
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }


    public void changePassword(String user, String pass) {
        try {
            String query = "UPDATE users SET password=? WHERE username=?";
            pstmt = con.prepareStatement(query);
            String encPass = new Users().encryptPassword(pass);
            pstmt.setString(1, encPass);
            pstmt.setString(2, user);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
