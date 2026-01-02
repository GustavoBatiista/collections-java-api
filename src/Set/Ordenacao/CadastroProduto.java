package Set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtosSet;

    public CadastroProduto() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibiProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtosSet);
        return produtoPorPreco;

    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProduto.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProduto.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProduto.produtosSet);
        System.out.println("=======================");

        System.out.println(cadastroProduto.exibiProdutosPorNome());
        System.out.println("=======================");

        System.out.println(cadastroProduto.exibirProdutoPorPreco());

    }
}