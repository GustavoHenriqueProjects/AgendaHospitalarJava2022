package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282227
 */
public class HomeFrame extends javax.swing.JFrame {

    private int fecha;
    private EspecialidadesPanel especialidadesPanel;
    private PlanoDeSaudePanel planoDeSaudePanel;
    private final int POS_X = 30;
    private final int POS_Y = 180;
    private final int POS_W = 750;
    private final int POS_H = 300;

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/equipe-medica1.png")));
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(158, 168, 250));
        jPanel1.setLayout(null);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Calendario.png"))); // NOI18N
        jPanel1.add(labelIcon);
        labelIcon.setBounds(30, 0, 70, 70);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelTitulo.setText("Agenda de Consultas");
        labelTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(280, 20, 240, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 70);

        buttonSair.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Log-Outsair.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(750, 90, 30, 40);

        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Agenda.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(120, 100, 60, 40);

        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Cadastro De Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(190, 100, 60, 39);

        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/estetoscopio.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Cadastro de especialidades Médicas");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(330, 100, 60, 40);

        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/equipe-medica.png"))); // NOI18N
        buttonMedicos.setToolTipText("Cadastro de Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(260, 100, 60, 40);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(158, 168, 250));
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(10, 10, 250, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(10, 70, 280, 20);

        jPanel2.setBackground(new java.awt.Color(158, 168, 250));
        jPanel2.setForeground(new java.awt.Color(158, 168, 250));
        panelHome.add(jPanel2);
        jPanel2.setBounds(0, 100, 750, 5);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Site: www.HospitalGreen@gmail.com");
        panelHome.add(jLabel3);
        jLabel3.setBounds(410, 270, 240, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("E-mail: HospitalGreen@gmail.com");
        panelHome.add(jLabel4);
        jLabel4.setBounds(410, 220, 290, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Telefone: 11 4143-6562");
        panelHome.add(jLabel5);
        jLabel5.setBounds(410, 170, 150, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Dados Técnicos:");
        panelHome.add(jLabel6);
        jLabel6.setBounds(440, 130, 200, 32);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/rede.png"))); // NOI18N
        panelHome.add(jLabel7);
        jLabel7.setBounds(370, 270, 24, 24);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/chamada-telefonica.png"))); // NOI18N
        panelHome.add(jLabel8);
        jLabel8.setBounds(370, 163, 32, 32);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/email.png"))); // NOI18N
        panelHome.add(jLabel9);
        jLabel9.setBounds(370, 220, 30, 24);

        getContentPane().add(panelHome);
        panelHome.setBounds(30, 180, 750, 300);

        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano de saúde");
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(400, 100, 60, 39);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home.png"))); // NOI18N
        buttonHome.setToolTipText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(40, 100, 70, 40);

        setSize(new java.awt.Dimension(816, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
       
                if (evt.getSource() == buttonSair) {
                    fecharHomeFrame();
                }

    }//GEN-LAST:event_buttonSairActionPerformed
    private void fecharHomeFrame() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você deseja Sair da aplicação?",
                "Muita Atenção!!!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {
            dispose();
        }
    }
    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
        planoDeSaudePanel.setVisible(false);
        buttonEspecialidades.setBackground(new java.awt.Color(242, 242, 242));
        buttonHome.setBackground(new java.awt.Color(242, 242, 242));
        buttonMedicos.setBackground(new java.awt.Color(242, 242, 242));
        buttonPacientes.setBackground(new java.awt.Color(242, 242, 242));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(242, 242, 242));
        buttonAgenda.setBackground(new java.awt.Color(204, 255, 204));
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
        planoDeSaudePanel.setVisible(false);
        buttonEspecialidades.setBackground(new java.awt.Color(242, 242, 242));
        buttonHome.setBackground(new java.awt.Color(242, 242, 242));
        buttonMedicos.setBackground(new java.awt.Color(242, 242, 242));
        buttonPacientes.setBackground(new java.awt.Color(204, 255, 204));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(242, 242, 242));
        buttonAgenda.setBackground(new java.awt.Color(242, 242, 242));
// TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 204));
        buttonHome.setBackground(new java.awt.Color(242, 242, 242));
        buttonMedicos.setBackground(new java.awt.Color(242, 242, 242));
        buttonPacientes.setBackground(new java.awt.Color(242, 242, 242));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(242, 242, 242));
        buttonAgenda.setBackground(new java.awt.Color(242, 242, 242));
        panelHome.setVisible(false);
        planoDeSaudePanel.setVisible(false);
        especialidadesPanel.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
        planoDeSaudePanel.setVisible(false);
        buttonEspecialidades.setBackground(new java.awt.Color(242, 242, 242));
        buttonHome.setBackground(new java.awt.Color(242, 242, 242));
        buttonMedicos.setBackground(new java.awt.Color(204, 255, 204));
        buttonPacientes.setBackground(new java.awt.Color(242, 242, 242));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(242, 242, 242));
        buttonAgenda.setBackground(new java.awt.Color(242, 242, 242));
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
        planoDeSaudePanel.setVisible(true);
        buttonEspecialidades.setBackground(new java.awt.Color(242, 242, 242));
        buttonHome.setBackground(new java.awt.Color(242, 242, 242));
        buttonMedicos.setBackground(new java.awt.Color(242, 242, 242));
        buttonPacientes.setBackground(new java.awt.Color(242, 242, 242));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 255, 204));
        buttonAgenda.setBackground(new java.awt.Color(242, 242, 242));
// TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonEspecialidades.setBackground(new java.awt.Color(242, 242, 242));
        buttonHome.setBackground(new java.awt.Color(204, 255, 204));
        buttonMedicos.setBackground(new java.awt.Color(242, 242, 242));
        buttonPacientes.setBackground(new java.awt.Color(242, 242, 242));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(242, 242, 242));
        buttonAgenda.setBackground(new java.awt.Color(242, 242, 242));
        panelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
        planoDeSaudePanel.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, POS_W, POS_H);
        getContentPane().add(especialidadesPanel);
        especialidadesPanel.setVisible(false);

        planoDeSaudePanel = new PlanoDeSaudePanel();
        planoDeSaudePanel.setBounds(POS_X, POS_Y, POS_W, POS_H);
        getContentPane().add(planoDeSaudePanel);
        planoDeSaudePanel.setVisible(false);

    }

}
