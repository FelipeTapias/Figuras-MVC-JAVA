package Modelo;

//Clase hija, hereda de la SuperClase
public class Paralelogramo extends Figura {
    public double base;
    public double altura;
    
    public double Area(){
        double area;
        area = base*altura;
        return area;
    }
    
    public double Perimetro(){
        double perimetro;
        perimetro = (2*base)+(2*altura);
        return perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
