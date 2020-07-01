/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz5_cc104;

import doublylinkedlist.DList;
import doublylinkedlist.DNode;
/**
 *
 * @author Fairy
 */
public class Register_quiz5<E>implements Transaction_quiz5<E>{
    
    private DList<E> person;
    
    public Register_quiz5(){
        person = new DList<>();
    }

    @Override
    public void addFirst(E e) {
         person.addLast((DNode) e);
    }

    @Override
    public void addLast(E e) {
        person.addFirst((DNode) e);
    }

    @Override
    public E removeFirst() throws EmptyTransaction {
        if(person.size() == 0){
            throw new EmptyTransaction();
        }
        return (E) person.removeFirst();
    }

    @Override
    public E removeLast() throws EmptyTransaction {
                if(person.size() == 0){
            throw new EmptyTransaction();
        }
        return (E) person.removeLast();
        
    }

    @Override
    public E first() throws EmptyTransaction{
        if(person.size() == 0){
            throw new EmptyTransaction();
        }
        return (E) person.getHeader();
   }

    @Override
    public E last() throws EmptyTransaction{
        if(person.size() == 0){
            throw new EmptyTransaction();
        }
        return (E) person.getTrailer();
        
    }
   @Override
    public int size() {
        return person.size();
    }

    @Override
    public boolean isEmpty() {
       return person.isEmpty();
    }
    
     public void showTransaction(){
        person.showList();
    }
    
}
