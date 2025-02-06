package alura.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numero;
    private String avaliacao;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
    }

    public Integer getTemporada() {
        return temporada;
    }

    public Episodio setTemporada(Integer temporada) {
        this.temporada = temporada;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Episodio setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Integer getNumero() {
        return numero;
    }

    public Episodio setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public Episodio setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
        return this;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public Episodio setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
        return this;
    }

    private String dataLancamento;
}
