/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        
        Feligreses feligreses = new Feligreses();
        feligreses.Pastores();
        feligreses.informacion();

        double gananciasIglesia = feligreses.gananciasIglesia() * 0.09;
        double impuestoComedor = gananciasIglesia * 0.21;
        double gananciasPastor = gananciasIglesia * 0.7;

        JOptionPane.showMessageDialog(null,
                "\nCantidad de Pastores: " + feligreses.getPastores() +
                "\nNombre de la iglesia: " + feligreses.getIglesia() +
                "\nNombre del pastor: " + feligreses.getPastor() +
                "\nCantidad de feligreses: " + feligreses.getFeligreses() +
                "\nCedula feligrez: " + feligreses.getCedula() +
                "\nDiezmo ganado del pastor: " + feligreses.getDiezmo() +
                "\nTotal de ganancias de la iglesia: " + gananciasIglesia + 
                "\nMonto para el comedor municipal: " + impuestoComedor +
                "\nGanancia para el pastor: " + gananciasPastor);
    }
    
}
