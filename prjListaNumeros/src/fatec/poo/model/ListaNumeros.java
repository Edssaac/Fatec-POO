/**
 * Classe ListaNumeros.
 * @author Edssaac
 */

// Pacote da Classe:
package fatec.poo.model;

public class ListaNumeros {
    
    /**
    * Matriz de números. 
    */
    private double[] matNum;
    
    /**
    * Quantidade de Elementos. 
    */
    private int qtdeElem;
    
    /**
    * Indice. 
    */
    private int indice; 

    
    /**
    * Método construtor da classe.
    * @param qtdeElem : int
    */
    public ListaNumeros(int qtdeElem) {
        this.qtdeElem = qtdeElem;
        this.indice = 0;
        this.matNum = new double[qtdeElem];
    }
    
    
    /**
    * getMatNum()
    * Método responsável por retornar a matriz de números.
    * @return double[]
    */
    public double[] getMatNum() {
        return this.matNum;
    }
        
    /**
    * getQtdeElem()
    * Método responsável por retornar a quantidade de elementos. 
    * @return int
    */
    public int getQtdeElem() {
        return this.qtdeElem;
    }
    
    /**
    * insereNumero()
    * Método responsável por inserir um novo elemento na matriz de números. 
    * @param valor : double
    * @void
    */
    public void insereNumero(double valor) {
        this.matNum[this.indice] = valor;
        this.indice++;
    }
    
    /**
    * calcSomatoria()
    * Método responsável por retornar a 
    * somatória dos valores armazenados na matriz. 
    * @return double
    */
    public double calcSomatoria() {
        
        double total=0;
        
        for ( int n=0; n<this.qtdeElem; n++ ) {
            total += this.matNum[n];
        }
                
        return total;
    }
        
    /**
    * calcMedia()
    * Método responsável por retornar a 
    * média dos valores armazenados na matriz. 
    * @return double
    */
    public double calcMedia() {
        
        return ( this.calcSomatoria() / this.qtdeElem );
    }
    
    /**
    * calcMaior()
    * Método responsável por retornar o 
    * maior dos valores armazenados na matriz. 
    * @return double
    */
    public double calcMaior() {
        
        double maior=0;
        
        for ( int n=0; n<this.qtdeElem; n++ ) {
            
            if ( this.matNum[n] > maior )
                maior = this.matNum[n];
        }
                
        return maior;
    }
    
    /**
    * calcMenor()
    * Método responsável por retornar o 
    * menor dos valores armazenados na matriz. 
    * @return double
    */
    public double calcMenor() {
        
        double menor=this.matNum[0];
        
        for ( int n=0; n<this.qtdeElem; n++ ) {
            
            if ( menor > this.matNum[n] )
                menor = this.matNum[n];
        }
                
        return menor;
    }
    
}