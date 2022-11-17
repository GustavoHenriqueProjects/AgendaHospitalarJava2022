package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

    //atributos
    private static int contador = 0;
    private Integer codigo;
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private static int quantidade; //1 porque cada objeto tem sua própria quantidade
//	private int quantidade; //3 

    //construtores
    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        this.quantidade++;
        gerarCodigo(); //Porque esse codigo é unico, um para cada operadora
    }

    public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) { //modificado
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.numero = numero;
        this.quantidade++;//Para ir somando mais 1 toda vez que for utilizado
        gerarCodigo();
        
    }
    
     public PlanoDeSaude(Integer codigo, String operadora, String categoria, String numero, LocalDate validade) { //metodo Integer criado para validade
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.numero = numero;
        this.codigo = codigo;
        
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
        this.validade = validade;
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

    public LocalDate getValidade() {
        return validade;
    }
    
     public String getPlanoDeSaudeSeparadaPorPontoEVirgula(){
        return this.codigo + ";"+ this.operadora+";"+this.getNumero()+";"+this.getCategoria()+";"+this.getValidade();
    }
     

}
