package fatec.poo.model;

/**
* Classe responsável por processar as informações do aluno.
* @author Edssaac
*/
public class Aluno 
{
    /**
    * Registro Acadêmico do Aluno.
    */
    private int ra;
    
    /**
    * Nota da primeira prova.
    */
    private double notaProva1;
    
    /**
    * Nota da segunda prova.
    */
    private double notaProva2;
    
    /**
    * Nota do primeiro trabalho.
    */
    private double notaTrab1;
    
    /**
    * Nota do segundo trabalho.
    */
    private double notaTrab2;
                            
    
    
    /**
    * Método responsável por setar o RA do aluno.
    * @param valor int;
    */
    public void setRa(int valor)
    {
        ra = valor;
    }
    
    /**
    * Método responsável por setar a nota da primeira prova do aluno.
    * @param valor double;
    */
    public void setNotaProva1(double valor)
    {
        notaProva1 = valor;
    }
    
    /**
    * Método responsável por setar a nota da segunda prova do aluno.
    * @param valor double;
    */
    public void setNotaProva2(double valor)
    {
        notaProva2 = valor;
    }
    
    /**
    * Método responsável por setar a nota do primeiro trabalho do aluno.
    * @param valor double;
    */
    public void setNotaTrab1(double valor)
    {
        notaTrab1 = valor;
    }
    
    /**
    * Método responsável por setar a nota do segundo trabalho do aluno.
    * @param valor double;
    */
    public void setNotaTrab2(double valor)
    {
        notaTrab2 = valor;
    }
    
    
    
    /**
    * Método responsável por retornar o RA do aluno.
    * @return int;
    */
    public int getRa()
    {
        return ra;
    }
    
    /**
    * Método responsável por retornar a nota da primeira prova do aluno.
    * @return double;
    */
    public double getNotaProva1()
    {
        return notaProva1;
    }
    
    /**
    * Método responsável por retornar a nota da segunda prova do aluno.
    * @return double;
    */
    public double getNotaProva2()
    {
        return notaProva2;
    }
    
    /**
    * Método responsável por retornar a nota do primeiro trabalho do aluno.
    * @return double;
    */
    public double getNotaTrab1()
    {
        return notaTrab1;
    }
    
    /**
    * Método responsável por retornar a nota do segundo trabalho do aluno.
    * @return double;
    */
    public double getNotaTrab2()
    {
        return notaTrab2;
    }
    

    
    /**
    * Método responsável calcular e devolver a média das provas.
    * @return double;
    */
    public double calcMediaProva()
    {
        return ( 0.75 * ( notaProva1 + 2 * notaProva2 ) / 3 );
    }
    
    /**
    * Método responsável calcular e devolver a média dos trabalhos.
    * @return double;
    */
    public double calcMediaTrab()
    {
        return ( 0.25 * ( notaTrab1 + notaTrab2 ) / 2 );
    }
    
    /**
    * Método responsável calcular e devolver a média final.
    * @return double;
    */
    public double calcMediaFinal()
    {
        return ( calcMediaProva() + calcMediaTrab() );
    }
    
}