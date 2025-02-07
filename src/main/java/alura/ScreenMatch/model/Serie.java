package alura.ScreenMatch.model;

import alura.ScreenMatch.service.ConsultaMyMemory;

import java.util.OptionalDouble;

public class Serie {
    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    private Categoria genero;
    private String atores;
    private String poster;
    private String sinopse;

    public Serie(DadosSerie dadosSerie){
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0);
        this.genero =Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
        this.atores = dadosSerie.atores();
        this.poster = dadosSerie.poster();
        this.sinopse = ConsultaMyMemory.obterTraducao(dadosSerie.sinopse()).trim();
    }

    public String getTitulo() {
        return titulo;
    }

    public Serie setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }

    public Serie setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
        return this;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public Serie setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
        return this;
    }

    public Categoria getGenero() {
        return genero;
    }

    public Serie setGenero(Categoria genero) {
        this.genero = genero;
        return this;
    }

    public String getAtores() {
        return atores;
    }

    public Serie setAtores(String atores) {
        this.atores = atores;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    public Serie setPoster(String poster) {
        this.poster = poster;
        return this;
    }

    public String getSinopse() {
        return sinopse;
    }

    public Serie setSinopse(String sinopse) {
        this.sinopse = sinopse;
        return this;
    }

    @Override
    public String toString() {
        return "genero=" + genero +
                ", titulo='" + titulo + '\'' +
                ", totalTemporadas=" + totalTemporadas +
                ", avaliacao=" + avaliacao +
                ", atores='" + atores + '\'' +
                ", poster='" + poster + '\'' +
                ", sinopse'" + sinopse + '\'';
    }
}
