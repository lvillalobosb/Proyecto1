package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class Figuras {
    public void cuadraro(){
        int lado,area;
        lado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lados del cuadrado"));
        area=lado*lado;
        JOptionPane.showMessageDialog(null,"El área del cuadrado es:"+ area);
    }
    public void triangulo(){
        double base,altura,area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la atura del triángulo"));
        area = (base * altura) / 2;
        JOptionPane.showConfirmDialog(null,"El área del triángulo es:" + area);
    }
    public void circulo(){
        double radio,pi=3.14,area;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo"));
        area = pi*Math.pow(radio, 2);
        JOptionPane.showConfirmDialog(null,"El área del círculo es:" + area);
    }
}
