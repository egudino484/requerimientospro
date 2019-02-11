/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Eddy
 */
@Named(value = "clienteManagedBean")
@Dependent
public class ClienteManagedBean {

    /**
     * Creates a new instance of ClienteManagedBean
     */
    public ClienteManagedBean() {
    }
    
    public String nombre(){
    return "juan";
    }
    public String ejecutardb(){
    try{
        
        return "iniciobien: "+ Aplicativo.conectar();
    }catch(Exception e){
        
        return "fallo: "+e.getMessage();
    }
        
    
    }
    
}
