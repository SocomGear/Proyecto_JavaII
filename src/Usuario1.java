/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author socom_000
 */
public class Usuario1 {
    
    private int password;

    public Usuario1(int password)throws Comparacion {
        Validacion.Validarpassword(password);
       
        this.password = password;
    }

   
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
       
        this.password = password;
    }
    
    
}
