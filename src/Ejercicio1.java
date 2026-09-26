import java.util.Scanner;

public class Ejercicio1 {
//correccion ejercicio 1-A
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        int[] paquetes = new int[10];
        int suma = 0;
        int longitud = paquetes.length;
        int menor = 0;
        int posicionMenor = 1;

        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese la cantidad de paquetes de la hora " + (i + 1));
            paquetes[i] = leer.nextInt();

            while (paquetes[i] < 0) {
                System.out.println("Error, ingrese un número positivo");
                paquetes[i] = leer.nextInt();
            }

            suma += paquetes[i];

            if (i == 0) {
                menor = paquetes[i];
            }

            if (paquetes[i] < menor) {
                menor = paquetes[i];
                posicionMenor = i + 1;
            }
        }

        double prom = (double) suma / longitud;

        int menoresPromedio = 0;
        int rachaActual = 0;
        int rachaMaxima = 0;

        for (int j = 0; j < longitud; j++) {

            if (paquetes[j] < prom) {
                menoresPromedio++;
                rachaActual++;

                if (rachaActual > rachaMaxima) {
                    rachaMaxima = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }

        System.out.println("\nListado final:");

        for (int i = 0; i < longitud; i++) {
            System.out.println("Hora " + (i + 1) + " = " + paquetes[i]);
        }

        System.out.println("\nEl total de paquetes procesados fue de: " + suma);
        System.out.println("El promedio de paquetes por hora fue de: " + prom);
        System.out.println("La hora con menor cantidad procesada fue la " + posicionMenor + " con " + menor + " paquetes.");
        System.out.println("Las horas con producción inferior al promedio fueron: " + menoresPromedio);
        System.out.println("La racha más larga inferior al promedio fue de: " + rachaMaxima);
    }
}