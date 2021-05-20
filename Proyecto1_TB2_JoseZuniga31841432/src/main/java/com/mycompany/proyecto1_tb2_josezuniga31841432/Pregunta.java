package com.mycompany.proyecto1_tb2_josezuniga31841432;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Pregunta {
    private int id, idClase;
    private String titulo, descripcion;
    @BsonProperty(value = "_id")
    private  ObjectId preguntaId;

    public ObjectId getPreguntaId() {
        return preguntaId;
    }

    public void setPreguntaId(ObjectId preguntaId) {
        this.preguntaId = preguntaId;
    }

    public Pregunta(int id, int idClase, String titulo, String descripcion) {
        this.id = id;
        this.idClase = idClase;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
