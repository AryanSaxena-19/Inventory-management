package com.inventory.ui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Dashboard extends javax.swing.JFrame {

    CardLayout layout;
    String userSelect;
    String username;
    ButtonGroup theme;

    public Dashboard() {

    }

    public Dashboard(String user, String username) {
        initComponents();
        navPanel.setVisible(true);
        menuPanel.setVisible(true);
        layout = new CardLayout();
        userSelect = user;
        this.username = username;
        if ("NORMAL USER".equalsIgnoreCase(userSelect)) {
            NotForNormalUser();
        }
        mainPanel.setLayout(layout);
        mainPanel.add("First", new HomePage());
        mainPanel.add("Second", new Products(username));
        mainPanel.add("Third", new Customers());
        mainPanel.add("Fourth", new Suppliers());
        mainPanel.add("Fifth", new Users());
        mainPanel.add("Sixth", new Logs());
        mainPanel.add("Seventh", new ChangeDetails(username));
        mainPanel.add("Eight", new CurrentStocks(username));
        mainPanel.add("Ninth", new SalesReport(username));
        mainPanel.add("Tenth", new Purchase());
        mainPanel.add("Eleventh", new About());
        layout.next(mainPanel);
        layout.next(mainPanel);

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ims-logo.png")));
        Toolkit theKit = getToolkit();
        Dimension dim = theKit.getScreenSize();
        setSize(dim);
        setTitle("Inventory Management System");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addProductsPage() {
        layout.show(mainPanel, "Second");
    }

    public void addCustomersPage() {
        layout.show(mainPanel, "Third");
    }

    public void addSuppliersPage() {
        layout.show(mainPanel, "Fourth");
    }

    public void addUsersPage() {
        layout.show(mainPanel, "Fifth");
    }

    public void addLogsPage() {
        layout.show(mainPanel, "Sixth");
    }

    public void addChangeDetailsPage() {
        layout.show(mainPanel, "Seventh");
    }

    public void addCurrentStocksPage() {
        layout.show(mainPanel, "Eigth");
    }

    public void addSalesReportPage() {
        layout.show(mainPanel, "Ninth");
    }

    public void addPurchasePage() {
        layout.show(mainPanel, "Tenth");
    }

    public void addAboutPage() {
        layout.show(mainPanel, "Eleventh");
    }

    @SuppressWarnings("unchecked")

    private void initComponents(){


        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bttnPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addProductBttn = new javax.swing.JLabel();
        customersBttn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        suppliersBttn = new javax.swing.JLabel();
        userBttn = new javax.swing.JLabel();
        userLab = new javax.swing.JLabel();
        currentStocksBttn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salesReportBttn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        purchaseBttn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel(); 
        menuPanel = new javax.swing.JPanel();
        menuBttn = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        homeMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        salesMenuItem = new javax.swing.JMenu();
        changeDetailsMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bttnPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout bttnPanelLayout = new javax.swing.GroupLayout(bttnPanel);
        bttnPanel.setLayout(bttnPanelLayout);
        bttnPanelLayout.setHorizontalGroup(
            bttnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );
        bttnPanelLayout.setVerticalGroup(
            bttnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(570, 570, 570)
                .addComponent(bttnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
            );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(183, 183,183))
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addComponent(bttnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        navPanel.setBackground(new java.awt.Color(255, 255, 255));
        navPanel.setBorder(BorderFactory.createLineBorder(null));
        navPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Products");

        addProductBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/productLarge.png")));
        addProductBttn.setToolTipText("Products");

        addProductBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
            addProductBttnMouseClicked(evt);
        }
    });
    
    customersBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/customerLarge.png")));
    customersBttn.setToolTipText("Customers");

    customersBttn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            customersBttnMouseClicked(evt);
        }
    });

    jLabel3.setText("Customers");

    suppliersBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/supplierLarge.png")));
    suppliersBttn.setToolTipText("Suppliers");

    suppliersBttn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            suppliersBttnMouseClicked(evt);
        }
    });

    jLabel5.setText("Suppliers");

    userBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/userLarge.png")));
    userBttn.setToolTipText("Users");
    userBttn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            userBttnMouseClicked(evt);
        }
    });

    userLab.setText("User");

    currentStocksBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventiry/ui/images/inventory-management-icon.png")));
    currentStocksBttn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            currentStocksBttnMouseClicked(evt);
        }
    });

    jLabel4.setText("Current Stocks");

    salesReportBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/saleLarge.png"))); // NOI18N
    salesReportBttn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            salesReportBttnMouseClicked(evt);
        }
    });


    salesReportLab.setText("Sales");

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/home.png")));
    jLabel1.setText("Home");
    jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel1MouseClicked(evt);
        }
    });

    purchaseBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/basket-icon.png"))); // NOI18N
    purchaseBttn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            purchaseBttnMouseClicked(evt);
        }
    });

    jLabel7.setText("Purchase");

    javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
    navPanel.setLayout(navPanelLayout);
    navPanelLayout.setHorizontalGroup(
        navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(navPanelLayout.createSequentialGroup()
        .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suppliersBttn))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addProductBttn))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(userLab))
                    .addComponent(userBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(customersBttn))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(purchaseBttn)
                    .addComponent(jLabel7)))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentStocksBttn))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(salesReportLab))
                    .addComponent(salesReportBttn)))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)))
        .addContainerGap())
);
            navPanelLayout.setVerticalGroup(
                navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(suppliersBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(addProductBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(customersBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(currentStocksBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(salesReportBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                .addComponent(currentStocksBttn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                .addComponent(salesReportBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesReportLab)
                .addGap(18, 18, 18)
                .addComponent(userBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLab)
                .addContainerGap(355, Short.MAX_VALUE))
            );
            menuPanel.setPreferredSize(new java.awt.Dimension(61, 16));

            menuBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/menu.png")));
            menuBttn.setPreferredSize(new java.awt.Dimension(77, 16));
            menuBttn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    menuBttnMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
            menuPanel.setLayout(menuPanelLayout);
            menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                    .addComponent(menuBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            fileMenu.setMnemonic('f');
            fileMenu.setText("file");

            homeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
            homeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/home.png")));
            homeMenuItem.setText("Home");

            homeMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    homeMenuItemActionPerformed(evt);
                }
            });
            fileMenu.add(homeMenuItem);

            jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
            jMenuItem1.setText("About");

            jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem1ActionPerformed(evt);
                }
            });

            fileMenu.add(jMenuItem1);

            jMenuBar1.add(fileMenu);

            salesMenuItem.setText("Action");

            changeDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
            changeDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/changeDetails.png")));
            changeDetailsMenuItem.setText("Change Details");
        
            changeDetailsMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    changeDetailsMenuItemMouseClicked(evt);
                }
            });
            changeDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    changeDetailsMenuItemActionPerformed(evt);
                }
            });
            salesMenuItem.add(changeDetailsMenuItem);

            logoutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
            logoutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/logoutSmall.png")));
            logoutMenuItem.setText("Logout");
            
            logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    logoutMenuItemActionPerformed(evt);
                }
            });
            salesMenuItem.add(logoutMenuItem);

            jMenuBar1.add(salesMenuItem);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1710, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }

        private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
            dispose();
        LoginDialog ld = new LoginDialog();
        ld.setLocationRelativeTo(null);
        ld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ld.setVisible(true);
    }

        private void changeDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt){
            addChangeDetailsPage();
        }

        private void changeDetailsMenuItemMouseClicked(java.awt.event.MouseEvent evt){
            
        }

        private void currentStocksBttnMouseClicked(java.awt.event.MouseEvent evt){
            addCurrentStocksPage();
        }

        private void userBttnMouseClicked(java.awt.event.MouseEvent evt) {
            addUsersPage();
        }

        private void suppliersBttnMouseClicked(java.awt.event.MouseEvent evt){
            addSuppliersPage();
        }

        private void customersBttnMouseClicked(java.awt.event.MouseEvent evt) {
            addCustomersPage();
        }

        private void addProductBttnMouseClicked(java.awt.event.MouseEvent evt) {
            addProductsPage();
        }

        private void salesReportBttnMouseClicked(java.awt.event.MouseEvent evt) {
            addSalesReportPage();
        }

        private void menuBttnMouseClicked(java.awt.event.MouseEvent evt) {
            if (navPanel.isVisible() == false){
                navPanel.setVisible(true);
            }else {
                navPanel.setVisible(false);
            }
        }

        private void homeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
            new Dashboard(userSelect, username);
            dispose();
        }

        private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
            new Dashboard(userSelect, username);
            dispose();
        }

        private void purchaseBttnMouseClicked(java.awt.event.MouseEvent evt) {
            addPurchasePage();
        }

        private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
            addAboutPage();
        }

        public static void main(String args[]) {
            try{
                for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if("Nimbus".equals(info .getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            }   catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }   catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }   catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }   catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }

            public void NotForNormalUser() {
                navPanel.remove(userBttn);
                navPanel.remove(userLab);
            }


            private javax.swing.JLabel addProductBttn;
            private javax.swing.JPanel bttnPanel;
            private javax.swing.JMenuItem changeDetailsMenuItem;
            private javax.swing.JLabel currentStocksBttn;
            private javax.swing.JLabel customersBttn;
            private javax.swing.JMenu fileMenu;
            private javax.swing.JMenuItem homeMenuItem;
            private javax.swing.JLabel jLabel1;
            private javax.swing.JLabel jLabel3;
            private javax.swing.JLabel jLabel4;
            private javax.swing.JLabel jLabel5;
            private javax.swing.JLabel jLabel6;
            private javax.swing.JLabel jLabel7;
            private javax.swing.JMenuBar jMenuBar1;
            private javax.swing.JMenuItem jMenuItem1;
            private javax.swing.JPanel jPanel1;
            private javax.swing.JMenuItem logoutMenuItem;
            private javax.swing.JPanel mainPanel;
            private javax.swing.JLabel menuBttn;
            private javax.swing.JPanel menuPanel;
            private javax.swing.JPanel navPanel;
            private javax.swing.JLabel purchaseBttn;
            private javax.swing.JMenu salesMenuItem;
            private javax.swing.JLabel salesReportBttn;
            private javax.swing.JLabel salesReportLab;
            private javax.swing.JLabel suppliersBttn;
            private javax.swing.JLabel userBttn;
            private javax.swing.JLabel userLab;

}
   
