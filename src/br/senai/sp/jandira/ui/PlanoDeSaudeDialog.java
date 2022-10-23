package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    //Atributos
    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    //Metodos construtores
    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        planoDeSaude = p;

        prencherFormularioPlanoSaude();
        this.operacao = operacao;
        preencherTitulo();
    }

    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    private void prencherFormularioPlanoSaude() {

        TextFieldCodigoDoPlano.setText(planoDeSaude.getCodigo().toString());
        jTextFieldDescriçãoDaCategoria.setText(planoDeSaude.getCategoria());
        jTextFieldNomeDaOperadora.setText(planoDeSaude.getOperadora());

    }

    private void preencherTitulo() {
        jLabelTitulo.setText("Plano de saúde - " + operacao);
        if (operacao == OperacaoEnum.EDITAR) {
            IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        } else {
            IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaixo = new java.awt.Panel();
        jPanelContent = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldDescriçãoDaCategoria = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldNomeDaOperadora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFieldCodigoDoPlano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        IconeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        getContentPane().setLayout(null);

        panelBaixo.setBackground(new java.awt.Color(242, 242, 242));
        panelBaixo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBaixo.setLayout(null);

        jPanelContent.setBackground(new java.awt.Color(204, 204, 255));
        jPanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do plano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanelContent.setForeground(new java.awt.Color(255, 255, 255));
        jPanelContent.setLayout(null);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelContent.add(jButtonCancelar);
        jButtonCancelar.setBounds(510, 290, 70, 40);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Salvar.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setBorder(null);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelContent.add(jButtonSalvar);
        jButtonSalvar.setBounds(610, 290, 70, 40);

        jTextFieldDescriçãoDaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescriçãoDaCategoriaActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldDescriçãoDaCategoria);
        jTextFieldDescriçãoDaCategoria.setBounds(30, 230, 420, 30);

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescricao.setText("Descrição da categoria:");
        jPanelContent.add(jLabelDescricao);
        jLabelDescricao.setBounds(30, 200, 180, 20);

        jTextFieldNomeDaOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDaOperadoraActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldNomeDaOperadora);
        jTextFieldNomeDaOperadora.setBounds(30, 150, 420, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome da operadora:");
        jPanelContent.add(jLabel3);
        jLabel3.setBounds(30, 120, 160, 20);

        TextFieldCodigoDoPlano.setEditable(false);
        TextFieldCodigoDoPlano.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCodigoDoPlano.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextFieldCodigoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoDoPlanoActionPerformed(evt);
            }
        });
        jPanelContent.add(TextFieldCodigoDoPlano);
        TextFieldCodigoDoPlano.setBounds(30, 70, 120, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código");
        jPanelContent.add(jLabel2);
        jLabel2.setBounds(30, 40, 50, 20);

        panelBaixo.add(jPanelContent);
        jPanelContent.setBounds(30, 20, 710, 350);

        getContentPane().add(panelBaixo);
        panelBaixo.setBounds(0, 70, 780, 420);

        jPanel1.setBackground(new java.awt.Color(158, 168, 250));
        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setText("   Plano de saúde-ADICIONAR");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(70, 20, 360, 32);

        IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        IconeLabel.setToolTipText("");
        jPanel1.add(IconeLabel);
        IconeLabel.setBounds(40, 20, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 70);

        setSize(new java.awt.Dimension(794, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed
    private void adicionar() {
        if (jTextFieldNomeDaOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite o nome da Operadora ");
            jTextFieldNomeDaOperadora.requestFocus();
        }else if (jTextFieldDescriçãoDaCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite a descrição da Categoria ");
            jTextFieldNomeDaOperadora.requestFocus();
        }else {
            PlanoDeSaude novoPlanoSaude = new PlanoDeSaude();
            novoPlanoSaude.setOperadora(jTextFieldNomeDaOperadora.getText());
            novoPlanoSaude.setCategoria(jTextFieldDescriçãoDaCategoria.getText());

            PlanoDeSaudeDAO.gravar(novoPlanoSaude);

            JOptionPane.showMessageDialog(
                    this,
                    "Especialidade gravada com sucesso!",
                    "Especialiades",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void editar() {
        planoDeSaude.setOperadora(jTextFieldNomeDaOperadora.getText());
        planoDeSaude.setCategoria(jTextFieldDescriçãoDaCategoria.getText());

        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        JOptionPane.showMessageDialog(
                this,
                "Plano de saúde editado com sucesso!",
                "Plano saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
    private void jTextFieldDescriçãoDaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescriçãoDaCategoriaActionPerformed

    }//GEN-LAST:event_jTextFieldDescriçãoDaCategoriaActionPerformed

    private void jTextFieldNomeDaOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDaOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDaOperadoraActionPerformed

    private void TextFieldCodigoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoDoPlanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconeLabel;
    private javax.swing.JTextField TextFieldCodigoDoPlano;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JTextField jTextFieldDescriçãoDaCategoria;
    private javax.swing.JTextField jTextFieldNomeDaOperadora;
    private java.awt.Panel panelBaixo;
    // End of variables declaration//GEN-END:variables
}
