package models;

import java.util.ArrayList;
import java.util.Random;

public class Grupo {
    // Atributos de "Grupo"
    private String nome, descricao, cidade;
    private Usuario dono;
    private Hobbie hobbieDoGrupo;
    private int id;
    private ArrayList<Usuario> usuario;
    private ArrayList<String> participantes = new ArrayList<>();

    // Construtor de grupos, com alguns dos dados
    // sendo informados pelo usuário.
    public Grupo(String nome, String descricao, String cidade, Usuario user, Hobbie hobbie) {
        this.nome = nome;
        this.descricao = descricao;
        this.cidade = cidade;
        this.dono = user;
        this.hobbieDoGrupo = hobbie;

        Random rand = new Random();
        this.id = rand.nextInt(1000, 9999);
    }

    public void listarParticipantes() { // Método de listar os participantes de um grupo.
        System.out.println("O grupo possui " + participantes.size() + " participantes.\nParticipantes: ");

        for (String nome : participantes) {
            System.out.println(nome);
        }
    }
    public void adicionaParticipante(String p) { // Método de adicionar um participante a um grupo.
        if (participantes.size() <= 200) { // Tamanho de grupo definido inicialmente como 200 (pode ser mudado).
            participantes.add(p);
            System.out.println("Usuário adicionado!");
        } else {
            System.out.println("O grupo já está cheio. O usuário não foi adicionado.");
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public Usuario getDono() {
        return dono;
    }
    public String getCidade() {
        return cidade;
    }
    public int getId() {
        return id;
    }
}
