package com.mycompany.proyecto1_tb2_josezuniga31841432;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Clase {
    private int id;
    private String nombreClase;
    @BsonProperty(value = "_id")
    private ObjectId ClaseId;

    public Clase(int id, String nombreClase) {
        this.id = id;
        this.nombreClase = nombreClase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public ObjectId getClaseId() {
        return ClaseId;
    }

    public void setClaseId(ObjectId ClaseId) {
        this.ClaseId = ClaseId;
    }
    
    
}
