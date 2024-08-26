package br.com.view;

import br.com.controller.FilmeController;
import br.com.dao.ExceptionDAO;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Parte visual do sistema(tela cadastro de filmes)
 * @author Henrique
 */

public class TelaCenaFlix extends javax.swing.JFrame {
    
    private int id;

    public TelaCenaFlix() {
        initComponents();
    }
    
    // Limpa os campos preenchidos 
    public void limpar() {
        this.txtNomeFilme.setText("");
        this.txtDataLancamento.setText("");
        this.txtNomeFilme.requestFocus();
    }
    
    // Recebendo os dados para realizar alterações necessarias 
    public void recerberDadosAlteracao(int id, String nome, Date dataLancamento, String categoria) {
        this.id = id;
        this.txtNomeFilme.setText(nome);
        
        SimpleDateFormat mask = new SimpleDateFormat("dd/MM/yyyy");
        this.txtDataLancamento.setText(mask.format(dataLancamento));
        
        for (int i = 0; i < this.cbxCategoria.getItemCount(); i++) {
            if(this.cbxCategoria.getItemAt(i).equals(categoria)) {
                this.cbxCategoria.setSelectedIndex(i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCadastroFilme = new javax.swing.JLabel();
        sprNomeFilme = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtNomeFilme = new javax.swing.JTextField();
        lblErro = new javax.swing.JLabel();
        txtDataLancamento = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        sprDataLancamento = new javax.swing.JSeparator();
        sprCategoria = new javax.swing.JSeparator();
        sprLinha = new javax.swing.JSeparator();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnSalvarAlteracao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CenaFlix");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("CENAFLIX");
        pnlPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        lblCadastroFilme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCadastroFilme.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastroFilme.setText("CADASTRO DE FILME");
        pnlPrincipal.add(lblCadastroFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        sprNomeFilme.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprNomeFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 280, 10));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome do filme:");
        pnlPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 0));
        lblData.setText("Data de lançamento:");
        pnlPrincipal.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setText("Categoria:");
        pnlPrincipal.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(0, 255, 102));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Cadastrar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 160, -1));

        btnLimpar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, -1));

        txtNomeFilme.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeFilme.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeFilme.setBorder(null);
        txtNomeFilme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeFilmeKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtNomeFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 280, 30));

        lblErro.setBackground(new java.awt.Color(255, 0, 0));
        lblErro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblErro.setForeground(new java.awt.Color(255, 0, 0));
        pnlPrincipal.add(lblErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 280, 20));

        txtDataLancamento.setBackground(new java.awt.Color(255, 255, 255));
        txtDataLancamento.setBorder(null);
        txtDataLancamento.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtDataLancamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlPrincipal.add(txtDataLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 280, 30));

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 150, -1));

        sprDataLancamento.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprDataLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 280, 10));

        sprCategoria.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 280, 10));

        sprLinha.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 173, 10));

        cbxCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cbxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aventura", "Ação", "Drama", "Comédia", "Terror", "Educação", "Infantil" }));
        cbxCategoria.setBorder(null);
        pnlPrincipal.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 280, 30));

        btnSalvarAlteracao.setBackground(new java.awt.Color(0, 255, 102));
        btnSalvarAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/326572_check_icon.png"))); // NOI18N
        btnSalvarAlteracao.setToolTipText("Salvar alteração");
        btnSalvarAlteracao.setEnabled(false);
        btnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracaoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnSalvarAlteracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean sucesso;
        String categoria = cbxCategoria.getSelectedItem().toString();
        FilmeController controller = new FilmeController();
        
        try {
            sucesso = controller.validarDados(this.txtNomeFilme.getText(), this.txtDataLancamento.getText(), 
                    categoria);
            
            if(sucesso) {
                lblErro.setForeground(Color.green);
                lblErro.setText("Filme cadastrado com sucesso!");
                
            } else {
                lblErro.setForeground(Color.red);
                lblErro.setText("Não foi possível inserir os dados! Por favor, Preencha todos os campos!");
            }
        } 
        catch(ExceptionDAO e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados! Por favor, "
                    + "verifique valores digitados!");
        } 
        catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados! Por favor, "
                    + "verifique valores digitados!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeFilmeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeFilmeKeyReleased
        this.lblErro.setText("");
    }//GEN-LAST:event_txtNomeFilmeKeyReleased

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        TelaConsulta telaConsulta = new TelaConsulta();
        telaConsulta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoActionPerformed
        boolean alteracao;
        String categoria = this.cbxCategoria.getSelectedItem().toString();
        FilmeController controller = new FilmeController();
        
        try {
            alteracao = controller.alterarFilmeController(this.id, this.txtNomeFilme.getText(), 
                this.txtDataLancamento.getText(), categoria);

            if(alteracao) {
                this.lblErro.setForeground(Color.green);
                this.lblErro.setText("Alteração concluída");
                limpar();
            }
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar os dados! Por favor, "
                    + "verifique valores digitados!");
        }
    }//GEN-LAST:event_btnSalvarAlteracaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCenaFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCenaFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCenaFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCenaFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCenaFlix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    public static javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel lblCadastroFilme;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprCategoria;
    private javax.swing.JSeparator sprDataLancamento;
    private javax.swing.JSeparator sprLinha;
    private javax.swing.JSeparator sprNomeFilme;
    private javax.swing.JFormattedTextField txtDataLancamento;
    private javax.swing.JTextField txtNomeFilme;
    // End of variables declaration//GEN-END:variables
}
