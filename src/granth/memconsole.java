/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granth;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author MOHIT
 */
public class memconsole extends javax.swing.JInternalFrame {
Connection c=null;
Statement s=null;
ResultSet rs=null;
    /**
     * Creates new form memconsole
     */
    public memconsole() {
        initComponents();
        t5.setEnabled(false);
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mohit","root","");
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(rootPane,e.getMessage());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        r3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        r4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        t3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(620, 463));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MEMBER'S CONSOLE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 569, -1));

        jLabel9.setText("(YYYY-MM-DD)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 340, -1, 19));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Phone/Mobile");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 167, -1, -1));

        buttonGroup1.add(r2);
        r2.setText("FOR 3 MONTHS");
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 221, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 105, -1, -1));

        t5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 278, 100, -1));

        buttonGroup1.add(r3);
        r3.setText("FOR 6 MONTHS");
        getContentPane().add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 221, -1, -1));

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 385, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 78, 47, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 589, 21));

        buttonGroup1.add(r4);
        r4.setText("FOR 1 YEAR");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        getContentPane().add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 221, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 134, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Membership Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 320, -1, -1));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 167, 118, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Member ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 80, -1, -1));

        t6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 319, 100, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, 569, -1));

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 385, -1, -1));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                t2PropertyChange(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 103, 178, -1));

        jLabel5.setText("(500 rs Per Month)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 297, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Membership Fee");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 279, -1, -1));

        buttonGroup1.add(r1);
        r1.setText("FOR 1 MONTH");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 221, -1, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 129, 272, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("SELECT YOUR MEMBERSHIP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 198, -1, -1));

        jLabel12.setText("(5% discount)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 246, -1, -1));

        jLabel13.setText("(8% discount)");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 246, -1, -1));

        jLabel14.setText("(10% discount)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 246, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/granth/abstract_colour_background_orange.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String t = null;
        int f = 0;
        if(r1.isSelected())
        {t="FOR 1 MONTH";
        f=500;}
       if(r2.isSelected())
        {t="FOR 3 MONTHS";
        f=1425;
        }
        if(r3.isSelected())
        {t="FOR 6 MONTHS";
        f=2760;
        }
     if(r4.isSelected())
        {t="FOR 1 YEAR";
        f=5400;
        }
        
     
        String qry="insert into member values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t+"',"+f+",'"+t6.getText()+"')";
       t5.setText(""+f);
        try{
          s=c.createStatement();
          s.executeUpdate(qry);
            JOptionPane.showMessageDialog(rootPane,"Member Details Are Saved");
                                   
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,e.getMessage()); 
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed

    }//GEN-LAST:event_t2ActionPerformed

    private void t2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_t2PropertyChange

    }//GEN-LAST:event_t2PropertyChange

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed

    }//GEN-LAST:event_t2KeyPressed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
       
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
