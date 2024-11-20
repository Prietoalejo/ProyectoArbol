/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolgenealogico;

import edd.NodoLista;
import edd.Tree;
import edd.NodoListaHashTable;
import edd.ListaHashTable;
import edd.MostrarArboles;
/**
 *
 * @author Alejandro
 */
public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        NodoLista nodoarbol;
        
        tree.insert("8", -1, -1, null,"mote 8");
        tree.insert("10", 0, 0,tree.getRoot(),"mote 10");
        tree.insert("22", 0,  0,tree.getRoot(),"mote 22");
        tree.insert("5", 0,  0,tree.getRoot(),"mote 5");
        tree.insert("80", 0, 0, tree.getRoot(),"mote 80");
        tree.insert("15", 0, 0, tree.getRoot(),"mote 15");
        tree.insert("3", 0, 0, tree.getRoot(),"mote 3");
        tree.insert("1", 3,2, tree.getRoot(),"mote 1"); 
        tree.insert("7", 3,5, tree.getRoot(),"mote 7");
        tree.insert("9", 6,2, tree.getRoot(),"mote 9");
        tree.insert("99", 9,16, tree.getRoot(),"mote 99");
        
        /*FUNCIONES PARA MOSTRAR EL ARBOL*/
        System.out.println("ARBOL");
        tree.print(tree.getRoot());
        
        
        /*FUNCIONES PARA CREAR EL HASH TABLE*/
        System.out.println("HASH TABLE");
        tree.getHt().insertWithValue(tree.getRoot());
        tree.saveInHashTable(tree.getRoot());
        tree.getHt().show();
        
        
        /*ACCEDER A UN ELEMENTO DESDE EL HASH TABLE*/
        System.out.println("HIJOS 1");
        nodoarbol = tree.getHt().gettNodeById("7");
        tree.mostrarDescendientes(nodoarbol);
        
        
        System.out.println("HIJOS 2");
        nodoarbol = tree.findNodeById(16,tree.getRoot());
        tree.mostrarDescendientes(nodoarbol);
        
        
        System.out.println("BUSCAR POR NOMBRE");
        ListaHashTable lista_personas_encontrada = tree.getHt().getPersonajePorNombre("0");
        
        if(lista_personas_encontrada!= null){
            NodoListaHashTable aux = lista_personas_encontrada.head;
            while(aux!=null){
                System.out.println(aux.val);
                aux = aux.next;
            }
        }
        
        System.out.println("BUSCAR POR MOTE");
        lista_personas_encontrada = tree.getHt().getPersonajePorMote("mote 9");
        
        if(lista_personas_encontrada!= null){
            NodoListaHashTable aux = lista_personas_encontrada.head;
            while(aux!=null){
                System.out.println(aux.nodoarbol.getMote());
                aux = aux.next;
            }
       }
        
        System.out.println("ARBOLES HT DESCNEDIENTES");
        nodoarbol = tree.getHt().gettNodeById("5");
        tree.mostrarDescendientes(nodoarbol);
        

        System.out.println("ARBOLES HT ANCESTROS");
        nodoarbol = tree.getHt().gettNodeById("99");
        tree.mostrarAncestros(nodoarbol);
        
        System.setProperty("org.graphstream.ui", "swing");
        MostrarArboles Arbol = new MostrarArboles();
        Arbol.mostrar(tree);
        
    }
    
    
    
}
