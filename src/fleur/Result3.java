/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleur;

/**
 *
 * @author HP
 */
public class Result3 extends javax.swing.JFrame {


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public Result3(int i) {
        initComponents();
        setVisible(true);
        this.setLocation(600,250);
        //searching cases in button3
        switch (i) {
            case 1:
                jLabel2.setText("You have sucessfully create a flying bird");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Bird_Fish.jpg")));
                break;
            case 2:
                jLabel2.setText("You have sucessfully create griffin");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Bird_Lion.jpg")));
                break;
            case 3:
                jLabel2.setText("You have sucessfully create Wingman");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Bird_Man.jpg")));
                break;
            case 4:
                jLabel2.setText("You have sucessfully create a mermaid");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Fish_Man.jpg")));
                break;
            case 5:
                jLabel2.setText("You have sucessfully create a sagittarius");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Horse_Man.jpg")));
                break;
            case 6:
                jLabel2.setText("You have sucessfully create lion horse");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Lion_Horse.jpg")));
                break;
            case 7:
                jLabel2.setText("You have sucessfully create lion man");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Lion_Man.jpg")));
                break;
            case 8:
                jLabel2.setText("You have sucessfully create spider bird");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Spider_Bird.jpg")));
                break;
            case 9:
                jLabel2.setText("You have sucessfully create spider horse");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Spider_Horse.jpg")));
                break;
            case 10:
                jLabel2.setText("You have sucessfully create Spiderman");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Spider_Man.jpg")));
                break;
            case 11:
                jLabel2.setText("You have sucessfully create a spider");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Spider.jpg")));
                break;
            case 12:
                jLabel2.setText("You have sucessfully create a human");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Man.jpg")));
                break;
            case 13:
                jLabel2.setText("You have sucessfully create a lion");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Lion.jpg")));
                break;
            case 14:
                jLabel2.setText("You have sucessfully create a horse");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Horse.jpg")));
                break;
            case 15:
                jLabel2.setText("You have sucessfully create a fish");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Fish.jpg")));
                break;
            case 16:
                jLabel2.setText("You have sucessfully create a bird");
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fleur/mystic/Bird.jpg")));
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
