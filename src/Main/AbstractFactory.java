/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conversiones.Conversion;
import Operaciones.Operacion;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Operacion getOperacion(String type);
    Conversion getConversion(String type);
    
}
