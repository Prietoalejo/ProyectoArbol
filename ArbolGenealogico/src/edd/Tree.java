/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Alejandro
 */
public class Tree {
    private Nodo root;
    private int keyCounter;

    public Tree() {
        this.root = null;
        this.keyCounter = 0;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public int getKeyCounter() {
        return keyCounter;
    }

    public void setKeyCounter(int keyCounter) {
        this.keyCounter = keyCounter;
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
    
    public Nodo insert(Object element, int fatherKey, int motherKey, Nodo pointer) { 
        //fk 5 pointer 5 element 21
        Nodo nodo = new Nodo(element, getKeyCounter());
        if (isEmpty()) setRoot(nodo);
        else {
            if(pointer.getKey() == fatherKey){
                increaseSons(pointer, nodo);
                nodo.setParent(pointer);
                Nodo motherNode = findNodeById(motherKey, root);
                if (motherNode != null) {
                    nodo.setMother(motherNode);
                }

            } 
            else {
                for (int i = 0; i < pointer.getSons().length; i++) {
                    insert(element, fatherKey, motherKey, pointer.getSons()[i]);
                }
            }
        }
        keyCounter++;
        return nodo;
    }
    
    public void increaseSons(Nodo father, Nodo nodo){
        Nodo[] newSons = new Nodo[father.getSons().length + 1];
        for (int i = 0; i < father.getSons().length; i++) {
            newSons[i] = father.getSons()[i];
        }
        newSons[newSons.length - 1]= nodo;
        father.setSons(newSons);
    }
    
    public void print(Nodo nodo) {
        if (isEmpty()) {
            System.out.println("The tree is empty");
        } else {
            System.out.println("KEY: "+nodo.getKey()+" VAL: "+"["+nodo.getElement()+"]");
            for (int i = 0; i < nodo.getSons().length; i++) {
                print(nodo.getSons()[i]);
            }
        }
    }
    
    
     public Nodo findNodeById(int id, Nodo node) {
        if (node == null) {
            return null;
        }

        if (node.getKey() == id) {
            return node;
        }

        for (Nodo son : node.getSons()) {
            Nodo found = findNodeById(id, son);
            if (found != null) {
                return found;
            }
        }

        return null;
    }
     
    public void printAncestors(int id) { 
        Nodo node = findNodeById(id, root);

        Nodo current = node;
        while (current.getParent() != null) {
            System.out.println("Ancestor (padre): [" + current.getParent().getElement() + "]");
            current = current.getParent();
        }

        current = node;
        while (current.getMother() != null) {
            System.out.println("Ancestor (madre): [" + current.getMother().getElement() + "]");
            current = current.getMother();
        }
    }
}
