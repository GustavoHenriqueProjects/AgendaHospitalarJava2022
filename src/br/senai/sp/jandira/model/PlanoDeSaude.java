package br.senai.sp.jandira.model;

import java.io.Closeable;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class PlanoDeSaude {

    //atributos
    private static int contador = 0;
    private Integer codigo;
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate Validade;
    private static int quantidade; //1 porque cada objeto tem sua própria quantidade
//	private int quantidade; //3 

    //construtores
    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        this.quantidade++;
        gerarCodigo(); //Porque esse codigo é unico, um para cada operadora
    }

    public PlanoDeSaude(String operadora, String categoria) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.quantidade++;//Para ir somando mais 1 toda vez que for utilizado
        gerarCodigo();
    }

    public PlanoDeSaude() {
        this.quantidade++;
        gerarCodigo();
    }

    //metodos
    public void setOperadora(String operadora) {
            this.operadora = operadora;
        
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setValidade(LocalDate validade) {
        this.Validade = validade;
    }

    public LocalDate getValidade() {
        return Validade;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer setCodigo(Integer codigo) {
        return codigo;
    }

    //não é necessario o set porque ele vai usar o Plano de saude
    //public int getQuantidade()
    public static int getQuantidade() {
        return quantidade;
    }

    public int getContador() {
        return contador;
    }

}
