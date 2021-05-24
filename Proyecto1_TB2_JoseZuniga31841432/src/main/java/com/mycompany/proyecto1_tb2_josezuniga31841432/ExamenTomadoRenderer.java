package com.mycompany.proyecto1_tb2_josezuniga31841432;

import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ExamenTomadoRenderer extends JLabel implements ListCellRenderer<Nota> {
    private Map<Integer, String> map = new HashMap<>();
    
    public ExamenTomadoRenderer() {
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Nota> list, Nota value, int index, boolean isSelected, boolean cellHasFocus) {
       String data = "<html><h4>" +  map.get(value.getIdExamen()) + "</h4>" + "idExamen: " +
            value.getIdExamen() + "<br>" + (value.getNota() < 60 ? "<font color='red'>" : "<font color='green'>")
            +  "Nota: " + value.getNota() +"</font></html>";
        setText(data);
        if(cellHasFocus) {
            setBackground(Color.BLUE);
        } else {
            setBackground(null);
        }
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExaHecho.png")));
        setHorizontalTextPosition(JLabel.RIGHT);
        return this;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
    
    
}
