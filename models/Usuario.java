package models;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Hobbies> hobbies;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public ArrayList<Hobbies> getHobbies() {
        return hobbies;
    }

    public void adicionaHobbie(Hobbies hobbie) {
        hobbies.add(hobbie);
    }
}
