package menus;

import data.DataUsers;
import models.Contato;
import models.Endereco;
import models.Usuario;
import utils.UtilitariosHobbies;
import java.util.Scanner;

// Classe para efetuar cadastro do usuário
public class Cadastro {
    private static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        // Receber dados obrigatorios
        System.out.print("Nome: ");
        String nome = input.nextLine();

        String email = recebeEmailUnico();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        // Instancia usuario vazio
        Usuario user;
        // Verifica se quer cadastrar dados opcionais
        boolean querCadastroCompleto = MenuDuasOpcoes.pergunta("Deseja efetuar o cadastro completo?");
        if (querCadastroCompleto) {
            // Caso queira chama os metodos para preencher endereco e contato
            Endereco endereco = cadastroEndereco();
            Contato contato = cadastroContato();
            // o usuario e criado com todos os dados preenchidos
            user = new Usuario(nome, email, senha, endereco, contato);
        } else {
            // O usuario e criado com dados obrigatorios e restante vazio
            user = new Usuario(nome, email, senha, new Endereco(), new Contato());
        }

        // usuario e adicionado ao banco
        DataUsers.addUsuario(user);
        // escolha de hobbies iniciais
        UtilitariosHobbies.escolherHobbies(user);
    }

    private static String recebeEmailUnico() {
        System.out.print("Email: ");
        String email = input.nextLine();
        boolean emailJaExiste = DataUsers.verificaEmailUnico(email);
        if (!emailJaExiste) {
            return email;
        }
        System.out.println("Já existe um usuário cadastrado com esse email! escolha outro por favor");
        return recebeEmailUnico();
    }

    // Receber dados de contato
    private static Contato cadastroContato() {
        System.out.print("Telefone: ");
        String telefone = input.nextLine();

        Contato contato = new Contato(telefone);
        return contato;
    }

    // Receber dados de endereco
    private static Endereco cadastroEndereco() {
        System.out.print("Cidade: ");
        String cidade = input.nextLine();

        System.out.print("UF: ");
        String uf = input.nextLine();

        Endereco endereco = new Endereco(cidade, uf);
        return endereco;
    }
}