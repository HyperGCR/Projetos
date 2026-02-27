import java.util.Scanner;
public class atividade9 {
    
public static void main(String[]args){
Scanner input = new Scanner(System.in);
double capital;
double taxa;
int ano;
double r;

System.out.println("Digite o capital inicial: ");
capital = input.nextDouble();

System.out.println("Informe a taxa de juros (ex: 0.05 para 5%): ");
taxa = input.nextDouble();

System.out.println("informe o tempo em anos: ");
ano = input.nextInt();

r = capital * Math.pow((1 + taxa), ano);
System.out.printf("\nMontante final: %.2f", r);

}


}
