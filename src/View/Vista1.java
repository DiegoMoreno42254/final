/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.Personaje;
import Controller. Ataque;
import javax.swing.JOptionPane;

/**
 *Batalla 3 heroes, 3 jefes, 1 vs 1
 * @author Diego Miguel Moreno Duran
 */
public class Vista1 extends javax.swing.JFrame {

    /**
     * Creates new form Vista1
     */
    public Vista1() {
        initComponents();
        Heroe1.setMaximum(h1.getAcSalud());
        Jefe1.setMaximum(v1.getAcSalud());
        Heroe1.setValue(h1.getAcSalud());
        Jefe1.setValue(v1.getAcSalud());
        Heroe2.setMaximum(h2.getAcSalud());
        Jefe2.setMaximum(v2.getAcSalud());
        Heroe2.setValue(h2.getAcSalud());
        Jefe2.setValue(v2.getAcSalud());
        Heroe3.setMaximum(h3.getAcSalud());
        Jefe3.setMaximum(v3.getAcSalud());
        Heroe3.setValue(h3.getAcSalud());
        Jefe3.setValue(v3.getAcSalud());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextPane();
        Ataque1 = new javax.swing.JButton();
        Ataque2 = new javax.swing.JButton();
        Atque3 = new javax.swing.JButton();
        Jefe1 = new javax.swing.JProgressBar();
        Jefe2 = new javax.swing.JProgressBar();
        Jefe3 = new javax.swing.JProgressBar();
        Heroe1 = new javax.swing.JProgressBar();
        Heroe2 = new javax.swing.JProgressBar();
        Heroe3 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(Texto);

        Ataque1.setText("Ataque");
        Ataque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ataque1ActionPerformed(evt);
            }
        });

        Ataque2.setText("Ataque");
        Ataque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ataque2ActionPerformed(evt);
            }
        });

        Atque3.setText("Ataque");
        Atque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atque3ActionPerformed(evt);
            }
        });

        Jefe1.setForeground(new java.awt.Color(255, 0, 0));
        Jefe1.setStringPainted(true);

        Jefe2.setForeground(new java.awt.Color(255, 0, 0));
        Jefe2.setStringPainted(true);

        Jefe3.setForeground(new java.awt.Color(255, 0, 0));
        Jefe3.setStringPainted(true);

        Heroe1.setStringPainted(true);

        Heroe2.setStringPainted(true);

        Heroe3.setStringPainted(true);

        jLabel1.setText("Batman vs joker");

        jLabel2.setText("Superman vs Zoth");

        jLabel3.setText("Flash vs DeathStroke");

        jButton1.setText("siguiente Batalla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Ataque1)
                        .addGap(121, 121, 121)
                        .addComponent(Ataque2)
                        .addGap(120, 120, 120)
                        .addComponent(Atque3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(jLabel1)
                            .addGap(96, 96, 96)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Heroe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Heroe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Jefe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(Jefe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Jefe3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Heroe3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Heroe1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Heroe2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Heroe3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jefe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jefe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jefe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ataque1)
                    .addComponent(Ataque2)
                    .addComponent(Atque3))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ataque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ataque1ActionPerformed
        // TODO add your handling code here:
        Texto.setText(bs.ataca(1));
        Heroe1.setValue(h1.getAcSalud());
        Jefe1.setValue(v1.getAcSalud());
        end();
        
    }//GEN-LAST:event_Ataque1ActionPerformed

    private void Ataque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ataque2ActionPerformed
        // TODO add your handling code here:
        Texto.setText(bs2.ataca(2));
        Heroe2.setValue(h2.getAcSalud());
        Jefe2.setValue(v2.getAcSalud());
        end2();
    }//GEN-LAST:event_Ataque2ActionPerformed

    private void Atque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atque3ActionPerformed
        // TODO add your handling code here:
        Texto.setText(bs3.ataca(3));
        Heroe3.setValue(h3.getAcSalud());
        Jefe3.setValue(v3.getAcSalud());
        end3();
    }//GEN-LAST:event_Atque3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Vista2 jFrame=new Vista2();
        jFrame.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista1().setVisible(true);
            }
        });
    }
    Personaje h1= new Personaje("Batman", 100, 25, 15, 5),
            h2= new Personaje("Superman", 100, 30, 20, 2),
            h3= new Personaje("Flash", 100, 20, 10, 5),
            v1= new Personaje("Joker", 100, 25, 15, 2),
            v2= new Personaje("Zoth", 100, 20, 15, 3),
            v3= new Personaje("Deathstoke", 100, 20, 20, 6);
    Ataque bs= new Ataque(h1,v1);
    Ataque bs2=new Ataque(h2,v2);
    Ataque bs3=new Ataque(h3,v3);
    
    private void end() {
        if (h1.getAcSalud() ==0) {
            JOptionPane.showMessageDialog(null, "fin de la pelea. El ganador es "
                    +v1.getNombre());
            Ataque1.setEnabled(false);
            
        }else if(v1.getAcSalud()<=0){
            JOptionPane.showMessageDialog(null, "fin de la pelea. El ganador es "
                    +h1.getNombre());
            Ataque1.setEnabled(false);
        }
        
    }
    private void end2() {
        if (h2.getAcSalud() ==0) {
            JOptionPane.showMessageDialog(null, "fin de la pelea. El ganador es "
                    +v2.getNombre());
            Ataque2.setEnabled(false);
            
        }else if(v2.getAcSalud()==0){
            JOptionPane.showMessageDialog(null, "fin de la pelea. El ganador es "
                    +h2.getNombre());
            Ataque2.setEnabled(false);
        }
        
    }
    private void end3() {
        if (h3.getAcSalud() ==0) {
            JOptionPane.showMessageDialog(null, "fin de la pelea. El ganador es "
                    +v3.getNombre());
            Atque3.setEnabled(false);
            
        }else if(v3.getAcSalud()==0){
            JOptionPane.showMessageDialog(null, "fin de la pelea. El ganador es "
                    +h3.getNombre());
            Atque3.setEnabled(false);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ataque1;
    private javax.swing.JButton Ataque2;
    private javax.swing.JButton Atque3;
    private javax.swing.JProgressBar Heroe1;
    private javax.swing.JProgressBar Heroe2;
    private javax.swing.JProgressBar Heroe3;
    private javax.swing.JProgressBar Jefe1;
    private javax.swing.JProgressBar Jefe2;
    private javax.swing.JProgressBar Jefe3;
    private javax.swing.JTextPane Texto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
