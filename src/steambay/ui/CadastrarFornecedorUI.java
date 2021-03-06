/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steambay.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import steambay.dao.FornecedorDAO;
import steambay.entity.Fornecedor;

/**
 *
 * @author Daniel, Thales e Gabriel
 */
public class CadastrarFornecedorUI extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarFornecedorUI
     */
    public CadastrarFornecedorUI() {
        initComponents();
        salvar.setEnabled(false);
        remover.setEnabled(false);
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nome.setText(nome.getText().replaceAll("[0-9]", ""));
            }
        });
        razao_social.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                razao_social.setText(razao_social.getText().replaceAll("[0-9]", ""));
            }
        });
        cnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnpj.setText(cnpj.getText().replaceAll("[^0-9 | ^\\. | ^\\- | ^\\/]", ""));
            }
        });
        telefone.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefone.setText(telefone.getText().replaceAll("[^0-9 | ^\\+ | ^\\( | ^\\) | ^\\- ]", ""));
            }
        });
        numero.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numero.setText(numero.getText().replaceAll("[^0-9]", ""));
            }
        });
        cep.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cep.setText(cep.getText().replaceAll("[^0-9 | ^\\- ]", ""));
            }
        });
        cidade.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cidade.setText(cidade.getText().replaceAll("[0-9]", ""));
            }
        });
        uf.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uf.setText(uf.getText().replaceAll("[0-9]", ""));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        razao_social = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cnpj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        logradouro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        complemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        uf = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Fornecedor");
        setResizable(false);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome *");

        jLabel2.setText("Razão Social *");

        jLabel3.setText("CNPJ *");

        cnpj.setToolTipText("");
        cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone *");

        jLabel5.setText("Logradouro *");

        logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logradouroActionPerformed(evt);
            }
        });

        jLabel6.setText("Número *");

        jLabel7.setText("Complemento");

        jLabel8.setText("CEP *");

        jLabel9.setText("Cidade *");

        jLabel10.setText("UF *");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        jLabel11.setText("(*) Campos obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(complemento))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(logradouro))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cnpj)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(razao_social))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(cadastrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(limpar)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cidade)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pesquisar)
                                    .addGap(18, 18, 18)
                                    .addComponent(salvar)
                                    .addGap(18, 18, 18)
                                    .addComponent(remover))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(pesquisar)
                    .addComponent(limpar)
                    .addComponent(remover)
                    .addComponent(salvar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        nome.setText("");
        razao_social.setText("");
        cnpj.setText("");
        telefone.setText("");
        logradouro.setText("");
        numero.setText("");
        complemento.setText("");
        cep.setText("");
        cidade.setText("");
        uf.setText("");
        salvar.setEnabled(false);
        remover.setEnabled(false);
    }//GEN-LAST:event_limparActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO acao = new FornecedorDAO();

        fornecedor.setNome(nome.getText());
        fornecedor.setRazao_social(razao_social.getText());
        fornecedor.setCnpj(cnpj.getText());
        fornecedor.setTelefone(telefone.getText());
        fornecedor.setLogradouro(logradouro.getText());
        fornecedor.setNumero(numero.getText());
        fornecedor.setComplemento(complemento.getText());
        fornecedor.setCep(cep.getText());
        fornecedor.setCidade(cidade.getText());
        fornecedor.setUf(uf.getText());

        acao.insere(fornecedor);
    }//GEN-LAST:event_cadastrarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO acao = new FornecedorDAO();
        String tcnpj;
        
        tcnpj = cnpj.getText();
        
        if(acao.buscar(tcnpj).getCnpj() != null){
            salvar.setEnabled(true);
            remover.setEnabled(true);
            fornecedor = acao.buscar(tcnpj);
            nome.setText(fornecedor.getNome());
            razao_social.setText(fornecedor.getRazao_social());
            cnpj.setText(fornecedor.getCnpj());
            telefone.setText(fornecedor.getTelefone());
            logradouro.setText(fornecedor.getLogradouro());
            numero.setText(fornecedor.getNumero());
            complemento.setText(fornecedor.getComplemento());
            cep.setText(fornecedor.getCep());
            cidade.setText(fornecedor.getCidade());
            uf.setText(fornecedor.getUf());
            JOptionPane.showMessageDialog(logradouro, "Fornecedor encontrado!");
        }
        else
            JOptionPane.showMessageDialog(logradouro, "Fornecedor não encontrado!");
    }//GEN-LAST:event_pesquisarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO acao = new FornecedorDAO();

        fornecedor.setNome(nome.getText());
        fornecedor.setRazao_social(razao_social.getText());
        fornecedor.setCnpj(cnpj.getText());
        fornecedor.setTelefone(telefone.getText());
        fornecedor.setLogradouro(logradouro.getText());
        fornecedor.setNumero(numero.getText());
        fornecedor.setComplemento(complemento.getText());
        fornecedor.setCep(cep.getText());
        fornecedor.setCidade(cidade.getText());
        fornecedor.setUf(uf.getText());

        acao.atualizar(fornecedor);
    }//GEN-LAST:event_salvarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        FornecedorDAO acao = new FornecedorDAO();
        String tcnpj;
        
        tcnpj = cnpj.getText();
        
        acao.apagar(tcnpj);
    }//GEN-LAST:event_removerActionPerformed

    private void logradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logradouroActionPerformed

    private void cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarFornecedorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFornecedorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cnpj;
    private javax.swing.JTextField complemento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField logradouro;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTextField razao_social;
    private javax.swing.JButton remover;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField uf;
    // End of variables declaration//GEN-END:variables
}
