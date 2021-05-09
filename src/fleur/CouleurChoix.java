
package fleur;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CouleurChoix extends javax.swing.JFrame implements ActionListener {

    public CouleurChoix() {
        initComponents();
       setVisible(true);
       this.setLocation(600,250);
       this.setResizable(false);
       JOptionPane.showMessageDialog(this,"Please select a type of flower and a color to start");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        types = new javax.swing.JComboBox();
        couleur = new javax.swing.JComboBox();
        imageDemo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        result2 = new javax.swing.JEditorPane();

        setBackground(new java.awt.Color(255, 248, 220));
        setForeground(java.awt.Color.magenta);

        jPanel1.setBackground(new java.awt.Color(255, 248, 220));
        jPanel1.setForeground(new java.awt.Color(240, 128, 128));

        types.setForeground(new java.awt.Color(220, 20, 60));
        types.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rose", "Cosmos", "Lily", "Pansy", "Tulip" }));

        couleur.setForeground(new java.awt.Color(210, 105, 30));
        couleur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Red", "Yellow", "White", "Purple", "Blue", "Orange", "Black", "Pink", "HybridRed" }));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        result2.setBackground(new java.awt.Color(0, 0, 0));
        result2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        result2.setForeground(new java.awt.Color(124, 252, 0));
        jScrollPane2.setViewportView(result2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(types, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(couleur, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imageDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(types, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(couleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(imageDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        types.addActionListener(this);
        couleur.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //roses data
    GetColor rose_orange2 = new GetColor(Color.ORANGE, 100, Color.BLACK, Color.YELLOW);
    GetColor rose_orange1 = new GetColor(Color.ORANGE, 50, Color.RED, Color.YELLOW);
    GetColor rose_black = new GetColor(Color.BLACK, 25, Color.RED, Color.RED);
    GetColor rose_pink1 = new GetColor(Color.PINK, 25, Color.RED, Color.RED);
    GetColor rose_pink2 = new GetColor(Color.PINK, 50, Color.RED, Color.WHITE);
    GetColor rose_purple = new GetColor(Color.MAGENTA, 25, Color.WHITE, Color.WHITE);
    GetColor rose_hybridRed = new GetColor(Color.DARK_GRAY, 25, Color.ORANGE, Color.MAGENTA);
    GetColor rose_blue = new GetColor(Color.BLUE, 1.6, Color.DARK_GRAY, Color.DARK_GRAY);
    //cosmos data
    GetColor cosmos_orange = new GetColor(Color.ORANGE, 100, Color.RED, Color.YELLOW);
    GetColor cosmos_pink = new GetColor(Color.PINK, 100, Color.RED, Color.WHITE);
    GetColor cosmos_black = new GetColor(Color.BLACK, 6.25, Color.ORANGE, Color.ORANGE);
    //lilies data
    GetColor lilies_orange = new GetColor(Color.ORANGE, 50, Color.RED, Color.YELLOW);
    GetColor lilies_black = new GetColor(Color.BLACK, 25, Color.RED, Color.RED);
    GetColor lilies_pink1 = new GetColor(Color.PINK, 25, Color.RED, Color.RED);
    GetColor lilies_pink2 = new GetColor(Color.PINK, 50, Color.RED, Color.WHITE);
    //pansies data
    GetColor pansies_orange = new GetColor(Color.ORANGE, 100, Color.RED, Color.YELLOW);
    GetColor pansies_blue = new GetColor(Color.BLUE, 25, Color.WHITE, Color.WHITE);
    GetColor pansies_hybridRed = new GetColor(Color.DARK_GRAY, 100, Color.RED, Color.BLUE);
    GetColor pansies_purple = new GetColor(Color.MAGENTA, 6.25, Color.DARK_GRAY, Color.DARK_GRAY);
    //tulips  data
    GetColor tulips_orange = new GetColor(Color.ORANGE, 100, Color.RED, Color.YELLOW);
    GetColor tulips_black = new GetColor(Color.BLACK, 25, Color.RED, Color.RED);
    GetColor tulips_pink = new GetColor(Color.PINK, 50, Color.RED, Color.WHITE);
    GetColor tulips_purple = new GetColor(Color.MAGENTA, 6.25, Color.ORANGE, Color.ORANGE);
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox couleur;
    private javax.swing.JLabel imageDemo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane result2;
    public javax.swing.JComboBox types;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
            
      
            JOptionPane.showMessageDialog(this, "You choose to make " + types.getSelectedItem().toString() + " with the color " + couleur.getSelectedItem().toString());
            switch (types.getSelectedItem().toString()) {
                // cases of flowers and path to the success of breeding
                case "Rose":
                    switch (couleur.getSelectedItem().toString()) {
                        case "Red":
                            result2.setText("Roses are red,\n"
                            +"Violets are blue,\n"
                            +"Sugar is sweet,\n"
                            +"And so are you. ");
                            break;
                        case "Yellow":
                            result2.setText("Yellow roses are available in nature");
                            break;
                        case "White":
                            result2.setText("White roses are available in nature");
                            break;
                        case "Blue":
                            result2.setText("Method 1 \r\n      F1       Parent 1: White roses    X    Parent 2: White roses with  " + rose_purple.pct + " ( to create purple rose ) %, or  \n"
                                    + "     F1      Parent 1 : Red roses     X      Parent 2: Yellow roses  with " + rose_orange1.pct + " (to create orange rose)  % \n"
                                    + "     F2      Parent 1 : Orange Roses    X    Parent 2 : Purple Roses with " + rose_hybridRed.pct + "(to create hybrid red rose) % \n"
                                    + "     F3      Parent 1 : Hybrid Red Roses    X     Parent 2 : Hybrid Red Roses" + rose_blue.pct + " %\n"
                                    + "                 Total percentage : " + rose_purple.pct * rose_orange1.pct * rose_hybridRed.pct * rose_blue.pct / 1000000 + " % \n"
                                    + "Method 2 \r\n     F1      Parent 1 : White roses X Parent 2 : White roses with  " + rose_purple.pct + " ( to create purple rose ) % or \n"
                                    + "     F1      Parent 1 : Red roses X Parent 2 : Red roses with " + rose_black.pct + " % success (to create Black rose)\n"
                                    + "     F2      Parent 1 : Black roses x Parent 2 : Yellow roses with " + rose_orange2.pct + " % success (to create orange rose) \n"
                                    + "     F3      Parent 1 : Orange Roses X Parent 2 : Purple Roses with " + rose_hybridRed.pct + " (to create hybrid red rose) % \n"
                                    + "     F4      Parent 1 : Parent 1 : Hybrid Red Roses X Parent 2 : Hybrid Red Roses " + rose_blue.pct + " %  \n"
                                    + "                     Total percentage :  " + rose_purple.pct * rose_black.pct * rose_orange2.pct * rose_hybridRed.pct * rose_blue.pct / 100000000 + " %");
                            break;
                        case "HybridRed":
                            result2.setText("Method 1 \r\n      F1       Parent 1 : White roses X Parent 2 : White roses with  " + rose_purple.pct + " ( to create purple rose ) % or \n"
                                    + "     F1      Parent 1 : Red roses X  Parent 2 : Yellow roses  with " + rose_orange1.pct + " (to create orange rose)  % \n"
                                    + "     F2      Parent 1 : Orange Roses X Parent 2 : Purple Roses with " + rose_hybridRed.pct + " % \n"
                                    + "                 Total percentage : " + rose_purple.pct * rose_orange1.pct * rose_hybridRed.pct / 10000 + " % \n"
                                    + "Method 2 \r\n     F1      Parent 1 : White roses X Parent 2 : White roses with  " + rose_purple.pct + " ( to create purple rose ) % or \n"
                                    + "     F1      Parent 1 : Red roses    X    Parent 2 : Red roses with " + rose_black.pct + " % success (to create Black rose)\n"
                                    + "     F2      Parent 1 : Black roses x Parent 2 : Yellow roses with " + rose_orange2.pct + " % success (to create orange rose) \n"
                                    + "     F3      Parent 1 : Orange Roses X Parent 2 : Purple Roses with " + rose_hybridRed.pct + " % \n"
                                    + "                     Total percentage :" + rose_purple.pct * rose_black.pct * rose_orange2.pct * rose_hybridRed.pct / 1000000 + " %");
                            break;
                        case "Purple":
                            result2.setText("Method 1 \r\n      F1 : Parent 1 : White roses X Parent 2 : White roses with  " + rose_purple.pct + " %");
                            break;
                        case "Pink":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red roses X Parent 2 : Red roses with " + rose_pink1.pct + " %\n"
                                    + "Method 2 \r\n         F1 : Parent 1 : Red rose X Parent 2 : White roses with " + rose_pink2.pct + " %");
                            break;
                        case "Black":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red roses X Parent 2 : Red roses with  " + rose_black.pct + " %");
                            break;
                        case "Orange":
                            result2.setText("Method 1\r\n       F1 :  Parent 1 : Red roses X  Parent 2 : Yellow roses  with " + rose_orange1.pct + " % success \n "
                                    + "Method 2 \n          F1 : Parent 1 : Red roses X Parent 2 : Red roses with " + rose_black.pct + " % success (to create Black rose)\n"
                                    + "F2 \n    : Parent 1 : Black roses x Parent 2 : Yellow roses with " + rose_orange2.pct + " % success \n"
                                    + "                         Total percentage : " + rose_black.pct * rose_orange2.pct * 1 / 100 + " %");
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Can't make roses of this color");
                            result2.setText("");

                    }
                    break;
                    //  case cosmos
                case "Cosmos":
                    switch (couleur.getSelectedItem().toString()) {
                        case "Red":
                            result2.setText("Red cosmos are available in nature");
                            break;
                        case "Yellow":
                            result2.setText("Yellow cosmos are available in nature");
                            break;
                        case "White":
                            result2.setText("White cosmos are available in nature");
                            break;
                        case "Orange":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red cosmos X Parent 2 : Yellow cosmos with  " + cosmos_orange.pct + " %");
                            break;
                        case "Pink":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red cosmos X Parent 2 : White cosmos with " + cosmos_pink.pct + " %");
                            break;
                        case "Black":
                            result2.setText("Method 1 \r\n         F1    Parent 1 : Red cosmos X Parent 2 : Yellow cosmos with " + cosmos_orange.pct + " % success (to create Orange cosmos) \n"
                                    + "         F2     Parent 1 : Orange cosmos x Parent 2 : Orange cosmos with " + cosmos_black.pct + " % success \n"
                                    + "                         Total percentage : " + cosmos_black.pct * cosmos_orange.pct * 1 / 100 + " %");
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Can't make cosmos of this color");
                            result2.setText("");
                    }
                    break;
                    //case lily
                case "Lily":
                    switch (couleur.getSelectedItem().toString()) {
                        case "Red":
                            result2.setText("Red lillies are available in nature");
                            break;
                        case "Yellow":
                            result2.setText("Yellow lillies are available in nature");
                            break;
                        case "White":
                            result2.setText("White lillies are available in nature");
                            break;
                        case "Orange":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red lilies X Parent 2 : Yellow lilies with  " + lilies_orange.pct + " %");
                            break;
                        case "Black":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red lilies X Parent 2 : Red lilies with  " + lilies_black.pct + " %");
                            break;
                        case "Pink":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red lilies X Parent 2 : Red lilies with " + lilies_pink1.pct + " %\n"
                                    + "Method 2 \r\n         F1 : Parent 1 : Red rose X Parent 2 : White roses with " + lilies_pink2.pct + " %");
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Can't make lilies of this color");
                            result2.setText("");
                    }
                    break;
                    //case tulip
                case "Tulip":
                    switch (couleur.getSelectedItem().toString()) {
                        case "Red":
                            result2.setText("Red tulips are available in nature");
                            break;
                        case "Yellow":
                            result2.setText("Yellow tulips are available in nature");
                            break;
                        case "White":
                            result2.setText("White tulips are available in nature");
                            break;
                        case "Orange":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red tulips X Parent 2 : Yellow tulips with  " + tulips_orange.pct + " %");
                            break;
                        case "Black":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red tulips X Parent 2 : Red tulips with  " + tulips_black.pct + " %");
                            break;
                        case "Pink":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red tulips X Parent 2 : White tulips with  " + tulips_pink.pct + " %");
                            break;
                        case "Purple":
                            result2.setText("Method 1 \r\n         F1    Parent 1 : Red tulips X Parent 2 : Yellow tulips with " + tulips_orange.pct + " % success (to create Orange tulips) \n"
                                    + "         F2     Parent 1 : Orange tulips x Parent 2 : Orange tulips with " + tulips_purple.pct + " % success \n"
                                    + "                         Total percentage : " + tulips_orange.pct * tulips_purple.pct * 1 / 100 + " %");
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Can't make tulips of this color");
                            result2.setText("");

                    }
                    break;
                    //case pansy
                case "Pansy":
                    switch (couleur.getSelectedItem().toString()) {
                        case "Red":
                            result2.setText("Red pansies are available in nature");
                            break;
                        case "Yellow":
                            result2.setText("Yellow pansies are available in nature");
                            break;
                        case "White":
                            result2.setText("White pansies are available in nature");
                            break;
                        case "Orange":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : Red pansies X Parent 2 : Yellow pansies with  " + pansies_orange.pct + " %");
                            break;
                        case "Blue":
                            result2.setText("Method 1 \r\n       F1 : Parent 1 : White pansies X Parent 2 : White pansies with  " + pansies_blue.pct + " %");
                            break;
                        case "HybridRed":
                            result2.setText("Method 1 \r\n         F1    Parent 1 : White pansies X Parent 2 : White pansies with " + pansies_blue.pct + " % success (to create Blue pansies) \n"
                                    + "         F2     Parent 1 : Red pansies x Parent 2 : Blue pansies with " + pansies_hybridRed.pct + " % success \n"
                                    + "                         Total percentage : " + pansies_blue.pct * pansies_hybridRed.pct * 1 / 100 + " %");
                            break;
                        case "Purple":
                            result2.setText("Method 1 \r\n         F1    Parent 1 : White pansies X Parent 2 : White pansies with " + pansies_blue.pct + " % success (to create Blue pansies) \n"
                                    + "         F2     Parent 1 : Red pansies x Parent 2 : Blue pansies with " + pansies_hybridRed.pct + " % success (to create Hybrid Red Pansies) \n"
                                    + "        F3     Parent 1 : Hybrid Red pansies x Parent 2 : Hybrid Red pansies " + pansies_purple.pct + "% success \n"
                                    + "                         Total percentage : " + pansies_blue.pct * pansies_hybridRed.pct * pansies_purple.pct * 1 / 10000 + " %");
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Can't make pansies of this color");
                            result2.setText("");
                    }
                    break;
            }
        
        //  set image for result
        imageDemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/img_fleur/" + types.getSelectedItem().toString() + "_" + couleur.getSelectedItem().toString() + ".jpg")));
    }
}
