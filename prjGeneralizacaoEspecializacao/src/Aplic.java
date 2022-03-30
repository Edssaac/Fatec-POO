/**
 * Interface da aplicação.
 * @author Edssaac
 */

// Dependências necessárias:
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.util.Scanner;


public class Aplic 
{
    public static void main(String[] args) 
    {
        // Instânciando as classes:
        FuncionarioHorista objFH;
        FuncionarioMensalista objFM;
        Scanner entrada = new Scanner(System.in);
        
        // Variáveis necessárias:
        int tipo;
        int opcao;
        int registro;
        String nome;
        String dataAdmissao;
        String cargo;
        int valHora;
        double qtdHorasTrabalhadas;
        double valorSalarioMinimo;
        double numeroSalarioMinimo;

        
        while (true)
        {
            System.out.println("#-------------------------------------------#");
            System.out.println("\tCálculo de Salário\n");

            System.out.println("Escolha o tipo de funcionário:");

            System.out.println("[0] Sair");
            System.out.println("[1] Funcionário Horista");
            System.out.println("[2] Funcionário Mensalista");

            System.out.print("\n\tTipo: ");
            tipo = entrada.nextInt();
            
            if (tipo == 0)
                break;
            
            if (tipo != 1 && tipo != 2)
                continue;
                        
            System.out.println("#-------------------------------------------#\n");
            
            
            System.out.print("Registro: ");
            registro = entrada.nextInt();
            entrada.nextLine(); // Limpar entrada;
            
            System.out.print("Nome: ");
            nome = entrada.nextLine();
            
            System.out.print("Data de Admissão: ");
            dataAdmissao = entrada.nextLine();
                        
            System.out.print("Cargo: ");
            cargo = entrada.nextLine();
            
            if (tipo == 1) //horista
            {
                System.out.print("Valor da Hora Trabalhada: ");
                valHora = entrada.nextInt();
            
                System.out.print("Quantidade de Horas Trabalhadas: ");
                qtdHorasTrabalhadas = entrada.nextDouble();
                
                objFH = new FuncionarioHorista(registro, nome, dataAdmissao);
                objFH.setCargo(cargo);
                objFH.setValHora(valHora);
                objFH.setQtdHoraTrabalhada(qtdHorasTrabalhadas);
            }
            else if (tipo == 2) //mensalista
            {
                System.out.print("Valor do Salário Mínimo: ");
                valorSalarioMinimo = entrada.nextDouble();
            
                System.out.print("Quantidade de Salários Mínimos: ");
                numeroSalarioMinimo = entrada.nextDouble();
                
                objFM = new FuncionarioMensalista(registro, nome, dataAdmissao);
                objFM.setCargo(cargo);
                objFM.setValorSalarioMinimo(valorSalarioMinimo);
                objFM.setNumeroSalarioMinimo(numeroSalarioMinimo);
            }
             
            System.out.println("\n\tOperações\n");

            System.out.println("[0] Sair.");
            System.out.println("[1] Calcular Salário Bruto.");
            System.out.println("[2] Calcular Salário Liquído.");
            System.out.println("[3] Calcular Descontos.");

            if (tipo == 1) // horista
            {
                System.out.println("[4] Calcular Gratificação.");
                System.out.println("[5] Apontar Horas Trabalhadas.");
            }
            else if (tipo == 2) // menstalista
            {
                System.out.println("[4] Apontar Quantidade de Salários Mínimos.");
            }

            System.out.print("\n\tEscolha: ");
            opcao = entrada.nextInt();
            
            if (opcao == 0) 
                break;
            
            System.out.print("Registro: ");
            System.out.print("Nome: ");
            System.out.print("Data Admissão: ");
            System.out.print("Cargo: ");

            if (opcao == 1)
            {
            
            }
            
            
            
        } //while   

    } //main
    
} // aplic
