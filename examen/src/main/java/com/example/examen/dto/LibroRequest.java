package com.example.examen.dto;

public record LibroRequest(
        Integer id,
        String tituloLibro,
        String descripcionLibro,
        int paginaLibro,
        String edicionLibro
) {

}
