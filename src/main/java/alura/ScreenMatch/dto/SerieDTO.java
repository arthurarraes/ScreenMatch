package alura.ScreenMatch.dto;

import alura.ScreenMatch.model.Categoria;

public record SerieDTO(Long id,
                        String titulo,
                        Integer totalTemporadas,
                        Double avaliacao,
                        Categoria genero,
                        String atores,
                        String poster,
                       String sinopse) {
}
