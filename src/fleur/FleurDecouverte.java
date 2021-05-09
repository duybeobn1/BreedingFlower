/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleur;

import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.List;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorModel;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FleurDecouverte extends javax.swing.JFrame implements ActionListener {

    public FleurDecouverte() {
        initComponents();
        this.setLocation(600, 250);
        setVisible(true);
        JOptionPane.showMessageDialog(this, "Please select a type of flower and the genes to start.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rMom = new javax.swing.ButtonGroup();
        yMom = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        wMom = new javax.swing.ButtonGroup();
        sMom = new javax.swing.ButtonGroup();
        rDad = new javax.swing.ButtonGroup();
        yDad = new javax.swing.ButtonGroup();
        wDad = new javax.swing.ButtonGroup();
        sDad = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        typeFleur = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        result3 = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        r0Mom = new javax.swing.JRadioButton();
        y0Mom = new javax.swing.JRadioButton();
        w0Mom = new javax.swing.JRadioButton();
        s0Mom = new javax.swing.JRadioButton();
        r1Mom = new javax.swing.JRadioButton();
        y1Mom = new javax.swing.JRadioButton();
        w1Mom = new javax.swing.JRadioButton();
        s1Mom = new javax.swing.JRadioButton();
        r2Mom = new javax.swing.JRadioButton();
        y2Mom = new javax.swing.JRadioButton();
        w2Mom = new javax.swing.JRadioButton();
        s2Mom = new javax.swing.JRadioButton();
        s2Dad = new javax.swing.JRadioButton();
        s1Dad = new javax.swing.JRadioButton();
        s0Dad = new javax.swing.JRadioButton();
        w0Dad = new javax.swing.JRadioButton();
        w1Dad = new javax.swing.JRadioButton();
        w2Dad = new javax.swing.JRadioButton();
        y2Dad = new javax.swing.JRadioButton();
        r2Dad = new javax.swing.JRadioButton();
        r1Dad = new javax.swing.JRadioButton();
        y1Dad = new javax.swing.JRadioButton();
        y0Dad = new javax.swing.JRadioButton();
        r0Dad = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        rMom.add(r0Mom);rMom.add(r1Mom);rMom.add(r2Mom);

        yMom.add(y0Mom);
        yMom.add(y1Mom);
        yMom.add(y2Mom);

        jButton1.setText("jButton1");

        wMom.add(w0Mom);
        wMom.add(w1Mom);
        wMom.add(w2Mom);

        sMom.add(s0Mom);
        sMom.add(s1Mom);
        sMom.add(s2Mom);

        rDad.add(r0Dad);
        rDad.add(r1Dad);
        rDad.add(r2Dad);

        yDad.add(y0Dad);
        yDad.add(y1Dad);
        yDad.add(y2Dad);

        wDad.add(w0Dad);
        wDad.add(w1Dad);
        wDad.add(w2Dad);

        sDad.add(s0Dad);
        sDad.add(s1Dad);
        sDad.add(s2Dad);

        typeFleur.setForeground(new java.awt.Color(0, 0, 196));
        typeFleur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Roses", "Cosmos", "Lilies", "Pansies", "Tulips" }));

        result3.setBackground(new java.awt.Color(176, 224, 230));
        jScrollPane1.setViewportView(result3);

        jLabel5.setText("MOM");

        jLabel6.setText("DAD");

        startButton.setBackground(new java.awt.Color(220, 20, 60));
        startButton.setForeground(new java.awt.Color(255, 255, 0));
        startButton.setText("Start");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        r0Mom.setText("0");

        y0Mom.setText("0");

        w0Mom.setText("0");

        s0Mom.setText("0");

        r1Mom.setText("1");

        y1Mom.setText("1");

        w1Mom.setText("1");

        s1Mom.setText("1");

        r2Mom.setText("2");

        y2Mom.setText("2");

        w2Mom.setText("2");

        s2Mom.setText("2");

        s2Dad.setText("2");

        s1Dad.setText("1");

        s0Dad.setText("0");

        w0Dad.setText("0");

        w1Dad.setText("1");

        w2Dad.setText("2");

        y2Dad.setText("2");

        r2Dad.setText("2");

        r1Dad.setText("1");

        y1Dad.setText("1");

        y0Dad.setText("0");

        r0Dad.setText("0");

        jLabel1.setText("Gen R");

        jLabel2.setText("Gen Y");

        jLabel3.setText("Gen W");

        jLabel4.setText("Gen S");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(r0Mom)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(r1Mom)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(r2Mom))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(y0Mom)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(y1Mom)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(y2Mom)))
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(s0Mom)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s1Mom)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s2Mom)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4)
                                            .addGap(1, 1, 1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(w0Mom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(w1Mom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(w2Mom)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(r0Dad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(r1Dad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(r2Dad))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(y0Dad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y1Dad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y2Dad))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(w0Dad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(w1Dad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(w2Dad))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(s0Dad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s1Dad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s2Dad)))))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(typeFleur, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(typeFleur, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r0Mom)
                            .addComponent(r1Mom)
                            .addComponent(r2Mom)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y0Mom)
                            .addComponent(y1Mom)
                            .addComponent(y2Mom)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(w0Mom)
                            .addComponent(w1Mom)
                            .addComponent(w2Mom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s0Mom)
                            .addComponent(s1Mom)
                            .addComponent(s2Mom)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r0Dad)
                            .addComponent(r1Dad)
                            .addComponent(r2Dad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y0Dad)
                            .addComponent(y1Dad)
                            .addComponent(y2Dad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(w0Dad)
                            .addComponent(w1Dad)
                            .addComponent(w2Dad)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s0Dad)
                            .addComponent(s1Dad)
                            .addComponent(s2Dad))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        startButton.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r0Dad;
    private javax.swing.JRadioButton r0Mom;
    private javax.swing.JRadioButton r1Dad;
    private javax.swing.JRadioButton r1Mom;
    private javax.swing.JRadioButton r2Dad;
    private javax.swing.JRadioButton r2Mom;
    private javax.swing.ButtonGroup rDad;
    private javax.swing.ButtonGroup rMom;
    private javax.swing.JEditorPane result3;
    private javax.swing.JRadioButton s0Dad;
    private javax.swing.JRadioButton s0Mom;
    private javax.swing.JRadioButton s1Dad;
    private javax.swing.JRadioButton s1Mom;
    private javax.swing.JRadioButton s2Dad;
    private javax.swing.JRadioButton s2Mom;
    private javax.swing.ButtonGroup sDad;
    private javax.swing.ButtonGroup sMom;
    private javax.swing.JButton startButton;
    private javax.swing.JComboBox typeFleur;
    private javax.swing.JRadioButton w0Dad;
    private javax.swing.JRadioButton w0Mom;
    private javax.swing.JRadioButton w1Dad;
    private javax.swing.JRadioButton w1Mom;
    private javax.swing.JRadioButton w2Dad;
    private javax.swing.JRadioButton w2Mom;
    private javax.swing.ButtonGroup wDad;
    private javax.swing.ButtonGroup wMom;
    private javax.swing.JRadioButton y0Dad;
    private javax.swing.JRadioButton y0Mom;
    private javax.swing.JRadioButton y1Dad;
    private javax.swing.JRadioButton y1Mom;
    private javax.swing.JRadioButton y2Dad;
    private javax.swing.JRadioButton y2Mom;
    private javax.swing.ButtonGroup yDad;
    private javax.swing.ButtonGroup yMom;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        ReadData rc = new ReadData();
        if (ae.getSource() == startButton) {
            //these strings for stocking gens which are created form gen r y w s from mom and dad simply created by binaire
            String r = "", y = "", w = "", s = "";
            String result5 = "";
            ArrayList<String> valeur = new ArrayList<String>();
            ArrayList<String> tr = new ArrayList<String>();
            ArrayList<String> ty = new ArrayList<String>();
            ArrayList<String> tw = new ArrayList<String>();
            ArrayList<String> ts = new ArrayList<String>();

            //Gen r 
            if (r0Mom.isSelected()) {
                if (r0Dad.isSelected()) {
                    r = "Gen R : 0x0 -> 0";
                    tr.add("0");
                }
                if (r1Dad.isSelected()) {
                    r = "Gen R : 0x1 -> (0,1)";
                    tr.add("0");
                    tr.add("1");
                }
                if (r2Dad.isSelected()) {
                    r = "Gen R : 0x2 -> 1";
                    tr.add("1");
                }
            }
            if (r1Mom.isSelected()) {
                if (r0Dad.isSelected()) {
                    r = "Gen R : 0x1 -> (0,1)";
                    tr.add("0");
                    tr.add("1");
                }
                if (r1Dad.isSelected()) {
                    r = "Gen R : 1x1 -> (0,1,2)";
                    tr.add("0");
                    tr.add("1");
                    tr.add("2");
                }
                if (r2Dad.isSelected()) {
                    r = "Gen R : 1x2 -> (1,2)";
                    tr.add("1");
                    tr.add("2");
                }
            }
            if (r2Mom.isSelected()) {
                if (r0Dad.isSelected()) {
                    r = "Gen R : 2x0 -> 1";
                    tr.add("1");
                }
                if (r1Dad.isSelected()) {
                    r = "Gen R : 2x1 -> (1,2)";
                    tr.add("1");
                    tr.add("2");
                }
                if (r2Dad.isSelected()) {
                    r = "Gen R : 2x2 -> 2";
                    tr.add("2");
                }
            }
            //Gen y
            if (y0Mom.isSelected()) {
                if (y0Dad.isSelected()) {
                    y = "Gen Y : 0x0 -> 0";
                    ty.add("0");
                }
                if (y1Dad.isSelected()) {
                    y = "Gen Y : 0x1 -> (0,1)";
                    ty.add("0");
                    ty.add("1");
                }
                if (y2Dad.isSelected()) {
                    y = "Gen Y : 0x2 -> 1";
                    ty.add("1");
                }
            }
            if (y1Mom.isSelected()) {
                if (y0Dad.isSelected()) {
                    y = "Gen Y : 0x1 -> (0,1)";
                    ty.add("0");
                    ty.add("1");
                }
                if (y1Dad.isSelected()) {
                    y = "Gen Y  : 1x1 -> (0,1,2)";
                    ty.add("0");
                    ty.add("1");
                    ty.add("2");
                }
                if (y2Dad.isSelected()) {
                    y = "Gen Y : 1x2 -> (1,2)";
                    ty.add("1");
                    ty.add("2");
                }
            }
            if (y2Mom.isSelected()) {
                if (y0Dad.isSelected()) {
                    y = "Gen Y : 2x0 -> 1";
                    ty.add("1");
                }
                if (y1Dad.isSelected()) {
                    y = "Gen Y : 2x1 -> (1,2)";
                    ty.add("1");
                    ty.add("2");
                }
                if (y2Dad.isSelected()) {
                    y = "Gen Y : 2x2 -> 2";
                    ty.add("2");
                }
            }
            //Gen w
            if (w0Mom.isSelected()) {
                if (w0Dad.isSelected()) {
                    w = "Gen W : 0x0 -> 0";
                    tw.add("0");
                }
                if (w1Dad.isSelected()) {
                    w = "Gen W : 0x1 -> (0,1)";
                    tw.add("0");
                    tw.add("1");
                }
                if (w2Dad.isSelected()) {
                    w = "Gen W : 0x2 -> 1";
                    tw.add("1");
                }
            }
            if (w1Mom.isSelected()) {
                if (w0Dad.isSelected()) {
                    w = "Gen W : 0x1 -> (0,1)";
                    tw.add("0");
                    tw.add("1");
                }
                if (w1Dad.isSelected()) {
                    w = "Gen W : 1x1 -> (0,1,2)";
                    tw.add("0");
                    tw.add("1");
                    tw.add("2");
                }
                if (w2Dad.isSelected()) {
                    w = "Gen W : 1x2 -> (1,2)";
                    tw.add("1");
                    tw.add("2");
                }
            }
            if (w2Mom.isSelected()) {
                if (w0Dad.isSelected()) {
                    w = "Gen W : 2x0 -> 1";
                    tw.add("1");
                }
                if (w1Dad.isSelected()) {
                    w = "Gen W : 2x1 -> (1,2)";
                    tw.add("1");
                    tw.add("2");
                }
                if (w2Dad.isSelected()) {
                    w = "Gen W : 2x2 -> 2";
                    tw.add("2");
                }
            }
            if (typeFleur.getSelectedItem().toString() == "Roses") {
                //gen S
                if (s0Mom.isSelected()) {
                    if (s0Dad.isSelected()) {
                        s = "Gen S : 0x0 -> 0";
                        ts.add("0");
                    }
                    if (s1Dad.isSelected()) {
                        s = "Gen S : 0x1 -> (0,1)";
                        ts.add("0");
                        ts.add("1");
                    }
                    if (s2Dad.isSelected()) {
                        s = "Gen S : 0x2 -> 1";
                        ts.add("1");
                    }
                }
                if (s1Mom.isSelected()) {
                    if (s0Dad.isSelected()) {
                        s = "Gen S : 0x1 -> (0,1)";
                        ts.add("0");
                        ts.add("1");
                    }
                    if (s1Dad.isSelected()) {
                        s = "Gen S : 1x1 -> (0,1,2)";
                        ts.add("0");
                        ts.add("1");
                        ts.add("2");
                    }
                    if (s2Dad.isSelected()) {
                        s = "Gen S : 1x2 -> (1,2)";
                        ts.add("1");
                        ts.add("2");
                    }
                }
                if (s2Mom.isSelected()) {
                    if (s0Dad.isSelected()) {
                        s = "Gen S : 2x0 -> 1";
                        ts.add("1");
                    }
                    if (s1Dad.isSelected()) {
                        s = "Gen S : 2x1 -> (1,2)";
                        ts.add("1");
                        ts.add("2");
                    }
                    if (s2Dad.isSelected()) {
                        s = "Gen S : 2x2 -> 2";
                        ts.add("2");;
                    }
                }
                for (String x1 : tr) {
                    for (String x2 : ty) {
                        for (String x3 : tw) {
                            for (String x4 : ts) {
                                valeur.add((x1 + x2 + x3 + x4));

                            }
                        }
                    }
                }
                double rose_color_White = 0, rose_color_Red = 0, rose_color_Yellow = 0, rose_color_Black = 0, rose_color_Blue = 0, rose_color_HybridRed = 0,
                        rose_color_Orange = 0, rose_color_Pink = 0, rose_color_Purple = 0;
                String rose_White = "", rose_Red = "", rose_Yellow = "", rose_Black = "", rose_Blue = "", rose_HybridRed = "", rose_Orange = "", rose_Pink = "", rose_Purple = "";

                rc.ReadData("Roses");
                HashMap<Integer, String> rose_map = new HashMap<>();
                //stocking genes from possible cases
                for (int i = 0; i < 81; i++) {
                //compare to 81 genes case of rose and stock in another hashmap if the cases are right
                    rose_map.put(rc.ReadNumber(i, 0), rc.ReadColor(i, 1));
                }
                Set<Map.Entry<Integer, String>> setHashMap = rose_map.entrySet();
                for (String x : valeur) {
                    for (Map.Entry<Integer, String> i : setHashMap) {
                        if (Integer.parseInt(x) == i.getKey()) {
                            //to calculate the % of each color which are created
                            switch (i.getValue()) {
                                case "White":
                                    rose_color_White++;
                                    break;
                                case "Yellow":
                                    rose_color_Yellow++;
                                    break;
                                case "Red":
                                    rose_color_Red++;
                                    break;
                                case "Black":
                                    rose_color_Black++;
                                    break;
                                case "Blue":
                                    rose_color_Blue++;
                                    break;
                                case "HybridRed":
                                    rose_color_HybridRed++;
                                    break;
                                case "Orange":
                                    rose_color_Orange++;
                                    break;
                                case "Pink":
                                    rose_color_Pink++;
                                    break;
                                case "Purple":
                                    rose_color_Purple++;
                                    break;
                            }
                        }
                        if (rose_color_White == 0) {
                            rose_White = "";
                        } else {
                            rose_White = "White Rose : " + Math.round(rose_color_White / valeur.size() * 100) + " % \n";
                        }
                        if (rose_color_Yellow == 0) {
                            rose_Yellow = "";
                        } else {
                            rose_Yellow = "Yellow Rose :" + Math.round(rose_color_Yellow / valeur.size() * 100) + "% \n";
                        }
                        if (rose_color_Red == 0) {
                            rose_Red = "";
                        } else {
                            rose_Red = "Red Rose : " + Math.round(rose_color_Red / valeur.size() * 100) + " % \n";
                        }
                        if (rose_color_Black == 0) {
                            rose_Black = "";
                        } else {
                            rose_Black = "Black Rose : " + Math.round(rose_color_Black / valeur.size() * 100) + " % \n";
                        }
                        if (rose_color_Blue == 0) {
                            rose_Blue = "";
                        } else {
                            rose_Blue = "Blue Rose : " + Math.round(rose_color_Blue / valeur.size() * 100) + " % \n";
                        }
                        if (rose_color_HybridRed == 0) {
                            rose_HybridRed = "";
                        } else {
                            rose_HybridRed = "HybridRed Rose : " + Math.round(rose_color_HybridRed / valeur.size() * 100) + " % \n";
                        }
                        if (rose_color_Orange == 0) {
                            rose_Orange = "";
                        } else {
                            rose_Orange = "Orange Rose : " + Math.round(rose_color_Orange / valeur.size() * 100) + " % \n ";
                        }
                        if (rose_color_Pink == 0) {
                            rose_Pink = "";
                        } else {
                            rose_Pink = "Pink Rose : " + Math.round(rose_color_Pink / valeur.size() * 100) + " % \n";
                        }
                        if (rose_color_Purple == 0) {
                            rose_Purple = "";
                        } else {
                            rose_Purple = "Purple Rose : " + Math.round(rose_color_Purple / valeur.size() * 100) + " % \n";
                        }
                    }
                }
                String pct = rose_White + rose_Red + rose_Yellow + rose_Black + rose_Blue + rose_HybridRed + rose_Orange + rose_Pink + rose_Purple;
                result3.setText(r + "\n" + y + "\n" + w + "\n" + s + "\n"
                        + "Result : \n" + pct);
            }
            if (typeFleur.getSelectedItem() == "Cosmos") {
                for (String x1 : tr) {
                    for (String x2 : ty) {
                        for (String x3 : tw) {
                            valeur.add((x1 + x2 + x3));
                        }
                    }
                }
                double cosmos_color_White = 0, cosmos_color_Yellow = 0, cosmos_color_Red = 0, cosmos_color_Orange = 0, cosmos_color_Pink = 0, cosmos_color_Black = 0;

                String cosmos_White = "", cosmos_Yellow = "", cosmos_Red = "", cosmos_Orange = "", cosmos_Pink = "", cosmos_Black = "";

                rc.ReadData("Cosmos");
                HashMap<Integer, String> cosmos_map = new HashMap<>();
                for (int i = 0; i < 27; i++) {
                    cosmos_map.put(rc.ReadNumber(i, 0), rc.ReadColor(i, 1));
                }
                Set<Map.Entry<Integer, String>> setHashMap = cosmos_map.entrySet();
                for (String x : valeur) {
                    for (Map.Entry<Integer, String> i : setHashMap) {
                        if (Integer.parseInt(x) == i.getKey()) {
                            switch (i.getValue()) {
                                case "White":
                                    cosmos_color_White++;
                                    break;
                                case "Yellow":
                                    cosmos_color_Yellow++;
                                    break;
                                case "Red":
                                    cosmos_color_Red++;
                                    break;
                                case "Orange":
                                    cosmos_color_Orange++;
                                    break;
                                case "Pink":
                                    cosmos_color_Pink++;
                                    break;
                                case "Black ":
                                    cosmos_color_Black++;
                                    break;
                            }
                        }

                        if (cosmos_color_White == 0) {
                            cosmos_White = "";
                        } else {
                            cosmos_White = " White cosmos : " + Math.round(cosmos_color_White / valeur.size() * 100) + " % \n";
                        }

                        if (cosmos_color_Red == 0) {
                            cosmos_Red = "";
                        } else {
                            cosmos_Red = "Red cosmos : " + Math.round(cosmos_color_Red / valeur.size() * 100) + " % \n";
                        }

                        if (cosmos_color_Yellow == 0) {
                            cosmos_Yellow = "";
                        } else {
                            cosmos_Yellow = "Yellow cosmos : " + Math.round(cosmos_color_Yellow / valeur.size() * 100) + " % \n";

                        }
                        if (cosmos_color_Orange == 0) {
                            cosmos_Orange = "";
                        } else {
                            cosmos_Orange = "Orange cosmos : " + Math.round(cosmos_color_Orange / valeur.size() * 100) + " % \n";
                        }
                        if (cosmos_color_Pink == 0) {
                            cosmos_Pink = "";
                        } else {
                            cosmos_Pink = "Pink cosmos : " + Math.round(cosmos_color_Pink / valeur.size() * 100) + " % \n";
                        }
                        if (cosmos_color_Black == 0) {
                            cosmos_Black = "";
                        } else {
                            cosmos_Black = "Black cosmos : " + Math.round(cosmos_color_Black / valeur.size() * 100) + "% \n";
                        }

                    }
                }

                String pct = cosmos_White + cosmos_Yellow + cosmos_Red + cosmos_Orange + cosmos_Pink + cosmos_Black;
                result3.setText(r + "\n" + y + "\n" + w + "\n"
                        + "Result : \n" + pct);
            }
            if (typeFleur.getSelectedItem() == "Lilies") {
                for (String x1 : tr) {
                    for (String x2 : ty) {
                        for (String x3 : tw) {
                            valeur.add((x1 + x2 + x3));
                        }
                    }
                }
                double lilies_color_White = 0, lilies_color_Yellow = 0, lilies_color_Red = 0, lilies_color_Orange = 0, lilies_color_Pink = 0, lilies_color_Black = 0;

                String lilies_White = "", lilies_Yellow = "", lilies_Red = "", lilies_Orange = "", lilies_Pink = "", lilies_Black = "";
                rc.ReadData("Lilies");
                HashMap<Integer, String> lilies_map = new HashMap<>();
                for (int i = 0; i < 27; i++) {
                    lilies_map.put(rc.ReadNumber(i, 0), rc.ReadColor(i, 1));
                }
                Set<Map.Entry<Integer, String>> setHashMap = lilies_map.entrySet();
                for (String x : valeur) {
                    for (Map.Entry<Integer, String> i : setHashMap) {
                        if (Integer.parseInt(x) == i.getKey()) {
                            switch (i.getValue()) {
                                case "White":
                                    lilies_color_White++;
                                    break;
                                case "Yellow":
                                    lilies_color_Yellow++;
                                    break;
                                case "Red":
                                    lilies_color_Red++;
                                    break;
                                case "Orange":
                                    lilies_color_Orange++;
                                    break;
                                case "Pink":
                                    lilies_color_Pink++;
                                    break;
                                case "Black ":
                                    lilies_color_Black++;
                                    break;
                            }
                        }

                        if (lilies_color_White == 0) {
                            lilies_White = "";
                        } else {
                            lilies_White = " White lilies : " + Math.round(lilies_color_White / valeur.size() * 100) + " % \n";
                        }

                        if (lilies_color_Red == 0) {
                            lilies_Red = "";
                        } else {
                            lilies_Red = "Red lilies : " + Math.round(lilies_color_Red / valeur.size() * 100) + " % \n";
                        }

                        if (lilies_color_Yellow == 0) {
                            lilies_Yellow = "";
                        } else {
                            lilies_Yellow = "Yellow lilies : " + Math.round(lilies_color_Yellow / valeur.size() * 100) + " % \n";

                        }
                        if (lilies_color_Orange == 0) {
                            lilies_Orange = "";
                        } else {
                            lilies_Orange = "Orange lilies : " + Math.round(lilies_color_Orange / valeur.size() * 100) + " % \n";
                        }
                        if (lilies_color_Pink == 0) {
                            lilies_Pink = "";
                        } else {
                            lilies_Pink = "Pink lilies : " + Math.round(lilies_color_Pink / valeur.size() * 100) + " % \n";
                        }
                        if (lilies_color_Black == 0) {
                            lilies_Black = "";
                        } else {
                            lilies_Black = "Black lilies : " + Math.round(lilies_color_Black / valeur.size() * 100) + "% \n";
                        }

                    }
                }
                String pct = lilies_White + lilies_Yellow + lilies_Red + lilies_Orange + lilies_Pink + lilies_Black;
                result3.setText(r + "\n" + y + "\n" + w + "\n"
                        + "Result : \n" + pct);

            }
            if (typeFleur.getSelectedItem() == "Pansies") {
                for (String x1 : tr) {
                    for (String x2 : ty) {
                        for (String x3 : tw) {
                            valeur.add((x1 + x2 + x3));
                        }
                    }
                }
                rc.ReadData("Pansies");
                double pansies_color_White = 0, pansies_color_Yellow = 0, pansies_color_Red = 0, pansies_color_Orange = 0, pansies_color_Purple = 0, pansies_color_Blue = 0;

                String pansies_White = "", pansies_Yellow = "", pansies_Red = "", pansies_Orange = "", pansies_Purple = "", pansies_Blue = "";
                rc.ReadData("Pansies");
                HashMap<Integer, String> pansies_map = new HashMap<>();
                for (int i = 0; i < 27; i++) {
                    pansies_map.put(rc.ReadNumber(i, 0), rc.ReadColor(i, 1));
                }
                Set<Map.Entry<Integer, String>> setHashMap = pansies_map.entrySet();
                for (String x : valeur) {
                    for (Map.Entry<Integer, String> i : setHashMap) {
                        if (Integer.parseInt(x) == i.getKey()) {
                            switch (i.getValue()) {
                                case "White":
                                    pansies_color_White++;
                                    break;
                                case "Yellow":
                                    pansies_color_Yellow++;
                                    break;
                                case "Red":
                                    pansies_color_Red++;
                                    break;
                                case "Orange":
                                    pansies_color_Orange++;
                                    break;
                                case "Purple":
                                    pansies_color_Purple++;
                                    break;
                                case "Blue ":
                                    pansies_color_Blue++;
                                    break;
                            }
                        }

                        if (pansies_color_White == 0) {
                            pansies_White = "";
                        } else {
                            pansies_White = " White pansies : " + Math.round(pansies_color_White / valeur.size() * 100) + " % \n";
                        }

                        if (pansies_color_Red == 0) {
                            pansies_Red = "";
                        } else {
                            pansies_Red = "Red pansies : " + Math.round(pansies_color_Red / valeur.size() * 100) + " % \n";
                        }

                        if (pansies_color_Yellow == 0) {
                            pansies_Yellow = "";
                        } else {
                            pansies_Yellow = "Yellow pansies : " + Math.round(pansies_color_Yellow / valeur.size() * 100) + " % \n";

                        }
                        if (pansies_color_Orange == 0) {
                            pansies_Orange = "";
                        } else {
                            pansies_Orange = "Orange pansies : " + Math.round(pansies_color_Orange / valeur.size() * 100) + " % \n";
                        }
                        if (pansies_color_Purple == 0) {
                            pansies_Purple = "";
                        } else {
                            pansies_Purple = "Purple pansies : " + Math.round(pansies_color_Purple / valeur.size() * 100) + " % \n";
                        }
                        if (pansies_color_Blue == 0) {
                            pansies_Blue = "";
                        } else {
                            pansies_Blue = "Blue pansies : " + Math.round(pansies_color_Blue / valeur.size() * 100) + "% \n";
                        }

                    }
                }
                String pct = pansies_White + pansies_Yellow + pansies_Red + pansies_Orange + pansies_Purple + pansies_Blue;
                result3.setText(r + "\n" + y + "\n" + w + "\n"
                        + "Result : \n" + pct);

            }
            if (typeFleur.getSelectedItem() == "Tulips") {
                for (String x1 : tr) {
                    for (String x2 : ty) {
                        for (String x3 : tw) {
                            valeur.add((x1 + x2 + x3));
                        }
                    }
                }
                rc.ReadData("Tulips");
                double tulips_color_White = 0, tulips_color_Yellow = 0, tulips_color_Red = 0, tulips_color_Orange = 0, tulips_color_Purple = 0, tulips_color_Pink = 0, tulips_color_Black = 0;

                String tulips_White = "", tulips_Yellow = "", tulips_Red = "", tulips_Orange = "", tulips_Purple = "", tulips_Black = "", tulips_Pink = "";
                HashMap<Integer, String> tulips_map = new HashMap<>();
                for (int i = 0; i < 27; i++) {
                    tulips_map.put(rc.ReadNumber(i, 0), rc.ReadColor(i, 1));
                }
                Set<Map.Entry<Integer, String>> setHashMap = tulips_map.entrySet();
                for (String x : valeur) {
                    for (Map.Entry<Integer, String> i : setHashMap) {
                        if (Integer.parseInt(x) == i.getKey()) {
                            switch (i.getValue()) {
                                case "White":
                                    tulips_color_White++;
                                    break;
                                case "Yellow":
                                    tulips_color_Yellow++;
                                    break;
                                case "Red":
                                    tulips_color_Red++;
                                    break;
                                case "Orange":
                                    tulips_color_Orange++;
                                    break;
                                case "Purple":
                                    tulips_color_Purple++;
                                    break;
                                case "Black":
                                    tulips_color_Black++;
                                    break;
                                case "Pink":
                                    tulips_color_Pink++;
                                    break;
                            }
                        }

                        if (tulips_color_White == 0) {
                            tulips_White = "";
                        } else {
                            tulips_White = " White tulips : " + Math.round(tulips_color_White / valeur.size() * 100) + " % \n";
                        }

                        if (tulips_color_Red == 0) {
                            tulips_Red = "";
                        } else {
                            tulips_Red = "Red tulips : " + Math.round(tulips_color_Red / valeur.size() * 100) + " % \n";
                        }

                        if (tulips_color_Yellow == 0) {
                            tulips_Yellow = "";
                        } else {
                            tulips_Yellow = "Yellow tulips : " + Math.round(tulips_color_Yellow / valeur.size() * 100) + " % \n";

                        }
                        if (tulips_color_Orange == 0) {
                            tulips_Orange = "";
                        } else {
                            tulips_Orange = "Orange tulips : " + Math.round(tulips_color_Orange / valeur.size() * 100) + " % \n";
                        }
                        if (tulips_color_Purple == 0) {
                            tulips_Purple = "";
                        } else {
                            tulips_Purple = "Purple tulips : " + Math.round(tulips_color_Purple / valeur.size() * 100) + " % \n";
                        }
                        if (tulips_color_Black == 0) {
                            tulips_Black = "";
                        } else {
                            tulips_Black = "Black tulips : " + Math.round(tulips_color_Black / valeur.size() * 100) + "% \n";
                        }
                        if (tulips_color_Pink == 0) {
                            tulips_Pink = "";
                        } else {
                            tulips_Pink = "Pink tulips : " + Math.round(tulips_color_Pink / valeur.size() * 100) + "% \n";
                        }

                    }
                }
                String pct = tulips_White + tulips_Yellow + tulips_Red + tulips_Orange + tulips_Purple + tulips_Black + tulips_Pink;
                result3.setText(r + "\n" + y + "\n" + w + "\n"
                        + "Result : \n" + pct);
            }

        }

    }

}
