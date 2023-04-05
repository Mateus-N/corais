package data;

import models.Hobbie;
import models.Usuario;
import models.Grupo;
import java.util.ArrayList;

// simulacao de banco de dados
public class DataUsers {
    // tabelas base do banco
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Hobbie> hobbies = new ArrayList<>();
    private static ArrayList<Grupo> grupos = new ArrayList<>();

    // listar hobbies iniciais
    static {
        String[] defaultNomes = {
            "Esportes",
            "Música",
            "Arte",
            "Viagens",
            "Leitura",
            "Tecnologia",
            "Cinema",
            "Fotografia",
            "Culinária",
            "História",
            "Ciência",
            "Política",
            "Natureza",
            "Jogos",
            "Moda"
        };

        for (String nome : defaultNomes) {
            addHobby(new Hobbie(nome));
        }
    }

    // Adicionar dados as listas
    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void addHobby(Hobbie hobbie) {
        hobbies.add(hobbie);
    }

    public static int addGrupo(Grupo grupo) {
        grupos.add(grupo);
        return grupo.getId();
    }

    // Operacoes com hobbies
    public static void userHobbies(Usuario user) {
        if (user.getHobbies().size() == 0) {
            System.out.println("Nenhum hobby foi adicionado.");
        }
        for (int i = 0; i < user.getHobbies().size(); i++) {
            System.out.println(user.getHobbies().get(i).getNome());
        }
    }

    public static boolean escolherHobbie(String hobbieEscolhido, Usuario user) {
        for (Hobbie hobbie : hobbies) {
            if (hobbieEscolhido.equals(hobbie.getNome())) {
                user.adicionaHobbie(hobbie);
                return true;
            }
        }
        return false;
    }

    // Buscas
    public static Hobbie buscarHobbie(String nome) {
        for (Hobbie hobbie : hobbies) {
            if (nome.equals(hobbie.getNome())) {
                return hobbie;
            }
        }
        return null;
    }

    public static Usuario buscaUsuario(String email) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getEmail().equals(email)) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    // Listar informacoes
    public static void listarHobbies() {
        for (int i = 0; i < hobbies.size(); i++) {
            System.out.println(hobbies.get(i).getNome());
        }
    }

    public static void listarTodosOsGrupos() {
        for (int i = 0; i < grupos.size(); i++) {
            System.out.println(grupos.get(i).getNome());
        }
    }

    public static void listarGruposPorHobbie(Hobbie hobbie) {
        for (Grupo grupo : grupos) {
            if (grupo.getHobbieDoGrupo().equals(hobbie)) {
                System.out.println(grupo.getNome());
            }
        }
    }

    public static void listarGrupoPorUsuario(Usuario user) {
        for (Grupo grupo : grupos) {
            for (int grupoId : user.getGrupos()) {
                if (grupo.getId() == grupoId) {
                    System.out.println(grupo.getNome());
                }
            }
        }
    }
}