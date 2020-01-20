package org.stock.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public final class Welcome extends javax.swing.JFrame {

static Login login = new Login();

    public Welcome() {
        initComponents();
        
        pbWelcome.setStringPainted(true);
        pbWelcome.setValue(0);
        pbtimers.start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblWelcomeTo = new javax.swing.JLabel();
        lblMy = new javax.swing.JLabel();
        lblMy1 = new javax.swing.JLabel();
        pbWelcome = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        btnSkip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblWelcomeTo.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        lblWelcomeTo.setForeground(new java.awt.Color(0, 0, 102));
        lblWelcomeTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeTo.setText("WELCOME TO");

        lblMy.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        lblMy.setForeground(new java.awt.Color(0, 0, 102));
        lblMy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMy.setText("MY");

        lblMy1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        lblMy1.setForeground(new java.awt.Color(0, 0, 102));
        lblMy1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMy1.setText("MINI STOCK MANAGEMENT SYSTEM");

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Proudly Design by: LOVELOGIST");

        btnSkip.setBackground(new java.awt.Color(230, 230, 230));
        btnSkip.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnSkip.setForeground(new java.awt.Color(0, 0, 102));
        btnSkip.setText("Skip >>");
        btnSkip.setToolTipText("Proceed to Login Page");
        btnSkip.setBorder(null);
        btnSkip.setContentAreaFilled(false);
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipActionPerformed(evt);
            }
        });
        btnSkip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSkipKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(pbWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWelcomeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMy, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMy1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSkip)
                        .addGap(15, 15, 15))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(lblWelcomeTo)
                .addGap(18, 18, 18)
                .addComponent(lblMy)
                .addGap(18, 18, 18)
                .addComponent(lblMy1)
                .addGap(26, 26, 26)
                .addComponent(pbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSkip)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private Timer pbtimers = new Timer(150, new ActionListener(){
            
            int n = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                
                pbWelcome.setValue(++n);

                if(n>100){
                    pbtimers.stop();
                    welcome.setVisible(false);
                    login.setVisible(true);
                }  
            } 
        });
        
        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
        pbtimers.stop();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnSkipActionPerformed

    private void btnSkipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSkipKeyPressed
        pbtimers.stop();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnSkipKeyPressed
    
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                welcome.setVisible(true);
            }
        });
    }

static Welcome welcome = new Welcome();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMy;
    private javax.swing.JLabel lblMy1;
    private javax.swing.JLabel lblWelcomeTo;
    private javax.swing.JProgressBar pbWelcome;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables

}
