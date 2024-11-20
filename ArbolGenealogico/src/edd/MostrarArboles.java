/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author Edgar
 */
public class MostrarArboles {
    public Graph graph;
    
    
public MostrarArboles(){
        graph = new SingleGraph("Red de Transporte");
        //graph.setAttribute("ui.stylesheet", "node{fill-color: green} edge{fill-color: black}");     
    }   

public void AgregarParada (String parada){
        graph.addNode(parada);
        graph.getNode(parada).setAttribute("ui.label", parada);
}

public void AgregarConexion(String parada1, String parada2){
        //graph.addEdge(parada1 +"-"+ parada2, parada1, parada2, true);
        graph.addEdge(parada1 + parada2, parada1, parada2, false);
    }

public void mostrar (Tree arbol){
    CreacionNodos (arbol.getRoot());
    CreacionConexiones (arbol.getRoot());
    graph.display();
    
    
    
}

public void CreacionNodos(NodoLista nodo) {
    AgregarParada (nodo.getNombre());
    
            for (NodoLista son : nodo.getSons()) {
                CreacionNodos(son);
            }
        }
public void CreacionConexiones (NodoLista Nodo){
  for (NodoLista son : Nodo.getSons()) {
      AgregarConexion (Nodo.getNombre(), son.getNombre());
                CreacionConexiones(son);
                
            }  
}

public void mostrarAncestros(NodoLista nodo) {
        if (nodo == null) return; 

        AgregarParada(nodo.getNombre());

        mostrarAncestros(nodo.getParent());
        mostrarAncestros(nodo.getMother());
    }

public void mostrarVisualAncestros (NodoLista nodo){
    mostrarAncestros (nodo);
    // CreacionConexiones (arbol.getRoot());
    graph.display();
    
    
    
}

}





