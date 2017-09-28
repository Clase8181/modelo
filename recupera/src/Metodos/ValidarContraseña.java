/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Jaime
 */
public class ValidarContraseña {
       public static String saludar(String nombre)
    {
        //Se crea el mensaje de saludo
        String saludo = "Hola. Bienvenido " + nombre;

        return saludo;//Se retorna el saludo
    }
    
    public static String error(String nombre)
    {
        //Se crea el mensaje de error
        String error = "Ups. No pudimos validar tus datos. " + nombre + " es tu usuario?";

        return error; //Se retorna el error
    }
    
    public static void verificar(String usuario, String contrasenia)
    {
        String usuarioValido = "Juan";
        
        String contraseniaValida = "123";
        
        //Se validan los datos
        if(usuarioValido.equals(usuario) && contraseniaValida.equals(contrasenia))
        {
            //Si son validos se llama ala función saludar y se muestra el mensaje retornado por pantalla
            System.out.println(saludar(usuario));
            return; //Terminamos la ejecución
        }
        //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
        System.out.println(error(usuario));
    }
}
