package models;

public class Contato {
    private String telefone = "";

    public Contato () {}

    public Contato(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
