package Modelo;

//Clase hija, hereda de la SuperClase
public class Rombo extends Figura{
    
    public double diagonalMayor;
    public double diagonalMenor;
    public double lado;
    
    public double Area(){
        double area;
        area = (diagonalMayor * diagonalMenor)/2;
        return area;
    }
    
    public double Perimetro(){
        double perimetro;
        perimetro = 4 * lado;
        return perimetro;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
