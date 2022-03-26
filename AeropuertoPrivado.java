package ProyectoAeropuerto;
public class AeropuertoPrivado extends Aeropuerto{
    
    private String listCompanys[] = new String[10];
    private int numCompanies;
    
    public AeropuertoPrivado(String name, String city, String country) {
        super(name, city, country);
    }

    public AeropuertoPrivado(String name, String city, String country, Compañia[] c, String[] e,
            int numCompanies) {
        super(name, city, country, c);
        this.listCompanys = e;
        this.numCompanies = e.length;
    }
    
    
}
