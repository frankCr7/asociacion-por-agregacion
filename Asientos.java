public class Asientos 
{
    private String marca;

    private Carro[] carro;

    private int contador;

    public Asientos(String marca)
    {
        this.marca = marca;
        this.carro = new Carro[3];
        this.contador = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void agregarAsientos(Carro carro)
    {
        this.carro[this.contador] = carro;

        this.contador++;
    }

    public Carro[] listarCarro()
    {
        return this.carro;
    }

    
}
