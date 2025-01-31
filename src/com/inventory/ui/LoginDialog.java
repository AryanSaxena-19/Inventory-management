package com.inventory.ui;

import java.math.BigInteger;
import java.security.MessageDigest;

import javax.swing.JOptionPane;

import com.inventory.database.ConnectionFactory;

public class LoginDialog extends javax.swing.JDialog {

    public LoginDialog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {
        comboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        usernameLab = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Logine");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRATOR", "NORMAL USER" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/loginMember.png")));

        usernameLab.setText("Username");

        usernameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        loginBttn
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/logout-icon.png")));

        loginBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBttnMouseClicked(evt);
            }
        });

        loginBttn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginBttnKeyPressed(evt);
            }
        });

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/clear.png")));

        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        passwordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTxtKeyTyped(evt);
            }
        });

        jLabel3.setText("Login");

        jLabel4.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(usernameLab)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(usernameTxt)
                                                        .addComponent(passwordTxt, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                188, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(loginBttn)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(17, 17, 17)
                                                                                .addComponent(jLabel3)))
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(29, 29, 29)
                                                                                .addComponent(clearBttn))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(42, 42, 42)
                                                                                .addComponent(jLabel4)))))))
                                .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(80, 80, 80)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLab)
                                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel2)
                                                .addGap(23, 23, 23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(clearBttn)
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(loginBttn)
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel3)))
                                .addContainerGap(12, Short.MAX_VALUE)));

        pack();
    }

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private String encryptPassword(String input) {
        String encPass = null;
        if (input == null)
            return null;

        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(), 0, input.length());
            encPass = new BigInteger(1, digest.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encPass;
    }

    String user;

    private void loginBttnMouseClicked(java.awt.event.MouseEvent evt) {
        String username = usernameTxt.getText();
        String p = passwordTxt.getText();
        String password = encryptPassword(p);
        user = (String) comboBox.getSelectedItem();

        if (new ConnectionFactory().checkLogin(username, password, user) == true) {
            dispose();
            new Dashboard(user, username);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
    }

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {
        usernameTxt.setText("");
        passwordTxt.setText("");
    }

    private void loginBttnKeyPressed(java.awt.event.KeyEvent evt) {

    }

    private void passwordTxtKeyTyped(java.awt.event.KeyEvent evt) {

    }

    public String getUser() {
        return user;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginDialog dialog = new LoginDialog();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private javax.swing.JLabel clearBttn;
    private javax.swing.JComboBox comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel loginBttn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel usernameLab;
    private javax.swing.JTextField usernameTxt;
}