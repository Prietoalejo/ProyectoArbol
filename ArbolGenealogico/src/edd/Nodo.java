/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Alejandro
 */
public class Nodo<T> {
    private T element;
    private String key; 
    private Nodo[] sons;
    private Nodo parent; 
    private Nodo mother;

    public Nodo( T element, String key) { 
        this.element= element;
        this.key = key;
        this.sons = new Nodo[0];
    }

    public Object getElement() {
        return element;
    }

    public void setElement( T element) {
        this.element = element;
    }

    public String getKey() { 
        return key;
    }

    public void setKey(String key) { 
        this.key = key;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }
    
    public Nodo getParent() {
        return parent;
    }

    public void setParent(Nodo parent) {
        this.parent = parent;
    }

    public Nodo getMother() {
        return mother;
    }

    public void setMother(Nodo mother) {
        this.mother = mother;
    }
}