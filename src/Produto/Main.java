package Produto;

public class Main {
    public static void main(String[] args) {
    	// Teste da classe Produto
    	Produto produto = new Produto("Caneta", 2.0, 5.0);
    	//Chamando o metodo salvar produto
    	produto.salvar();
        System.out.println("Lucro da caneta: " + produto.calcularLucro());
    	
        // Teste da classe ProdutoAlimenticio
        ProdutoAlimenticio produtoAlimento = new ProdutoAlimenticio("Arroz", 10.0, 15.0, "20/10/2024", "Rico em carboidratos");
        
        //Chamando o metodo salvar produto alimenticio
        produtoAlimento.salvar();
        System.out.println("Lucro do arroz: " + produtoAlimento.calcularLucro());

        // Teste da classe ProdutoVestuario
        ProdutoVestuario produtoVestuario = new ProdutoVestuario("Camiseta", 20.0, 50.0, "M", "Preto", "Algodão");
        
        //Chamando o metodo salvar produto alimenticio
        produtoVestuario.salvar();
        System.out.println("Lucro da camiseta: " + produtoVestuario.calcularLucro());      
    }
}
