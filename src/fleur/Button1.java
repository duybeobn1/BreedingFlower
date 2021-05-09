/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Button1 extends JFrame implements ActionListener {

    public Button1() {
        this.setVisible(true);
        initComponents();
        this.setLocation(600,250);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MOM = new javax.swing.JComboBox();
        DAD = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        imageDad = new javax.swing.JLabel();
        imageMom = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel1.setForeground(new java.awt.Color(72, 61, 139));

        jPanel2.setBackground(new java.awt.Color(50, 205, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 300));

        MOM.setForeground(new java.awt.Color(255, 20, 147));
        MOM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Donkey", "Zebra", "Horse", "Pony", "Bison", "Cow", "Sheep", "Goat", "Camel", "Llama", "Brown Bear", "Polar Bear", "Cat", "Leopard Cat", "Lion", "Tiger", "Jaguar", "Wolf", "Dog", "Coyote" }));

        DAD.setForeground(new java.awt.Color(255, 20, 147));
        DAD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Donkey", "Zebra", "Horse", "Pony", "Bison", "Cow", "Sheep", "Goat", "Camel", "Llama", "Brown Bear", "Polar Bear", "Cat", "Leopard Cat", "Lion", "Tiger", "Jaguar", "Wolf", "Dog", "Coyote" }));
        DAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(72, 61, 139));
        jButton1.setForeground(new java.awt.Color(250, 240, 230));
        jButton1.setText("Start ");

        jLabel3.setText("jLabel2");

        imageDad.setBackground(new java.awt.Color(255, 192, 203));
        imageDad.setForeground(new java.awt.Color(255, 192, 203));
        imageDad.setLabelFor(DAD);

        imageMom.setBackground(new java.awt.Color(34, 139, 34));
        imageMom.setForeground(new java.awt.Color(255, 192, 203));
        imageMom.setLabelFor(MOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(imageMom, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(MOM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DAD, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageDad, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(230, 230, 230))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(image1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageMom, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageDad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(328, 328, 328)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MOM.addActionListener(this);
        DAD.addActionListener(this);
        jButton1.addActionListener(this);

        jPanel3.setPreferredSize(new java.awt.Dimension(0, 300));

        jLabel1.setBackground(new java.awt.Color(255, 248, 220));
        jLabel1.setForeground(new java.awt.Color(220, 20, 60));
        jLabel1.setText("Crossbreeds show the results when the parent is in the same family. ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("For example : \n- Horse and Donkey are in odd-toed ungulate so they create a Mule or a Hinny.\n- So on , we have Bison, Cow, Sheep, Goat, Camel, Llama in even toed-ungulate\n- Family fedidae ( colloquially referred to as cats)\n- Family canid ( colloquially referred to as dogs)");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DADActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DAD;
    private javax.swing.JComboBox MOM;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel imageDad;
    private javax.swing.JLabel imageMom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        //MOM
            imageMom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/" + MOM.getSelectedItem().toString() + ".jpg"))); // NOI18N
            imageMom.setLabelFor(MOM);
            repaint();        
        //DAD
            imageDad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/" + DAD.getSelectedItem().toString() + ".jpg"))); // NOI18N
            imageDad.setLabelFor(DAD);
            repaint();
       
        if (ae.getSource() == jButton1) { // start breeding
            //showing cases of mom and dad which are possible

            switch (MOM.getSelectedItem().toString()) {
                case "Donkey":
                    switch (DAD.getSelectedItem().toString()) {
                        case "Donkey":
                            Result1 popUp = new Result1(111);
                            repaint();
                            break;
                        case "Horse":
                            popUp = new Result1(2);
                            repaint();
                            break;
                        case "Zebra" : 
                            popUp = new Result1(5);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                           
                    }
                break;
                case "Zebra":
                    switch (DAD.getSelectedItem().toString()) {
                        case "Zebra":
                            Result1 popUp = new Result1(211);
                            repaint();
                            break;
                        case "Horse":
                            popUp = new Result1(3);
                            repaint();
                            break;
                        case "Pony" : 
                            popUp = new Result1(4);
                            repaint();
                            break;
                        case "Donkey" : 
                            popUp = new Result1(5);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");    
                    }
                break;
                case "Horse":
                    switch(DAD.getSelectedItem().toString()) {
                        case "Horse" : 
                            Result1 popUp = new Result1(311);
                            repaint();
                            break;
                        case "Donkey" : 
                            popUp = new Result1(1);
                            repaint();
                            break;  
                        case "Zebra" : 
                            popUp = new Result1(3);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Pony" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Pony" : 
                            Result1 popUp = new Result1(411);
                            repaint();
                            break;
                        case "Zebra" : 
                            popUp = new Result1(4);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");       
                        
                    }
                break;
                case "Bison":
                    switch(DAD.getSelectedItem().toString()) {
                        case "Bison" : 
                            Result1 popUp = new Result1(511);
                            repaint();
                            break;
                        case "Cow" : 
                            popUp = new Result1(6);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");    
                     }
                break;
                case "Cow":
                    switch(DAD.getSelectedItem().toString()) {
                        case "Cow" : 
                            Result1 popUp = new Result1(611);
                            repaint();
                            break;
                        case "Bison" : 
                            popUp = new Result1(6);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Sheep":
                    switch(DAD.getSelectedItem().toString()) {
                        case "Sheep" : 
                            Result1 popUp = new Result1(711);
                            repaint();
                            break;
                        case "Goat" : 
                            popUp = new Result1(7);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");       
                        
                    }
                break;
                case "Goat" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Goat" : 
                            Result1 popUp = new Result1(811);
                            repaint();
                            break;
                        case "Sheep" : 
                            popUp = new Result1(7);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Camel" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Camel" : 
                            Result1 popUp = new Result1(911);
                            repaint();
                            break;
                        case "Llama" : 
                            popUp = new Result1(8);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Llama" : 
                    switch(DAD.getSelectedItem().toString()) {
                        case "Llama" : 
                            Result1 popUp = new Result1(1111);
                            repaint();
                            break;
                        case "Camel" : 
                            popUp = new Result1(8);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Brown Bear" : 
                    switch(DAD.getSelectedItem().toString()) {
                        case "Brown Bear" : 
                            Result1 popUp = new Result1(1112);
                            repaint();
                            break;
                        case "Polar Bear" : 
                            popUp = new Result1(9);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Polar Bear":
                    switch(DAD.getSelectedItem().toString()) {
                        case "Polar Bear" : 
                            Result1 popUp = new Result1(1113);
                            repaint();
                            break;
                        case "Brown Bear" : 
                            popUp = new Result1(9);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");       
                        
                    }
                break;
                case "Cat" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Cat" : 
                            Result1 popUp = new Result1(1114);
                            repaint();
                            break;
                        case "Leopard Cat" : 
                            popUp = new Result1(10);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Leopard Cat" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Leopard Cat" : 
                            Result1 popUp = new Result1(1115);
                            repaint();
                            break;
                        case "Cat" : 
                            popUp = new Result1(10);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Lion" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Lion" : 
                            Result1 popUp = new Result1(1116);
                            repaint();
                            break;
                        case "Tiger" : 
                            popUp = new Result1(11);
                            repaint();
                            break;
                        case "Jaguar" : 
                            popUp = new Result1(12);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Tiger" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Tiger" : 
                            Result1 popUp = new Result1(1117);
                            repaint();
                            break;
                        case "Lion" : 
                            popUp = new Result1(11);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");       
                        
                    }
                break;
                case "Jaguar" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Jaguar" : 
                            Result1 popUp = new Result1(1118);
                            repaint();
                            break;
                        case "Lion" : 
                            popUp = new Result1(12);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Dog" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Dog" : 
                            Result1 popUp = new Result1(1119);
                            repaint();
                            break;
                        case "Wolf" : 
                            popUp = new Result1(13);
                            repaint();
                            break;
                         case "Coyote" : 
                            popUp = new Result1(14);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                        
                    }
                break;
                case "Wolf" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Wolf" : 
                            Result1 popUp = new Result1(1121);
                            repaint();
                            break;
                        case "Dog" : 
                            popUp = new Result1(13);
                            repaint();
                            break;
                        case "Coyote" : 
                            popUp = new Result1(15);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");        
                            break;
                        
                    }
                break;
                case "Coyote" :
                    switch(DAD.getSelectedItem().toString()) {
                        case "Coyote" : 
                            Result1 popUp = new Result1(1122);
                            repaint();
                            break;
                        case "Dog" : 
                            popUp = new Result1(14);
                            repaint();
                            break;
                        case "Wolf" : 
                            popUp = new Result1(15);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Impossible to crossbreed, please try again");   
                            break;
                        
                    }
                break;
            }
        }
    }
}

