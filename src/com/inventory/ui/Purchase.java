package com.inventory.ui;

import com.inventory.dao.ProductDAO;
import com.inventory.dto.ProductDTO;
import static com.inventory.ui.Products.productCode;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


public class Purchase extends javax.swing.JPanel {
ProductDTO productdto;
    
    public Purchase() {
        initComponents();
        comboBox.removeAllItems();
        comboBox.addItem("Select Supplier's Name");
        suppliersName();
        purchaseIdTxt.setVisible(false);
        productNameLab.setVisible(false);

        loadDatas();

    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        productsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        comboBox = new javax.swing.JComboBox();
        addProduct = new javax.swing.JLabel();
        deleteBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        purchaseIdTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productCodeTxt = new javax.swing.JTextField();
        productCodeLab = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        quantityLab1 = new javax.swing.JLabel();
        productNameLab = new javax.swing.JLabel();
        productCodeLab1 = new javax.swing.JLabel();
        costPriceTxt = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchTxt = new javax.swing.JTextField();
        searchByLab = new javax.swing.JLabel();
        supplierInfoPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        supplierInfoLab = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        purchasedDateLab = new javax.swing.JLabel();
        refreshBttn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();

        productsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsPanelMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel1.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N

        comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Supplier's Name" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/add item.png"))); // NOI18N
        addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductMouseClicked(evt);
            }
        });

        deleteBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/delete item.png"))); // NOI18N
        deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBttnMouseClicked(evt);
            }
        });

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/clear.png"))); // NOI18N
        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        jLabel2.setText("Purchase");

        jLabel7.setText("Delete");

        jLabel8.setText("Clear");

        jLabel3.setText("Date");

        productCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCodeTxtActionPerformed(evt);
            }
        });
        productCodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productCodeTxtKeyReleased(evt);
            }
        });

        productCodeLab.setText("Product Code");

        quantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTxtActionPerformed(evt);
            }
        });

        quantityLab1.setText("Quantity");

        productNameLab.setBackground(new java.awt.Color(204, 204, 255));
        productNameLab.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        productNameLab.setForeground(new java.awt.Color(102, 102, 255));

        productCodeLab1.setText("Cost Price");

        costPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPriceTxtActionPerformed(evt);
            }
        });
        costPriceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costPriceTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(addProduct))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBttn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearBttn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(purchaseIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(productCodeLab)
                                        .addComponent(quantityLab1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(productCodeTxt)
                                        .addComponent(quantityTxt)
                                        .addComponent(costPriceTxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(comboBox, 0, 301, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(productNameLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(productCodeLab1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCodeLab))
                .addGap(4, 4, 4)
                .addComponent(productNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCodeLab1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLab1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(purchaseIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addProduct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBttn)
                            .addComponent(clearBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRODUCTS", jPanel1);

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("PURCHASE");

        searchTxt.setToolTipText("Search using Product Name, Brand Name OR Product Code");
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        searchByLab.setText("SEARCH");

        supplierInfoPanel.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Supplier Info: ");

        supplierInfoLab.setForeground(new java.awt.Color(0, 0, 51));
        supplierInfoLab.setText("         ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Purchased Date:");

        purchasedDateLab.setForeground(new java.awt.Color(0, 51, 51));
        purchasedDateLab.setText("                ");

        javax.swing.GroupLayout supplierInfoPanelLayout = new javax.swing.GroupLayout(supplierInfoPanel);
        supplierInfoPanel.setLayout(supplierInfoPanelLayout);
        supplierInfoPanelLayout.setHorizontalGroup(
            supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierInfoPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplierInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(purchasedDateLab))
                    .addGroup(supplierInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supplierInfoLab, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        supplierInfoPanelLayout.setVerticalGroup(
            supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchasedDateLab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(supplierInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(supplierInfoLab))
                .addContainerGap())
        );

        refreshBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/reload.png"))); // NOI18N
        refreshBttn.setText("Refresh");
        refreshBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout productsPanelLayout = new javax.swing.GroupLayout(productsPanel);
        productsPanel.setLayout(productsPanelLayout);
        productsPanelLayout.setHorizontalGroup(
            productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productsPanelLayout.createSequentialGroup()
                .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(productsPanelLayout.createSequentialGroup()
                        .addComponent(refreshBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchByLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(productsPanelLayout.createSequentialGroup()
                        .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(supplierInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(productsPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        productsPanelLayout.setVerticalGroup(
            productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refreshBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(searchByLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productsPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(productsPanelLayout.createSequentialGroup()
                        .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supplierInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }
int quantity;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {
      int row = table.getSelectedRow();
        int column = table.getColumnCount();
        Object[] val = new Object[column];
        for(int i = 0; i < column; i++) {
            val[i]=table.getValueAt(row, i);
        }
        purchaseIdTxt.setText(val[0].toString());
        String sup=new ProductDAO().getProductsSupplier(Integer.parseInt(purchaseIdTxt.getText()));
        supplierInfoLab.setText("Purchased from "+sup);
        String purchasedDate=new ProductDAO().getPurchasedDate(Integer.parseInt(purchaseIdTxt.getText()));
        purchasedDateLab.setText(purchasedDate);
        
        quantity=Integer.parseInt(val[3].toString());
        productCode=val[1].toString();
    }

    public void loadDatas() {
        try {
            ProductDAO productDAO = new ProductDAO();
            table.setModel(productDAO.buildTableModel(productDAO.getPurchaseResult()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {
        String text = searchTxt.getText();
        loadSearchPurchaseDatas(text);

    }

    public void loadSearchPurchaseDatas(String text) {
        try {
            ProductDAO productDAO = new ProductDAO();
            table.setModel(productDAO.buildTableModel(productDAO.getSearchPurchaseQueryResult(text)));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void refreshBttnActionPerformed(java.awt.event.ActionEvent evt) {
        comboBox.removeAllItems();
        comboBox.addItem("Select Supplier's Name");
        suppliersName();
        purchaseIdTxt.setText("");
        productCodeTxt.setText("");
        productNameLab.setText("");
        dateChooser.setDate(null);
        productCodeTxt.setText("");
    }

    private void productsPanelMouseClicked(java.awt.event.MouseEvent evt) {
        purchaseIdTxt.setText("");
        dateChooser.setDate(null);
        productNameLab.setText("");
        productNameLab.setVisible(false);
        productCodeTxt.setText("");
    }

    private void productCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt){
        purchaseIdTxt.setText("");
        productNameLab.setText("");
        productNameLab.setText("");
        dateChooser.setDate(null);
        productCodeTxt.setText("");
    }

    private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Select a table date first!");
        }else{
            new ProductDAO().deletePurchaseDAO(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
            new ProductDAO().editStock(String.valueOf(table.getValueAt(table.getSelectedRow(), 1)),quantity);
            loadDatas();
        }
    }

    private void addProductMouseClicked(java.awt.event.MouseEvent evt) {
        productdto=new ProductDTO();

        if(productCodeTxt.getText().equals("") || dateChooser.getDate()==null || productCodeTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the fields!");
        }else{

            String supplier=(String)comboBox.getSelectedItem();
            if("Select SUPPLIER'S NAME".equalsIgnoreCase(supplier)){
                JOptionPane.showMessageDialog(null, "Please select a supplier and try again!");
            }else{

                String supplierCode=new ProductDAO().getSupplierCode(supplier);
                productdto.setSupplierCode(supplierCode);
                productdto.setProductCode(productCodeTxt.getText());
                try {
                    ResultSet rs=new ProductDAO().getProductName(productCodeTxt.getText());
                    if(rs.next()){
                        productdto.setDate(dateChooser.getDate().toString());
                        productdto.setQuantity(Integer.parseInt(quantityTxt.getText()));
                        Double costPrice=Double.parseDouble(costPriceTxt.getText());
                        Double totalCost = costPrice*Integer.parseInt(quantityTxt.getText());
                        productdto.setTotalCost(totalCost);

                        new ProductDAO().addPurchaseDAO(productdto);
                        loadDatas();
                    }else{
                        productNameLab.setText("Not associated with any Products!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void quantityTxtActionPerformed(java.awt.event.ActionEvent evt) {

    }


    private void productCodeTxtKeyReleased(java.awt.event.KeyEvent evt) {
        productNameLab.setVisible(true);

        try {
            ResultSet rs=new ProductDAO().getProductName(productCodeTxt.getText());
            if(rs.next()){
                productNameLab.setText(rs.getString("productname"));
                Double costPrice=new ProductDAO().getProductCostPrice(productCodeTxt.getText());
                costPriceTxt.setText(costPrice.toString());
            }else{
                productNameLab.setText("Not associated with any Products!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void costPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void costPriceTxtKeyReleased(java.awt.event.KeyEvent evt) {

    }

    public void suppliersName() {
        ResultSet rs=new ProductDTO().getSuppliersName();
        try {
            while(rs.next()){
                String suppliersName=rs.getString("fullname");
                comboBox.addItem(suppliersName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private javax.swing.JLabel addProduct;
    private javax.swing.JLabel clearBttn;
    private javax.swing.JComboBox comboBox;
    private javax.swing.JTextField costPriceTxt;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel deleteBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel productCodeLab;
    private javax.swing.JLabel productCodeLab1;
    private javax.swing.JTextField productCodeTxt;
    private javax.swing.JLabel productNameLab;
    public javax.swing.JPanel productsPanel;
    private javax.swing.JTextField purchaseIdTxt;
    private javax.swing.JLabel purchasedDateLab;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JLabel quantityLab1;
    private javax.swing.JButton refreshBttn;
    private javax.swing.JLabel searchByLab;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel supplierInfoLab;
    private javax.swing.JPanel supplierInfoPanel;
    private javax.swing.JTable table;
}
