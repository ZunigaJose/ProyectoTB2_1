package com.mycompany.proyecto1_tb2_josezuniga31841432;

import java.util.ArrayList;

public class Nota {
    private int idExamen;
    private double nota;
    private ArrayList<PreguntaResuelta> preguntas = new ArrayList<>();
    public Nota() {
    }

    public Nota(int idExamen, double nota) {
        this.idExamen = idExamen;
        this.nota = nota;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public double getNota() {
        return nota;
    }
    
    public void sumarNota(double puntos) {
        if (this.nota + puntos <= 100) {
            this.nota += puntos;
        }
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public ArrayList<PreguntaResuelta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<PreguntaResuelta> preguntas) {
        this.preguntas = preguntas;
    }
}
