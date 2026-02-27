import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US);
        int idade;
        double altura;
        String sexo;
        boolean maiordeidade;

        System.out.println("Informe a sua idade: ");
        idade = input.nextInt();

        System.out.println("Informe a sua altura: ");
        altura = input.nextDouble();

        System.out.println("Informe o sexo, F ou M: ");
        sexo = input.next();
        
        if (idade >= 18) {
            maiordeidade = true;
            
        }else{
            maiordeidade = false;
        }
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Maior de idade: "+ maiordeidade);
        input.close();
    
    }
}