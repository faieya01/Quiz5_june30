/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz5_cc104;

/**
 *
 * @author Fairy
 */
public interface Transaction_quiz5<E> {
   public void addFirst(E e);
    public void addLast(E e);
    public E removeFirst() throws EmptyTransaction;
    public E removeLast() throws EmptyTransaction;
    
    public E first() throws EmptyTransaction;
    public E last() throws EmptyTransaction;
    public int size();
    public boolean isEmpty(); 
}
