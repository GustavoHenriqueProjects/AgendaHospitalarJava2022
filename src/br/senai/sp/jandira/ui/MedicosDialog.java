package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282186
 */
public class MedicosDialog extends javax.swing.JDialog {

    //atributos
    private Medico medico;
    private OperacaoEnum operacao;

    //Metodos construtores
    public MedicosDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {
        super(parent,
                modal);

        initComponents();

        medico = m;

        preencheFormularioMedico();
        this.operacao = operacao;
        preencherTitulo();
    }

    public MedicosDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        this.operacao = operacao;
        preencherTitulo();
    }

    private void preencheFormularioMedico() {
        jTextFieldCodigoMedico.setText(medico.getCodigo().toString());
        jTextFieldNomeDoMedico.setText(medico.getNome());
        jTextFieldEmail.setText(medico.getEmail());
        jTextFieldTelefone.setText(medico.getTelefone());
        jTextFieldCRM.setText(medico.getCrm());
        formattedTextFieldDataDeNascimento.setText(medico.getDataDeNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo() {
        jLabelTitulo.setText("Plano médico - " + operacao);
        if (operacao == OperacaoEnum.EDITAR) {
            IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        } else {
            IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        IconeLabel = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigoMedico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNomeDoMedico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldCRM = new javax.swing.JTextField();
        formattedTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(158, 168, 250));
        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setText("MÉDICO - ADICIONAR");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(70, 20, 340, 32);

        IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        IconeLabel.setToolTipText("");
        jPanel1.add(IconeLabel);
        IconeLabel.setBounds(30, 20, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 70);

        jPanelContent.setBackground(new java.awt.Color(204, 204, 255));
        jPanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) médico(a):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(153, 0, 153))); // NOI18N
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
        jButtonCancelar.setBounds(570, 330, 70, 40);

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
        jButtonSalvar.setBounds(660, 330, 70, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CRM:");
        jPanelContent.add(jLabel2);
        jLabel2.setBounds(210, 40, 50, 20);

        jTextFieldCodigoMedico.setEditable(false);
        jTextFieldCodigoMedico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigoMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCodigoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoMedicoActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldCodigoMedico);
        jTextFieldCodigoMedico.setBounds(30, 70, 120, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Código");
        jPanelContent.add(jLabel3);
        jLabel3.setBounds(30, 40, 50, 20);

        jTextFieldTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(30, 150, 160, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");
        jPanelContent.add(jLabel4);
        jLabel4.setBounds(30, 120, 70, 20);

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(210, 150, 330, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("E-mail:");
        jPanelContent.add(jLabel5);
        jLabel5.setBounds(210, 120, 50, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Data de nascimento:");
        jPanelContent.add(jLabel6);
        jLabel6.setBounds(580, 120, 130, 20);

        jTextFieldNomeDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldNomeDoMedico);
        jTextFieldNomeDoMedico.setBounds(390, 70, 320, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nome do(a) médico(a):");
        jPanelContent.add(jLabel7);
        jLabel7.setBounds(390, 40, 150, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Especialidades do médico:");
        jPanelContent.add(jLabel1);
        jLabel1.setBounds(290, 200, 170, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel8.setText("Lista de especialidades:");
        jPanelContent.add(jLabel8);
        jLabel8.setBounds(30, 200, 170, 20);

        jScrollPane1.setViewportView(jList2);

        jPanelContent.add(jScrollPane1);
        jScrollPane1.setBounds(290, 230, 150, 140);

        jScrollPane2.setViewportView(jList1);

        jPanelContent.add(jScrollPane2);
        jScrollPane2.setBounds(30, 230, 150, 140);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/retorna.png"))); // NOI18N
        jPanelContent.add(jButton1);
        jButton1.setBounds(210, 290, 50, 31);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-direita.png"))); // NOI18N
        jPanelContent.add(jButton2);
        jButton2.setBounds(210, 240, 50, 31);
        jPanelContent.add(jTextFieldCRM);
        jTextFieldCRM.setBounds(210, 70, 140, 30);
        jPanelContent.add(formattedTextFieldDataDeNascimento);
        formattedTextFieldDataDeNascimento.setBounds(580, 150, 130, 30);
        try {
            formattedTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }

    getContentPane().add(jPanelContent);
    jPanelContent.setBounds(20, 90, 740, 380);

    setSize(new java.awt.Dimension(794, 533));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        CharSequence s = " ";
        
        if (jTextFieldCRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite o seu CRM.");
        } else if (jTextFieldNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite seu nome.");
        } else if (jTextFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite seu número de telefone nesse formato:(##) #####-####.");
        } else if(jTextFieldTelefone.getText().matches("[A-Za-z-]")){
            JOptionPane.showMessageDialog(null, "Atenção, digie seu número de telefone nesse formato:(##) #####-####.");
        } else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite seu e-mail.");
        }else if (formattedTextFieldDataDeNascimento.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(this, "Digite sua data de nascimento");   
        } else {
            if (operacao == OperacaoEnum.ADICIONAR) {
                adicionar();
            } else {
                editarMedico();
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    private void adicionar() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Medico novoMedico = new Medico();

        novoMedico.setCrm(jTextFieldCRM.getText());
        novoMedico.setNome(jTextFieldNomeDoMedico.getText());
        novoMedico.setTelefone(jTextFieldTelefone.getText());
        novoMedico.setEmail(jTextFieldEmail.getText());
        novoMedico.setDataDeNascimento(LocalDate.parse(formattedTextFieldDataDeNascimento.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        MedicoDAO.gravar(novoMedico);

        JOptionPane.showMessageDialog(
                this,
                "Especialidade gravada com sucesso!",
                "Especialiades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();

    }
    
    private void editarMedico(){
        medico.setCrm(jTextFieldCRM.getText());
        medico.setNome(jTextFieldNomeDoMedico.getText());
        medico.setTelefone(jTextFieldTelefone.getText());
        medico.setEmail(jTextFieldEmail.getText());
        medico.setDataDeNascimento(LocalDate.parse(formattedTextFieldDataDeNascimento.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        MedicoDAO.atualizar(medico);
        JOptionPane.showMessageDialog(null, "Médico(a) atualizado com sucesso!", "Médico(a)", JOptionPane.WARNING_MESSAGE);
        
        dispose();
    }
    private void jTextFieldCodigoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoMedicoActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDoMedicoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MedicosDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MedicosDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MedicosDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MedicosDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                MedicosDialog dialog = new MedicosDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconeLabel;
    private javax.swing.JFormattedTextField formattedTextFieldDataDeNascimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCRM;
    private javax.swing.JTextField jTextFieldCodigoMedico;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeDoMedico;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
