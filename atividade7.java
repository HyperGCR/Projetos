import java.util.Scanner;
public class atividade7 {
    
public static void main(String[]args){
Scanner input = new Scanner(System.in);
    float num1;
    float num2;
    float soma;
    float subtrair;
    float divisao;
    float multi;
    
    int menu;
    int sair = 0;
    float r;
    while (sair != 2) {
        
    
    System.out.println("##################################");
    System.out.println("1 - Adição");
    System.out.println("2 - Subtração");
    System.out.println("3 - multiplicação");
    System.out.println("4 - Divisão");
    System.out.println("##################################");
    System.out.println("Escolha um numero: ");
    menu = input.nextInt();
    
    System.out.println("informe o primeiro numero: ");
    num1 = input.nextFloat();
    
    System.out.println("Informe o segundo numero: ");
    num2 = input.nextFloat();
    
    
    switch (menu) {
        case 1:
        r = num1 + num2;
        System.out.println("O valor da soma é: "+ r);    
            break;
        case 2:
        r = num1 - num2;
        System.out.println("O valor da subtração é: "+ r); 
            break;
        case 3:
        r = num1 * num2;
        System.out.println("O valor da multiplicação é: "+ r); 
            break;
        case 4:
        r = num1 / num2;
        System.out.println("O valor da divisão é: "+ r); 
            break;
        default:
            r = 0;
            System.out.println("Operação invalida!!");
            break;
    }
    System.out.println("Deseja continuar\n S = 1\n  \nN = 2: ");
    sair = input.nextInt();
    
    
    }
}





}


