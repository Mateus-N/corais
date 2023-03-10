package data;

import models.Usuario;
import models.Hobbie;
import java.util.ArrayList;

public class DataUsers {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Hobbie> hobbies = new ArrayList<>();

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

    public static void listarHobbies() {
        for (int i = 0; i < hobbies.size(); i++) {
            System.out.println(hobbies.get(i).getNome());
        }
    }
}
