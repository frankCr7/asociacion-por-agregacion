public class Motor 
{
    private String marca;

    private String tipo;

    private Carro carro;

    public Motor(String marca, String tipo)
    {
        this.marca = marca;
        this.tipo = tipo;

    }

    public String getTipo()
    {
        return tipo;
    }

    public String getMarca() {
        return marca;
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
