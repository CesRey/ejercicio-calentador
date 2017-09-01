/**
 * @autor César Ulises Reyes Mata
 * @version 1.0  (29-agosto-2017)
 * 
 * clase calentador
 */
public class Calentador
{
    private int Temperatura;
    private int Incremento;
    private int min;
    private int max;
    
    /**
     * El constructor inicializa las variables
     */
    public Calentador()
    {
        Temperatura = 15;
        Incremento = 5; // valor inicial
        min = 2;
        max = 10;
    }
    
    /**
     * Este Metodo modifica el incremento 
     * @param pIncremeto sirve para modificar el incremento 
     */
    public void modificarIncremento(int pIncremento)
    {
        if(pIncremento >= 0 && pIncremento >= min && pIncremento <= max)
        {
            Incremento=pIncremento;
        }
        else
        {
           System.out.println("El valor nuevo no es correcto");
        }     
    }
    
     /**
     * Este Metodo modifica la temperatura enfriando el calentador entre un intervalo
     */
    public void enfriar()
    {      
       if(Temperatura - Incremento >= -10)
       {
            Temperatura = Temperatura - Incremento;
       }  
       else
       {
            System.out.println("Has sobrepasado la minima temperatura");
       }
    }
    
     /**
     * 
     * Este metodo modifica la temperatura del calentador aumentandola en un intervalo
     */
    public void calentar()
    {
        if(Temperatura + Incremento <= 30)
        {
            Temperatura = Temperatura + Incremento;
        }
        else
        {
            System.out.println("El incremento sobrepasa el nivel");
        }        
    }
    
    /**
     * Este metodo regresa la temperatura del calentador
     * @return Regresa la temperatura actual del calentador
     */
    public int checarTemp()
    {
        System.out.println(Temperatura);
        return Temperatura;
    }
}