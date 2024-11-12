/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolgenealogico;

import edd.hashTable2;

/**
 *
 * @author Alejandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
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
        
        
        
        
        
    }
}


    