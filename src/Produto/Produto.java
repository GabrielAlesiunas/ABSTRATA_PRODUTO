package Produto;

// Classe Produto
public class Produto {
	//Atributos da classe Produto
    private String nome;
    private double precoCusto;
    private double precoVenda;

    //Construtor da classe Produto
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    //Funcao para calcular o Lucro do Produto
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // Método para salvar o Produto
    public void salvar() {
        System.out.println("Produto salvo: " + nome);
    }

    //Método para deletar o Produto
    public void deletar() {
        System.out.println("Produto deletado: " + nome);
    }
    
    //Método para atualizar o Produto
    public void atualizar() {
        System.out.println("Produto atualizado: " + nome);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
