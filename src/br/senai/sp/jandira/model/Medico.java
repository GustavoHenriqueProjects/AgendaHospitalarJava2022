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


    //Construtor
//    public Medico(Integer codigo, String crm, String nome, String telefone){
//     
//        this.codigo = codigo;
//        this.nome = nome;
//        this.telefone = telefone;
//        this.crm = crm;
//        gerarCodigo();
//    }
//    public Medico(Integer codigo, String nome, String telefone, String crm) {
//        this.codigo = codigo;
//        this.nome = nome;
//        this.telefone = telefone;
//        this.crm = crm;
//        gerarCodigo();
//    }
    
    public Medico(Integer codigo,String crm, String nome, String telefone, String email,LocalDate dataDeNascimento){
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        gerarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome, String telefone, String email, LocalDate dataDeNascimento, Especialidade[] especialidades) {
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.especialidade = especialidades;
        
    }

    public Medico() {
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

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
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
                + this.dataDeNascimento;
    }

}
