package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class MenuIn extends javax.swing.JFrame {

    /**
     * Creates new form MenuIn
     */
    public MenuIn() {
        initComponents();
    }
    
    private void cancelar() {
        Object[] opcao = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente sair?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        if (opcaoSelecionada == 0) {
            this.dispose();
        }
    }
    
    
    private void sobre() {
        JOptionPane.showMessageDialog(null,"Projeto POO sem nome                  \nVersão 1.0.5"
                + "\n\npra que serve tantos codigos\nse a vida nao é programada\ne as melhores coisas não tem logica");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bCancelar1 = new javax.swing.JButton();
        bSobre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bMerceeiro = new javax.swing.JButton();
        bAgro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        bCancelar.setText("Cancelar");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCancelar1.setText("Sair");
        bCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(bCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 680, -1, -1));

        bSobre.setText("Sobre");
        bSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSobreActionPerformed(evt);
            }
        });
        getContentPane().add(bSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Mono", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para melhorar a sua experiência, precisamos saber se você é:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 540, 40));

        jLabel4.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seja bem-vindo(a) a um marketplace");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 500, 78));

        jLabel5.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("sob medida pra você.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 430, 78));

        bMerceeiro.setBackground(new java.awt.Color(0, 102, 255));
        bMerceeiro.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bMerceeiro.setForeground(new java.awt.Color(255, 255, 255));
        bMerceeiro.setText("Merceeiro");
        bMerceeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bMerceeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMerceeiroActionPerformed(evt);
            }
        });
        getContentPane().add(bMerceeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 150, 50));

        bAgro.setBackground(new java.awt.Color(0, 204, 0));
        bAgro.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bAgro.setForeground(new java.awt.Color(255, 255, 255));
        bAgro.setText("Agropecuário");
        bAgro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgroActionPerformed(evt);
            }
        });
        getContentPane().add(bAgro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 150, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zos.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bAgroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgroActionPerformed
        
    String[] opcoes = { "Entrar", "Cadastrar"};
    int escolha = JOptionPane.showOptionDialog(null,"O que voce deseja?","Login",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null,opcoes,opcoes[0]);

    if (escolha == JOptionPane.CLOSED_OPTION) {
        
    } else if(escolha == 1){
        new CadA().setVisible(true);
            this.dispose();
    }else {    
        new Painel().setVisible(true);
        this.dispose();
    }

// TODO add your handling code here:
    }//GEN-LAST:event_bAgroActionPerformed

    private void bCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelar1ActionPerformed
        cancelar();


// TODO add your handling code here:
    }//GEN-LAST:event_bCancelar1ActionPerformed

    private void bSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSobreActionPerformed
        sobre();
// TODO add your handling code here:
    }//GEN-LAST:event_bSobreActionPerformed

    private void bMerceeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMerceeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMerceeiroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgro;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCancelar1;
    private javax.swing.JButton bMerceeiro;
    private javax.swing.JButton bSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
