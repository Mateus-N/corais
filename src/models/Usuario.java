package models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Endereco endereco;
    private Contato contato;
    private ArrayList<Hobbie> hobbies;
    private List<Integer> gruposId = new ArrayList<Integer>();

    public Usuario(String nome, String email, String senha, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.contato = contato;
        this.hobbies = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Integer> getGrupos() {
        return gruposId;
    }

    public void adicionaHobbie(Hobbie hobbie) {
        hobbies.add(hobbie);
    }

    public void adicionarGrupo(int grupoId) {
        gruposId.add(grupoId);
    }
}
