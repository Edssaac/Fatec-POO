/**
* @author Edssaac
*/

// Importando as dependências necessárias:
import fatec.poo.model.Aluno;
import java.util.Scanner;

public class Aplic 
{
    public static void main(String[] args) 
    {
        // Instânciando as classes necessárias:
        Aluno objAluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        // Variáveis necessárias:
        int opcao;
        int ra;
        double notaProva1;
        double notaProva2;
        double notaTrab1;
        double notaTrab2;
        
        
        // Entrada de dados:
        System.out.print("\tEntre com as informações do aluno.\n\n");
        
        System.out.print("Ra: ");
        ra = entrada.nextInt();
                
        System.out.print("Nota da Prova 1: ");
        notaProva1 = entrada.nextDouble();
        
        System.out.print("Nota da Prova 2: ");
        notaProva2 = entrada.nextDouble();
        
        System.out.print("Nota do Trabalho 1: ");
        notaTrab1 = entrada.nextDouble();
        
        System.out.print("Nota do Trabalho 2: ");
        notaTrab2 = entrada.nextDouble();
        // Fim da entrada de dados.
        
        // Passando os dados para o objeto:
        objAluno.setRa(ra);
        objAluno.setNotaProva1(notaProva1);
        objAluno.setNotaProva2(notaProva2);
        objAluno.setNotaTrab1(notaTrab1);
        objAluno.setNotaTrab2(notaTrab2);
                
        // "Interface do Usuário":
        do
        {
            System.out.print("\n\tOpções\n");
            
            System.out.print("1 - Exibir Nota das Provas/Trabalhos.\n");
            System.out.print("2 - Exibir Média dos Provas/Trabalhos.\n");
            System.out.print("3 - Exibir Média Final.\n");
            System.out.print("4 - Sair.\n");
            
            System.out.print("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            // Saídas:
            switch (opcao)
            {
                case 1:
                    System.out.printf("Nota Prova 1: %.2f\n", objAluno.getNotaProva1());
                    System.out.printf("Nota Prova 2: %.2f\n", objAluno.getNotaProva2());
                    System.out.printf("Nota Trabalho 1: %.2f\n", objAluno.getNotaTrab1());
                    System.out.printf("Nota Trabalho 2: %.2f\n", objAluno.getNotaTrab2());
                    break;
                    
                case 2:
                    System.out.printf("Média Provas: %.2f\n", objAluno.calcMediaProva());
                    System.out.printf("Média Trabalhos: %.2f\n", objAluno.calcMediaTrab());
                    break;
                    
                case 3:
                    System.out.printf("Média Final: %.2f\n", objAluno.calcMediaFinal());
                    break;
                    
                default:
                    break;
            }
        
        } while ( opcao < 4 );    

    }
}
