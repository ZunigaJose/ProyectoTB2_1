package com.mycompany.proyecto1_tb2_josezuniga31841432;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Examen {
    private int id, idClase, nPreguntas;
    @BsonProperty(value = "_id")
    private  ObjectId examenId;

    public Examen(int id, int idClase, int nPreguntas) {
        this.id = id;
        this.idClase = idClase;
        this.nPreguntas = nPreguntas;
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

    public int getnPreguntas() {
        return nPreguntas;
    }

    public void setnPreguntas(int nPreguntas) {
        this.nPreguntas = nPreguntas;
    }

    public ObjectId getExamenId() {
        return examenId;
    }

    public void setExamenId(ObjectId examenId) {
        this.examenId = examenId;
    }
}
