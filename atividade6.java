import java.util.Scanner;
public class atividade6 {
    
public static void main(String[] args){

Scanner input = new Scanner(System.in);

    int[][] matriz = new int[3][3];
    int soma = 0;

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            System.out.print("Digite um valor: ");
            matriz[i][j] = input.nextInt();
            
        }

    }
    System.out.println("\nMatriz: ");

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            System.out.print(matriz[i][j] + " ");

        }
        System.out.println();
    }

    for(int i = 0; i < 3; i++){
        soma += matriz[i][i];

    }
    System.out.println("\nSoma da diagonal principal: "+ soma);

    input.close();
}

}
