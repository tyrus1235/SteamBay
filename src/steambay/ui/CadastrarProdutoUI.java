/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steambay.ui;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import steambay.dao.FornecedorDAO;
import steambay.dao.JogoDAO;
import steambay.entity.Fornecedor;
import steambay.entity.Jogo;

/**
 *
 * @author Daniel, Thales e Gabriel
 */
public class CadastrarProdutoUI extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarProdutoUI
     */
    public CadastrarProdutoUI() {
        initComponents();
        Vector<Fornecedor> fornList = new Vector<>();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornList = fornecedorDAO.buscarTodos();
        for (int i = 0; i < fornList.size(); i++) {
            jComboBoxForn.addItem(fornList.get(i).getNome()+", "+fornList.get(i).getCnpj());
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

        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jCheckBoxTipo = new javax.swing.JCheckBox();
        jLabelQtde = new javax.swing.JLabel();
        jTextFieldQtde = new javax.swing.JTextField();
        jLabelTam = new javax.swing.JLabel();
        jTextFieldTam = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabelEspec = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEspec = new javax.swing.JTextArea();
        jLabelDesc = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFornecedor = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jButtonDrop = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jComboBoxForn = new javax.swing.JComboBox();

        setTitle("Gerenciar Jogo");
        setResizable(false);

        jLabelNome.setLabelFor(jTextFieldNome);
        jLabelNome.setText("Nome");

        jTextFieldNome.setToolTipText("Digite o nome do jogo.");

        jLabelTipo.setLabelFor(jCheckBoxTipo);
        jLabelTipo.setText("Tipo");

        jCheckBoxTipo.setText("Jogo Físico");
        jCheckBoxTipo.setToolTipText("Selecione se o jogo for em mídia física - deixe em branco se for mídia digital.");
        jCheckBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTipoActionPerformed(evt);
            }
        });

        jLabelQtde.setLabelFor(jTextFieldQtde);
        jLabelQtde.setText("Quantidade");
        jLabelQtde.setEnabled(false);

        jTextFieldQtde.setToolTipText("Digite quantos produtos serão adicionados no estoque.");
        jTextFieldQtde.setEnabled(false);
        jTextFieldQtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQtdeActionPerformed(evt);
            }
        });
        jTextFieldQtde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQtdeKeyTyped(evt);
            }
        });

        jLabelTam.setLabelFor(jTextFieldTam);
        jLabelTam.setText("Tamanho");

        jTextFieldTam.setToolTipText("Digite o tamanho (com unidade de medida) que o jogo ocupará no disco rígido do usuário.");
        jTextFieldTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTamActionPerformed(evt);
            }
        });

        jLabelPreco.setLabelFor(jTextFieldPreco);
        jLabelPreco.setText("Preço");

        jTextFieldPreco.setToolTipText("Digite o preço (em Reais) do produto.");
        jTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoActionPerformed(evt);
            }
        });

        jLabelEspec.setLabelFor(jTextAreaEspec);
        jLabelEspec.setText("Especificações Técnicas");

        jTextAreaEspec.setColumns(20);
        jTextAreaEspec.setRows(5);
        jTextAreaEspec.setToolTipText("Digite as especificações técnicas do jogo.");
        jTextAreaEspec.setWrapStyleWord(true);
        jTextAreaEspec.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextAreaEspec);

        jLabelDesc.setLabelFor(jTextAreaDesc);
        jLabelDesc.setText("Descrição");

        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setRows(5);
        jTextAreaDesc.setToolTipText("Digite uma descrição para o jogo.");
        jTextAreaDesc.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextAreaDesc);

        jButtonSave.setText("Salvar");
        jButtonSave.setToolTipText("Salva as informações no banco de dados.");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.setToolTipText("Fechar a janela.");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelFornecedor.setText("Fornecedor");

        jButtonSearch.setText("Buscar");
        jButtonSearch.setToolTipText("Busca um jogo no banco de dados baseado no nome inserido.");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonDrop.setText("Apagar");
        jButtonDrop.setToolTipText("Busca e apaga o jogo cujo nome foi inserido.");
        jButtonDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDropActionPerformed(evt);
            }
        });

        jButtonClean.setText("Limpar");
        jButtonClean.setToolTipText("Limpa todos os campos e áreas de texto.");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Atualizar");
        jButtonUpdate.setToolTipText("Sobrescreve o jogo cujo nome foi inserido. Recomenda-se buscá-lo antes.");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jComboBoxForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFornActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addGap(169, 169, 169)
                                .addComponent(jLabelTipo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jCheckBoxTipo)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQtde)
                            .addComponent(jTextFieldQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTam)
                            .addComponent(jTextFieldTam, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPreco)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelFornecedor)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxForn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonSearch)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClean)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDrop)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(jButtonSave)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEspec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDesc)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxTipo)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelTam)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelQtde)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPreco)
                            .addComponent(jLabelFornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEspec)
                    .addComponent(jLabelDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonSearch)
                    .addComponent(jButtonDrop)
                    .addComponent(jButtonClean)
                    .addComponent(jButtonUpdate))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQtdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQtdeActionPerformed

    private void jTextFieldTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTamActionPerformed

    private void jTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoActionPerformed

    private void jTextFieldQtdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQtdeKeyTyped
        String nums="0987654321";
        if(!nums.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldQtdeKeyTyped

    private void jCheckBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTipoActionPerformed
        if (jCheckBoxTipo.isSelected()) {
            jLabelQtde.setEnabled(true);
            jTextFieldQtde.setEnabled(true);
        }
        else {
            jLabelQtde.setEnabled(false);
            jTextFieldQtde.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxTipoActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String tNome = jTextFieldNome.getText();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        boolean tTipo = jCheckBoxTipo.isSelected();
        int tQtde = 0;
        if (tTipo)
            tQtde = Integer.parseInt(jTextFieldQtde.getText().trim());
        String tTamanho = jTextFieldTam.getText();
        float tPreco = Float.parseFloat(jTextFieldPreco.getText().trim());
        String tEsp = jTextAreaEspec.getText();
        String tDesc = jTextAreaDesc.getText();
        String tFornAux1 = jComboBoxForn.getSelectedItem().toString();
        String[] tFornAux2;
        tFornAux2 = tFornAux1.split(", ");
        int tForn = fornecedorDAO.buscarId(tFornAux2[1]);
        if (!tNome.isEmpty() && !tTamanho.isEmpty() && !jTextFieldPreco.getText().isEmpty() && !tEsp.isEmpty() && !tDesc.isEmpty()) {
            Jogo tJogo = new Jogo(tNome, tTipo, tQtde, tTamanho, tPreco, tEsp, tDesc, tForn);
            JogoDAO jogoDAO = new JogoDAO();
            if (jogoDAO.buscar(tNome).size() < 1){
                jogoDAO.insere(tJogo);
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        Jogo tJogo;
        JogoDAO jogoDAO = new JogoDAO();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        Fornecedor tForn;
        if (!jTextFieldNome.getText().isEmpty())
            if (jogoDAO.buscar(jTextFieldNome.getText()).size() > 0) {
                tJogo = jogoDAO.buscar(jTextFieldNome.getText()).get(0);
                tForn = fornecedorDAO.buscarPorId(tJogo.getFornecedor());
                jTextAreaDesc.setText(tJogo.getDescricao());
                jTextAreaEspec.setText(tJogo.getEspecificacao());
                jComboBoxForn.setSelectedItem(tForn.getNome()+", "+tForn.getCnpj());
                jTextFieldNome.setText(tJogo.getNome());
                jTextFieldPreco.setText(String.valueOf(tJogo.getPreco()));
                if (tJogo.isTipo() != jCheckBoxTipo.isSelected())
                    jCheckBoxTipo.doClick();
                if (tJogo.isTipo())
                    jTextFieldQtde.setText(String.valueOf(tJogo.getQtde()));
                jTextFieldTam.setText(tJogo.getTamanho());
            }
        
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDropActionPerformed
        JogoDAO jogoDAO = new JogoDAO();
        String tNome = jTextFieldNome.getText();
        if (!jTextFieldNome.getText().isEmpty())
            if (jogoDAO.buscar(tNome).size() > 0)
                jogoDAO.apagar(tNome);
    }//GEN-LAST:event_jButtonDropActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        jTextAreaDesc.setText("");
        jTextAreaEspec.setText("");
        jComboBoxForn.removeAllItems();
        jTextFieldNome.setText("");
        jTextFieldPreco.setText("");
        if (jCheckBoxTipo.isSelected())
            jCheckBoxTipo.doClick();
        jTextFieldQtde.setText("");
        jTextFieldTam.setText("");
        Vector<Fornecedor> fornList = new Vector<>();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornList = fornecedorDAO.buscarTodos();
        for (int i = 0; i < fornList.size(); i++) {
            jComboBoxForn.addItem(fornList.get(i).getNome()+", "+fornList.get(i).getCnpj());
        }
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        String tNome = jTextFieldNome.getText();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        boolean tTipo = jCheckBoxTipo.isSelected();
        int tQtde = 0;
        if (tTipo)
            tQtde = Integer.parseInt(jTextFieldQtde.getText().trim());
        String tTamanho = jTextFieldTam.getText();
        float tPreco = Float.parseFloat(jTextFieldPreco.getText().trim());
        String tEsp = jTextAreaEspec.getText();
        String tDesc = jTextAreaDesc.getText();
        String tFornAux1 = jComboBoxForn.getSelectedItem().toString();
        String[] tFornAux2;
        tFornAux2 = tFornAux1.split(", ");
        int tForn = fornecedorDAO.buscarId(tFornAux2[1]);
        if (!tNome.isEmpty() && !tTamanho.isEmpty() && !jTextFieldPreco.getText().isEmpty() && !tEsp.isEmpty() && !tDesc.isEmpty()) {
            Jogo tJogo = new Jogo(tNome, tTipo, tQtde, tTamanho, tPreco, tEsp, tDesc, tForn);
            JogoDAO jogoDAO = new JogoDAO();
            if (jogoDAO.buscar(tNome).size() > 0)
                    jogoDAO.atualizar(tJogo);
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jComboBoxFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFornActionPerformed

    }//GEN-LAST:event_jComboBoxFornActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProdutoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProdutoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDrop;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JCheckBox jCheckBoxTipo;
    private javax.swing.JComboBox jComboBoxForn;
    private javax.swing.JLabel jLabelDesc;
    private javax.swing.JLabel jLabelEspec;
    private javax.swing.JLabel jLabelFornecedor;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelQtde;
    private javax.swing.JLabel jLabelTam;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDesc;
    private javax.swing.JTextArea jTextAreaEspec;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQtde;
    private javax.swing.JTextField jTextFieldTam;
    // End of variables declaration//GEN-END:variables

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }
}
