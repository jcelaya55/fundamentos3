/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block_Chain;

import static Block_Chain.hash.getSHA;
import static Block_Chain.hash.toHexString;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bloques {

    public String value;
    public String Timestap;
    public String Datos;
    public String Hash;

    public Bloque Backhash;
    /////////////////////////
    // metodo para obtener la hora del sistema

    public static String getActualTime() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);

        return strDate;
    }
    //////////////////////////
// Crear el primer bloque
    public static String crearbloque(String datos) throws NoSuchAlgorithmException {

        Bloque bloque = new Bloque();
        int i = 1;
        String istring = String.valueOf(i);
        bloque.value = istring;
        System.out.println("Valor del bloque: " +bloque.value);
        String valoristring = toHexString(getSHA(bloque.value));
        bloque.Timestap = getActualTime();
        System.out.println("Fecha : " +bloque.Timestap);
        String valorTimestap = toHexString(getSHA(bloque.Timestap));
        bloque.Datos = datos;
        System.out.println("Datos del bloque: " +bloque.Datos);
        String valordatos = toHexString(getSHA(bloque.Datos));
        String valorFinal = toHexString(getSHA(valoristring + valorTimestap + valordatos));
        bloque.Hash = valorFinal;
        System.out.println("Hash general del Bloque: " +bloque.Hash);
        bloque.Backhash = null;
        return bloque.Hash;
        
    }

    //insertar otro bloque
    public static String insertarbloque(String datos, String hashAnterior) throws NoSuchAlgorithmException {
        numBloque++;
        Bloque bloque = new Bloque();
        String istring = String.valueOf(numBloque);
        bloque.value = istring;
        System.out.println("Valor del bloque: " +bloque.value);
 String valoristring = toHexString(getSHA(bloque.value));
        bloque.Timestap = getActualTime();
        System.out.println("Fecha : " +bloque.Timestap);
        String valorTimestap = toHexString(getSHA(bloque.Timestap));
        bloque.Datos = datos;
        System.out.println("Datos del bloque: " +bloque.Datos);
        String valordatos = toHexString(getSHA(bloque.Datos));
        String valorFinal = toHexString(getSHA(valoristring + valorTimestap + valordatos));
        bloque.Hash = valorFinal;
         System.out.println("Hash general del Bloque: " +bloque.Hash);
        ///// Todavia no esta referenciado al anterior
        bloque.Backhash = hashAnterior;
        return bloque.Hash;
    }
    
    static int numBloque = 1;
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String primerValor = "Hola";
        String segundoValor = "Adios";
        String tercerValor = "Voy";
        
        String hashPrimerBloque = crearbloque(primerValor);
        System.out.println("---------------------------------------------------------------------------------");
        String hashSegundoBloque = insertarbloque(segundoValor,hashPrimerBloque);
        System.out.println("---------------------------------------------------------------------------------");
        String hashGeneral = insertarbloque(tercerValor,hashSegundoBloque);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Hash General de todo el bloque > " + hashGeneral);
    }
}
