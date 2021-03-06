package com.mycompany.proyecto1_tb2_josezuniga31841432;

import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ExamenDisponibleRenderer extends JLabel implements ListCellRenderer<Examen> {
    private Map<Integer, String> map = new HashMap<>();

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
    
    public ExamenDisponibleRenderer() {
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Examen> list, Examen value, int index, boolean isSelected, boolean cellHasFocus) {
        String data = "<html><h4>" +  map.get(value.getIdExamen()) + "</h4>" + "idExamen: " +
            value.getIdExamen() + " Cantidad Preguntas: " + value.getCantPreguntas() +"</html>";
        setText(data);
        if (isSelected) {
            setBackground(Color.BLUE);
            setForeground(Color.BLUE);
        } else {
            setBackground(null);
            setForeground(null);
        }
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExaDisponible.png")));
        setHorizontalTextPosition(JLabel.RIGHT);
        return this;
    }
    
}
