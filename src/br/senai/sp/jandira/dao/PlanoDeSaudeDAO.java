package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
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
    PlanoDeSaude p1 = new PlanoDeSaude("Amil", "Diamante","200",LocalDate.of(2002, Month.MARCH, 12));
    PlanoDeSaude p2 = new PlanoDeSaude("Bradesco Saúde", "Ouro","201",LocalDate.of(2002, Month.MARCH, 12) );
    PlanoDeSaude p3 = new PlanoDeSaude("Notredame", "Prata","202",LocalDate.of(2002, Month.MARCH, 12) );
    PlanoDeSaude p4 = new PlanoDeSaude("SulAmérica", "Bronze","203",LocalDate.of(2002, Month.MARCH, 12) );
    
    planos.add(p1);
    planos.add(p2);
    planos.add(p3);
    planos.add(p4);

    }
    
    public static DefaultTableModel getPlanosModel(){
        String[] titulos = {"CÓDIGO","OPERADORA","NUMERO DO CARTÃO","CATEGORIA","VALIDADE"};
        String[][] dados = new String[planos.size()][5];
        
        int i = 0;
        
        for(PlanoDeSaude p : planos){
           
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getNumero().toString();
            dados[i][3] = p.getCategoria();
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd//MM/yy");
            dados[i][4] = p.getValidade().toString();
            
           i++; 
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    
    }

}
