package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.DataUsers;
import models.Usuario;

public class UtilitariosHobbies {
    private static Scanner in = new Scanner(System.in);
    
    // metodo que exibe a lista de hobbies para escolha do usuario
    public static void escolherHobbies(Usuario user) {
        DataUsers.listarHobbies(); // Listar hobbies para escolha do usuário
        System.out.println("Escolha seus interesses iniciais ou digite Avancar para prosseguir.");
        try { 
            while (true) {
                String hobbieEscolhido = in.nextLine();
                if (hobbieEscolhido.equals("Avancar")) {
                    break;
                } else {
                    if (DataUsers.escolherHobbie(hobbieEscolhido, user)) {
                        System.out.println("Hobbie adicionado.");
                    } else {
                        System.out.println("Ops! Esse hobbie não existe. Tente novamente.");
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Isso não é um hobbie. Tente novamente.");
        }
    }
}
