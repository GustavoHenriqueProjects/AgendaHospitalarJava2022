package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import br.senai.sp.jandira.model.OperacaoEnum;

/**
 *
 * @author 22282176
 */
public class EspecialidadeDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        especialidade = e;

        prencherFormulario();
        this.operacao = operacao;
        preencherTitulo();
    }

    public EspecialidadeDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    private void prencherFormulario() {

        TextFieldCodigoDaEspecialidade.setText(especialidade.getCodigo().toString());
        jTextFieldDescriçãoDaEspecialidade.setText(especialidade.getDescricao());
        jTextFieldNomeEspecialidade.setText(especialidade.getNome());

    }

    private void preencherTitulo() {
        jLabelTitulo.setText("ESPECIALIDADE - " + operacao);
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
        jTextFieldDescriçãoDaEspecialidade = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldNomeEspecialidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFieldCodigoDaEspecialidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        IconeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelBaixo.setBackground(new java.awt.Color(242, 242, 242));
        panelBaixo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBaixo.setLayout(null);

        jPanelContent.setBackground(new java.awt.Color(204, 204, 255));
        jPanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes de Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(153, 0, 153))); // NOI18N
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

        jTextFieldDescriçãoDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescriçãoDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldDescriçãoDaEspecialidade);
        jTextFieldDescriçãoDaEspecialidade.setBounds(30, 230, 370, 30);

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescricao.setText("Descrição da especialidade:");
        jPanelContent.add(jLabelDescricao);
        jLabelDescricao.setBounds(30, 200, 180, 20);

        jTextFieldNomeEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeEspecialidadeActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldNomeEspecialidade);
        jTextFieldNomeEspecialidade.setBounds(30, 150, 370, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome da Especialidade:");
        jPanelContent.add(jLabel3);
        jLabel3.setBounds(30, 120, 160, 20);

        TextFieldCodigoDaEspecialidade.setEditable(false);
        TextFieldCodigoDaEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCodigoDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextFieldCodigoDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanelContent.add(TextFieldCodigoDaEspecialidade);
        TextFieldCodigoDaEspecialidade.setBounds(30, 70, 120, 30);

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
        jLabelTitulo.setText("   Especialidades-ADICIONAR");
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

        if (jTextFieldNomeEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite o nome da Operadora ");
            jTextFieldNomeEspecialidade.requestFocus();
        } else if (jTextFieldDescriçãoDaEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite a descrição da Categoria ");
            jTextFieldDescriçãoDaEspecialidade.requestFocus();
        } else {
            Especialidade novaEspecialidade = new Especialidade();
            novaEspecialidade.setNome(jTextFieldNomeEspecialidade.getText());
            novaEspecialidade.setDescricao(jTextFieldDescriçãoDaEspecialidade.getText());

            EspecialidadeDAO.gravar(novaEspecialidade);

            JOptionPane.showMessageDialog(
                    this,
                    "Especialidade gravada com sucesso!",
                    "Especialiades",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void editar() {
        especialidade.setNome(jTextFieldNomeEspecialidade.getText());
        especialidade.setDescricao(jTextFieldDescriçãoDaEspecialidade.getText());

        EspecialidadeDAO.atualizar(especialidade);
        JOptionPane.showMessageDialog(
                this,
                "Especialidade editada com sucesso!",
                "Especialiades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void jTextFieldDescriçãoDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescriçãoDaEspecialidadeActionPerformed

    }//GEN-LAST:event_jTextFieldDescriçãoDaEspecialidadeActionPerformed

    private void jTextFieldNomeEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeEspecialidadeActionPerformed

    private void TextFieldCodigoDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoDaEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconeLabel;
    private javax.swing.JTextField TextFieldCodigoDaEspecialidade;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JTextField jTextFieldDescriçãoDaEspecialidade;
    private javax.swing.JTextField jTextFieldNomeEspecialidade;
    private java.awt.Panel panelBaixo;
    // End of variables declaration//GEN-END:variables
}
