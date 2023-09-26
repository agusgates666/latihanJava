/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectBaru;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;  
/**
 *
 * @author agus
 */
public class FormUtama extends javax.swing.JFrame {

    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        
        getContentPane().setBackground(Color.white);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuFileMaster = new javax.swing.JMenu();
        menuFileMasterBarang = new javax.swing.JMenuItem();
        menuFileExit = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        menuTransaksiInput = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuFile.setMnemonic('f');
        menuFile.setText("File");

        menuFileMaster.setText("Master");

        menuFileMasterBarang.setText("Barang");
        menuFileMasterBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileMasterBarangActionPerformed(evt);
            }
        });
        menuFileMaster.add(menuFileMasterBarang);

        menuFile.add(menuFileMaster);

        menuFileExit.setMnemonic('x');
        menuFileExit.setText("Exit");
        menuFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileExitActionPerformed(evt);
            }
        });
        menuFile.add(menuFileExit);

        jMenuBar1.add(menuFile);

        menuTransaksi.setText("Transaksi");

        menuTransaksiInput.setText("Input");
        menuTransaksiInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiInputActionPerformed(evt);
            }
        });
        menuTransaksi.add(menuTransaksiInput);

        jMenuBar1.add(menuTransaksi);

        menuHelp.setText("Help");

        menuAbout.setMnemonic('a');
        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFileExitActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        JOptionPane.showMessageDialog(null,"Dibuat oleh\nAgus");
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuFileMasterBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileMasterBarangActionPerformed
        new FormBarang().setVisible(true);
    }//GEN-LAST:event_menuFileMasterBarangActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void menuTransaksiInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiInputActionPerformed
       new FormTransaksi().setVisible(true);
    }//GEN-LAST:event_menuTransaksiInputActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuFileExit;
    private javax.swing.JMenu menuFileMaster;
    private javax.swing.JMenuItem menuFileMasterBarang;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JMenuItem menuTransaksiInput;
    // End of variables declaration//GEN-END:variables
}
