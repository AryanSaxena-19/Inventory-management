package com.inventory.ui;

import com.inventory.dao.CustomerDAO;
import com.inventory.dao.ProductDAO;
import com.inventory.dto.ProductDTO;


import static com.inventory.ui.Products.productCode;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


public class SalesReport extends javax.swing.JPanel {

        String  u;
        public SalesReport(String user) {
                initComponents();
                u = user;
                loadDatas();
                salesIdTxt.setVisible(false);
                customerNameLab.setVisible(false);
                productNameLab.setVisible(false);
        }

        
        @SuppressWarnings("unchecked")
       
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                table = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jTabbedPane1 = new javax.swing.JTabbedPane();
                jPanel1 = new javax.swing.JPanel();
                salePanel = new javax.swing.JPanel();
                productCodeLab = new javax.swing.JLabel();
                productCodeTxt = new javax.swing.JTextField();
                quantityTxt = new javax.swing.JTextField();
                quantityLab = new javax.swing.JLabel();
                sellingPriceTxt = new javax.swing.JTextField();
                sellingPriceLab = new javax.swing.JLabel();
                dateChooser = new com.toedter.calendar.JDateChooser();
                jLabel3 = new javax.swing.JLabel();
                customerCodeTxt = new javax.swing.JTextField();
                productCodeLab1 = new javax.swing.JLabel();
                productNameLab = new javax.swing.JLabel();
                sellBttn = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                deleteBttn = new javax.swing.JLabel();
                clearBttn1 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                salesIdTxt = new javax.swing.JTextField();
                customerNameLab = new javax.swing.JLabel();
                supplierInfoPanel = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                supplierInfoLab = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                purchasedDateLab = new javax.swing.JLabel();
                searchByLab = new javax.swing.JLabel();
                searchTxt = new javax.swing.JTextField();

                table.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                table.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(table);

                jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); 
                jLabel1.setForeground(new java.awt.Color(0, 102, 204));
                jLabel1.setText("SALES");

                jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
                jPanel1.setFont(new java.awt.Font("Comfortaa", 0, 12)); 

                productCodeLab.setText("Product Code");

                productCodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                productCodeTxtKeyReleased(evt);
                        }
                });

                quantityLab.setText("Quantity");

                sellingPriceLab.setText("Selling Price");

                jLabel3.setText("Date");

                customerCodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                customerCodeTxtKeyReleased(evt);
                        }
                });

                productCodeLab1.setText("Customer Code");

                productNameLab.setBackground(new java.awt.Color(204, 204, 255));
                productNameLab.setFont(new java.awt.Font("Comfortaa", 0, 14)); 
                productNameLab.setForeground(new java.awt.Color(102, 102, 255));

                sellBttn.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/com/inventory/ui/images/saleLarge.png"))); 
                sellBttn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                sellBttnMouseClicked(evt);
                        }
                });

                jLabel7.setText("Delete");

                deleteBttn
                                .setIcon(new javax.swing.ImageIcon(
                                                getClass().getResource("/com/inventory/ui/images/delete item.png"))); 
                deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                deleteBttnMouseClicked(evt);
                        }
                });

                clearBttn1.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/com/inventory/ui/images/clear.png"))); 
                clearBttn1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                clearBttn1MouseClicked(evt);
                        }
                });

                jLabel8.setText("Clear");

                jLabel9.setText("Sell");

                salesIdTxt.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                salesIdTxtActionPerformed(evt);
                        }
                });

                customerNameLab.setBackground(new java.awt.Color(204, 204, 255));
                customerNameLab.setFont(new java.awt.Font("Comfortaa", 0, 14)); 
                customerNameLab.setForeground(new java.awt.Color(102, 102, 255));

                javax.swing.GroupLayout salePanelLayout = new javax.swing.GroupLayout(salePanel);
                salePanel.setLayout(salePanelLayout);
                salePanelLayout.setHorizontalGroup(
                                salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(salePanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(salePanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(customerNameLab,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                salePanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(salePanelLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(sellBttn)
                                                                                                                                .addGroup(salePanelLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(jLabel9)
                                                                                                                                                .addGap(19, 19, 19)))
                                                                                                                .addGap(10, 10, 10)
                                                                                                                .addGroup(salePanelLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(jLabel7)
                                                                                                                                .addComponent(deleteBttn))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addGroup(salePanelLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(salePanelLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                                .addComponent(jLabel8))
                                                                                                                                .addComponent(clearBttn1))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(salesIdTxt,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(7, 7, 7))
                                                                                .addGroup(salePanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(salePanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(sellingPriceLab)
                                                                                                                .addComponent(quantityLab))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(salePanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(sellingPriceTxt,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                239,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(quantityTxt)))
                                                                                .addComponent(productNameLab,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(salePanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(salePanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(productCodeLab1)
                                                                                                                .addComponent(productCodeLab)
                                                                                                                .addComponent(jLabel3))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(salePanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(dateChooser,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(customerCodeTxt)
                                                                                                                .addGroup(salePanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(0, 1, Short.MAX_VALUE)
                                                                                                                                .addComponent(productCodeTxt,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                238,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addContainerGap()));
                salePanelLayout.setVerticalGroup(
                                salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(salePanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(salePanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                salePanelLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addGap(18, 18, 18))
                                                                                .addGroup(salePanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(dateChooser,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                27,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                                .addGroup(
                                                                                salePanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(productCodeLab1)
                                                                                                .addComponent(customerCodeTxt,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(customerNameLab,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                19,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addGroup(
                                                                                salePanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(productCodeTxt,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(productCodeLab))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(productNameLab,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                19,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(salePanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(sellingPriceTxt,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                29,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(sellingPriceLab,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(25, 25, 25)
                                                                .addGroup(
                                                                                salePanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(quantityLab)
                                                                                                .addComponent(quantityTxt,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(salePanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(salePanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(39, 39, 39)
                                                                                                .addComponent(salesIdTxt,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                34,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(salePanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(salePanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(sellBttn)
                                                                                                                .addGroup(salePanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(salePanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(deleteBttn)
                                                                                                                                                .addComponent(clearBttn1))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(salePanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                .addComponent(jLabel9))))))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addComponent(salePanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(9, 9, 9)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(salePanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                351,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jTabbedPane1.addTab("Sales", jPanel1);

                supplierInfoPanel.setBackground(new java.awt.Color(255, 255, 204));

                jLabel4.setForeground(new java.awt.Color(0, 0, 51));
                jLabel4.setText("Customer Info: ");

                supplierInfoLab.setForeground(new java.awt.Color(0, 0, 51));
                supplierInfoLab.setText("         ");

                jLabel5.setForeground(new java.awt.Color(0, 0, 51));
                jLabel5.setText("Sold Date:");

                purchasedDateLab.setForeground(new java.awt.Color(0, 51, 51));
                purchasedDateLab.setText("                ");

                javax.swing.GroupLayout supplierInfoPanelLayout = new javax.swing.GroupLayout(supplierInfoPanel);
                supplierInfoPanel.setLayout(supplierInfoPanelLayout);
                supplierInfoPanelLayout.setHorizontalGroup(
                                supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(supplierInfoPanelLayout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addGroup(supplierInfoPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(supplierInfoPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel5)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(purchasedDateLab))
                                                                                .addGroup(supplierInfoPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(supplierInfoLab,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                291,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                supplierInfoPanelLayout.setVerticalGroup(
                                supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                supplierInfoPanelLayout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(purchasedDateLab)
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                supplierInfoPanelLayout.createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(supplierInfoPanelLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel4)
                                                                                                .addComponent(supplierInfoLab))
                                                                                .addContainerGap()));

                searchByLab.setText("SEARCH");

                searchTxt.setToolTipText("Search using Product Name, Brand Name OR Product Code");
                searchTxt.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                searchTxtActionPerformed(evt);
                        }
                });
                searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                searchTxtKeyReleased(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(supplierInfoPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                483,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTabbedPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                427,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jSeparator1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                883,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(searchByLab)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(searchTxt,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                270,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(93, 93, 93)))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(searchTxt,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(searchByLab,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                34,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                430,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTabbedPane1,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                430,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(supplierInfoPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
        }

        int quantity;

        private void tableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableMouseClicked
                int row = table.getSelectedRow();
                int column = table.getColumnCount();
                Object[] val = new Object[column];
                for (int i = 0; i < column; i++) {
                        val[i] = table.getValueAt(row, i);
                }
                salesIdTxt.setText(val[0].toString());
                String cus = new ProductDAO().getProductsCustomer(Integer.parseInt(salesIdTxt.getText()));
                supplierInfoLab.setText("Sold to " + cus);
                String soldDate = new ProductDAO().getSoldDate(Integer.parseInt(salesIdTxt.getText()));
                purchasedDateLab.setText(soldDate);

                quantity = Integer.parseInt(val[3].toString());
                productCode = val[1].toString();
        }

        private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_searchTxtKeyReleased
                String text = searchTxt.getText();
                loadSearchSalesDatas(text);

        }

        private void salesIdTxtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_salesIdTxtActionPerformed

        }

        private void clearBttn1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_clearBttn1MouseClicked
                salesIdTxt.setText("");
                customerCodeTxt.setText("");
                productNameLab.setText("");
                productNameLab.setVisible(false);
                customerNameLab.setText("");
                customerNameLab.setVisible(false);
                dateChooser.setDate(null);
                productCodeTxt.setText("");
        }// GEN-LAST:event_clearBttn1MouseClicked

        private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteBttnMouseClicked
                if (table.getSelectedRow() < 0) {
                        JOptionPane.showMessageDialog(null, "Select a table data first!");
                } else {
                        new ProductDAO().deleteSalesDAO(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
                        new ProductDAO().editSoldStock(String.valueOf(table.getValueAt(table.getSelectedRow(), 1)),
                                        quantity);
                        loadDatas();
                }
        }

        private void sellBttnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_sellBttnMouseClicked
                if (dateChooser.getDate() == null || quantityTxt.getText().equals("")
                                || customerCodeTxt.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields!");
                } else {
                        try {
                                ResultSet rs = new CustomerDAO().getCustomersName(customerCodeTxt.getText());
                                if (rs.next()) {
                                        ProductDTO productdto = new ProductDTO();
                                        productdto.setCustomerCode(customerCodeTxt.getText());
                                        productdto.setSellDate(dateChooser.getDate().toString());
                                        productdto.setProductCode(productCodeTxt.getText());
                                        Double sellingPrice = Double.parseDouble(sellingPriceTxt.getText());
                                        Double totalRevenue = sellingPrice * Integer.parseInt(quantityTxt.getText());
                                        productdto.setTotalRevenue(totalRevenue);
                                        productdto.setQuantity(Integer.parseInt(quantityTxt.getText()));
                                        new ProductDAO().sellProductDAO(productdto, u);
                                        loadDatas();
                                } else {
                                        JOptionPane.showMessageDialog(null, "Please enter valid customer code!");
                                }
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                }
        }

        private void customerCodeTxtKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_customerCodeTxtKeyReleased
                customerNameLab.setVisible(true);

                try {
                        ResultSet rs = new CustomerDAO().getCustomersName(customerCodeTxt.getText());
                        if (rs.next()) {
                                customerNameLab
                                                .setText("Name: " + rs.getString("fullname") + " | Location: "
                                                                + rs.getString("location"));
                        } else {
                                customerNameLab.setText("Not associated with any Customers!");
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        private void productCodeTxtKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_productCodeTxtKeyReleased
                productNameLab.setVisible(true);

                try {
                        ResultSet rs = new CustomerDAO().getProductsName(productCodeTxt.getText());
                        if (rs.next()) {
                                productNameLab.setText(
                                                "Name: " + rs.getString("productname") + " | Available Quantity: "
                                                                + rs.getInt("quantity"));
                                Double sellingPrice = new ProductDAO().getProductSellingPrice(productCodeTxt.getText());
                                sellingPriceTxt.setText(sellingPrice.toString());
                        } else {
                                productNameLab.setText("Not associated with any Products!");
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchTxtActionPerformed

        }

        public void loadDatas() {
                try {
                        ProductDAO productDAO = new ProductDAO();
                        table.setModel(productDAO.buildTableModel(productDAO.getSalesReportQueryResult()));
                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
        }

        public void loadSearchSalesDatas(String text) {
                try {
                        ProductDAO productDAO = new ProductDAO();
                        table.setModel(productDAO.buildTableModel(productDAO.getSearchSalesQueryResult(text)));
                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
        }

        private javax.swing.JLabel clearBttn1;
        private javax.swing.JTextField customerCodeTxt;
        private javax.swing.JLabel customerNameLab;
        private com.toedter.calendar.JDateChooser dateChooser;
        private javax.swing.JLabel deleteBttn;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTabbedPane jTabbedPane1;
        private javax.swing.JLabel productCodeLab;
        private javax.swing.JLabel productCodeLab1;
        private javax.swing.JTextField productCodeTxt;
        private javax.swing.JLabel productNameLab;
        private javax.swing.JLabel purchasedDateLab;
        private javax.swing.JLabel quantityLab;
        private javax.swing.JTextField quantityTxt;
        private javax.swing.JPanel salePanel;
        private javax.swing.JTextField salesIdTxt;
        private javax.swing.JLabel searchByLab;
        private javax.swing.JTextField searchTxt;
        private javax.swing.JLabel sellBttn;
        private javax.swing.JLabel sellingPriceLab;
        private javax.swing.JTextField sellingPriceTxt;
        private javax.swing.JLabel supplierInfoLab;
        private javax.swing.JPanel supplierInfoPanel;
        private javax.swing.JTable table;

}
