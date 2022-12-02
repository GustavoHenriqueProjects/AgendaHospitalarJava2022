package br.senai.sp.jandira.dao;
import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    //Final uma variavel nunca pode ser alterada
    private final static String URL = 
            "C:\\Users\\sarna\\OneDrive\\Área de Trabalho\\Java\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);
    private final static String URL_TEMP = 
            "C:\\Users\\sarna\\OneDrive\\Área de Trabalho\\Java\\Especialidade-TEMP.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    DefaultTableModel listModel = new DefaultTableModel();

    public static void gravar(Especialidade e) { //CREATE
        especialidades.add(e);
        
        //Gravar em Arquivo ***
        //SERIALIZAÇÃO pegar algo e colocar decompor em outra coisa
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            //escritor.write(e.getCodigo()+";"+e.getNome()+";"+e.getDescricao()); 
            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }
    }
    public static ArrayList<Especialidade> getEspecialidades() { //READ
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { //READ
        for (Especialidade e : especialidades) {
            if (e.getCodigo()== codigo) {
                return e;
            }
        }

        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) { //UPDATE
        for (Especialidade e : especialidades) {
            if(e.getCodigo().equals(especialidadeAtualizada.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
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
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
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
        for (Especialidade e : especialidades) {
            if (e.getCodigo() .equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        
        atualizarArquivo();
    }

    //Criar uma lista de especialidades
    public static void criarListaDeEspecialidade() {
        
        try {
            //Tranformando linha em objeto
            
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            //While enquanto essa linha não for nula crio uma especialidade
            while(linha != null){
                
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";"); //split me devolve um vetor posição 0 1 2
                Especialidade e = new Especialidade(
                        vetor[1], 
                        vetor[2],
                        Integer.valueOf(vetor[0]) ); // A cada volta eu crio uma especialidade
                
                //Guardar a especialidade na lista
                especialidades.add(e);
                
                //Ler a proxima linha
                linha = leitor.readLine();
                
            }
            
            //fechar o arquivo depois que sair do while
            leitor.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ão ler o arquivo");
        }
//        Especialidade e1 = new Especialidade("Cardiologia", "Parte da medicina que cuida do coração");
//        Especialidade e2 = new Especialidade("Nefrologia", "Cuida das doençãs relacionadas ao Rins");
//        Especialidade e3 = new Especialidade("Otorringolaringologia", "Estuda as doenças do ouvido");
//        Especialidade e4 = new Especialidade("Pediatria", "Parte da medicina que cuida das crianças");
//
//        especialidades.add(e1);
//        especialidades.add(e2);
//        especialidades.add(e3);
//        especialidades.add(e4);

    }

    public static DefaultTableModel getEspecialidadesModel() {
        String[] titulos = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][2] = e.getDescricao();
            dados[i][1] = e.getNome();

            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }
    
    //Criando o contrutor da jlist
    public static DefaultListModel<Especialidade> preencherEspecialidade(){
        //Criando objeto lista de especialidedes que sera exibida no médico
        DefaultListModel<Especialidade> listaDeEspecialidade = new DefaultListModel<>();
        for(Especialidade listas : getEspecialidades()){
            
            //O metodo addElement é usado para adicionar elemento especifico ao vetor
            listaDeEspecialidade.addElement(listas);
            listaDeEspecialidade.toString();
           
        }
        return listaDeEspecialidade;
    }

}
