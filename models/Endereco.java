package models;

public class Endereco {
    private String logradouro = "";
    private String numeroOuLote = "";
    private String bairro = "";
    private String cidade = "";
    private String uf = "";

    public Endereco () {}
    
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

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumeroOuLote(String numeroOuLote) {
        this.numeroOuLote = numeroOuLote;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
