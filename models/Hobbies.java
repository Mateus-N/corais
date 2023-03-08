package models;

import java.util.Random;

public class Hobbies {
    // Criação de atributos
    private String nome;
    private int idHobby;

    // Construtor de grupos de hobbies, com nome dado pelo
    // usuário e id do hobby gerado automaticamente.
    public Hobbies(String nome) {
        this.nome = nome;

        Random rand = new Random();
        int numero = rand.nextInt(1000, 9999);

        this.idHobby = numero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdHobby() {
        return idHobby;
    }
}
