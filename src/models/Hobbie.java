package models;

import java.util.Random;

public class Hobbie {
    // Atributos de "Hobbie"
    private String nome;
    private int id;

    // Construtor de hobbies, com nome dado pelo
    // usuário e id do hobby gerado automaticamente.
    public Hobbie(String nome) {
        this.nome = nome;

        Random rand = new Random();
        this.id = rand.nextInt(1000, 9999);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}
