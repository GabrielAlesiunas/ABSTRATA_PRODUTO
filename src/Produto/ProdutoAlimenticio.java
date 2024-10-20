package Produto;

//Classe Produto Alimenticio com herança da classe Produto
public class ProdutoAlimenticio extends Produto {
	//Atributos da classe ProdutoAlimenticio
    private String dataValidade;
    private String informacoesNutricionais;

    //Construtor da classe ProdutoAlimenticio
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    // Métodos para salvar o produto alimenticio
    @Override
    public void salvar() {
        System.out.println("Produto alimentício salvo: " + getNome());
    }

 // Métodos para deletar o produto alimenticio
    @Override
    public void deletar() {
        System.out.println("Produto alimentício deletado: " + getNome());
    }

 // Métodos para atualizar o produto alimenticio
    @Override
    public void atualizar() {
        System.out.println("Produto alimentício atualizado: " + getNome());
    }

    // Getters e Setters
    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getInformacoesNutricionais() {
        return informacoesNutricionais;
    }

    public void setInformacoesNutricionais(String informacoesNutricionais) {
        this.informacoesNutricionais = informacoesNutricionais;
    }
}
