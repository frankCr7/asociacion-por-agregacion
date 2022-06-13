public class Main 
{
    public static void main(String args[])
    {
        System.out.println("************COMBUSTIBLE**********");

        Combustible combustible = new Combustible( "GASOLINA", "PETROPERU");

        System.out.println("COMBUSTIBLE: "+combustible.getNombre());

        System.out.println("COMBUSTIBLE: "+combustible.getClase());

        combustible.agregarCarro(new Carro( "TODOTERRENO", "TOYOTA"));
        System.out.println("CARRO: "+combustible.mostrarCarro().getNombre());
        System.out.println("MARCA: "+combustible.mostrarCarro().getMarca());

        System.out.println("************MOTOR DEL CARRO**********");

        Motor motor = new Motor( "TOYOTA", "PULPO");

        System.out.println("MOTOR: "+motor.getMarca());
        System.out.println("TIPO: "+motor.getTipo());

        motor.agregarCarro(new Carro( "TODOTERRENO", "TOYOTA"));
        System.out.println("CARRO: "+combustible.mostrarCarro().getNombre());
        System.out.println("MARCA: "+combustible.mostrarCarro().getMarca());

        System.out.println("**************PALANCA DE CAMBIO******");
        
        PalancaDeCambio palanca = new PalancaDeCambio("TUNING", "MANUAL");

        System.out.println("MODELO: "+palanca.getModelo());
        System.out.println("MODELO: "+palanca.getTipo());

        palanca.agregarCarro(new Carro( "TODOTERRENO", "TOYOTA"));
        System.out.println("CARRO: "+combustible.mostrarCarro().getNombre());
        System.out.println("MARCA: "+combustible.mostrarCarro().getMarca());

        System.out.println("**************FRENOS******");

        Frenos frenos = new Frenos("GAS COMMIUNITY");
        Frenos frenos02 = new Frenos("EDO COMPETITION");

        System.out.println(frenos.getMarca());
        System.out.println(frenos02.getMarca());

        frenos.agregarFrenos(new Carro("TODOTERRENO", "TOYOTA"));
        frenos.agregarFrenos(new Carro("PISTERO", "TOYOTA"));

        //System.out.println(frenos.listarCarro());

        for(Carro carro: frenos.listarCarro())
        {
            System.out.println("CARROS: "+carro.getMarca()+" "+carro.getNombre());
        
        }

        System.out.println("**************NUMEROS DE ASIENTOS******");

        Asientos asiento = new Asientos("SPARCO");
        Asientos asiento02 = new Asientos("BRINGE");
        Asientos asiento03 = new Asientos("RECARO");

        System.out.println(asiento.getMarca());
        System.out.println(asiento02.getMarca());
        System.out.println(asiento03.getMarca());

        asiento.agregarAsientos(new Carro("TODOTERRENO", "TOYOTA"));
        asiento.agregarAsientos(new Carro("PISTERO", "TOYOTA"));
        asiento.agregarAsientos(new Carro("CHACRERO", "TOYOTA"));
        

        for(Carro carro: asiento.listarCarro())
        {
            System.out.println("ASIENTOS: "+carro.getNombre()+" "+carro.getMarca());
        
        }

        

        













    }
    
}
