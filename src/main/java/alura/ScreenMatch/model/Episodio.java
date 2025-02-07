package alura.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        this.numeroEpisodio = dadosEpisodio.numero();

        try{
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        } catch (NumberFormatException e){
            this.avaliacao = 0.0;
        }
        try{
            this.dataLancamento = getDataLancamento();
        } catch (DateTimeParseException e){
            this.dataLancamento = null;
        }
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
        return numeroEpisodio;
    }

    public Episodio setNumero(Integer numero) {
        this.numeroEpisodio = numero;
        return this;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public Episodio setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
        return this;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public Episodio setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
        return this;
    }

    @Override
    public String toString() {
        return  "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;
    }
}
