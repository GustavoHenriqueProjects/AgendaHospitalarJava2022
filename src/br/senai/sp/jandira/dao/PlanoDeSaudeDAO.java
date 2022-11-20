package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
    
    private final static String URL_TEMP = 
            "C:\\Users\\22282186\\JavaBanco\\PlanoDeSaude-temp.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

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
        atualizarArquivo();
    }
    
    public static void atualizarArquivo(){
        // Passo 1 - Criar uma representação dos arquivos que serão manipulados
        //referencia para o objeto que está no local(caminho)
        File arquivoAtual = new File(URL);

        //representação do arquivo temporario
        File arquivoTemp = new File(URL_TEMP);

        try {
            //criar o arquivo temporario
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporario para a escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar(fazer ou dizer novamente; repetir) na lista para 
            //adicionar as especialidades no arquivo temporario, exceto o 
            //registro que não queremos mais
            for (PlanoDeSaude p : planos) {
                bwTemp.write(p.getPlanoDeSaudeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            
            //Excluir o arquivo atual
            arquivoAtual.delete();
            
            //Renomear o arquivo
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
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
        
        atualizarArquivo();
    }

    //Criar a lista de planos
    public static void criarListaDePlano() {
        try {
            //Tranformando linha em objeto
            
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            //While enquanto essa linha não for nula crio uma especialidade
            while(linha != null){
                
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";"); //split me devolve um vetor posição 0 1 2
                String[] data = vetor[4].split("-");
                 PlanoDeSaude p = new PlanoDeSaude(
                        Integer.valueOf(vetor[0]), 
                        vetor[1], 
                        vetor[3], 
                        vetor[2], 
                        LocalDate.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])));
                         // A cada volta eu crio uma especialidade
                
                //Guardar a especialidade na lista
                planos.add(p);
                
                //Ler a proxima linha
                linha = leitor.readLine();
                
            }
            
            //fechar o arquivo depois que sair do while
            leitor.close();
            
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ão ler o arquivo ");
        }

//        PlanoDeSaude p1 = new PlanoDeSaude("Amil", "Diamante", "200", LocalDate.of(2023, Month.MARCH, 12));
//        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco Saúde", "Ouro", "201", LocalDate.of(2023, Month.MARCH, 12));
//        PlanoDeSaude p3 = new PlanoDeSaude("Notredame", "Prata", "202", LocalDate.of(2023, Month.MARCH, 12));
//        PlanoDeSaude p4 = new PlanoDeSaude("SulAmérica", "Bronze", "203", LocalDate.of(2023, Month.MARCH, 12));
//
//        planos.add(p1);
//        planos.add(p2);
//        planos.add(p3);
//        planos.add(p4);

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
