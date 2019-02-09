
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class TicTacToe extends javax.swing.JFrame {
    
    private String start="X";
    private int xCount=0;
    private int oCount=0;

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
       
        setSize(1200,600);
        setLocationRelativeTo(null);
    }

    private void Score()
    {
        jLabel4.setText(Integer.toString(xCount));
        jLabel5.setText(Integer.toString(oCount));
    }
    
    private void Player_move()
    {
        if(start.equalsIgnoreCase("X"))
        {
            start="O";
        }
        else
        {
            start="X";
        }
    }
    
    private void setOff()
    {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }
    
    private void setOn()
    {
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }
    
    private void Win()
    {
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        
        String b4=jButton4.getText();
        String b5=jButton5.getText();
        String b6=jButton6.getText();
        
        String b7=jButton7.getText();
        String b8=jButton8.getText();
        String b9=jButton9.getText();
        
        if(b1=="X"&&b2=="X"&&b3=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            Score();
            //jButton1.setBackground(Color.WHITE);
            //jButton2.setBackground(Color.WHITE);
            //jButton3.setBackground(Color.WHITE);
            setOff();
        }
        
        if(b4=="X"&&b5=="X"&&b6=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            Score();
            //jButton4.setBackground(Color.WHITE);
            //jButton5.setBackground(Color.WHITE);
            //jButton6.setBackground(Color.WHITE);
            setOff();
        }
        
        if(b7=="X"&&b8=="X"&&b9=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            Score();
            //jButton7.setBackground(Color.WHITE);
            //jButton8.setBackground(Color.WHITE);
            //jButton9.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b1=="X"&&b4=="X"&&b7=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            Score();
            //jButton1.setBackground(Color.WHITE);
            //jButton4.setBackground(Color.WHITE);
            //jButton7.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b2=="X"&&b5=="X"&&b8=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            Score();
            //jButton2.setBackground(Color.WHITE);
            //jButton5.setBackground(Color.WHITE);
            //jButton8.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b3=="X"&&b6=="X"&&b9=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            Score();
            //jButton3.setBackground(Color.WHITE);
            //jButton6.setBackground(Color.WHITE);
            //jButton9.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b1=="X"&&b5=="X"&&b9=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            Score();
            //jButton1.setBackground(Color.WHITE);
            //jButton5.setBackground(Color.WHITE);
            //jButton9.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b3=="X"&&b5=="X"&&b7=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            Score();
            //jButton3.setBackground(Color.WHITE);
            //jButton5.setBackground(Color.WHITE);
            //jButton7.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b1=="O"&&b2=="O"&&b3=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            Score();
            //jButton1.setBackground(Color.WHITE);
            //jButton2.setBackground(Color.WHITE);
            //jButton3.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b4=="O"&&b5=="O"&&b6=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            Score();
            //jButton4.setBackground(Color.WHITE);
            //jButton5.setBackground(Color.WHITE);
            //jButton6.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b7=="O"&&b8=="O"&&b9=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            Score();
            //jButton7.setBackground(Color.WHITE);
            //jButton8.setBackground(Color.WHITE);
            //jButton9.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b1=="O"&&b4=="O"&&b7=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            Score();
            //jButton1.setBackground(Color.WHITE);
            //jButton4.setBackground(Color.WHITE);
            //jButton7.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b2=="O"&&b5=="O"&&b8=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            Score();
            //jButton2.setBackground(Color.WHITE);
            //jButton5.setBackground(Color.WHITE);
            //jButton8.setBackground(Color.WHITE);
            setOff();
            
        }
        
        if(b3=="O"&&b6=="O"&&b9=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            Score();
            //jButton3.setBackground(Color.WHITE);
            //jButton6.setBackground(Color.WHITE);
            //jButton9.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b1=="O"&&b5=="O"&&b9=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            Score();
            //jButton1.setBackground(Color.WHITE);
            //jButton5.setBackground(Color.WHITE);
            //jButton9.setBackground(Color.WHITE);
            setOff();            
        }
        
        if(b3=="O"&&b5=="O"&&b7=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins ", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            Score();
            //jButton3.setBackground(Color.WHITE);
            //jButton5.setBackground(Color.WHITE);
            //jButton7.setBackground(Color.WHITE);
            setOff();            
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setForeground(new java.awt.Color(0, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.setForeground(new java.awt.Color(0, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel5.setForeground(new java.awt.Color(0, 255, 255));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("PLAYER X");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 70)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel8.setForeground(new java.awt.Color(0, 255, 255));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 255, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel9.setForeground(new java.awt.Color(0, 255, 255));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel10.setForeground(new java.awt.Color(0, 255, 255));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 255, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("PLAYER O");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel13.setForeground(new java.awt.Color(0, 255, 255));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 255, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel14.setForeground(new java.awt.Color(0, 255, 255));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 255, 255));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel15.setForeground(new java.awt.Color(0, 255, 255));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Calibri", 1, 120)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 255, 255));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Calibri", 1, 75)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 255, 0));
        jButton10.setText("RESET");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Calibri", 1, 75)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 255, 0));
        jButton11.setText("EXIT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton3.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            setOn();
            jButton1.setText(null);
            jButton2.setText(null);
            jButton3.setText(null);
            
            jButton4.setText(null);
            jButton5.setText(null);
            jButton6.setText(null);
            
            jButton7.setText(null);
            jButton8.setText(null);
            jButton9.setText(null);
            
            
            jButton1.setBackground(Color.BLACK);
            jButton2.setBackground(Color.BLACK);
            jButton3.setBackground(Color.BLACK); 
            
            jButton4.setBackground(Color.BLACK);
            jButton5.setBackground(Color.BLACK);
            jButton6.setBackground(Color.BLACK);

            jButton7.setBackground(Color.BLACK);
            jButton8.setBackground(Color.BLACK);
            jButton9.setBackground(Color.BLACK);// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed
private JFrame frame;
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
                frame=new JFrame("EXIT");
                if(xCount>oCount)
                    JOptionPane.showMessageDialog(frame, "Player X Wins. Thank you for playing");
                else if(xCount<oCount)
                    JOptionPane.showMessageDialog(frame, "Player O Wins. Thank you for playing");
                else
                    JOptionPane.showMessageDialog(frame, "Thank you for playing");
                System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton1.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton2.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton4.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton5.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton6.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton7.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton8.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.MAGENTA);
        }
        else
        {
            jButton9.setForeground(Color.BLUE);
        }  
        Player_move();
        Win();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
