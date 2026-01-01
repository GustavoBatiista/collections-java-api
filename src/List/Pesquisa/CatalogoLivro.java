package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloDeAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livroPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livroPorIntervaloDeAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }

            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivro.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivro.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivro.pesquisaPorAutor("Autor 2"));
        System.out.println("==========================");
        System.out.println(catalogoLivro.pesquisaPorIntervaloDeAnos(2020, 2022));
        System.out.println("==========================");
        System.out.println(catalogoLivro.pesquisaPorTitulo("Livro 1"));

    }

}
