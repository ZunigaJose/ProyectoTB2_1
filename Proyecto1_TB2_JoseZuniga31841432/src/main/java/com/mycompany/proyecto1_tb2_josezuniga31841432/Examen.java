package com.mycompany.proyecto1_tb2_josezuniga31841432;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Examen {
    @BsonProperty(value = "id")
    private int idExamen;
    private int idClase;
    @BsonProperty(value= "nPreguntas")
    private int cantPreguntas;
    private  ObjectId id;

    public Examen() {
    }

    public Examen(int id, int idClase, int nPreguntas) {
        this.idExamen = id;
        this.idClase = idClase;
        this.cantPreguntas = nPreguntas;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getCantPreguntas() {
        return cantPreguntas;
    }

    public void setCantPreguntas(int cantPreguntas) {
        this.cantPreguntas = cantPreguntas;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
