package com.algaworks.jsfspring;

public class Cliente implements Cloneable {

    private Integer id;

    private String nome;

    private String email;

    private String telefone;

    public Cliente() {
    }

    private Cliente(Integer id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public static Cliente copiar(Cliente cliente) {
        return new Cliente(cliente.getId(),
                cliente.getNome(), cliente.getEmail(), cliente.getTelefone());
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
