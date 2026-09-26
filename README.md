Ejercicio1: paquetes procesados por hora

Entradas: 

El programa debe solicitar al usuario:
La cantidad de paquetes procesados en cada una de las 10 horas.
Cada dato debe ser un número entero mayor o igual a cero. Si se ingresa un valor negativo, debe volver a pedir el dato.

Proceso:

Crear un arreglo de 10 posiciones para almacenar los paquetes de cada hora.
Leer los 10 valores y validar que ninguno sea negativo.
Guardar cada valor en el arreglo.
Sumar todos los paquetes procesados.
Identificar la hora con la menor cantidad de paquetes.
Calcular el promedio de paquetes por hora.
Recorrer nuevamente el arreglo para contar cuántas horas quedaron por debajo del promedio.
Calcular la racha más larga de horas consecutivas con producción inferior al promedio.
Mostrar el listado final con todas las horas y sus respectivos valores.

Salidas: 

El programa debe mostrar:
El total de paquetes procesados.
El promedio de paquetes por hora.
La hora con la menor cantidad procesada.
La cantidad de horas con producción inferior al promedio.
La racha más larga de horas consecutivas por debajo del promedio.
El listado completo de las 10 horas con su cantidad de paquetes.

corrección, en el código me falto esto despues de la linea 8 específicamente
Validar correctamente los datos negativos usando un while, para que siga pidiendo el dato hasta que sea válido.
Acumular la suma de todos los paquetes dentro del primer recorrido del arreglo.
Inicializar y buscar el menor valor junto con la posición de la hora correspondiente.
Calcular el promedio con división decimal ((double) suma / longitud).
Hacer un segundo recorrido para contar las horas por debajo del promedio.
Calcular la racha más larga reiniciando la racha cuando un valor ya no esté por debajo del promedio
Imprimir el listado final de las 10 horas con sus cantidades.
Mostrar el reporte final con todos los resultados solicitados por el ejercicio.


Ejercicio 2: Registro de ventas de sucursales

Entradas: 

El programa debe solicitar al usuario:
Las unidades vendidas de cada uno de los 5 productos en las 4 sucursales (20 datos en total).
Cada dato debe ser un número entero mayor o igual a cero. Si se ingresa un valor negativo, debe volver a pedir el dato.

Proceso: 

Crear una matriz de 4 filas y 5 columnas para almacenar las ventas.
Crear un arreglo para guardar el total vendido por cada sucursal.
Crear un arreglo para guardar el total vendido de cada producto.
Leer los 20 valores y validar que ninguno sea negativo.
Guardar cada valor en la matriz.
Sumar las ventas de cada sucursal mientras se recorren las filas.
Acumular el total general de ventas.
Contar cuántos registros de la matriz son superiores a 30 unidades.
Recorrer nuevamente la matriz para calcular el total vendido de cada producto.
Identificar la sucursal con la menor cantidad total de ventas.
Identificar el producto con la mayor cantidad total de unidades vendidas.
Mostrar la matriz completa organizada por sucursales y productos.
Mostrar el reporte final con todos los resultados obtenidos.

Salidas:

El programa debe mostrar:
El total de unidades vendidas por cada sucursal.
El total vendido de cada producto.
El total general de ventas.
La sucursal con la menor cantidad total de ventas.
El producto con la mayor cantidad total de unidades vendidas.
La cantidad de registros superiores a 30 unidades.
La matriz completa organizada por sucursales y productos.

en este ejercicio me faltó todo literalmente: 
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Faltaba crear la matriz de 4x5 para almacenar las ventas.
        int[][] ventas = new int[4][5];

        // Faltaba crear los arreglos para guardar los totales.
        int[] sumaSucursales = new int[4];
        int[] sumaProductos = new int[5];

        int contador = 0;
        int longitudFilas = ventas.length;
        int longitudColumnas = ventas[0].length;
        int sumaTotal = 0;

        // Faltaba recorrer la matriz para leer los 20 datos.
        for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudColumnas; j++) {

                System.out.println("Ingrese las ventas de la sucursal " + (i + 1)
                        + " producto " + (j + 1));

                ventas[i][j] = leer.nextInt();

                // Faltaba validar correctamente los valores negativos.
                while (ventas[i][j] < 0) {
                    System.out.println("Error, ingrese un número positivo.");
                    ventas[i][j] = leer.nextInt();
                }

                // Faltaba contar los registros mayores a 30.
                if (ventas[i][j] > 30) {
                    contador++;
                }

                // Faltaba acumular el total de cada sucursal.
                sumaSucursales[i] += ventas[i][j];
            }

            // Faltaba acumular el total general.
            sumaTotal += sumaSucursales[i];
        }

        // Faltaba hacer un segundo recorrido para sumar cada producto.
        for (int j = 0; j < longitudColumnas; j++) {
            for (int i = 0; i < longitudFilas; i++) {
                sumaProductos[j] += ventas[i][j];
            }
        }

        // Faltaba buscar la sucursal con menor venta.
        int menor = sumaSucursales[0];
        int posicionMenor = 1;

        for (int i = 0; i < longitudFilas; i++) {
            if (sumaSucursales[i] < menor) {
                menor = sumaSucursales[i];
                posicionMenor = i + 1;
            }
        }

        // Faltaba buscar el producto con mayor venta.
        int mayor = sumaProductos[0];
        int posicionMayor = 1;

        for (int j = 0; j < longitudColumnas; j++) {
            if (sumaProductos[j] > mayor) {
                mayor = sumaProductos[j];
                posicionMayor = j + 1;
            }
        }

        // Faltaba mostrar los totales por sucursal.
        System.out.println("\nTotal por sucursal:");
        for (int i = 0; i < longitudFilas; i++) {
            System.out.println("Sucursal " + (i + 1) + ": " + sumaSucursales[i]);
        }

        // Faltaba mostrar los totales por producto.
        System.out.println("\nTotal por producto:");
        for (int j = 0; j < longitudColumnas; j++) {
            System.out.println("Producto " + (j + 1) + ": " + sumaProductos[j]);
        }

        // Faltaba mostrar el reporte final.
        System.out.println("\nTotal general: " + sumaTotal);
        System.out.println("Sucursal con menor venta: " + posicionMenor +
                " con " + menor + " unidades.");
        System.out.println("Producto con mayor venta: " + posicionMayor +
                " con " + mayor + " unidades.");
        System.out.println("Registros mayores a 30: " + contador);

        // Faltaba imprimir la matriz completa.
        System.out.println("\nMatriz de ventas:");

        for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudColumnas; j++) {
                System.out.print(ventas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Crear la matriz 4x5 y los arreglos para guardar los totales por sucursal y por producto.
Leer los 20 datos con dos ciclos for.
Validar los datos negativos con un while.
Acumular las ventas de cada sucursal y el total general.
Contar los registros mayores a 30 unidades.
Hacer un segundo recorrido para sumar las ventas de cada producto.
Identificar la sucursal con el menor total de ventas.
Identificar el producto con el mayor total de ventas.
Imprimir la matriz completa y el reporte final con todos los resultados solicitados.. 