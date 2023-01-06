public import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.
        System.out.println(velocidadeAtual >= 60 ? "Foi multado" : "Nao foi multado");
    }
    
}
