/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Edgar
 */
public class ListaHashTable {
    public NodoListaHashTable head;
    public String indice;


    public ListaHashTable () {
        head = null;
        indice = "";
    }
    
     
    public ListaHashTable (boolean nueva_sucursal,String new_indice) {
        head = null;
        indice = new_indice;

    }
    
    public NodoListaHashTable crearNodo(String value, NodoLista nodoarbol) {
        NodoListaHashTable nodo 	= new NodoListaHashTable(value,nodoarbol,null);
        return nodo;
    }
    
    public NodoListaHashTable insertar(NodoLista nodoarbol ) {
        NodoListaHashTable nodo = crearNodo((String)nodoarbol.getNombre(),nodoarbol);
        if (head==null) {
            head = nodo;
        } 
        
        else {
            NodoListaHashTable pointer = head;
            while(pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next=nodo;
        }
        return nodo;

    }
    
    public NodoListaHashTable eliminar(String val) {
        if (head == null) return null;

        NodoListaHashTable deleteNode = head;
        
        if (deleteNode.val == val) {
            head = head.next;
            deleteNode = null;
            return head;
        }

        while (deleteNode.next!=null && deleteNode.next.val != val){
            deleteNode = deleteNode.next;
        }
            
        
        if (deleteNode.next==null)return head;
        
        NodoListaHashTable aux = deleteNode.next;
        deleteNode.next = aux.next;

        return head;
    }
    
    public boolean busqueda(String val) {
        NodoListaHashTable aux = head;

        while (aux != null){

            if (aux.val == val) {
                System.out.println("SE ENCONTRO EL VALOR " +val + " EN LA LISTA" );
                return true;
            }
            aux = aux.next;
        }

        System.out.println("No SE ENCONTRO EL VALOR " +val + " EN LA LISTA" );
        return false;
    }
}


