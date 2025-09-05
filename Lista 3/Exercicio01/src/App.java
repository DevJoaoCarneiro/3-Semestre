import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Livro> listaLivros = new ArrayList<>();
        listaLivros.add(new Livro("Dom Casmurro", "Machado de Assis"));
        listaLivros.add(new Livro("Grande Sertão: Veredas", "João Guimarães Rosa"));
        listaLivros.add(new Livro("O Cortiço", "Aluísio Azevedo"));
        listaLivros.add(new Livro("Capitães da Areia", "Jorge Amado"));
        listaLivros.add(new Livro("A Hora da Estrela", "Clarice Lispector"));
        listaLivros.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis"));
        listaLivros.add(new Livro("O Alienista", "Machado de Assis"));
        listaLivros.add(new Livro("Iracema", "José de Alencar"));
        listaLivros.add(new Livro("O Guarani", "José de Alencar"));
        listaLivros.add(new Livro("Vidas Secas", "Graciliano Ramos"));

        List<String> listaTitulos = listaLivros
                .stream()
                .map(c-> c.getAutor())
                .collect(Collectors.toList());

        listaTitulos.forEach(System.out::println);
    }
}
