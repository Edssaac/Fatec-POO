/**
 * @author Edson
 */

import fatec.poo.model.Retangulo;
import java.util.Scanner;

public class Aplic 
{
    public static void main(String[] args) 
    {
        //instanciação de objetos da classe Scanner
        //e da classe Retangulo
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet;
        
        double medAlt, medBase;
        String medida;
        int opcao;
        
        System.out.print("Digite a unidade de medida: ");
        medida = entrada.nextLine();
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        objRet = new Retangulo(medida);
        
        //passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
           
        do
        {
            System.out.println("\n1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Consultar Diagonal");
            System.out.println("4 - Sair");
            System.out.print("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            
            System.out.print("\nAltura: " + objRet.getAltura() + " " + objRet.getUnidadeMedida());
            System.out.print("\nBase: " + objRet.getBase() + " " + objRet.getUnidadeMedida());
            switch(opcao)
            {                               
                case 1 : 
                    System.out.println("\nÁrea: " + objRet.calcArea() + " " + objRet.getUnidadeMedida());
                    break;
                        
                case 2 : 
                    System.out.println("\nPerímetro: " + objRet.calcPerimetro() + " " + objRet.getUnidadeMedida());
                    break;         
                    
                case 3 : 
                    System.out.println( String.format("\nDiagonal: %.2f %s", objRet.calcDiagonal(), objRet.getUnidadeMedida()) );
                    break;     
            }
            
        } while( opcao < 4 );     
        
    }    
    
}