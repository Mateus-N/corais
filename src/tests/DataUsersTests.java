package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import data.DataUsers;
import models.Hobbie;
import models.Usuario;

public class DataUsersTests {
  @Test
  public void testaEncontrarUsuarioPorEmail(){
    DataUsers.addUsuario(
      new Usuario("teste", "teste@teste.com", "123", null, null)
    );

    Usuario user = DataUsers.buscaUsuario("teste@teste.com");

    assertNotNull(user);
  }

  @Test
  public void testeNaoEncontrarUsuarioPorEmail(){
    Usuario user = DataUsers.buscaUsuario("email@");
    
    assertNull(user);
  }

  @Test
  public void testeEncontrarBuscarHobbies(){
    Hobbie hobbie = DataUsers.buscarHobbie("Leitura");
    assertNotNull(hobbie);
  }

  @Test
  public void testeNaoEncontrarBuscarHobbies(){
    Hobbie hobbie = DataUsers.buscarHobbie("luta");
    assertNull(hobbie);
  }

  @Test
  public void testeEhEmailUnico(){
    DataUsers.addUsuario(
      new Usuario("teste", "teste@teste.com", "123", null, null)
    );

    boolean resultado = DataUsers.verificaEmailUnico("email@qualquer");
    assertFalse(resultado);
  }

  @Test
  public void testeNaoEhEmailUnico(){
    DataUsers.addUsuario(
      new Usuario("teste", "teste@teste.com", "123", null, null)
    );

    boolean resultado = DataUsers.verificaEmailUnico("teste@teste.com");
    assertTrue(resultado);
  }

}
