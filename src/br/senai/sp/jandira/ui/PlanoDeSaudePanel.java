package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.JTable;

public class PlanoDeSaudePanel extends javax.swing.JPanel {

   
    public PlanoDeSaudePanel() {
        initComponents();
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroolPlanoDeSaude = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirPlano = new javax.swing.JButton();
        buttobEditarPlano = new javax.swing.JButton();
        buttonNovoPlano = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 300));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scroolPlanoDeSaude.setViewportView(tableEspecialidades);

        add(scroolPlanoDeSaude);
        scroolPlanoDeSaude.setBounds(30, 40, 680, 210);

        buttonExcluirPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirPlano.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoActionPerformed(evt);
            }
        });
        add(buttonExcluirPlano);
        buttonExcluirPlano.setBounds(600, 260, 40, 30);

        buttobEditarPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttobEditarPlano.setToolTipText("Editar  especialidade selecionada");
        buttobEditarPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttobEditarPlanoActionPerformed(evt);
            }
        });
        add(buttobEditarPlano);
        buttobEditarPlano.setBounds(650, 260, 40, 30);

        buttonNovoPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        buttonNovoPlano.setToolTipText("Editar nova Especialidade");
        buttonNovoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoPlanoActionPerformed(evt);
            }
        });
        add(buttonNovoPlano);
        buttonNovoPlano.setBounds(700, 260, 40, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoActionPerformed

        

    }//GEN-LAST:event_buttonExcluirPlanoActionPerformed

    private void buttobEditarPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttobEditarPlanoActionPerformed

        

    }//GEN-LAST:event_buttobEditarPlanoActionPerformed

    private void buttonNovoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoPlanoActionPerformed
        

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNovoPlanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttobEditarPlano;
    private javax.swing.JButton buttonExcluirPlano;
    private javax.swing.JButton buttonNovoPlano;
    private javax.swing.JScrollPane scroolPlanoDeSaude;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

}
