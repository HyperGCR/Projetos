
public class Produto {
    
private int id;
private String nome;
private double preco;
private int quantidade;


public Produto(String nome, double preco, int quantidade){
this.nome = nome;
this.preco = preco;
this.quantidade = quantidade;

}
public void adicionarEstoque(int qtd){

if(qtd > 0){
this.quantidade += qtd;
}

}
public void removerEstoque(int qtd){
if (qtd > 0 && quantidade >= qtd){
this.quantidade -= qtd;

}else {
    System.out.println("Não é possivel remover essa quantidade do estoque!");

}

}

public void exibirProduto(){
System.out.printf("O produto %s custa R$ %.2f e temos %d no estoque.\n", this.nome, this.preco, this.quantidade);

}
 public String getNome(){
    return this.nome;
 }
 public double getPreco(){
    return this.preco;
 }
 public int getQuantidade(){
    return this.quantidade;
 }

}