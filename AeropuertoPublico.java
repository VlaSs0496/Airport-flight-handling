package ProyectoAeropuerto;

public class AeropuertoPublico extends Aeropuerto{
    private double money;

    public AeropuertoPublico(String name, String city, String country, double money) {
        super(name, city, country);
        this.money = money;
    }

    public AeropuertoPublico(String name, String city, String country, Compañia[] c, double money) {
        super(name, city, country, c);
        this.money = money;
    }
    
}
