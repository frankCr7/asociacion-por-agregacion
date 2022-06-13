public class PalancaDeCambio 
{
    private String modelo;
    
    private String tipo;

    private Carro carro;

    public PalancaDeCambio(String modelo, String tipo)
    {
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
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
