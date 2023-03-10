package models;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Endereco endereco;
    private Contato contato;
    private ArrayList<Hobbie> hobbies;

    public Usuario(String nome, String email, String senha, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.contato = contato;
        this.hobbies = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public ArrayList<Hobbie> getHobbies() {
        return hobbies;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void adicionaHobbie(Hobbie hobbie) {
        hobbies.add(hobbie);
    }
}
