package com.mycompany.proyecto1_tb2_josezuniga31841432;

public class PreguntaResuelta {
    private int idPregunta;
    private boolean respuesta;

    public PreguntaResuelta() {
    }

    public PreguntaResuelta(int idPregunta, boolean respuesta) {
        this.idPregunta = idPregunta;
        this.respuesta = respuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
}
