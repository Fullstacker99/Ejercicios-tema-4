package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {

        //IF PARTE 1
        System.out.println("IF:");
        int numeroIf=-5;

        if(numeroIf>=0){
            if(numeroIf>0){
                System.out.println("Positivo");
            }else{
                System.out.println("Cero");
            }
        }else {
            System.out.println("Negativo");
        }

        //WHILE PARTE 2
        System.out.println("WHILE:");
        int numeroWHILE=0;

        while (numeroWHILE<3){
            System.out.println(numeroWHILE);
            numeroWHILE++;
        }

        //FOR PARTE3
        System.out.println("FOR:");
        for (int numeroFOR=0;numeroFOR<=3;numeroFOR++){
            System.out.println(numeroFOR);
        }

        //SWITCH PARTE 4
        System.out.println("SWITCH:");
        var estacion="primavera";
        switch (estacion){
            case "verano":
                System.out.println("Es verano.");
                break;
            case "invierno":
                System.out.println("Es invierno.");
                break;
            case "otoño":
                System.out.println("Es otoño.");
                break;
            case "primavera":
                System.out.println("Es primavera.");
                break;
            default:
                System.out.println("ESTACION NO VALIDA");
        }
    }
}