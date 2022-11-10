package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {
    // atributos

    private static int contador = 0;
    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private Endereco endereco;
    private String rg;
    private String cpf;
    private PlanoDeSaude planoDeSaude;
    private static int quantidade;// porque cada objeto tem sua identidade

    //Construtores
    public Paciente(String nome, String telefone, String rg, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        gerarCodigo();
    }

    // metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
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
