
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {

        out.println("Olá, Mundo!");

        Scanner teclado = new Scanner(System.in);

        out.print("Digite o nome: ");

        String nome = teclado.nextLine();

        out.print("Digite a nota: ");

        float nota = teclado.nextFloat();

        out.format("A nota de %s é %.1f \n",nome,nota); //analisar erro //



        String situacao = (nota>=6)?"Aprovado":"Reprovado";

        out.println(situacao);




        out.print("Digite a sua idade: ");

        Integer idade = teclado.nextInt();

        String data = Integer.toString(idade);

        out.println("Sua idade é "+idade);


        //criando token//

        double ale = Math.random();
        int n   = (int) (1 + ale *(999999-1));
        out.println("Seu código itoken é: "+n);


        System.out.println("Digite o primeiro valor: ");
        int a = teclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        int b = teclado.nextInt();

        System.out.println("Digite o tipo de operação: +,-,*,/");
        String operacao = teclado.next();

        int valor = 0;

        switch (operacao) {
            case "+":
                valor = a + b;
                break;
            case "-":
                valor = a - b;
                break;
            case "*":
                valor = a * b;
                break;
            case "/":
                valor = a / b;
                break;
            default:
                System.out.println("Operação não identificada");
        }
        System.out.printf("O Resultado é: %d", valor);
    }
}