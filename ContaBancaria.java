
import java.util.Scanner;
public class ContaBancaria {
String nome;
double saldo = 0;
int numconta;
public void depositar(double valorDepositado){
saldo += valorDepositado;
}

public void sacar(double valorSacado){
if(valorSacado <= saldo){
saldo -= valorSacado;
System.out.println("valor sacado com sucesso!");
}else{
    System.out.println("Operação invalida!\nVocê não tem saldo!");
}


}

public void exibirSaldo(){

System.out.printf("Saldo atual: R$ %.2f\n", saldo);
}
public static void main(String[]args){
Scanner input = new Scanner(System.in);

ContaBancaria minhaConta = new ContaBancaria();
minhaConta.nome = "Guilherme";
minhaConta.numconta = 2365;
int opçao = 0;

while (opçao != 4) {
System.out.println("Ola " + minhaConta.nome + "\nPortador da conta: "+ minhaConta.numconta + "\nComo posso ajudar ?");
System.out.println("\n##########################");
System.out.println("1 - Depositar \n2 - Sacar \n3 - Ver saldo \n4 - Sair");
System.out.println("##########################");
System.out.println("Informe a opção: ");
opçao = input.nextInt();

switch (opçao) {
    case 1:
        System.out.println("Qual valor a ser depositado ?");
        double valordep = input.nextDouble();
        minhaConta.depositar(valordep);
        System.out.println("Valor depositado com sucesso!");
        break;
    case 2:
        System.out.println("Quanto gostaria de sacar ?");
        double valorsac = input.nextDouble();
        minhaConta.sacar(valorsac); 
        break;
    case 3:
        minhaConta.exibirSaldo();
        break;
    case 4:
        System.out.println("Até mais :)");
        break;
    default:
        System.out.println("Operação invalida! \n\nNúmero incorreto!");
        break;
}

}
}
}