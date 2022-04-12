/**
 * Interface da Aplicação.
 * @author Edssaac
 */

// Importações Necessárias:
import fatec.poo.model.ListaNumeros;
import java.util.Scanner;

// Aplicação:
public class Aplic {

    // Classe Principal:
    public static void main(String[] args) {
        
        ListaNumeros objLista; // Lista.
        int quantidade; // Quantidade de Elementos.
        int opcao;  // Opção Selecionada.
        boolean ativo = true;
        Scanner entrada = new Scanner(System.in); // Entrada de Dados.
        
        System.out.print("Inserir a quantidade de elementos: ");
        quantidade = entrada.nextInt();
        objLista = new ListaNumeros(quantidade);
        
        // Entrada dos Números 
        for ( int n=1; n<=quantidade; n++ ) {
            System.out.printf("Número #%d: ", n);
            objLista.insereNumero(entrada.nextDouble());
        }
               
        do {
            
            System.out.println("------------------------");
            System.out.println("1 - Exibir a Somatória.");
            System.out.println("2 - Exibir Média.");
            System.out.println("3 - Exibir Maior Valor.");
            System.out.println("4 - Exibir Menor Valor.");
            System.out.println("5 - Exibir Lista.");
            System.out.println("6 - Sair.");
            System.out.print("\n\t Digite a Opção: ");
            
            opcao = entrada.nextInt();
            
            switch(opcao) {
                
                case 1:
                    System.out.println("\nSomatória: " + objLista.calcSomatoria());
                    break;
                
                case 2:
                    System.out.println("\nMédia: " + objLista.calcMedia());
                    break;
                    
                case 3:
                    System.out.println("\nMaior Valor: " + objLista.pesqMaior());
                    break;
                    
                case 4:
                    System.out.println("\nMenor Valor: " + objLista.pesqMenor());
                    break;
                    
                case 5:
                    System.out.println("\n\t -- Lista --");
                    double[] lista = objLista.getMatNum();
                    
                    for ( int n=0; n<quantidade; n++ ) {
                        System.out.printf("#%d: %.2f\n", (n+1), lista[n]);
                    }
                    
                    break;
                    
                case 6:
                    ativo = false;
                    break;
                
                default: 
                    ativo = false;
                    break;
            }
            
        } while (ativo); // Do

    } // Main
    
} // Aplic
