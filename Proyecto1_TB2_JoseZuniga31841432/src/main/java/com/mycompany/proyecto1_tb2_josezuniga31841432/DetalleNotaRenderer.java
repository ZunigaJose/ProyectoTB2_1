package com.mycompany.proyecto1_tb2_josezuniga31841432;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

public class DetalleNotaRenderer extends JLabel implements ListCellRenderer<PreguntaResuelta>{

    private Map<Integer, Pregunta> map = new HashMap<>();

    public Map<Integer, Pregunta> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Pregunta> map) {
        this.map = map;
    }
    
    public DetalleNotaRenderer() {
        
    }
    @Override
    public Component getListCellRendererComponent(JList<? extends PreguntaResuelta> list, PreguntaResuelta value, int index, boolean isSelected, boolean cellHasFocus) {
        String data = "<html>" + "<div style=width:" + (list.getFixedCellWidth() - 32) + ";><h4>" + "<b>" + "Titulo: " + "</b>"
            +  map.get(value.getIdPregunta()).getTitulo()  + "</h4>"
            + "<h5>" + map.get(value.getIdPregunta()).getDescripcion() + "</h5>" +
            "<p>" + "<b>" + "Su respuesta: " + "</b>"
            + ((value.isRespuesta()) ? "Verdadero " : "Falso ") +
            ((value.isRespuesta() == map.get(value.getIdPregunta()).isTipo()) ? "5" : "0")
            + "/5"  +  "</p>" + "</div>" + "</html>";
        setText(data);
        if (value.isRespuesta() == map.get(value.getIdPregunta()).isTipo()) {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/checked.png")));
        } else {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/wrong.png")));
        }
        setHorizontalTextPosition(JLabel.RIGHT);
        setBorder(new LineBorder(Color.BLACK));
        return this;
    }
    
}

