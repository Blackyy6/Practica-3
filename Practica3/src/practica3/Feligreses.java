/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Feligreses {

    public String Iglesia;
    public String Pastor;
    public int Pastores;
    public int Feligreses;
    public int Cedula;
    public Double Diezmo;
    private ArrayList<Feligreses> feligresesList;

    public Feligreses() {
        feligresesList = new ArrayList<>();
    }

    public Feligreses(String Iglesia, String Pastor) {
        this.Iglesia = Iglesia;
        this.Pastor = Pastor;
        feligresesList = new ArrayList<>();
    }

    public void informacion() {
        this.Feligreses = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Feligreses"));
        for (int i = 0; i < this.Feligreses; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del feligrés " + (i + 1));
            int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cédula de " + nombre));
            double diezmo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el diezmo de " + nombre));

            Feligreses feligres = new Feligreses();
            feligres.setNombre(nombre);
            feligres.setCedula(cedula);
            feligres.setDiezmo(diezmo);

            feligresesList.add(feligres);
        }
    }

    public void Pastores() {
        this.Pastores = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pastores: "));
        for (int i = 0; i < this.Pastores; i++) {
            this.Iglesia = JOptionPane.showInputDialog(null, "Ingrese el nombre de la iglesia " + (i + 1));
            this.Pastor = JOptionPane.showInputDialog(null, "Ingrese el nombre del pastor " + (i + 1));
        }
    }

    public String getIglesia() {
        return Iglesia;
    }

    public void setIglesia(String Iglesia) {
        this.Iglesia = Iglesia;
    }

    public String getPastor() {
        return Pastor;
    }

    public void setPastor(String Pastor) {
        this.Pastor = Pastor;
    }

    public int getPastores() {
        return Pastores;
    }

    public void setPastores(int Pastores) {
        this.Pastores = Pastores;
    }

    public int getFeligreses() {
        return Feligreses;
    }

    public void setFeligreses(int Feligreses) {
        this.Feligreses = Feligreses;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public Double getDiezmo() {
        return Diezmo;
    }

    public void setDiezmo(Double Diezmo) {
        this.Diezmo = Diezmo;
    }

    public ArrayList<Feligreses> getFeligresesList() {
        return feligresesList;
    }

    public double gananciasIglesia() {
        double gananciasIglesia = 0;
        for (Feligreses feligres : feligresesList) {
            gananciasIglesia += feligres.getDiezmo();
        }
        return gananciasIglesia;
    }

}
