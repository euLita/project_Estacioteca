import java.awt.*;

public class Livro {

    String nome;
    String autor;
    String data;
    String editora;
    String genero;

    public Livro (String nome, String autor, String data, String editora, String genero) {
        this.nome = nome;
        this.autor = autor;
        this.data = data;
        this.editora = editora;
        this.genero = genero;


            System.out.println("Nome do livro: " + this.nome);
            System.out.println("Autor do livro: " + this.autor);
            System.out.println("Data de publicação: " + this.data);
            System.out.println("Editora: " + this.editora);
            System.out.println("Gênero do livro: " + this.genero);
        }
}