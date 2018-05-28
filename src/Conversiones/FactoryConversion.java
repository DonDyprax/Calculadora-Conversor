/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

import Main.AbstractFactory;
import Operaciones.Operacion;

/**
 *
 * @author LN710Q
 */
public class FactoryConversion implements AbstractFactory{
    @Override
    public Operacion getOperacion(String type) {
        return null;
    }
    
    @Override
    public Conversion getConversion(String type) {
        switch (type) {
            case "binario":
                return new Binario();
        }
        return null;
    }
    
}
