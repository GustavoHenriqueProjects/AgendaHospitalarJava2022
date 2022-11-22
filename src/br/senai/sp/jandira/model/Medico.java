package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    //atributos
    private String nome;
    private Especialidade[] especialidade;
    private String telefone;
    private String email;
    private String crm;
    private Integer codigo;
    private LocalDate dataDeNascimento;
    private static int contador = 0;
    private static int quantidade;
    
    //Construtor
    public Medico(String nome, String telefone, String crm){
        this.nome = nome;
        this.telefone = telefone;
        this.crm = crm;
        gerarCodigo();
    }
    
     public Medico(String nome, String telefone, String crm,String email, LocalDate dataDeNascimento){
        this.nome = nome;
        this.telefone = telefone;
        this.crm = crm;
        this.email = email;
        this.codigo = codigo;
    }
     
      public Medico() {
        this.quantidade++;
        gerarCodigo();
    }

    //metodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecialidade(Especialidade[] especialidade) {
        this.especialidade = especialidade;
    }

    public Especialidade[] getEspecialidade() {
        return especialidade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }
    
    public LocalDate setDataDeNascimento(){
        return dataDeNascimento;
    }
    
     public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getMedicoSeparadorPorPontoEVirgula() {
        return this.codigo + ";"
                + this.nome + ";"
                + this.telefone + ";"
                + this.email + ";"
                + this.crm + ";"
                + this.dataDeNascimento+";"
                +this.especialidade;
    }

}
