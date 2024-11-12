/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Edgar
 */

class NodoLista {
    public String key;
    public String val;
    public NodoLista next;
    public NodoLista (String key_new, String val_new, NodoLista siguiente) {
        key = key_new;
        val = val_new;
        next = siguiente;
    }
}

class ListaNew {
    public NodoLista head;
    public String indice;


    public ListaNew () {
        head = null;
        indice = "";
    }
    
     
    public ListaNew (boolean nueva_sucursal,String new_indice) {
        head = null;
        indice = new_indice;

    }
    
    public NodoLista crearNodo(String key, String val) {
        NodoLista nodo 	= new NodoLista(key, val,null);
        return nodo;
    }
    
    public NodoLista insertar(String key, String val ) {

        NodoLista nodo = crearNodo(key,val);
        if (head==null) {
            head = nodo;
        } else {
            NodoLista pointer = head;
            while(pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next=nodo;
        }
        return nodo;

    }
    public NodoLista eliminar(String val) {
        // Paso #1
        if (head == null) return null;

        NodoLista deleteNode = head;

        // Paso #2
        if (deleteNode.val == val) {
            head = head.next;
            deleteNode = null;
            return head;
        }

        // Paso #3
        while (deleteNode.next!=null && deleteNode.next.val != val){
            deleteNode = deleteNode.next;
        }
            
        
        
        if (deleteNode.next==null){
            return head;
        } 

        // Paso #4
        NodoLista aux = deleteNode.next;
        deleteNode.next = aux.next;
        //aux = null;

        return head;
    }
    
    public boolean busqueda(String val) {
        NodoLista aux = head;

        // Paso #1
        while (aux != null){

            // Paso #2
            if (aux.val == val) {
                System.out.println("SE ENCONTRO EL VALOR " +val + " EN LA LISTA" );
                return true;
            }
            aux = aux.next;
        }

        // Paso #3
        System.out.println("No SE ENCONTRO EL VALOR " +val + " EN LA LISTA" );
        return false;
    }
}


public class hashTable2 {
    static int hashTable2Size = 5;
    static ListaNew hashTable2 []= new ListaNew[hashTable2Size];
    
    public hashTable2 () {
        for (int i = 0; i < hashTable2Size; i++) {
             hashTable2[i] = new ListaNew() ;
        }
       
    }
    public static int hashFunc(String c) {
        int hash = c.hashCode()%hashTable2Size;
        if(hash<0) hash = hash*-1;
        return hash;
    }
    
    
    public void insertWithValue(String key, String value){
        int index = hashFunc(key);
        hashTable2[index].insertar(key,value);
    }
    
    
    public void show(){
        for (int i = 0; i < hashTable2Size; i++) {
            System.out.println("----INDICE: "+i+"------");
            NodoLista aux = hashTable2[i].head;
            while(aux!= null){
                System.out.println("CLAVE: " + aux.key+" VALOR: "+aux.val+" ");
                aux = aux.next;
            }
            System.out.println();
        }
    }
    
    public void accessByKey(String key){
        int index = hashFunc(key);

        NodoLista aux = hashTable2[index].head;
        while(aux!= null & aux.key!=key){
            aux = aux.next;
        }
        if(aux!=null)       System.out.println("INDICE: "+index+" CLAVE: " + aux.key+" VALOR: "+aux.val+" ");
        else                System.out.println("not found");

    }
    
    public ListaNew busquedaHash (String palabra ){

         ListaNew listahash = new ListaNew();
         
         

         for (int i = 0; i < hashTable2Size; i++) {
            System.out.println("----INDICE: "+i+"------");
            NodoLista aux = hashTable2[i].head;

            while(aux!= null){
                if (aux.val.contains(palabra)){
                listahash.insertar(aux.key, aux.val);


}
                System.out.println("CLAVE: " + aux.key+" VALOR: "+aux.val+" ");
                aux = aux.next;
            }
            System.out.println();
        }
        return listahash;
        
        
}
    
        
        
    
        
    public static void main(String[] args) {
        /*
        System.out.println(hashFunc("c"));
        System.out.println(hashFunc("d"));
        System.out.println(hashFunc("e"));
        System.out.println(hashFunc("h"));
        System.out.println(hashFunc("i"));
        System.out.println(hashFunc("Hola"));
        System.out.println(hashFunc("aaaa"));
        System.out.println(hashFunc("bbbb"));*/
        
        
        hashTable2 ht = new hashTable2();
        
        ht.insertWithValue("CARLOS I","CARLOS II");
        ht.insertWithValue("CARLOS III","CARLOS III");
        ht.insertWithValue("MARIA","MARIA");
        ht.insertWithValue("CARLOTA","CARLOTA");
        ht.insertWithValue("MARIA II","MARIA II");
        ht.insertWithValue("JUANA","JUANA");
        ht.insertWithValue("EDGAR","EDGAR");
        
        ListaNew lista_personas_encontrada = ht.busquedaHash("CARLOS");
       if(lista_personas_encontrada!= null){
            NodoLista aux = lista_personas_encontrada.head;
            while(aux!=null){
                System.out.println(aux.key + " "+aux.val);
                aux = aux.next;
            }
       }
        
        
        
    }
    
}
