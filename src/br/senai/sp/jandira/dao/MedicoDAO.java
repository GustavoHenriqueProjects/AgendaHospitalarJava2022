package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    //Seleciona o local do arquivo txt onde as informações do médico serão salvas
    private final static String URL
            = "D:\\Eclipse.java\\Project-Java\\Medico.txt";

    //Arquivo temporario que sera criado pelo netbeans
    private final static String URL_TEMP
            = "D:\\Eclipse.java\\Project-Java\\Medico-temp.txt";

    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    //Arraylist Elementos podem ser adicionados ou removidos, e manupulo o vetor
    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static void gravar(Medico m) {
        medicos.add(m);

        //Gravar em arquivo 
        //APPEND Se o arquivo for aberto os bytes são gravados no arquivo
        //WRITE arquivo aberto para escreve no arquivo
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(m.getMedicoSeparadorPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro");
        }
    }
    
    public static ArrayList <Medico> getMedicos(){
        return medicos;
    }
    
    //Nesse for se o codigo seledionado for iqual ao do codigo do medico é para me retorna o valor
    public static Medico getMedico(Integer codigo){
        for( Medico m: medicos){
            if(m.getCodigo().equals(codigo)){
                return m;
            }
        }
        return null;
    }
    
     public static void atualizar(Medico medicoAtualizado) { //UPDATE
        for (Medico m: medicos) {
            if(m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(m), medicoAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }
    
    //Criando instancia excluir
    public static void excluir(Integer codigo){
        for(Medico m : medicos){
            if(m.getCodigo().equals(codigo)){
                medicos.remove(m);
                break;
            }
        }
        atualizarArquivo();
    }
    
    private static void atualizarArquivo(){
        //Passo 1 - Criar uma representação dos arquivos que vâo ser manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        
        try {
            //Arquivo temporario para atualição
            arquivoTemp.createNewFile();
            
            //Abri arquivo temporario para realizar a escrita
            BufferedWriter bwTemp = Files.newBufferedWriter( 
                    PATH_TEMP, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            //Colocar na lista a especialidades medicas, exeto a que não queremos mais
            for(Medico m : medicos){
                bwTemp.write(m.getMedicoSeparadorPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            
            //Excluir arquivo atual para poder colocar atualizacao nova 
            arquivoAtual.delete();
            
            //Renomear o arquivo temporario com as nova informaçoes para o arquivo atual
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (Exception error) {
            //A exeção erro vai se imprimir aqui
            error.printStackTrace();
        }
    }
    
    public static DefaultTableModel getTabelaMedico(){
        String[] titulo = {"Código","CRM","Nome dos médicos", "Telefone"};
        String[][] dados = new String[medicos.size()][4];
        
        int i = 0;
        
        for(Medico m : medicos){
 
            //int i = medicos.indexOf(m);
            
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
           
        }
        return new DefaultTableModel(dados,titulo);
    }
}
