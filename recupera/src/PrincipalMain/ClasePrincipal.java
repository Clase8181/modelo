/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalMain;

import Clases.Usuario;
import static Metodos.ValidarContraseña.verificar;

/**
 *
 * @author Jaime
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar el objeto
         Usuario usu = new Usuario();
        usu.setContraenia("1231234");
        usu.setNombre("Juan");   //Se hace la verificación
        verificar(usu.getNombre(), usu.getContraenia());  //Mostrará el mensaje error.
    }
    
}
