import menus.Cadastro;
import menus.Login;
import java.util.Scanner;

class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1 - Fazer login\n2 - Criar conta\n3 - Encerrar sistema");
            try {
                int opcao = Integer.parseInt(in.nextLine());

                if (opcao == 1) {
                    Login.showMenu();
                } else if (opcao == 2) {
                    Cadastro.showMenu();
                } else if (opcao == 3) {
                    System.out.println("\nVolte sempre!");
                    continuar = false;
                } else {
                    System.out.println("\nEscolha uma opção válida");
                }
            } catch (Exception e) {
                System.out.println("\nEscolha uma opção válida");
            }
        }
    }
}
