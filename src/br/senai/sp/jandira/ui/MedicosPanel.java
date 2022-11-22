/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JTable;


public class MedicosPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicosPanel
     */
    private int linha;
    
    public MedicosPanel() {
        initComponents();
        MedicoDAO.criarListaDeMedico();
        preencherTabelaMedicos();
    }
    
     private int getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String CodigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(CodigoStr);
        return codigo;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroolEspecialidades = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        buttonExcluirMedico = new javax.swing.JButton();
        buttobEditarMedico = new javax.swing.JButton();
        buttonNovoMedico = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        setLayout(null);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        scroolEspecialidades.setViewportView(tableMedicos);

        add(scroolEspecialidades);
        scroolEspecialidades.setBounds(30, 40, 680, 210);

        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(600, 260, 40, 30);

        buttobEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttobEditarMedico.setToolTipText("Editar  especialidade selecionada");
        buttobEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttobEditarMedicoActionPerformed(evt);
            }
        });
        add(buttobEditarMedico);
        buttobEditarMedico.setBounds(650, 260, 40, 30);

        buttonNovoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        buttonNovoMedico.setToolTipText("Editar nova Especialidade");
        buttonNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoMedicoActionPerformed(evt);
            }
        });
        add(buttonNovoMedico);
        buttonNovoMedico.setBounds(700, 260, 40, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed

      
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void buttobEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttobEditarMedicoActionPerformed

        
    }//GEN-LAST:event_buttobEditarMedicoActionPerformed

    private void buttonNovoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoMedicoActionPerformed
        MedicosDialog medicosdialog = new MedicosDialog(null,
                true,
                OperacaoEnum.ADICIONAR);
        medicosdialog.setVisible(true);
        preencherTabelaMedicos();
        
    }//GEN-LAST:event_buttonNovoMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttobEditarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JButton buttonNovoMedico;
    private javax.swing.JScrollPane scroolEspecialidades;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables
private void preencherTabelaMedicos() {

        tableMedicos.setModel(MedicoDAO.getMedicoPanel());
        ajustarTabelaMedicos();
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    private void ajustarTabelaMedicos() {
        // Impedir que o usuário ajuste as colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);
        
        // Bloquear a edição das celulas da tabela
        tableMedicos.setDefaultEditor(Object.class, null);
        
        // Definir largura coluna
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(60);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(220);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(206);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(190);
    }

}
