package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    //Seleciona o local do arquivo txt onde as informações do médico serão salvas
    private final static String URL
            = "C:\\Users\\22282186\\JavaBanco\\medico.txt";

    //Arquivo temporario que sera criado pelo netbeans
    private final static String URL_TEMP
            = "C:\\Users\\22282186\\JavaBanco\\Medico-TEMP.txt";

    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    LocalDate localDate = LocalDate.now();

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

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }

    //Nesse for se o codigo seledionado for iqual ao do codigo do medico é para me retorna o valor
    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medicoAtualizado) { //UPDATE
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(m), medicoAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }

    //Criando instancia excluir
    public static void excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {
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
            for (Medico m : medicos) {
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

    public static void criarListaDeMedico() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Tranformando as informaçoes da linha em especialidade]
                String[] vetor = linha.split(";");
                String[] data = vetor[5].split("-"); //data
                
                Medico m = new Medico(
                        Integer.valueOf(vetor[0]), 
                        vetor[4], // CRM
                        vetor[1], //Nome do medico 1 , 2 telefone, 3 e-mail, 4 crm,  5 data de nascimento.
                        vetor[2], //Telefone
                        vetor[3],//email;
                        LocalDate.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])));

                //Guardando as especialidades na lista
                medicos.add(m);

                //Lendo a proxoma linha
                linha = leitor.readLine();

            }
            
            //Fechando leitor
            leitor.close();

        } catch (IOException erro) {
            
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorre um erro com o seu arquivo ");
        }

//        Medico m1 = new Medico("1012112/BR", "Gustavo", "(11) 98608-6714");
//        Medico m2 = new Medico("2112221/BR", "Fernanda", "(11) 9601-6321");
//        Medico m3 = new Medico("3155442/BR", "Paulo", "(11) 9631-2112");
//        Medico m4 = new Medico("1235423/BR", "Marilda", "(11)9645-6312");
//
//        medicos.add(m1);
//        medicos.add(m2);
//        medicos.add(m3);
//        medicos.add(m4);
//        
//        System.out.println(medicos.size());
    }

    public static DefaultTableModel getMedicoPanel() {
        String[] titulo = {
            "Código",
            "Nome do médico",
            "Crm",
            "Telefone"};
        String[][] dados = new String[medicos.size()][4];

        for (Medico m : medicos) {

            int i = medicos.indexOf(m);

            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getCrm();
            dados[i][3] = m.getTelefone();
           
            
//            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            dados[i][4] = m.getDataDeNascimento().format(formato);

        }
        return new DefaultTableModel(dados, titulo);
    }
}
