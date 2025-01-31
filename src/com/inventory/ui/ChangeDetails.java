package com.inventory.ui;

import java.sql.ResultSet;

import javax.swing.GroupLayout;
import javax.swing.JOptionPane;

import com.inventory.dao.UserDAO;
import com.inventory.dto.UserDTO;

public class ChangeDetails extends javax.swing.JPanel{


    String user;
    public ChangeDetails(String userSelect){
        initComponents();
        user = userSelect;
        fullNameTxt.setEnabled(false);
        locationTxt.setEnabled(false);
        phoneTxt.setEnabled(false);
        usernameTxt.setEnabled(false);
        passwordTxt.setEnabled(false);
        newPasswordTxt.setEnabled(false);
        categoryTxt.setEnabled(false);
        ResultSet rs = new UserDAO().getUser(user);
        try {
            while (rs.next()){
                fullNameTxt.setText(rs.getString("fullname"));
                locationTxt.setText(rs.getString("location"));
                phoneTxt.setText(rs.getString("phone"));
                usernameTxt.setText(rs.getString("username"));
                categoryTxt.setText(rs.getString("category"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        inputPanel = new javax.swing.JPanel();
        usernameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordLab = new javax.swing.JLabel();
        locationLab = new javax.swing.JLabel();
        fullNameLab = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        locationTxt = new javax.swing.JTextField();
        fullNameTxt = new javax.swing.JTextField();
        phoneLab = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        editBttn = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        categoryTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordLab3 = new javax.swing.JLabel();
        newPasswordTxt = new javax.swing.JPasswordField();
        editProfileBttn = new javax.swing.JButton();

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        usernameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                usernameTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        passwordLab.setText("Old Password");

        locationLab.setText("Location");

        fullNameLab.setText("Full Name");

        phoneTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        locationTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        fullNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        phoneLab.setText("Phone");

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/clear.png")));

        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        editBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/editPeople.png")));

        editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBttnMouseClicked(evt);
            }
        });

        passwordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        
        
        passwordLab1.setText("Category");

        categoryTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel2.setText("Update");

        jLabel3.setText("Clear");

        passwordLab3.setText("New Password");

        newPasswordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        newPasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(editBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBttn))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(locationLab)
                        .addComponent(fullNameLab)
                        .addComponent(phoneLab)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordLab, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fullNameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(locationTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(usernameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(passwordTxt)
                        .addComponent(categoryTxt)
                        .addComponent(newPasswordTxt))))
                    .addGap(34, 34, 34))          
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLab)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLab)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBttn)
                    .addComponent(clearBttn))
                .addGap(12, 12, 12)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Profile Detail", inputPanel);

        editProfileBttn.setText("Edit Profile");

        editProfileBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editProfileBttn)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editProfileBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        String username = usernameTxt.getText().trim();
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!username.matches("[a-zA-Z0-9_]+")) {
            JOptionPane.showMessageDialog(this, "Username can only contain letters, numbers, and underscores.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Username accepted.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    }

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        char[] password = passwordTxt.getPassword();
        String passwordStr = new String(password);
        if (passwordStr.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Password accepted.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    }

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBttnMouseClicked
        if (fullNameTxt.getText().equals("") || locationTxt.getText().equals("") || phoneTxt.getText().equals("") || usernameTxt.getText().equals("") || passwordTxt.getText().equals("") || newPasswordTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields!");
        } else {

            UserDTO userdto = new UserDTO();
            
            String encryptPass=new Users().encryptPassword(passwordTxt.getText());
                ResultSet rs = new UserDAO().getPassword(usernameTxt.getText(),encryptPass);
                try {
                    if(rs.next()) {
                        new UserDAO().changePassword(usernameTxt.getText(),newPasswordTxt.getText());
                    }else{
                        JOptionPane.showMessageDialog(null,"Wrong Password!");
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }  
        }

        private void editProfileBttnActionPerformed(java.awt.event.ActionEvent evt) {
            passwordTxt.setEnabled(true);
            newPasswordTxt.setEnabled(true);
        }

        private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {
            passwordTxt.setText("");
            newPasswordTxt.setText("");
        }

        private void newPasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {
            char[] newPassword = newPasswordTxt.getPassword();
            String newPasswordStr = new String(newPassword);
            if (newPasswordStr.length() < 8) {
                JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "New password accepted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
                newPasswordTxt.setText("");
    
        }

        private javax.swing.JTextField categoryTxt;
        private javax.swing.JLabel clearBttn;
    private javax.swing.JLabel editBttn;
    private javax.swing.JButton editProfileBttn;
    private javax.swing.JLabel fullNameLab;
    private javax.swing.JTextField fullNameTxt;
    public javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel locationLab;
    private javax.swing.JTextField locationTxt;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField newPasswordTxt;
    private javax.swing.JLabel passwordLab;
    private javax.swing.JLabel passwordLab1;
    private javax.swing.JLabel passwordLab3;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel phoneLab;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField usernameTxt;
}
