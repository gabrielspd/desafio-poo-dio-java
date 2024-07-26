package br.com.dio.desafio.dominio;

public class Feedback {
    private Dev dev;
    private Conteudo conteudo;
    private String comentario;
    private int rating;

    public Feedback(Dev dev, Conteudo conteudo, String comentario, int rating) {
        this.dev = dev;
        this.conteudo = conteudo;
        this.comentario = comentario;
        this.rating = rating;
    }

    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Avaliação deve ser entre 1 e 5");
        }
        this.rating = rating;
    }

    public void exibirFeedback() {
        System.out.println("Feedback de: " + dev.getNome());
        System.out.println("Sobre: " + conteudo.getNome());
        System.out.println("Comentário: " + comentario);
        System.out.println("Avaliação: " + rating + " estrelas");
    }
}
