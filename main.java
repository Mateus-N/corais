import menus.Cadastro;
import menus.Login;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Fazer login\n2 - Criar conta");
            int opcao = Integer.parseInt(input.nextLine());

            if (opcao == 1) {
                Login.showMenu();
            } else if (opcao == 2) {
                Cadastro.showMenu();
            }
        }
    }
}
