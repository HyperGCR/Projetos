
public class atividade4 {

public static void main(String[]args){


int[] numeros = new int[5];

numeros[0] = 10;
numeros[1] = 10;
numeros[2] = 5;
numeros[3] = 10;
numeros[4] = 20;


int resultado = 0;

for (int numero : numeros){
    resultado += numero;

}
double media = resultado / numeros.length;
int maior = numeros[0];
for(int numero : numeros){
    if (numero > maior){
        maior = numero;
    }


}
int menor = numeros[0];
for(int numero : numeros){
    if (numero < menor){
        menor = numero;
    }
}


System.out.println("resultado dos numeros somados: " + resultado);
System.out.println("Média: " + media);
System.out.println(numeros.length);
System.out.println("Maior numero: " + maior);
System.out.println("Menor numero: " + menor);

}
}
