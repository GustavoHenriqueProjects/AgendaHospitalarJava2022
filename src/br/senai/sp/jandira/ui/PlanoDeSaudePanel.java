/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanoDeSaudePanel extends javax.swing.JPanel {

    private int linha;

    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlano();
        preencherTabelaPlanosDeSaude();

    }

    //metodos
    private int getLinha() {
        linha = tablePlanosDeSaude.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String CodigoStr = tablePlanosDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(CodigoStr);
        return codigo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroolEspecialidades = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttobEditarPlanoDeSaude = new javax.swing.JButton();
        buttonNovoPlanoDeSaúde = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano De Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 300));
        setLayout(null);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scroolEspecialidades.setViewportView(tablePlanosDeSaude);

        add(scroolEspecialidades);
        scroolEspecialidades.setBounds(30, 40, 680, 210);

        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(600, 260, 40, 30);

        buttobEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttobEditarPlanoDeSaude.setToolTipText("Editar  especialidade selecionada");
        buttobEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttobEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttobEditarPlanoDeSaude);
        buttobEditarPlanoDeSaude.setBounds(650, 260, 40, 30);

        buttonNovoPlanoDeSaúde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        buttonNovoPlanoDeSaúde.setToolTipText("Editar nova Especialidade");
        buttonNovoPlanoDeSaúde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoPlanoDeSaúdeActionPerformed(evt);
            }
        });
        add(buttonNovoPlanoDeSaúde);
        buttonNovoPlanoDeSaúde.setBounds(700, 260, 40, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed

        System.out.println(linha);
        if (getLinha() != -1) {
            excluirPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a especialidade que deseja excluir",
                    "ATENÇÃO!",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed

    private void excluirPlanoDeSaude() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Muita Atenção!!!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {
            String codigoString = tablePlanosDeSaude.getValueAt(linha, 0).toString();
            Integer codigo = Integer.valueOf(codigoString);
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabelaPlanosDeSaude();
        }
    }
    private void buttobEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttobEditarPlanoDeSaudeActionPerformed
        if (getLinha() != -1) {
            editarPlanoSaude();
        } else {
            JOptionPane.showConfirmDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja editar",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttobEditarPlanoDeSaudeActionPerformed
    private void editarPlanoSaude() {

     PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaudes(getCodigo());

        PlanoDeSaudeDialog planoDeSaudeDialog
                = new PlanoDeSaudeDialog(
                        null,
                        true,
                        planoDeSaude,
                        OperacaoEnum.EDITAR);

        planoDeSaudeDialog.setVisible(true);
 
        preencherTabelaPlanosDeSaude();
        
    }
    private void buttonNovoPlanoDeSaúdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoPlanoDeSaúdeActionPerformed
    
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null,
                true,
                OperacaoEnum.ADICIONAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabelaPlanosDeSaude();

    }//GEN-LAST:event_buttonNovoPlanoDeSaúdeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttobEditarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JButton buttonNovoPlanoDeSaúde;
    private javax.swing.JScrollPane scroolEspecialidades;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables
    
    private void preencherTabelaPlanosDeSaude() {
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getPlanosModel());
        ajustarTabelaPlanosDeSaude();
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    private void ajustarTabelaPlanosDeSaude() {
        //Impedir que o úsuario ajuste as colunas
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        //Bloquear as ediçoes de coluna na tabela
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);

        //Defenir a Largura das colunas
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(60);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(230);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(386);
    }
}
