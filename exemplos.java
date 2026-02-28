public class exemplos {
    
        String nome;
        int idade;
        void apresentar(){
            System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
        
        }
        public static void main(String[] args){

            exemplos p1 = new exemplos();
            p1.nome = "Guilherme";
            p1.idade = 21;
            p1.apresentar();


        }
}
