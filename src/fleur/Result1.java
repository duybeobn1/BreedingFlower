/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleur;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class Result1 extends javax.swing.JFrame {

    /**
     * Creates new form Result1
     */
    public Result1(int i) {
        setVisible(true);
        this.setLocation(600,250);
        initComponents();
        //search cases that was setting in button1
        switch (i) {
            case 111:
                textResult.setText("You have sucessfully create a Donkey!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Donkey.jpg")));
                break;
            case 211:
                textResult.setText("You have sucessfully create a Zebra!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Zebra.jpg")));
                break;
            case 311:
                textResult.setText("You have sucessfully create a Horse!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Horse.jpg")));
                break;
            case 411:
                textResult.setText("You have sucessfully create a Pony!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Pony.jpg")));
                break;
            case 511:
                textResult.setText("You have sucessfully create a Bison!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Bison.jpg")));
                break;
            case 611:
                textResult.setText("You have sucessfully create a Cow!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Cow.jpg")));
                break;
            case 711:
                textResult.setText("You have sucessfully create a Sheep!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Sheep.jpg")));
                break;
            case 811:
                textResult.setText("You have sucessfully create a Goat!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Goat.jpg")));
                break;
            case 911:
                textResult.setText("You have sucessfully create a Camel!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Camel.jpg")));
                break;
            case 1111:
                textResult.setText("You have sucessfully create a Llama!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Llama.jpg")));
                break;
            case 1112:
                textResult.setText("You have sucessfully create a Grizzly Bear!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Brown.jpg")));
                break;
            case 1113:
                textResult.setText("You have sucessfully create a Polar Bear!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Polar.jpg")));
                break;
            case 1114:
                textResult.setText("You have sucessfully create a Domestic Cat");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Cat.jpg")));
                break;
            case 1115:
                textResult.setText("You have sucessfully create an Asian Leopard Cat");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Leopard.jpg")));
                break;
            case 1116:
                textResult.setText("You have sucessfully create a Lion");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Lion.jpg")));
                break;
            case 1117:
                textResult.setText("You have sucessfully create a Tiger");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Tiger.jpg")));
                break;
            case 1118:
                textResult.setText("You have sucessfully create a Jaguar");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Jaguar.jpg")));
                break;
            case 1119:
                textResult.setText("You have sucessfully create a Domestic Dog!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Dog.jpg")));
                break;
            case 1121:
                textResult.setText("You have sucessfully create a Wolf!!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Wolf.jpg")));
                break;
            case 1122:
                textResult.setText("You have sucessfully create a Coyote");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Coyote.jpg")));
                break;
            case 1:
                textResult.setText("You have sucessfully create a Mule");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Mule.jpg")));
                break;
            case 2:
                textResult.setText("You have sucessfully create a Hinny");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Hinny.jpg")));
                break;
            case 3:
                textResult.setText("You have sucessfully create a Zorse");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Zorse.jpg")));
                break;
            case 4:
                textResult.setText("You have sucessfully create a Zony");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Zony.jpg")));
                break;
            case 5:
                textResult.setText("You have sucessfully create a Zonkey");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Zonkey.jpg")));
                break;
            case 6:
                textResult.setText("You have sucessfully create a Beefalo");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Beefalo.jpg")));
                break;
            case 7:
                textResult.setText("You have sucessfully create a Shoat");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Shoat.jpg")));
                break;
            case 8:
                textResult.setText("You have sucessfully create a Cama");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Cama.jpg")));
                break;
            case 9:
                textResult.setText("You have sucessfully create a Grolar Bear");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Grolar.jpg")));
                break;
            case 10:
                textResult.setText("You have sucessfully create a Bengal Cat");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Bengal.jpg")));
                break;
            case 11:
                textResult.setText("You have sucessfully create a Liger");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Liger.jpg")));
                break;
            case 12:
                textResult.setText("You have sucessfully create a Jaglion");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Jaglion.jpg")));
                break;
            case 13:
                textResult.setText("You have sucessfully create a Black Wolf!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Black.jpg")));
                break;
            case 14:
                textResult.setText("You have sucessfully create a Coydog!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Coydog.jpg")));
                break;
            case 15:
                textResult.setText("You have sucessfully create a Coywolf!");
                imgResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img/Coywolf.jpg")));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgResult = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textResult = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        imgResult.setBackground(new java.awt.Color(255, 105, 180));
        imgResult.setForeground(new java.awt.Color(255, 105, 180));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgResult, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );

        textResult.setBackground(new java.awt.Color(255, 105, 180));
        textResult.setForeground(new java.awt.Color(255, 105, 180));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textResult, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgResult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textResult;
    // End of variables declaration//GEN-END:variables
}
