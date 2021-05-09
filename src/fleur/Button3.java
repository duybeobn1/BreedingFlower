/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Button3 extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Button3
     */
    public Button3() {
        initComponents();
        setVisible(true);
        this.setLocation(600,250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mom = new javax.swing.JComboBox();
        dad = new javax.swing.JComboBox();
        img_mom = new javax.swing.JLabel();
        img_dad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(205, 133, 63));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);

        mom.setForeground(new java.awt.Color(0, 128, 128));
        mom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bird", "Lion", "Man", "Fish", "Horse", "Spider" }));

        dad.setForeground(new java.awt.Color(0, 128, 128));
        dad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bird", "Lion", "Man", "Fish", "Horse", "Spider" }));

        img_mom.setForeground(new java.awt.Color(220, 20, 60));

        img_dad.setForeground(new java.awt.Color(220, 20, 60));

        jButton1.setForeground(new java.awt.Color(220, 20, 60));
        jButton1.setText("Start");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Just choose whatever you want !!");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(img_mom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mom, 0, 175, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img_dad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_mom, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_dad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        mom.addActionListener(this);
        dad.addActionListener(this);
        jButton1.addActionListener(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox dad;
    private javax.swing.JLabel img_dad;
    private javax.swing.JLabel img_mom;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox mom;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //set mom image
        img_mom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/" + mom.getSelectedItem().toString() + ".jpg")));
        //set dad image
        img_dad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/" + dad.getSelectedItem().toString() + ".jpg")));
        if (e.getSource() == jButton1) {
        //all cases possible of  breeding
            switch (mom.getSelectedItem().toString()) {
                case "Spider":
                    switch (dad.getSelectedItem().toString()) {
                        case "Bird":
                            Result3 popUp = new Result3(8);
                            repaint();
                            break;
                        case "Horse":
                            popUp = new Result3(9);
                            repaint();
                            break;
                        case "Man":
                            popUp = new Result3(10);
                            repaint();
                            break;
                        case "Spider ":
                            popUp = new Result3(11);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Doesn't exist, even for a mysthical creature lol");
                    }
                    break;
                case "Man":
                    switch (dad.getSelectedItem().toString()) {
                        case "Spider":
                            Result3 popUp = new Result3(10);
                            repaint();
                            break;
                        case "Lion":
                            popUp = new Result3(7);
                            repaint();
                            break;
                        case "Horse":
                            popUp = new Result3(5);
                            repaint();
                            break;
                        case "Fish":
                            popUp = new Result3(4);
                            repaint();
                            break;
                        case "Bird":
                            popUp = new Result3(3);
                            repaint();
                            break;
                        case "Man":
                            popUp = new Result3(12);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Doesn't exist, even for a mysthical creature lol");
                    }
                    break;
                case "Lion":
                    switch (dad.getSelectedItem().toString()) {
                        case "Man":
                            Result3 popUp = new Result3(7);
                            repaint();
                            break;
                        case "Horse":
                            popUp = new Result3(6);
                            repaint();
                            break;
                        case "Bird":
                            popUp = new Result3(2);
                            repaint();
                            break;
                        case "Lion":
                            popUp = new Result3(13);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Doesn't exist, even for a mysthical creature lol");
                    }
                    break;
                case "Horse":
                    switch (dad.getSelectedItem().toString()) {
                        case "Horse":
                            Result3 popUp = new Result3(14);
                            repaint();
                            break;
                        case "Spider":
                            popUp = new Result3(9);
                            repaint();
                            break;
                        case "Lion":
                            popUp = new Result3(6);
                            repaint();
                            break;
                        case "Man":
                            popUp = new Result3(5);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Doesn't exist, even for a mysthical creature lol");
                    }
                    break;
                case "Fish":
                    switch (dad.getSelectedItem().toString()) {
                        case "Fish":
                            Result3 popUp = new Result3(15);
                            repaint();
                            break;
                        case "Man":
                            popUp = new Result3(4);
                            repaint();
                            break;
                        case "Bird":
                            popUp = new Result3(1);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Doesn't exist, even for a mysthical creature lol");
                    }
                    break;
                case "Bird":
                    switch (dad.getSelectedItem().toString()) {
                        case "Bird":
                            Result3 popUp = new Result3(16);
                            repaint();
                            break;
                        case "Spider":
                            popUp = new Result3(8);
                            repaint();
                            break;
                        case "Man":
                            popUp = new Result3(3);
                            repaint();
                            break;
                        case "Lion":
                            popUp = new Result3(2);
                            repaint();
                            break;
                        case "Fish":
                            popUp = new Result3(1);
                            repaint();
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Doesn't exist, even for a mysthical creature lol");
                    }
                    break;
            }

        }
    }
}
