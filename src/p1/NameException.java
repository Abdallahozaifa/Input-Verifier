/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author hea113
 */
public class NameException extends Exception{
    /**
     * 
     * @param message A string that is a message to display when the exception is thrown   
     */
    public NameException(String message){
        super(message);     
    }
    
    /**
     * 
     * @return the message that is thrown 
     */ 
    public String getMessage()
    {
        return super.getMessage();
    }
}
