/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 * AgeException class
 * @author hea113
 */
public class AgeException extends Exception{
    /**
     * Age Exception constructor initializes message
     * @param message A string that is a message to display when the exception is thrown 
     */
    public AgeException(String message){
        super(message);     
    }
    
    /**
     * 
     * @return the exception message
     */
    public String getMessage()
    {
        return super.getMessage();
    }
}
