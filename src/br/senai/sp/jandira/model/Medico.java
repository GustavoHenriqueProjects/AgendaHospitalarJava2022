package br.senai.sp.jandira.model;

public class Medico {

    //atributos
    private String nome;
    private Especialidade[] especialidade;
    private String telefone;
    private String email;
    private String crm;
    private Integer codigo;
    private static int contador = 0;
    
    //Construtor
    public Medico(String nome, String telefone, String crm){
        this.nome = nome;
        this.telefone = telefone;
        this.crm = crm;
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

    public String getMedicoSeparadorPorPontoEVirgula() {
        return this.codigo + ";"
                + this.crm + ";"
                + this.nome + ";"
                + this.telefone + ";"
                + this.email + ";"
                + this.especialidade;
    }

}
