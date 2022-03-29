/**
 * @author Edson
 */

// Importando as dependências necessárias:
import fatec.poo.model.Circulo;
import java.util.Scanner;

public class Aplic 
{
    public static void main(String[] args) 
    {
        // Instânciando os objetos necessários:
        Scanner entrada = new Scanner(System.in);
        Circulo objCirc = new Circulo();
        
        // Declarando as variáveis necessárias:
        double raio;
        int opcao;
        
        // Entrada de valores:
        System.out.print("Digite o valor do raio: ");
        raio = entrada.nextDouble();
        
        // Passando os valores para o objeto:
        objCirc.setRaio(raio);
        
        // Criando a "Interface do Usuário":
        do
        {
            // Saída de texto:
            System.out.println("\n1 - Consultar Área.");
            System.out.println("2 - Consultar Perímetro.");
            System.out.println("3 - Consultar Diâmetro.");
            System.out.println("4 - Sair.");
            System.out.print("\n\tDigite a opção: ");
            opcao = entrada.nextInt(); // Entrada da escolha do usuário;
            
            // Saídas do programa:
            System.out.print("\nRaio: " + objCirc.getRaio());
            switch(opcao)
            {                               
                case 1 : 
                    System.out.println("\nÁrea: " + objCirc.calcArea());
                    break;
                        
                case 2 : 
                    System.out.println("\nPerímetro: " + objCirc.calcPerimetro());
                    break;         
                    
                case 3 : 
                    System.out.println("\nDiâmtro: " + objCirc.calcDiametro());
                    break;     
            }
            
        } while( opcao < 4 );     
        
    }    
    
}