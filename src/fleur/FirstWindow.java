/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleur;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class FirstWindow extends JFrame implements ActionListener {
    JButton button1, button2, button3; 
    public FirstWindow(){
        this.setTitle("CROSSBREEDING PROJECT");
        this.setSize(400,400);
        this.setLocation(300,200);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        //container 1 
        JPanel panel1 = new JPanel();
        panel1.setBounds(20,20,360,150);
        panel1.setLayout(null);
        panel1.setBackground(new Color(255,240,245));
        
        JLabel label1 = new JLabel();
        label1.setText("Welcome To Our Crossbreeding Lab!");
        Font police = new Font(" Arial ",Font.BOLD,18);
        label1.setFont(police);
        label1.setBounds(15,10,340,50);
        panel1.add(label1);
        
        //container 2
        JPanel panel2 = new JPanel();
        panel2.setBounds(20,190,360,150);        
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,215,0));
        
        
        button1 = new JButton("Animal");
        button1.setBounds(10,10,100,120);
        button1.setBackground(new Color(255,240,245));  
        button1.setForeground(Color.black);
        button1.addActionListener(this);
        panel2.add(button1);
        
        button2 = new JButton("Flower");
        button2.setBounds(130,10,100,120);
        button2.setBackground(new Color(255,240,245));
        button2.setForeground(Color.black);
        button2.addActionListener(this);
        panel2.add(button2);
        
        button3 = new JButton("Mystic");
        button3.setBounds(250,10,100,120);
        button3.setBackground(new Color(255,240,245));
        button3.setForeground(Color.black);
        button3.addActionListener(this);
        panel2.add(button3);
        
        
        
        //container global
        JPanel panelGlobal = new JPanel();
        panelGlobal.setBounds(0,0,400,400);
        panelGlobal.setLayout(null);
        panelGlobal.setBackground(new Color(255,215,0));  
        panelGlobal.add(panel1);
        panelGlobal.add(panel2);
        
        this.add(panelGlobal);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== button1){
             JOptionPane.showMessageDialog(this, "You choose to crossbreed animals");
             Button1 popUp = new Button1(); 
        }
        if(ae.getSource()==button2) {
            JOptionPane.showMessageDialog(this, "You choose to crossbreed flowers");
            Button2 popUp = new Button2();
            
        } 
        if(ae.getSource()==button3) {
            JOptionPane.showMessageDialog(this, "You choose to create mysthical creatures");
            Button3 popUp = new Button3();
        }
    }
    
}
