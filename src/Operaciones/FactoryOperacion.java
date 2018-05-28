/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conversiones.Conversion;
import Main.AbstractFactory;

/**
 *
 * @author LN710Q
 */
public class FactoryOperacion implements AbstractFactory{
    @Override
    public Conversion getConversion(String type) {
        return null;
    }
    
    @Override
    public Operacion getOperacion(String type) {
        switch (type) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }
}
