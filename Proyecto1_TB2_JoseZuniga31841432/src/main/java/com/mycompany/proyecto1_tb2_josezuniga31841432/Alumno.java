package com.mycompany.proyecto1_tb2_josezuniga31841432;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import java.util.List;

public class Alumno {
    private  ObjectId id;
    private  String nombre, login, pass;
    @BsonProperty(value = "id")
    private int alumnoId;
    private List<Nota> notas = new ArrayList<>();
    

    public Alumno(String nombre, String login, String pass, int id) {
        this.nombre = nombre;
        this.login = login;
        this.pass = sha(pass);
        this.alumnoId = id;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }
    
    public void addNota(Nota nota) {
        notas.add(nota);
    }
    
    private String sha(String pass){
        final MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA3-256");
            final byte[] hashbytes = digest.digest(
                pass.getBytes(StandardCharsets.UTF_8));
            String sha3Hex = bytesToHex(hashbytes);
            return sha3Hex;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", login=" + login + ", pass=" + pass + ", alumnoId=" + alumnoId + '}';
    }
    
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
