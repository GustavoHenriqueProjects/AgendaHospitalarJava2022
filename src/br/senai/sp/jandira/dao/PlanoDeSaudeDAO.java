package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
        
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) {
        planos.add(p);
    }

    public static ArrayList<PlanoDeSaude> getPlanoDeSaudes() { //READ
        return planos;
    }

    public static PlanoDeSaude getPlanoDeSaudes(Integer codigo) { //READ
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoAtualizado) { //UPDATE
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo() == planoAtualizado.getCodigo()) {
                planos.set(planos.indexOf(p), planoAtualizado);
                break;
            }
        }

    }
    
    //instancia de um objeto
    public static void excluir(Integer codigo) { //DELETE
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo() == codigo) {
                planos.remove(p);
                break;
            }
        }
    }
    
    //Criar a lista de planos
    public static  void criarListaDePlano(){
    PlanoDeSaude p1 = new PlanoDeSaude("Amil", "Diamante" );
    PlanoDeSaude p2 = new PlanoDeSaude("Bradesco Saúde", "Ouro" );
    PlanoDeSaude p3 = new PlanoDeSaude("Notredame", "Prata" );
    PlanoDeSaude p4 = new PlanoDeSaude("SulAmérica", "Bronze" );
    
    planos.add(p1);
    planos.add(p2);
    planos.add(p3);
    planos.add(p4);

    }
    
    public static DefaultTableModel getPlanosModel(){
        String[] titulos = {"CÓDIGO","NOME DA OPERADORA","CATEGORIA"};
        String[][] dados = new String[planos.size()][3];
        
        int i = 0;
        
        for(PlanoDeSaude p : planos){
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
           i++; 
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    
    }

}
