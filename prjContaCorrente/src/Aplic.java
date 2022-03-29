/**
 * Interace do Usuário.
 * @author Edssaac
 */

// Importando dependências necessárias:
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

public class Aplic 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente objCC;
        
        int opcao;
        int numeroConta;
        double saldoConta;
        double valor;
        
        
        System.out.println("\tConta Corrente\n");
        
        System.out.print("Entre com o número da conta: ");
        numeroConta = entrada.nextInt();
        
        System.out.print("Entre com o saldo da conta: ");
        saldoConta = entrada.nextDouble();
        
        
        objCC = new ContaCorrente(numeroConta, saldoConta);
        
        
        do
        {
            System.out.println("\n\n\tOperações\n");
            
            System.out.println("1 - Depositar.");
            System.out.println("2 - Sacar.");
            System.out.println("3 - Consultar Saldo.");
            System.out.println("4 - Sair.\n");
            
            System.out.print("\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("");
            switch (opcao)
            {
                case 1:
                    System.out.println("Conta Número: " + objCC.getNumero());
                    System.out.print("Valor a ser depositado: ");
                    valor = entrada.nextDouble();
                    
                    objCC.depositar(valor);
                    break;
                    
                case 2:
                    System.out.println("Conta Número: " + objCC.getNumero());
                    System.out.print("Valor a ser sacado: ");
                    valor = entrada.nextDouble();
                    
                    if ( objCC.getSaldo() < valor )
                        System.out.println("Saldo Insuficiente.");
                    else
                        objCC.sacar(valor);
                    break;
                    
                case 3:
                    System.out.println("Conta Número: " + objCC.getNumero());
                    System.out.printf("Saldo: %.2f", objCC.getSaldo());
                    break;
            }
            
        } while (opcao < 4);
      
    }
    
}
