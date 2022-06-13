public class Frenos 
{
    private String marca;

    private Carro[] carro;

    private int contador;

    public Frenos(String marca)
    {
        this.marca = marca;
        this.carro = new Carro[2];
        this.contador = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void agregarFrenos(Carro carro)
    {
        this.carro[this.contador] = carro;

        this.contador++;
    }

    public Carro[] listarCarro()
    {
        return this.carro;
    }


    
    
}
