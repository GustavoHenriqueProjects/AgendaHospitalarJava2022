/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

/**
 *
 * @author 22282176
 */
public class PacientesPanel extends javax.swing.JPanel {

    public PacientesPanel() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroolPacientes = new javax.swing.JScrollPane();
        tablePacientes = new javax.swing.JTable();
        buttonExcluirPacientes = new javax.swing.JButton();
        buttonEditarPacientes = new javax.swing.JButton();
        buttonAdicionarPacientes = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 300));
        setLayout(null);

        tablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scroolPacientes.setViewportView(tablePacientes);

        add(scroolPacientes);
        scroolPacientes.setBounds(30, 40, 600, 210);

        buttonExcluirPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirPacientes.setToolTipText("Excluir paciente selecionado");
        buttonExcluirPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPacientesActionPerformed(evt);
            }
        });
        add(buttonExcluirPacientes);
        buttonExcluirPacientes.setBounds(600, 260, 40, 30);

        buttonEditarPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonEditarPacientes.setToolTipText("Editar  paciente selecionado.");
        buttonEditarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPacientesActionPerformed(evt);
            }
        });
        add(buttonEditarPacientes);
        buttonEditarPacientes.setBounds(650, 260, 40, 30);

        buttonAdicionarPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        buttonAdicionarPacientes.setToolTipText("Editar novo paciente.");
        buttonAdicionarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPacientesActionPerformed(evt);
            }
        });
        add(buttonAdicionarPacientes);
        buttonAdicionarPacientes.setBounds(700, 260, 40, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirPacientesActionPerformed

    private void buttonEditarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarPacientesActionPerformed

    private void buttonAdicionarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarPacientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPacientes;
    private javax.swing.JButton buttonEditarPacientes;
    private javax.swing.JButton buttonExcluirPacientes;
    private javax.swing.JScrollPane scroolPacientes;
    private javax.swing.JTable tablePacientes;
    // End of variables declaration//GEN-END:variables
}
