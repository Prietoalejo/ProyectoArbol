/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Alejandro
 */
public class NodoLista {
    private String nombre;
    private String mote;
    private int key;
    private NodoLista[] sons;
    private NodoLista parent;
    private NodoLista mother;
    
    public NodoLista(String element, int key , String mote) {
        this.nombre = element;
        this.key = key;
        this.sons = new NodoLista[0];
        this.mote = mote;
    }

     public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }
    public NodoLista getMother() {
        return mother;
    }

    public void setMother(NodoLista mother) {
        this.mother = mother;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public NodoLista[] getSons() {
        return sons;
    }

    public void setSons(NodoLista[] sons) {
        this.sons = sons;
    }
    
    public NodoLista getParent() {
        return parent;
    }

    public void setParent(NodoLista parent) {
        this.parent = parent;
    }

    
}
