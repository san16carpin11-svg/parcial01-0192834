import java.util.Scanner;

public class Ejercicio2 {
//corrección ejercicio 2-A
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        int[][] ventas = new int[4][5];
        int[] sumaSucursales = new int[4];
        int[] sumaProductos = new int[5];

        int contador = 0;
        int longitudFilas = ventas.length;
        int longitudColumnas = ventas[0].length;
        int sumaTotal = 0;

        for (int i = 0; i < longitudFilas; i++) {

            for (int j = 0; j < longitudColumnas; j++) {

                System.out.println("Ingrese ventas de la sucursal " + (i + 1) + " producto " + (j + 1));
                ventas[i][j] = leer.nextInt();

                while (ventas[i][j] < 0) {
                    System.out.println("Error, ingrese un número positivo");
                    ventas[i][j] = leer.nextInt();
                }

                if (ventas[i][j] > 30) {
                    contador++;
                }

                sumaSucursales[i] += ventas[i][j];
            }

            sumaTotal += sumaSucursales[i];
        }

        for (int j = 0; j < longitudColumnas; j++) {

            for (int i = 0; i < longitudFilas; i++) {
                sumaProductos[j] += ventas[i][j];
            }

            System.out.println("El producto " + (j + 1) + " vendió un total de: " + sumaProductos[j]);
        }

        int menor = sumaSucursales[0];
        int posicionMenor = 1;

        int mayor = sumaProductos[0];
        int posicionMayor = 1;

        for (int i = 0; i < longitudFilas; i++) {

            System.out.println("La sucursal " + (i + 1) + " vendió un total de: " + sumaSucursales[i]);

            if (sumaSucursales[i] < menor) {
                menor = sumaSucursales[i];
                posicionMenor = i + 1;
            }
        }

        for (int j = 0; j < longitudColumnas; j++) {

            if (sumaProductos[j] > mayor) {
                mayor = sumaProductos[j];
                posicionMayor = j + 1;
            }
        }

        System.out.println("\nEl total de ventas fue de: " + sumaTotal);
        System.out.println("La sucursal con menor venta fue la " + posicionMenor + " con " + menor + " unidades.");
        System.out.println("El producto con mayor venta fue el " + posicionMayor + " con " + mayor + " unidades.");
        System.out.println("Los registros superiores a 30 fueron: " + contador);

        System.out.println("\nMatriz completa:");

        for (int i = 0; i < longitudFilas; i++) {

            for (int j = 0; j < longitudColumnas; j++) {
                System.out.print(ventas[i][j] + " ");
            }

            System.out.println();
        }
    }
}