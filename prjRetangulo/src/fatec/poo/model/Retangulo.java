package fatec.poo.model;

/**
 * @author Edson
 */

public class Retangulo 
{
    // Variáveis:
    private double altura;
    private double base;
    private String unidadeMedida;
    
    
    // Constructor:
    public Retangulo(String uniMed)
    {
        unidadeMedida = uniMed;
    }
    
    
    
    // Sets:
    public void setAltura(double a)
    {
       altura = a;   
    }
    
    public void setBase(double b)
    {
        base = b;
    }
    
    
    //Gets:
    public double getAltura()
    {
       return(altura);   
    }
    
    public double getBase()
    {
        return(base);
    }
    
    public String getUnidadeMedida()
    {
        return unidadeMedida;
    }
    
    
    // Métodos:
    public double calcArea()
    {
        return(altura * base);
    }   
    
    public double calcPerimetro()
    {
        return(2 * (altura + base));
    }
    
    public double calcDiagonal()
    {
        double h = Math.pow(base, 2) + Math.pow(altura, 2);
        double r = Math.sqrt( h );
        return ( r );
    }
    
}
