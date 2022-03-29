
package poo;

import javax.swing.JOptionPane;

public class PrincipalColaborador {
    public static void main(String[] args) {
        Colaborador datos = new Colaborador();
        datos.setNombre(JOptionPane.showInputDialog("Digite el nombre del colaborador"));
        datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del colaborador")));
        datos.setGerero(JOptionPane.showInputDialog("Digite el género del colaborador").charAt(0));
        datos.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del colaborador")));
        datos.setPuesto(JOptionPane.showInputDialog("Digite el puesto del colaborador"));
        datos.setDepartamento(JOptionPane.showInputDialog("Digite el departamento del colaborador"));
        datos.MostrarDatos();
    }
}
