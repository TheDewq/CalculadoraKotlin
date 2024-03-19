package com.example.calculadorakotlin;

import java.text.DecimalFormat;

public class mat {
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b != 0) {
            DecimalFormat df = new DecimalFormat("#.0000");
            double rpt = a / b;
            return Double.valueOf(df.format(rpt));
        } else {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial de un número negativo no está definido");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
    public static int fibonacci(int n) {

        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n<=0 tamvien para incluir negativos
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
}
