import java.util.ArrayList;

public class atividade5 {
    
public static void main(String[]args){

ArrayList<String> nomes = new ArrayList<>();

nomes.add("Guilherme");
nomes.add("Gustavo");
nomes.add("Lucas");
nomes.add("Deyverson");
nomes.add("Giovanna");


for (int i = 0; i < nomes.size(); i++){
System.out.println(nomes.get(i));

}
nomes.remove(1);
System.out.println("#####################");
System.out.println("Tamanho da lista: " + nomes.size());
System.out.println("#####################");



for (int i = 0; i < nomes.size(); i++){
System.out.println(nomes.get(i));

}

}

}
