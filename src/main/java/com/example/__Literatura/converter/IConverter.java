package com.example.__Literatura.converter;

public interface IConverter {
    <T> T obtenerDatos(String json, Class<T> clase);
}