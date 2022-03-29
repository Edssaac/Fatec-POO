package fatec.poo.model;

/**
 * @author Edssaac
 */

public class Circulo 
{
    /**
     * Variável responsável por receber o valor do raio.
     * @var double raio;
    */
    private double raio;
        
    
    /**
     * Método responsável por alocar um valor na variável raio.
     * @param double r;
    */
    public void setRaio(double r)
    {
        raio = r;
    }
    
    
    /**
     * Método responsável retornar o valor da variável raio.
     * @return double
    */
    public double getRaio()
    {
        return raio;
    }
    
    
    /**
     * Método responsável por calcular a área.
     * @return double;
    */
    public double calcArea()
    {
        return ( Math.PI * Math.pow(raio, 2) );
    }
    
    /**
     * Método responsável por calcular o perímetro.
     * @return double;
    */
    public double calcPerimetro()
    {
        return ( (2*Math.PI) * raio ) ;
    }
    
    /**
     * Método responsável por calcular o diâmetro.
     * @return double;
    */
    public double calcDiametro()
    {
        return (2 * raio);
    }
 
}
