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
public class EmptyTransaction extends Exception {
    public EmptyTransaction(){
        super("The deque is empty.");
    }
    
}
