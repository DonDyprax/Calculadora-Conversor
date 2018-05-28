/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;



/**
 *
 * @author LN710Q
 */
public class Binario implements Conversion{
    @Override
    public String convertir(String n) {
        String numeros = "";
        int num = Integer.parseInt(n);
        int bin;
        while(num >= 2){
            bin = num % 2;
            numeros = numeros + bin;
            num = num / 2;            
        }
        numeros = numeros + num;
        
        String ans = new StringBuilder(numeros).reverse().toString();  
        
        return ans;
    }
}
