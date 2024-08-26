package br.com.view;

import br.com.controller.FilmeController;
import br.com.model.Filme;
import static br.com.view.TelaCenaFlix.btnSalvarAlteracao;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Parte visual do sistema(tela consulta de filmes)
 * @author Henrique
 */

public class TelaConsulta extends javax.swing.JFrame {
    
    public TelaConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCadastroFilme = new javax.swing.JLabel();
        sprLinha = new javax.swing.JSeparator();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        sprLinhaBuscar = new javax.swing.JSeparator();
        btnExcluir = new javax.swing.JButton();
        cbxBuscar = new javax.swing.JComboBox<>();
        btnBuscarCategoria = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDados.setBackground(new java.awt.Color(255, 255, 255));
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código filme", "Nome", "Data lançamento", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDados);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 195, 600, 200));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("CENAFLIX");
        pnlPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        lblCadastroFilme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCadastroFilme.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastroFilme.setText("CONSULTA DE FILME");
        pnlPrincipal.add(lblCadastroFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        sprLinha.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 173, 10));

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscar.setText("Buscar filme:");
        pnlPrincipal.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setText("Digite aqui ");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, 30));

        sprLinhaBuscar.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprLinhaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 10));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/8664938_trash_can_delete_remove_icon.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 40, 40));

        cbxBuscar.setBackground(new java.awt.Color(255, 255, 255));
        cbxBuscar.setForeground(new java.awt.Color(0, 0, 0));
        cbxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aventura", "Ação", "Drama", "Comédia", "Terror", "Educação", "Infantil" }));
        cbxBuscar.setBorder(null);
        cbxBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbxBuscarKeyReleased(evt);
            }
        });
        pnlPrincipal.add(cbxBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 140, 30));

        btnBuscarCategoria.setBackground(new java.awt.Color(0, 255, 102));
        btnBuscarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCategoria.setText("Buscar por categoria");
        btnBuscarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriaActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnBuscarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 150, 30));

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/8666681_edit_icon.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // Recebe o nome de busca
        String nome = this.txtBuscar.getText();
        
        DefaultTableModel tableModel = (DefaultTableModel) this.tblDados.getModel();
        tableModel.setRowCount(0);
        
        FilmeController controller = new FilmeController();
        
        try {
            // Lista em um ArrayList e mostra por meio da tabela
            ArrayList<Filme> filmes = controller.listarFilmeController(nome);
            filmes.forEach((Filme filme) -> {
                tableModel.addRow(new Object[] {filme.getId(),
                                                filme.getNome(),
                                                filme.getDataLancamento(),
                                                filme.getCategoria()});
            });
            this.tblDados.setModel(tableModel);
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os dados! Por favor, "
                    + "verifique valores digitados!");
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        this.txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void cbxBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxBuscarKeyReleased
        // Sem ação
    }//GEN-LAST:event_cbxBuscarKeyReleased

    private void btnBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaActionPerformed
        // Recebe a categoria de busca
        String categoria = this.cbxBuscar.getSelectedItem().toString();
        
        DefaultTableModel tableModel = (DefaultTableModel) this.tblDados.getModel();
        tableModel.setRowCount(0);
        
        FilmeController controller = new FilmeController();
        
        try {
            // Lista em um ArrayList e mostra por meio da tabela
            ArrayList<Filme> filmes = controller.listarFilmeCategoriaController(categoria);
            filmes.forEach((Filme filme) -> {
                tableModel.addRow(new Object[] {filme.getId(),
                                                filme.getNome(),
                                                filme.getDataLancamento(),
                                                filme.getCategoria()});
            });
            this.tblDados.setModel(tableModel);
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os dados! Por favor, "
                    + "verifique valores digitados!");
        }
    }//GEN-LAST:event_btnBuscarCategoriaActionPerformed

    private void cbxBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxBuscarKeyPressed
        // Sem ação
    }//GEN-LAST:event_cbxBuscarKeyPressed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = this.tblDados.getSelectedRow();
        
        if(linha != -1) {
            int id = (Integer) this.tblDados.getModel().getValueAt(this.tblDados.getSelectedRow(), 0);
            String nome = (String) this.tblDados.getModel().getValueAt(this.tblDados.getSelectedRow(), 1);
            Date dataLancamento = (Date) this.tblDados.getModel().getValueAt(this.tblDados.getSelectedRow(), 2);
            String categoria = (String) this.tblDados.getModel().getValueAt(this.tblDados.getSelectedRow(), 3);
            
            TelaCenaFlix telaCenaFlix = new TelaCenaFlix(); 
            telaCenaFlix.recerberDadosAlteracao(id, nome, dataLancamento, categoria);
            telaCenaFlix.setVisible(true);
            this.setVisible(false);
            btnSalvarAlteracao.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        boolean exclusao;
        FilmeController controller = new FilmeController();
        
        try {
            int linhaSelecionada = this.tblDados.getSelectedRow();
            int id = (Integer) this.tblDados.getModel().getValueAt(this.tblDados.getSelectedRow(), 0);
            
            if(linhaSelecionada >= 0) {
            String[] opcoes = {"Sim", "Não"};
            
            int opcao = JOptionPane.showOptionDialog(
                    rootPane, 
                    "Tem certeza que deseja exluir?", 
                    "Exlusão de filme", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    opcoes,
                    opcoes[0]);
            
            if(opcao == 0) 
                controller.deletarFilmeController(id);
                this.tblDados.clearSelection();
            } else {
                this.tblDados.clearSelection();
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir os dados! Por favor, "
                    + "verifique valores selecionados!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCategoria;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cbxBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCadastroFilme;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprLinha;
    private javax.swing.JSeparator sprLinhaBuscar;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
