package Controlador;

import Modelo.Paralelogramo;
import Modelo.Rombo;
import Modelo.Trapecio;
import java.util.Scanner;

//Controlador (ejecuta Figura)
public class EjecutaFigura {

    public static void main(String[] args) {
        //Declaracion de variables
        String nombre, entradaChar;
        double baseMayor, baseMenor, altura, ladoUno, ladoDos;
        double diagonalMayor, diagonalMenor, lado, base;
        int tipoFig;
        char desea;
        boolean bandera = true;

        Scanner sc = new Scanner(System.in);
        //Utilizado para hacer un ciclo "mientras que"
        do {
            System.out.println("<<<      Tipos de figura   >>>");
            System.out.println("<<< ------------------------- >>>");
            System.out.println("    1. Trapecio");
            System.out.println("    2. Rombo");
            System.out.println("    3. Paralelogramo");
            System.out.println("    4. Fin");
            System.out.println("<<< ------------------------- >>>");
            System.out.println("       NOTA: Digite el número de la figura que desea consultar. ");
            System.out.print("       Teclee tipo: ");
            tipoFig = sc.nextInt();
            sc.nextLine();

            
            //Activara un "case" dependiendo del elegido por el usuario
            switch (tipoFig) {
                //Se ejecuta cuando su valor de case sea igual al del usuario
                case 1:
                    Trapecio trapUno = new Trapecio();

                    nombre = "Trapecio";

                    //Creado para validar los datos
                    do {
                        System.out.println("Digite la base mayor: ");
                        baseMayor = sc.nextDouble();

                        System.out.println("Digite la base menor: ");
                        baseMenor = sc.nextDouble();

                        if (baseMenor > baseMayor) {
                            System.out.println("La base menor, no debe ser mayor a la base mayor");
                            System.out.println("Intente de nuevo");
                            bandera = true;
                        } else {
                            bandera = false;
                            System.out.println("Digite la altura ");
                            altura = sc.nextDouble();

                            System.out.println("Digite lado uno: ");
                            ladoUno = sc.nextDouble();

                            System.out.println("Digite lado dos: ");
                            ladoDos = sc.nextDouble();

                            trapUno.setNombre(nombre);
                            trapUno.setBaseMayor(baseMayor);
                            trapUno.setBaseMenor(baseMenor);
                            trapUno.setAltura(altura);
                            trapUno.setLadoUno(ladoUno);
                            trapUno.setLadoDos(ladoDos);
                            System.out.println("Nombre: " + trapUno.getNombre());
                            System.out.println("Perimetro: " + trapUno.Perimetro());
                            System.out.println("Area: " + trapUno.Area());
                        }
                    } while (bandera);
                    //Rompe el case
                    break;
                case 2:
                    Rombo romboUno = new Rombo();

                    nombre = "Rombo";

                    do {
                        System.out.println("Digite diagonal mayor: ");
                        diagonalMayor = sc.nextDouble();

                        System.out.println("Digite diagonal menor: ");
                        diagonalMenor = sc.nextDouble();

                        System.out.println("NOTA: Recuerda que todos los lados del rombo tienen la misma longitud.");
                        System.out.println("Con uno solo nos bastará: ");
                        System.out.println("Digite el lado: ");
                        lado = sc.nextDouble();

                        if (diagonalMayor < diagonalMenor || lado > diagonalMayor) {
                            bandera = true;
                            if (diagonalMayor < diagonalMenor) {
                                System.out.println("La diagonal menor, no puede ser mayor a la diagonal mayor");
                            } else {
                                System.out.println("La longitud de los lados, no puede ser mayor a la diagonal mayor");
                            }
                            System.out.println("Intente de nuevo");
                        } else {
                            bandera = false;
                            romboUno.setNombre(nombre);
                            romboUno.setDiagonalMayor(diagonalMayor);
                            romboUno.setDiagonalMenor(diagonalMenor);
                            romboUno.setLado(lado);

                            System.out.println("Nombre: " + romboUno.getNombre());
                            System.out.println("Perimetro: " + romboUno.Perimetro());
                            System.out.println("Area: " + romboUno.Area());
                        }
                    } while (bandera);
                    break;

                case 3:
                    Paralelogramo paraleUno = new Paralelogramo();

                    nombre = "Paralelogramo";

                    do {
                        System.out.println("Digite la base: ");
                        base = sc.nextDouble();

                        System.out.println("Digite la altura: ");
                        altura = sc.nextDouble();

                        if (base == 0 || altura == 0) {
                            bandera = true;
                            if (base == 0) {
                                System.out.println("La base tiene que ser mayor a '0'");
                            } else {
                                System.out.println("La altura tiene que ser mayor a '0'");
                            }
                            System.out.println("Intenta de nuevo");
                        } else {
                            bandera = false;
                            paraleUno.setNombre(nombre);
                            paraleUno.setBase(base);
                            paraleUno.setAltura(altura);

                            System.out.println("Nombre: " + paraleUno.getNombre());
                            System.out.println("Perimetro: " + paraleUno.Perimetro());
                            System.out.println("Area: " + paraleUno.Area());
                        }
                    } while (bandera);
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Figura no encontrada.");
                    break;
            }
            System.out.print("\n¿Desea consultar otra figura(S/N)?: ");
            entradaChar = sc.next();
            desea = entradaChar.charAt(0);
            sc.nextLine();
        } while (desea == 'S' || desea == 's');
        System.out.println("¡Hasta luego!");
        System.exit(0);
    }
}
