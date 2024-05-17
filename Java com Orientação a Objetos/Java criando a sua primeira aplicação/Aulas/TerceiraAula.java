public class Condicional{
    public static void main(String[] args){
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento > 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else{
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else{
        System.out.println("Deve pagar a locação");
        }
    }
}

import java.util.Scanner;

public class Leitura{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextline();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}

public class ExemploScanner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");
        scanner.close();
    }
}

public class Loop{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Diga sua avaliação para o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de Avalições é " + mediaAvaliacao/3);
    }
}

public class OurtoLoop{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1){
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if(nota != -1){
            mediaAvaliacao += nota;
            totalDeNotas++;
            }
        }

        System.out.println("Média de Avalições é " + mediaAvaliacao/totalDeNotas);
    }
}