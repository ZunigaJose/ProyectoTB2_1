package com.mycompany.proyecto1_tb2_josezuniga31841432;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Examen {
    @BsonProperty(value = "id")
    private int idExamen;
    private int idClase, nPreguntas;    
    private  ObjectId examenId;

    public Examen() {
    }

    public Examen(int id, int idClase, int nPreguntas) {
        this.idExamen = id;
        this.idClase = idClase;
        this.nPreguntas = nPreguntas;
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
