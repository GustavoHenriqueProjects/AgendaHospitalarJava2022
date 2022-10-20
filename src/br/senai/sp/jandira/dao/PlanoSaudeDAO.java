
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;

public class PlanoSaudeDAO {
    
    private static ArrayList<PlanoDeSaude> planoSaude = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude e){
        planoSaude.add(e);
    }
    
    public static ArrayList<PlanoDeSaude> getplanoSaude() { //READ
        return planoSaude;
    }
    
}
