package model;

public class Cliente {
    
    private String nome;
    private String endereco;
    private String sidico;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSidico() {
        return sidico;
    }

    public void setSidico(String sidico) {
        this.sidico = sidico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
