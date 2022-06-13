
public class Combustible 
{

    private String clase;
    
    private String nombre;

    private Carro carro;

    public Combustible(String clase, String nombre)
    {
        this.clase = clase;
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCarro(Carro carro)
    {
         this.carro = carro;

    }

    public Carro mostrarCarro()
    {
        return this.carro;
    }



}
