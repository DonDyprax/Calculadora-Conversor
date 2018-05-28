/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conversiones.Conversion;
import Main.AbstractFactory;
import Main.FactoryProducer;
import Operaciones.Operacion;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{
    public int WIDTH = 600,  widthTF = 120, widthB = 80;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2, textF3, textFConversion, textFOperacion;
    public JButton buttonSuma, buttonResta, buttonMultiplicacion, buttonDivision, buttonLimpiar, buttonBinario;
    
    public Ventana(){
        AbstractFactory factoryOperacion, factoryConversion;
        factoryOperacion = FactoryProducer.getFactory("operacion");
        factoryConversion = FactoryProducer.getFactory("conversion");
        
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(10, 40, widthTF, heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(170, 40, widthTF, heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(420, 40, widthTF, heightTF));
        
        textFOperacion = new JTextField();
        textFOperacion.setBounds(new Rectangle(100, 250, widthTF, heightTF));
        
        textFConversion = new JTextField();
        textFConversion.setBounds(new Rectangle(400, 250, 170, heightTF));
        
        buttonLimpiar = new JButton("Limpiar");
        buttonLimpiar.setBounds(new Rectangle(280, 250, widthB, heightB));
        
        buttonSuma = new JButton("Sumar");
        buttonSuma.setBounds(new Rectangle(50, 115, widthB, heightB));
        
        buttonResta = new JButton("Restar");
        buttonResta.setBounds(new Rectangle(50, 170, widthB, heightB));
        
        buttonMultiplicacion = new JButton("Multiplicar");
        buttonMultiplicacion.setBounds(new Rectangle(170, 115, 100, heightB));
        
        buttonDivision = new JButton("Dividir");
        buttonDivision.setBounds(new Rectangle(180, 170, widthB, heightB));
        
        buttonBinario = new JButton("Binario");
        buttonBinario.setBounds(new Rectangle(440, 145, widthB, heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textFOperacion.setEditable(false);
        textFConversion.setEditable(false);
        
        buttonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textF1.setText(null);
                textF2.setText(null);
                textF3.setText(null);
                textFOperacion.setText(null);
                textFConversion.setText(null);
                
            }
        });
        
        buttonBinario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Conversion binario = factoryConversion.getConversion("binario");
                textFConversion.setText(binario.convertir(textF3.getText()));
            }
        });
        
        buttonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Operacion suma = factoryOperacion.getOperacion("suma");
                textFOperacion.setText(String.valueOf(suma.operar(Float.parseFloat(textF1.getText()), Float.parseFloat(textF2.getText()))));
            }
        });
        
        buttonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Operacion resta = factoryOperacion.getOperacion("resta");
                textFOperacion.setText(String.valueOf(resta.operar(Float.parseFloat(textF1.getText()), Float.parseFloat(textF2.getText()))));
            }
        });
        
        buttonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Operacion multiplicacion = factoryOperacion.getOperacion("multiplicacion");
                textFOperacion.setText(String.valueOf(multiplicacion.operar(Float.parseFloat(textF1.getText()), Float.parseFloat(textF2.getText()))));
            }
        });
        
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Operacion division = factoryOperacion.getOperacion("division");
                textFOperacion.setText(String.valueOf(division.operar(Float.parseFloat(textF1.getText()), Float.parseFloat(textF2.getText()))));
            }
        });
        
        add(textF1);
        add(textF2);
        add(textF3);
        add(textFConversion);
        add(textFOperacion);
        add(buttonSuma);
        add(buttonResta);
        add(buttonMultiplicacion);
        add(buttonDivision);
        add(buttonLimpiar);
        add(buttonBinario);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
                
    }   
}
