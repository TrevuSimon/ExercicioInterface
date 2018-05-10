package fapi.poo;

import fapi.poo.geometria.Circulo;
import fapi.poo.geometria.Quadrado;
import fapi.poo.operacoes.*;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int buffer = 0;

    private void menuGeometria(){
        buffer = 0;

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        System.out.print("\ndigite a valor do lado do quadrado" +
                "\n>");
        quadrado.setLado(scanner.nextFloat());
        System.out.print("digite a valor do raio do circulo" +
                "\n>");
        circulo.setRaio(scanner.nextFloat());

        System.out.println("\nValor da area(A) e do perimetro(P)" +
                "\n\nQuadrado" +
                "\nA: " +quadrado.calcularArea()+
                "\nP: " +quadrado.calcularPerimetro()+
                "\n\nCirculo" +
                "\nA: "+circulo.calcularArea() +
                "\nP: "+circulo.calcularPerimetro()+"\n");
    }

    private void menuOperacao(){
        buffer = 0;

        Operacao operacao;
        operacao = new Soma();
        System.out.println("n1 e n2 = 5 e 5:");
        for (int i=0;i<4;i++){
            switch (i){
                case 0:
                    System.out.print("Soma ");
                    operacao = new Soma();
                    break;
                case 1:
                    System.out.print("Subtracao ");
                    operacao = new Subtracao();
                    break;
                case 2:
                    System.out.print("Divicao ");
                    operacao = new Divicao();
                    break;
                case 3:
                    System.out.print("Multiplicacao ");
                    operacao = new Multiplicacao();
                    break;
            }
            System.out.println("Resultado:"+ operacao.executar(5,5));
        }
    }

    public void menu(){
        do{
            if(buffer != 0 && buffer != 1 && buffer != 2){
                System.out.println("Escolha invalida!");
            }
            System.out.print("Exercicios" +
                    "\n1 - geometria" +
                    "\n2 - operacao" +
                    "\n>");
            buffer = scanner.nextInt();

            if(buffer == 1){
                menuGeometria();
                buffer = 1;
            }else if(buffer == 2){
                menuOperacao();
                buffer = 2;
            }
        }while(buffer != 0);
    }
}
