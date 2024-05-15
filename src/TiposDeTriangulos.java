import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        System.out.println("_______________________________");
        System.out.println("      TIPOS DE TRIANGULOS      ");
        System.out.println("_______________________________");

        System.out.println();
        System.out.print("Qual o valor do lado A: ");
        int ladoA = numeros.nextInt();
        System.out.println();
        System.out.print("Qual o valor do lado B: ");
        int ladoB = numeros.nextInt();
        System.out.println();
        System.out.print("Qual o valor do lado C: ");
        int ladoC = numeros.nextInt();
        System.out.println();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {

            if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
                System.out.println("É um triangulo Equilátero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("É um triangulo Isóceles");
            } else   {
                System.out.println("É um triangulo Escaleno");
            }

        }else {
            System.out.println("Não é um triangulo ");
        }

    }
}
