package com.mycompany.proyecto1_tb2_josezuniga31841432;

import java.util.Arrays;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Clase {
    private ObjectId id;
    @BsonProperty(value = "id")
    private char[] idClase = new char[6];
    private String nombreClase;

    public Clase(String id, String nombreClase) {
        this.idClase = id.toCharArray();
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

    public String getIdClase() {
        return new String(idClase);
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase.toCharArray();
    }
    
    @Override
    public String toString() {
        return new String(idClase) + ": " + nombreClase;
    }
}
