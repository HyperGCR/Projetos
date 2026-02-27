
import java.util.Scanner;
public class atividade8 {
    
public static void main(String[]args){
Scanner input = new Scanner(System.in);
double peso;
double altura;
double imc;
double r;
System.out.println("Informe o seu peso: ");
peso = input.nextDouble();

System.out.println("Informe a sua altura: ");
altura = input.nextDouble();

imc = peso / (altura * altura);
System.out.printf("\nseu imc é de: %.2f\n\n", imc);

if (imc < 22) {
    System.out.println("Baixo peso");
}else if (imc >= 22 || imc < 27) {
    System.out.println("Normal");
}else if (imc >= 27 || imc < 29.99) {
    System.out.println("Sobrepeso");
}else if (imc >= 30) {
    System.out.println("Obesidade");
}


input.close();
}

}
