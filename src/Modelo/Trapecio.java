package Modelo;

//Clase hija, hereda de la SuperClase
public class Trapecio extends Figura {
    public double baseMayor;
    public double baseMenor;
    public double altura;
    public double ladoUno;
    public double ladoDos;
    
    public double Area(){
        double area;
        area = (baseMayor + baseMenor)/2*altura;
        return area;
    }
    
    public double Perimetro(){
        double perimetro;
        perimetro = baseMayor + baseMenor + ladoUno + ladoDos;
        return perimetro;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(double ladoUno) {
        this.ladoUno = ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
    }

}
