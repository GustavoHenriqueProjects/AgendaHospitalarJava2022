/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import br.senai.sp.jandira.model.OperacaoEnum;

/**
 *
 * @author 22282176
 */
public class EspecialidadesPanel extends javax.swing.JPanel {

    private int linha;
    
    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidade();
        preencherTabela();
        
    }

    //metodos
    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }
    
    private Integer getCodigo(){
    String codigoStr = tableEspecialidades.getValueAt( getLinha(), 0).toString();
    Integer codigo = Integer.valueOf(codigoStr);
    return codigo;
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        buttonExcluirEspecialidades = new javax.swing.JButton();
        scroolEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttobEditarEspecialidade = new javax.swing.JButton();
        buttonNovaEspecialidade = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 300));
        setLayout(null);
        add(filler1);
        filler1.setBounds(600, 80, 0, 0);

        buttonExcluirEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirEspecialidades.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidades);
        buttonExcluirEspecialidades.setBounds(600, 260, 40, 30);

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
        scroolEspecialidades.setViewportView(tableEspecialidades);

        add(scroolEspecialidades);
        scroolEspecialidades.setBounds(30, 40, 680, 210);

        buttobEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttobEditarEspecialidade.setToolTipText("Editar  especialidade selecionada");
        buttobEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttobEditarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttobEditarEspecialidade);
        buttobEditarEspecialidade.setBounds(650, 260, 40, 30);

        buttonNovaEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        buttonNovaEspecialidade.setToolTipText("Editar nova Especialidade");
        buttonNovaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonNovaEspecialidade);
        buttonNovaEspecialidade.setBounds(700, 260, 40, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed
     
        System.out.println(linha);
        if (getLinha() != -1){
                excluirEspecialidade();
        }else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a especialidade que deseja excluir",
                    "ATENÇÃO!", 
                    JOptionPane.WARNING_MESSAGE);
        }
            
    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed
    private void excluirEspecialidade(){
         
        int resposta =   JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                 "Muita atenção!" , 
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.YES_NO_OPTION);
        
        if (resposta ==0){
            String codigoString = tableEspecialidades.getValueAt(linha,0).toString();
            Integer codigo = Integer.valueOf(codigoString);
            EspecialidadeDAO.excluir(getCodigo());
            preencherTabela();
        }  
}
    
    
    private void buttobEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttobEditarEspecialidadeActionPerformed
       
        if(getLinha() != -1){
            editarEspecialidade();
        }else{
            JOptionPane.showConfirmDialog(
                    this, 
                    "Por favor, selecione a especialidade que você deseja editar",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_buttobEditarEspecialidadeActionPerformed

    private void editarEspecialidade(){
    
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadeDialog especialidadeDialog = 
        new EspecialidadeDialog(
                null,
                true, 
                especialidade, OperacaoEnum.EDITAR);
        
        especialidadeDialog.setVisible(true);
        preencherTabela();
    
}
            
    private void buttonNovaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaEspecialidadeActionPerformed
        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog (null,
                true,
        OperacaoEnum.ADICIONAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();
    
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNovaEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttobEditarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JButton buttonNovaEspecialidade;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane scroolEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables
   
    private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadesModel());
        ajustarTabela();
               
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);}
        
      
          private void ajustarTabela(){
           // Impedir que o usuário ajuste as colunas
           tableEspecialidades.getTableHeader().setReorderingAllowed(false);
                      // Bloquear a edição das celulas da tabela

           tableEspecialidades.setDefaultEditor(Object.class, null);
           // Definir largura coluna
           tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(50);
           tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(230);
           tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(397);
           
           
            }
 
    

}
