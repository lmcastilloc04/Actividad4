package Nivel2;

import java.util.Random;

public class Funciones {

    //1
    public static boolean esMultiplo(int dividendo, int divisor){
        boolean esMultiplo = (dividendo % divisor == 0);

        return esMultiplo;
    }

    //2
    public static boolean esPar(int numero){
        boolean esPar = (numero % 2 ==0);

        return esPar;
    }

    //3
    public static boolean esImpar(int numero){
        boolean esImpar = (numero % 2 !=0);

        return esImpar;
    }

    //4
    public static boolean esPositivo(int numero){
        boolean esPositivo = (numero>=0);

        return esPositivo;
    }

    //5
    public static boolean esNegativo(int numero){
        boolean esNegativo = (numero<0);

        return esNegativo;
    }

    //6
    public static int mayor(int num1, int num2){
        int mayor=0;

        if (num1>num2){
            mayor = num1;
        }else{
            mayor =num2;
        }
        return mayor;
    }

    //7
    public static  int menor(int num1, int num2){
        int menor=0;

        if(num1<num2){
            menor =num1;
        }else{
            menor=num2;
        }
        return menor;
    }

    //8
    public static int factorial(int numero){
        int factorial=1;
        while(numero!=0){
            factorial=factorial*numero;
            numero--;
        }
        return factorial;
    }

    //9
    public static int dobleFactorial(int numero){
        int dobleFactorial=1;
        if(esPar(numero)){
            while (numero!=0){
                dobleFactorial=dobleFactorial*numero;
                numero=numero-2;
            }
        }else{
            while (numero !=1){
                dobleFactorial=dobleFactorial*numero;
                numero=numero-2;
            }
        }
        return dobleFactorial;
    }

    //10
    public static int cantDivisoresPos(int numero){
        int cantDivisoresPos=0;
        if(numero<0){
            numero=numero*-1;
        }
        int aux=numero;

        while(aux>0){
            if(numero%aux==0){
                cantDivisoresPos++;
                aux--;
            }else{
                aux--;
            }
        }
        return cantDivisoresPos;
    }

    //11
    public static int cantDivisoresNeg(int numero){
     int cantDivisoresNeg=cantDivisoresPos(numero);

     return cantDivisoresNeg;
    }

    //12
    public static int cantDivisores(int numero){
        int cantDivisores=cantDivisoresPos(numero)+cantDivisoresNeg(numero);

        return cantDivisores;
    }

    //13
    public static int sumDivisoresPos(int numero){
        int sumDivisoresPos=0;
        if(numero<0){
            numero=numero*-1;
        }
        int aux=numero;

        while(aux>0){
            if(numero%aux==0){
                sumDivisoresPos=sumDivisoresPos+aux;
                aux--;
            }else{
                aux--;
            }
        }
        return sumDivisoresPos;
    }

    //14
    public static int sumDivisoresNeg(int numero){
        int sumDivisoresNeg=0;
        if(numero>0){
            numero=numero*-1;
        }
        int aux=numero;

        while(aux<0){
            if(numero%aux==0){
                sumDivisoresNeg=sumDivisoresNeg-aux;
                aux++;
            }else{
                aux++;
            }
        }
        return sumDivisoresNeg;
    }

    //15
    public static int sumDivisores(int numero){
        int sumDivisores=sumDivisoresNeg(numero)+sumDivisoresPos(numero);

        return sumDivisores;
    }

    //16
    public static boolean esCompuesto(int numero){
        boolean esCompuesto= false;
        if(numero<0){
            numero=numero*-1;
        }
        int aux=numero;
        do{
            if(numero%aux==0 && aux!=numero && aux!=1){
                esCompuesto=true;
                aux=0;
            }else{
                aux--;
            }
        }while(aux>0);
        return esCompuesto;
    }

    //17
    public static boolean esPrimo(int numero){
        boolean esPrimo=!esCompuesto(numero);

        return esPrimo;
    }

    //18
    public static int Primorial (int numero){
        int primorial=1;
        while (numero>0){
            if (esPrimo(numero)){
                primorial=primorial*numero;
                numero--;
            }else{
                numero--;
            }
        }
        return primorial;
    }

    //19
    public static boolean esPerfecto(int numero){
        boolean esPerfecto=false;
        int aux= sumDivisoresPos(numero)-numero;
        if (aux==numero){
            esPerfecto=true;
        }
        return esPerfecto;
    }

    //20
    public static boolean sonAmigos(int num1, int num2){
         boolean sonAmigos=false;
         int aux1= sumDivisoresPos(num1)-num1;
         int aux2= sumDivisoresPos(num2)-num2;
         if(aux1==num2 && aux2==num1){
             sonAmigos=true;
         }
         return sonAmigos;
    }

    //21
    public static int generarAleatorio(int limInf, int limSup){
        Random c=new Random();
        int generarAleatorio = c.nextInt(limInf,limSup);
        return generarAleatorio;

    }



}
