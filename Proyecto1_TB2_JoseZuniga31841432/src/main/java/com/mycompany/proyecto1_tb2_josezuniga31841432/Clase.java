package com.mycompany.proyecto1_tb2_josezuniga31841432;

import java.util.ArrayList;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Clase {
    private ObjectId id;
    @BsonProperty(value = "id")
    private int idClase;
    private String nombreClase;
    private ArrayList<Examen> examenes = new ArrayList<>();

    public Clase(int id, String nombreClase) {
        this.idClase = id;
        this.nombreClase = nombreClase;
    }

    public Clase() {
    }
    
    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }
    
    @Override
    public String toString() {
        return idClase + ": " + nombreClase;
    }
}
