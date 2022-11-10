package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    //Final uma variavel nunca pode ser alterada
    private final static String URL = "C:\\Users\\22282186\\JavaBanco\\PlanoDeSaude.txt";
    private final static Path PATH = Paths.get(URL);

    LocalDate localDate = LocalDate.now();

    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) {
        planos.add(p);

        //Gravar em Arquivo ***
        //SERIALIZAÇÃO pegar algo e colocar decompor em outra coisa
        try {
            BufferedWriter escritorSaude = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //escritor.write(e.getCodigo()+";"+e.getNome()+";"+e.getDescricao()); 
            escritorSaude.write(p.getPlanoDeSaudeSeparadaPorPontoEVirgula());
            escritorSaude.newLine();
            escritorSaude.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }
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
    public static void criarListaDePlano() {
        
        
        PlanoDeSaude p1 = new PlanoDeSaude("Amil", "Diamante", "200", LocalDate.of(2023, Month.MARCH, 12));
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco Saúde", "Ouro", "201", LocalDate.of(2023, Month.MARCH, 12));
        PlanoDeSaude p3 = new PlanoDeSaude("Notredame", "Prata", "202", LocalDate.of(2023, Month.MARCH, 12));
        PlanoDeSaude p4 = new PlanoDeSaude("SulAmérica", "Bronze", "203", LocalDate.of(2023, Month.MARCH, 12));

        planos.add(p1);
        planos.add(p2);
        planos.add(p3);
        planos.add(p4);

    }

    public static DefaultTableModel getPlanosModel() {
        String[] titulos = {"CÓDIGO", "OPERADORA", "NUMERO DO CARTÃO", "CATEGORIA", "VALIDADE"};
        String[][] dados = new String[planos.size()][5];

        int i = 0;

        for (PlanoDeSaude p : planos) {

            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getNumero().toString();
            dados[i][3] = p.getCategoria();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = p.getValidade().format(formato);

            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }

}
