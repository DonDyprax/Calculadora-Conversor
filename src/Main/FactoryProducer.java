/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conversiones.FactoryConversion;
import Operaciones.FactoryOperacion;

/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        switch(type){
            case "operacion":
                return new FactoryOperacion();
            case "conversion":
                return new FactoryConversion();
        }
        return null;
    }
}
