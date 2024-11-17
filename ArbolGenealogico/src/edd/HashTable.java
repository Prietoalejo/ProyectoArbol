/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Edgar
 */
public class HashTable {
    static int hashTableSize = 100;
    static ListaHashTable hashTable []= new ListaHashTable[hashTableSize];
    
    public HashTable () {
        for (int i = 0; i < hashTableSize; i++) {
             hashTable[i] = new ListaHashTable() ;
        }
       
    }
    public static int hashFunc(String c) {
        int hash = c.hashCode()%hashTableSize;
        if(hash<0) hash = hash*-1;
        return hash;
    }
    
    
    public void insertWithValue(NodoLista nodoarbol){
        int index = hashFunc(nodoarbol.getNombre());
        hashTable[index].insertar(nodoarbol);
    }
    
    
    public void show(){
        for (int i = 0; i < hashTableSize; i++) {
           
            NodoListaHashTable aux = hashTable[i].head;
            if(aux!=null){
                System.out.println("----INDICE: "+i+"------");
                while(aux!= null){
                    System.out.println("VALOR: "+aux.val);
                    aux = aux.next;
                }
                System.out.println();
            }
          
        }
    }
    
    public NodoLista  gettNodeById(String value){
        int index = hashFunc(value);
        NodoListaHashTable aux = hashTable[index].head;
        while(aux!= null & aux.val!=value){
            aux = aux.next;
        }
        
        if(aux==null)return null;
        
        return aux.nodoarbol;
    }
    
    public void accessByKey(String value){
        int index = hashFunc(value);

        NodoListaHashTable aux = hashTable[index].head;
        while(aux!= null & aux.val!=value){
            aux = aux.next;
        }
        if(aux!=null)       System.out.println("INDICE: "+index+" VALOR: "+aux.val+" ");
        else                System.out.println("not found");

    }
    
    public ListaHashTable getPersonajePorNombre(String palabra){
        ListaHashTable nueva_lista = new ListaHashTable();
         for (int i = 0; i < hashTableSize; i++) {
           NodoListaHashTable aux = hashTable[i].head;
           while(aux!= null){
            if(aux.val.contains(palabra)){
                nueva_lista.insertar(aux.nodoarbol);
            }
            aux = aux.next;
           }
         }
         return nueva_lista;
    }
    
    public ListaHashTable getPersonajePorMote(String palabra){
        ListaHashTable nueva_lista = new ListaHashTable();
        for (int i = 0; i < hashTableSize; i++) {
           NodoListaHashTable aux = hashTable[i].head;
           while(aux!= null){
           if(aux.nodoarbol.getMote().contains(palabra)){
               nueva_lista.insertar(aux.nodoarbol);
           }
           aux = aux.next;
          }
        }
        
        return nueva_lista;
    }
}
