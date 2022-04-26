/**
 * Interface da Aplicação
 * @author Edson Isaac José Francico 0030482021020
 */

// Dependências necessárias:
import fatec.poo.model.Cliente;
import java.util.Scanner;

// Aplicação:
public class Aplic {

    // Classe Principal:
    public static void main(String[] args) {
        
        // Objeto Cliente:
        Cliente objCliente;
        
        // Objeto Scanner:
        Scanner entrada = new Scanner(System.in);
        
        
        String codigo, numTel;
        double limCred;
        
        
        //Entrada de Dados
        System.out.println("\tCadastro de Clientes\n");
        
        //Codigo
        System.out.print("Código: ");
        codigo = entrada.nextLine();
        
        //Numero de Telefone
        System.out.print("Número de Telefone: ");
        numTel = entrada.nextLine();
        
        
        // Instânciando o Objeto:
        objCliente = new Cliente(codigo, numTel);
        
        
        // Limite de Credito:
        System.out.print("Limite de Crédito: ");
        limCred = entrada.nextDouble();
        objCliente.setLimCred(limCred);
        
        
        // Saídas:   
        System.out.println("\n\tCliente Cadastrado!\n");
        System.out.printf("Código: %s\n", objCliente.getCodigo());
        System.out.printf("Número de Telefone: %s\n", objCliente.getNumTel());
        System.out.printf("Limite de Crédito: %.2f\n", objCliente.getLimCred());
    }
    
}
