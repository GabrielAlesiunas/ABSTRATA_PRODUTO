package Produto;

//Classe Produto Vestuario com heranca da classe Produto
public class ProdutoVestuario extends Produto {
	//Atributos da classe Produto Vestuario
    private String tamanho;
    private String cor;
    private String material;

    //Construtor da classe ProdutoVestuario
    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // Método para salvar o produto vestuario
    @Override
    public void salvar() {
        System.out.println("Produto de vestuário salvo: " + getNome());
    }
    
    // Método para deletar o produto vestuario
    @Override
    public void deletar() {
        System.out.println("Produto de vestuário deletado: " + getNome());
    }

    // Método para atualizar o produto vestuario
    @Override
    public void atualizar() {
        System.out.println("Produto de vestuário atualizado: " + getNome());
    }

    // Getters e Setters
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
