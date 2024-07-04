package com.inventory.ui;

import java.awt.Color;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.inventory.dao.UserDAO;
import com.inventory.dto.UserDTO;

public class Users extends javax.swing.JPanel {
    File f;
    JFileChooser chooser;


    public Users() {

        initComponents();

        usernameTxt.setVisible(false);
        chooser = new JFileChooser();
        loadDatas();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {


        mainPanel = new javax.swing.JPanel();
        userTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addBttn = new javax.swing.JLabel();
        locationLab = new javax.swing.JLabel();
        userComboBox = new javax.swing.JComboBox();
        fullNameLab = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        locationTxt = new javax.swing.JTextField();
        fullNameTxt = new javax.swing.JTextField();
        phoneLab = new javax.swing.JLabel();
        UserdeleteBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        userTabbedPane.addTab("Users", jScrollPane1);

        jLabel2.setFont(new java.awt.Font("Comfortaa", 1, 24));
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("USERS");

        jPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        addBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/addPeople.png")));
        addBttn.addMouseListener(new java.awt.event.MouseAdapter () {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttnMouseClicked(evt);
            }
        });

        locationLab.setText("Location");

        userComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRATOR", "NORMAL USER"}));
        userComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboBoxActionPerformed(evt);
            }
        });

        fullNameLab.setText("Full Name ");

        phoneLab.setText("Phone");

        UserdeleteBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/deletelarge.png")));
        UserdeleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserdeleteBttnmouseClicked(evt);
            }
        });

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/clear.png")));
        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        jLabel3.setText("Add");

        jLabel5.setText("Delete");

        jLabel6.setText("Clear");

        editBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/editPeople.png")));
        editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBttnMouseClicked(evt);
            }
        });

        jLabel4.setText("Edit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationLab)
                            .addComponent(fullNameLab)
                            .addComponent(phoneLab))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationTxt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(phoneTxt)
                            .addComponent(fullNameTxt))
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserdeleteBttn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(clearBttn))
                        .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLab)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLab)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserdeleteBttn)
                            .addComponent(clearBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBttn)
                            .addComponent(editBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(80, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(userTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE,0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

    }

    private void userComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public String encryptPassword(String input) {
        String encPass = null;
        if(input==null) return null;

        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(), 0, input.length());
            encPass=new BigInteger(1, digest.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encPass;
    }

    String user;
    
    private void addBttnMouseClicked(java.awt.event.MouseEvent evt) {
        UserDTO userdto = new UserDTO();

        if(fullNameTxt.getText().equals("") || locationTxt.getText().equals("") ||phoneTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the fields!");
        }else{
            user=(String)userComboBox.getSelectedItem();
            userdto.setFullName(fullNameTxt.getText());
            userdto.setLocation(locationTxt.getText());
            userdto.setPhone(phoneTxt.getText());
            userdto.setCategory(user);
            new UserDAO().addUserDAO(userdto, user);
            loadDatas();
        }
    }
String username;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {
        int row = table.getSelectedRow();
        int column = table.getColumnCount();
        Object[] val = new Object[column];
        for(int i = 0; i < column; i++) {
            val[i] = table.getValueAt(row, i);
        }
        usernameTxt.setText(val[3].toString());
        fullNameTxt.setText((String) val[0]);
        locationTxt.setText((String) val[1]);
        phoneTxt.setText((String) val[2]);
        user=(String)userComboBox.getSelectedItem();
        userComboBox.setSelectedItem(user);
        username=(String) val[3];
    }

    private void UserdeleteBttnmouseClicked(java.awt.event.MouseEvent evt) {
        if(table.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Select a table data first!");
        }else{
            new UserDAO().deleteUserDAO(String.valueOf(table.getValueAt(table.getSelectedRow(), 3)));
            loadDatas();
        }
    }

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {
        usernameTxt.setText("");
        fullNameTxt.setText("");
        locationTxt.setText("");
        phoneTxt.setText("");
    }
String filename;
    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {
        usernameTxt.setText("");
        fullNameTxt.setText("");
        locationTxt.setText("");
        phoneTxt.setText("");
    }

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Select a table data first!");
        }else{
            UserDTO userdto = new UserDTO();

            if(fullNameTxt.getText().equals("") || locationTxt.getText().equals("") || phoneTxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill all the fields!");
            }else{
                user=(String)userComboBox.getSelectedItem();
                userdto.setFullName(fullNameTxt.getText());
                userdto.setLocation(locationTxt.getText());
                userdto.setPhone(phoneTxt.getText());
                userdto.setUsername(usernameTxt.getText());
                userdto.setCategory(user);
                new UserDAO().editUserDAO(userdto);
                loadDatas();
            }
        }
    }

    public void loadDatas(){
        try {
            UserDAO userDAO = new UserDAO();
            table.setModel(userDAO.buildTableModel(userDAO.getQueryResult1()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    private javax.swing.JLabel UserdeleteBttn;
    private javax.swing.JLabel addBttn;
    private javax.swing.JLabel clearBttn;
    private javax.swing.JLabel editBttn;
    private javax.swing.JLabel fullNameLab;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel locationLab;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel phoneLab;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTable table;
    private javax.swing.JComboBox userComboBox;
    private javax.swing.JTabbedPane userTabbedPane;
    private javax.swing.JTextField usernameTxt;
    
}