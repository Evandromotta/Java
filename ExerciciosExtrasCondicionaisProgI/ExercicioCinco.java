import java.util.Scanner;
import java.io.IOException;

public class ExercicioCinco
{
    // através da cláusula throws indicamos que não iremos
    // tratar possíveis erros na entrada de dados realizada
    // através do método "read" do pacote de classes System.in
    public static void main(String args[])throws IOException 
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite M para Masculino ou F para Feminino: ");
        //entrada de dados (lendo um caractere)
        char sexo = (char)System.in.read();
        
        if(sexo == 'M'){
            System.out.println("\nSexo válido: Masculino.");
        } else if (sexo == 'F') {
            System.out.println("\nSexo válido: Feminino.");
        } else {
            System.out.println("\nSexo Inválido!");
        }
    }
}
