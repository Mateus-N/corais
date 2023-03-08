package data;

import models.Usuario;
import models.Hobbies;
import java.util.ArrayList;

public class DataUsers {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Hobbies> hobbies = new ArrayList<>();

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

    public static void addHobby(Hobbies grupohobbies) {
        hobbies.add(grupohobbies);
    }
}
