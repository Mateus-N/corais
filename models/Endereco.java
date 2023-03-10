package models;

public class Endereco {
    private String logradouro;
    private String numeroOuLote;
    private String bairro;
    private String cidade;
    private String uf;
    
    public Endereco(String logradouro, String numeroOuLote, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numeroOuLote = numeroOuLote;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumeroOuLote() {
        return numeroOuLote;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
}
