package adsn;

import java.util.Scanner;
// importação da biblioteca de scanner(entrada de dados)

public class Aula0101 {

    public static void main(String[] args) {

        // Scanner para pegar a entrada de dados
        Scanner leitura = new Scanner(System.in);

        float numeroUm;
        float numeroDois;
        float Resultado;

        System.out.printf("Informe o numero 01: ");
        numeroUm = leitura.nextFloat();

        System.out.printf("Informe o numero 02: ");
        numeroDois = leitura.nextFloat();
        Resultado = numeroUm * numeroDois;

        System.out.println(numeroUm + "*" + numeroDois + " = " + Resultado);        
    }
}
