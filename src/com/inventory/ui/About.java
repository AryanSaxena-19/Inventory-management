package com.inventory.ui;



public class About extends javax.swing.JPanel{


public About() {
      initComponents();
}  

@SuppressWarnings("unchecked")

private void initComponents(){

    mainPanel = new javax.swing.JPanel();
    jLayeredPane1 = new javax.swing.JLayeredPane();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();



    jLabel1.setFont(new java.awt.Font("Comfortaa", 0, 24));
    jLabel1.setText("Developer Info");


    jLabel2.setFont(new java.awt.Font("Comfortaa", 0, 14));
    jLabel2.setForeground(new java.awt.Color(0, 0, 102));
    jLabel2.setText("Name: Aryan Saxena");


    jLabel3.setFont(new java.awt.Font("Comfortaa", 0, 14));
    jLabel3.setForeground(new java.awt.Color(0, 0, 102));
    jLabel3.setText("Email Id: aryansaxena224@gmail.com");

    jLabel5.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 0, 102));
    jLabel5.setText("Website: https://www.linkedin.com/in/aryan-saxena-aaa19chinu/");


    jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
    jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
    jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
    jLayeredPane1.setLayout(jLayeredPane1Layout);
    jLayeredPane1Layout.setHorizontalGroup(
        jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jLayeredPane1Layout.createSequentialGroup()
            .addGap(150, 150, 150)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel5)
                .addComponent(jLabel1))
            .addContainerGap(133, Short.MAX_VALUE))
    );
    jLayeredPane1Layout.setVerticalGroup(
        jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jLayeredPane1Layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(jLabel1)
            .addGap(41, 41, 41)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel5)
            .addContainerGap(94, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
    mainPanel.setLayout(mainPanelLayout);
    mainPanelLayout.setHorizontalGroup(
        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(mainPanelLayout.createSequentialGroup()
            .addGap(44, 44, 44)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(176, Short.MAX_VALUE))
    );
    mainPanelLayout.setVerticalGroup(
        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(mainPanelLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(112, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
}
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel5;
private javax.swing.JLayeredPane jLayeredPane1;
private javax.swing.JPanel mainPanel;

}


