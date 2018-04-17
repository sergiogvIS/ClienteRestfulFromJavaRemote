/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author entrar
 */
public class ClientRest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Introduce un número:");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);
        int num = Integer.parseInt(buf.readLine());
        Client client = new Client();
        System.out.println("El binario es: " + client.conversorJSON(String.valueOf(num)));
        System.out.println("El factorial es: " + devuelveFactorial(num));
    }

    private static long devuelveFactorial(int arg0) {
        org.factorial.WSFactorial_Service service = new org.factorial.WSFactorial_Service();
        org.factorial.WSFactorial port = service.getWSFactorialPort();
        return port.devuelveFactorial(arg0);
    }
    
}
