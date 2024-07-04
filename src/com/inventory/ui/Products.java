package com.inventory.ui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.prefs.PreferenceChangeEvent;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import com.inventory.dao.ProductDAO;
import com.inventory.dto.ProductDTO;

public class Products extends javax.swing.JPanel {

        ProductDTO productdto;
        String username;
        String supplier;
        int userId;

        public Products() {

        }

        public Products(String user) {
                initComponents();
                username = user;
                productCodeTxt.setVisible(false);
                loadDatas();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                productsPanel = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                table = new javax.swing.JTable();
                jTabbedPane1 = new javax.swing.JTabbedPane();
                jPanel1 = new javax.swing.JPanel();
                productNameLab = new javax.swing.JLabel();
                productNameTxt = new javax.swing.JTextField();
                costPriceLab = new javax.swing.JLabel();
                costPriceTxt = new javax.swing.JTextField();
                sellingPriceTxt = new javax.swing.JTextField();
                priceLab1 = new javax.swing.JLabel();
                brandLab = new javax.swing.JLabel();
                brandTxt = new javax.swing.JTextField();
                addProduct = new javax.swing.JLabel();
                editBttn = new javax.swing.JLabel();
                deleteBttn = new javax.swing.JLabel();
                clearBttn = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                productCodeTxt = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                searchTxt = new javax.swing.JTextField();
                searchByLab = new javax.swing.JLabel();
                refreshBttn = new javax.swing.JButton();

                productsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                productsPanelMouseClicked(evt);
                        }
                });

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

                jPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                productNameLab.setText("Product Name");

                costPriceLab.setText("Cost Price");

                priceLab1.setText("Selling Price");

                brandLab.setText("Brand");

                addProduct.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/com/inventory/ui/images/add item.png")));

                addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                addProductMouseClicked(evt);
                        }
                });

                editBttn.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/com/inventory/ui/images/edit item.png")));
                editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                editBttnMouseClicked(evt);
                        }
                });

                deleteBttn
                                .setIcon(new javax.swing.ImageIcon(
                                                getClass().getResource("/com/inventory/ui/images/delete item.png")));
                deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                deleteBttnMouseClicked(evt);
                        }
                });

                clearBttn.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/com/inventory/ui/images/clear.png")));

                clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                clearBttnMouseClicked(evt);
                        }
                });

                jLabel2.setText("Add");

                jLabel6.setText("Edit");

                jLabel7.setText("Delete");

                jLabel8.setText("Clear");

                productCodeTxt.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                productCodeTxtActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                false)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addGap(10, 10, 10)
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addGap(42, 42, 42)
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addGap(30, 30, 30)
                                                                                                                .addComponent(jLabel7)
                                                                                                                .addGap(28, 28, 28)
                                                                                                                .addComponent(jLabel8))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(addProduct)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(editBttn)
                                                                                                                .addGap(21, 21, 21)
                                                                                                                .addComponent(deleteBttn)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(clearBttn)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(productCodeTxt,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                13,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(brandLab,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                47,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(productNameLab)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                .addComponent(costPriceLab,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(priceLab1,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(costPriceTxt,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                194,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(sellingPriceTxt,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                194,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(brandTxt,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                194,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(productNameTxt,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                194,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(productNameLab)
                                                                                .addComponent(productNameTxt,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                28,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(costPriceLab)
                                                                                .addComponent(costPriceTxt,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(priceLab1)
                                                                                .addComponent(sellingPriceTxt,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(brandLab)
                                                                                .addComponent(brandTxt,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(addProduct)
                                                                                .addComponent(deleteBttn)
                                                                                .addComponent(clearBttn)
                                                                                .addComponent(editBttn)
                                                                                .addComponent(productCodeTxt,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                28,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel7)
                                                                                                .addComponent(jLabel8)
                                                                                                .addComponent(jLabel6))
                                                                                .addComponent(jLabel2))
                                                                .addContainerGap(43, Short.MAX_VALUE)));

                jTabbedPane1.addTab("PRODUCTS", jPanel1);

                jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24));
                jLabel1.setForeground(new java.awt.Color(0, 102, 204));
                jLabel1.setText("PRODUCTS");

                searchTxt.setToolTipText("Search useing Product Name, Brand Name OR Product Code");

                searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                searchTxtKeyReleased(evt);
                        }
                });

                searchByLab.setFont(new java.awt.Font("Ubuntu", 0, 14));
                searchByLab.setText("SEARCH");

                refreshBttn.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/com/inventory/ui/images/reload.png")));
                refreshBttn.setText("Refresh");

                refreshBttn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                refreshBttnActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout productsPanelLayout = new javax.swing.GroupLayout(productsPanel);
                productsPanel.setLayout(productsPanelLayout);
                productsPanelLayout.setHorizontalGroup(
                                productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(productsPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                557,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTabbedPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(50, Short.MAX_VALUE))
                                                .addGroup(productsPanelLayout.createSequentialGroup()
                                                                .addGroup(productsPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                false)
                                                                                .addComponent(jSeparator1,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                productsPanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(refreshBttn)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel1)
                                                                                                                .addGap(330, 330,
                                                                                                                                330)
                                                                                                                .addComponent(searchByLab)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(searchTxt,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                270,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                productsPanelLayout.setVerticalGroup(
                                productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(productsPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(productsPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(refreshBttn)
                                                                                .addGroup(productsPanelLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel1)
                                                                                                .addComponent(searchByLab,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                34,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(searchTxt,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(productsPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jTabbedPane1))
                                                                .addContainerGap(34, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(productsPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 75, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(productsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
        }

        static String productCode;

        private void tableMouseClicked(java.awt.event.MouseEvent evt) {
                int row = table.getSelectedRow();
                int column = table.getColumnCount();
                Object[] val = new Object[column];
                for (int i = 0; i < column; i++) {
                        val[i] = table.getValueAt(row, i);
                }
                productCodeTxt.setText(val[0].toString());
                productNameTxt.setText(val[1].toString());
                costPriceTxt.setText(val[2].toString());
                sellingPriceTxt.setText(val[3].toString());
                brandTxt.setText(val[4].toString());
                productCode = val[1].toString();

        }

        private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {
                String text = searchTxt.getText();
                loadSearchProductsDatas(text);
        }

        private void productsPanelMouseClicked(java.awt.event.MouseEvent evt) {
                productCodeTxt.setText("");
                productNameTxt.setText("");
                costPriceTxt.setText("");
                sellingPriceTxt.setText("");
                brandTxt.setText("");
        }

        private void refreshBttnActionPerformed(java.awt.event.ActionEvent evt) {

                productCodeTxt.setText("");
                productNameTxt.setText("");
                costPriceTxt.setText("");
                sellingPriceTxt.setText("");
                brandTxt.setText("");
        }

        private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {
                productNameTxt.setText("");
                productNameTxt.setText("");
                costPriceTxt.setText("");
                sellingPriceTxt.setText("");
                brandTxt.setText("");
        }

        private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteBttnMouseClicked
                if (table.getSelectedRow() < 0) {
                        JOptionPane.showMessageDialog(null, "Select a table data first!");
                } else {
                        new ProductDAO().deleteProductDAO(((String) table.getValueAt(table.getSelectedRow(), 0)));
                        loadDatas();
                }
        }

        private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {
                if (table.getSelectedRow() < 0) {
                        JOptionPane.showMessageDialog(null, "Select a table data first!");
                } else {
                        productdto.setProductCode(productCodeTxt.getText());
                        productdto.setProductName(productNameTxt.getText());
                        productdto.setCostPrice(Double.parseDouble(costPriceTxt.getText()));
                        productdto.setSellingPrice(Double.parseDouble(sellingPriceTxt.getText()));
                        productdto.setBrand((brandTxt.getText()));
                        productdto.setUserId(userId);
                        new ProductDAO().editProductDAO(productdto);
                loadDatas();
                }
        }

        private void addProductMouseClicked(java.awt.event.MouseEvent evt) {
                productdto = new ProductDTO();

                if (productNameTxt.getText().equals("") || costPriceTxt.getText().equals("")
                                || sellingPriceTxt.getText().equals("") || brandTxt.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields!");
                } else {
                        productdto.setProductName(productNameTxt.getText());
                        productdto.setCostPrice(Double.parseDouble(costPriceTxt.getText()));
                        productdto.setSellingPrice(Double.parseDouble(costPriceTxt.getText()));
                        productdto.setBrand((brandTxt.getText()));
                        productdto.setUserId(userId);
                        new ProductDAO().addProductDAO(productdto);
                        loadDatas();
                }
        }

        private void productCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {

        }

        public void loadDatas() {
                try {
                        ProductDAO productDAO = new ProductDAO();
                        table.setModel(productDAO.buildTableModel(productDAO.getQueryResult()));
                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
        }

        public void loadSearchProductsDatas(String text) {
                try {
                        ProductDAO productDAO = new ProductDAO();
                        table.setModel(productDAO.buildTableModel(productDAO.getQueryResult()));
                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
        }

        /*
         * public void suppliersName(){
         * ResultSet rs=new ProductDTO().getSuppliersName();
         * try{
         * while(rs.next()){
         * String suppliersName=rs.getString("fullname");
         * comboBox.addItem(suppliersName);
         * }
         * }catch(Exception e){
         * e.printStackTrace();
         * }
         * }
         */

        private javax.swing.JLabel addProduct;
        private javax.swing.JLabel brandLab;
        private javax.swing.JTextField brandTxt;
        private javax.swing.JLabel clearBttn;
        private javax.swing.JLabel costPriceLab;
        private javax.swing.JTextField costPriceTxt;
        private javax.swing.JLabel deleteBttn;
        private javax.swing.JLabel editBttn;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTabbedPane jTabbedPane1;
        private javax.swing.JLabel priceLab1;
        private javax.swing.JTextField productCodeTxt;
        private javax.swing.JLabel productNameLab;
        private javax.swing.JTextField productNameTxt;
        public javax.swing.JPanel productsPanel;
        private javax.swing.JButton refreshBttn;
        private javax.swing.JLabel searchByLab;
        private javax.swing.JTextField searchTxt;
        private javax.swing.JTextField sellingPriceTxt;
        private javax.swing.JTable table;

}
