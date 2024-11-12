/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructuraDeDatos;

/**
 *
 * @author Edgar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tree tree = new Tree();
        
        tree.insert(8, -1, -1, null);
        tree.insert(10, 0, 0,tree.getRoot());
        tree.insert(22, 0,  0,tree.getRoot());
        tree.insert(5, 0,  0,tree.getRoot());
        tree.insert(80, 0, 0, tree.getRoot());
        tree.insert(15, 0, 0, tree.getRoot());
        tree.insert(3, 0, 0, tree.getRoot());
        tree.insert(1, 3,2, tree.getRoot());
        tree.insert(7, 3,5, tree.getRoot());
        tree.insert(9, 6,2, tree.getRoot());
        tree.insert(99, 9,16, tree.getRoot());


        tree.print(tree.getRoot());
        tree.printAncestors(32);
    }
    
    
}
