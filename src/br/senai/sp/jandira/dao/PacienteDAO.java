package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Paciente;
import java.util.ArrayList;


public class PacienteDAO {
    
     private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void gravar(Paciente p) {
        pacientes.add(p);
    }
    public static ArrayList<Paciente> getPacientes() { //READ
        return pacientes;
    }

   
}
