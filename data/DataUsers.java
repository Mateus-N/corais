package data;

import models.Hobbie;
import models.Usuario;
import models.Grupo;
import java.util.ArrayList;

public class DataUsers {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Hobbie> hobbies = new ArrayList<>();
    private static ArrayList<Grupo> grupos = new ArrayList<>();

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

    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static Usuario buscaUsuario(String email) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getEmail().equals(email)) {
                return usuarios.get(i);
            }
        }

        return null;
    }

    public static void addHobby(Hobbie hobbie) {
        hobbies.add(hobbie);
    }

    public static int addGrupo(Grupo grupo) {
        grupos.add(grupo);
        return grupo.getId();
    }

    public static void userHobbies(Usuario user) {
        if (user.getHobbies().size() == 0) {
            System.out.println("Nenhum hobby foi adicionado.");
        }
        for (int i = 0; i < user.getHobbies().size(); i++) {
            System.out.println(user.getHobbies().get(i).getNome());
        }
    }

    public static void listarHobbies() {
        for (int i = 0; i < hobbies.size(); i++) {
            System.out.println(hobbies.get(i).getNome());
        }
    }

    public static ArrayList<Hobbie> getHobbies() {
        return hobbies;
    }

    public static boolean escolherHobbie(String hobbieEscolhido, Usuario user) {
        for (Hobbie hobbie : DataUsers.getHobbies()) {
            if (hobbieEscolhido.equals(hobbie.getNome())) {
                user.adicionaHobbie(hobbie);
                return true;
            }
        }
        return false;
    }

    public static Hobbie buscarHobbie(String nome) {
        for (Hobbie hobbie : DataUsers.getHobbies()) {
            if (nome.equals(hobbie.getNome())) {
                return hobbie;
            }
        }

        return null;
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