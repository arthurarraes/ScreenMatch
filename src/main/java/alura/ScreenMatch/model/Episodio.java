package alura.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Entity
@Table(name = "episodios")
public class Episodio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avaliacao;
    private LocalDate dataLancamento;
    @ManyToOne
    private Serie serie;

    public Episodio() {
    }

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
            this.dataLancamento =  LocalDate.parse(dadosEpisodio.dataLancamento());
        } catch (DateTimeParseException e){
            this.dataLancamento = null;
        }
    }

    public long getId() {
        return id;
    }

    public Episodio setId(long id) {
        this.id = id;
        return this;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public Episodio setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
        return this;
    }

    public Serie getSerie() {
        return serie;
    }

    public Episodio setSerie(Serie serie) {
        this.serie = serie;
        return this;
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
