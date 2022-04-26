/**
* Interface da Aplicação:
* @author Edson Isaac José Francisco 0030482021020
*/

// Dependências necessárias:
import fatec.poo.model.Garcom;
import fatec.poo.model.Cliente;

// Aplicação:
public class Aplic {

    // Classe Principal:
    public static void main(String[] args) {
        
        // Objeto Garcom:
        Garcom objGarcom = new Garcom(10, "João", 10);
        
        // Objetos Clientes:
        Cliente objCliente1 = new Cliente(15, "Pedro", 1);
        Cliente objCliente2 = new Cliente(16, "Maria", 1);
        
        //Atribuiçõs:
        objGarcom.setSalBase((1000));
        
        objCliente1.addValorComanda(500);
        objCliente1.addValorComanda(150);
        objCliente2.addValorComanda(300);
        
        objGarcom.addGorjeta(objCliente1.getTotalConta());
        objGarcom.addGorjeta(objCliente2.getTotalConta());
        
        
        // Saídas:
        System.out.printf("Cliente: %s - Código: %d\nMesa: %d\nTotal da Conta: %.2f", objCliente1.getNome(), objCliente1.getCodigo(), objCliente1.getNumMesa(), objCliente1.getTotalConta());
        
        System.out.print("\n------------------------\n");
        
        System.out.printf("Cliente: %s - Código: %d\nMesa: %d\nTotal da Conta: %.2f", objCliente2.getNome(), objCliente2.getCodigo(), objCliente2.getNumMesa(), objCliente2.getTotalConta());
        
        System.out.print("\n\n------------------------\n");
        
        System.out.printf("Garcom: %s - Código: %d\n", objGarcom.getNome(), objGarcom.getCodigo());
        System.out.printf("Salário Base: %.2f\n", objGarcom.getSalBase());
        System.out.printf("Taxa de Serviço: %.2f\n", objGarcom.getTaxaServico());
        System.out.printf("Total de Gorjetas: %.2f\n", objGarcom.getTotalGorjeta());
        System.out.printf("Salário Final: %.2f\n\n", objGarcom.calcSalarioFinal());
    }
    
}
