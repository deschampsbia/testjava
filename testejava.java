import java.util.Scanner;
class testejava {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Digite o seu Nome: ");
            String nome = s.next();
            System.out.print("Informe sua Idade: ");
            int idade = s.nextInt();
            System.out.print("Informe o seu sexo? ");
            String sexo = s.next();
        

            System.out.println("Hello, " + nome + " sua idade é: " + idade + " seu sexo é: " + sexo);
            s.close();
            }
}
