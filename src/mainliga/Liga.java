/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainliga;

import java.util.ArrayList;

/**
 *
 * @author njarro
 */
public class Liga {
    private String nombre;
    private ArrayList<Equipo>equipos;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Liga(String nombre) {
        this.nombre = nombre;
        this.equipos =new ArrayList<>(); 
    }
    public boolean addEquipo(String nombre){
        Equipo equipo =new Equipo(nombre);
        return this.equipos.add(equipo);
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    

}
