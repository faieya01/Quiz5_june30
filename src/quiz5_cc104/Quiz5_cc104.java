/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz5_cc104;

import quiz5_cc104.EmptyTransaction;
import doublylinkedlist.DNode;
/**
 *
 * @author Fairy
 */
public class Quiz5_cc104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Persona s1= new Persona(11,"Alonto");
        Persona s2= new Persona(23,"Ray");
        Persona s3= new Persona(39,"Lacson");
        Persona s4= new Persona(40,"Perez");
        Persona s5= new Persona(54,"Dizon"); &*/
        
        DNode<String> transac1 = new DNode(null,"Ybanez", null);
        DNode<String> transac2 = new DNode(null,"Perez", null);
        DNode<String> transac3 = new DNode(null,"Dizon", null);
        DNode<String> transac4 = new DNode(null,"Alonto", null);
        DNode<String> transac5 = new DNode(null,"Mapa", null);
        
        
        Register_quiz5<DNode> transaction = new Register_quiz5<>();
        
        try{
        transaction.addLast(transac1);
        transaction.addLast(transac2);
        transaction.addFirst(transac3);
        transaction.addFirst(transac4);
        transaction.addFirst(transac5);
        
         System.out.println("List of Transactions: \n");
         transaction.showTransaction();
    
          System.out.println("\nRemove First: " + transaction.removeFirst().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
          System.out.println("\nRemove First: " + transaction.removeFirst().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
    
          System.out.println("\nRemove Last: " + transaction.removeLast().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
           System.out.println("\nRemove Last: " + transaction.removeLast().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
          
          } catch (EmptyTransaction ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
