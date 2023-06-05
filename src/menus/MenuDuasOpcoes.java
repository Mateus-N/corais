package menus;

import java.util.Scanner;

// menu que sera chamado para escolhas entre duas opcoes com resposta numerica
public class MenuDuasOpcoes {
    private static Scanner in = new Scanner(System.in);
    
    // perguntas de sim ou nao, recebe o texto da pergunta
    public static boolean pergunta(String text) {
        System.out.println("\n" + text + "\n1 - Sim / 2 - Não");
        // valida se foi digitado um numero
        try {
            int opcao = Integer.parseInt(in.nextLine());

            // caso digite 1 encerra o metodo e retorna true
            if (opcao == 1) {
                return true;
            // caso digite 2 encerra o metodo e retorna false
            } else if (opcao == 2) {
                return false;
            // caso digite outro numero
            } else {
                System.out.println("Comando desconhecido.");
            }
        // caso digite algo que nao e numero
        } catch (Exception e) {
            System.out.println("Comando desconhecido.");
        }
        // recursividade para exibir esse menu novamente
        return pergunta(text);
    }

    // perguntas com opcoes complexas, recebe a pergunta e as opcoes
    public static String perguntaComOpcoes(String text, String op1, String op2) {
        System.out.println("\n" + text + "\n1 - " + op1 + " / 2 - " + op2);
        // valida se foi digitado um numero
        try {
            int opcao = Integer.parseInt(in.nextLine());

            // caso digite 1 encerra o metodo e retorna a opcao 1
            if (opcao == 1) {
                return op1;
            // caso digite 2 encerra o metodo e retorna a opcao 2
            } else if (opcao == 2) {
                return op2;
            // caso digite outro numero
            } else {
                System.out.println("Comando desconhecido.");
            }
        // caso digite algo que nao e numero
        } catch (Exception e) {
            System.out.println("Comando desconhecido.");
        }
        // recursividade para exibir esse menu novamente
        return perguntaComOpcoes(text, op1, op2);
    }
}
