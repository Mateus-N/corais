package data;

import models.Hobbie;
import models.Usuario;
import models.Grupo;
import java.util.ArrayList;
import java.util.List;

// simulacao de banco de dados
public class DataUsers {
    // tabelas base do banco
    private static List<Usuario> usuarios = new ArrayList<Usuario>();
    private static List<Hobbie> hobbies = new ArrayList<Hobbie>();
    private static List<Grupo> grupos = new ArrayList<Grupo>();

    // hobbies iniciais
    static {
        String[] defaultHobbies = {
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
        
        
    // Criar primeiros hobbies
        for (String nome : defaultHobbies) {
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

    // Realizar operacoes com hobbies
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

    // Operacoes com grupos
    public static boolean entrarEmGrupo(Grupo grupo, Usuario user) {
        // verifica se esse grupo já está na lista de grupos do usuário
        if (!user.getGrupos().contains(grupo.getId())) {
            grupo.adicionaParticipante(user);
            user.adicionarGrupo(grupo.getId());
            return true;
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

    public static List<Grupo> buscaGrupos(String pesquisa) {
        List<Grupo> gruposEncontrados = new ArrayList<Grupo>();
        for (Grupo grupo : grupos) {
            if (grupo.getNome().toLowerCase().contains(pesquisa.toLowerCase())) {
                gruposEncontrados.add(grupo);
            }
        }
        return gruposEncontrados;
    }

    public static boolean verificaEmailUnico(String email) {
        boolean emailJaExiste = false;
        for (Usuario user : usuarios) {
            if (user.getEmail().toLowerCase().equals(email.toLowerCase())) {
                emailJaExiste = true;
            }
        }
        return emailJaExiste;
    }

    public static boolean verificaNomeDeGrupoUnico(String nome) {
        boolean grupoJaExiste = false;
        for (Grupo user : grupos) {
            if (user.getNome().toLowerCase().equals(nome.toLowerCase())) {
                grupoJaExiste = true;
            }
        }
        return grupoJaExiste;
    }

    // Listar dados
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
