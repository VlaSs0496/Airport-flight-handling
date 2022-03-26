package ProyectoAeropuerto;
public class Aeropuerto {
    private String name;
    private String city;
    private String country;
    private Compañia listCompanies[] = new Compañia[10];
    private int numCompanies;

    public Aeropuerto(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.numCompanies = 0;
    }

    public Aeropuerto(String name, String city, String country, Compañia c[]) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.listCompanies = c;
        this.numCompanies = c.length;
    }
    public void insertCompany(Compañia company) {
        listCompanies[numCompanies] = company;
        numCompanies++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Compañia[] getListCompanies() {
        return listCompanies;
    }

    public void setListCompanies(Compañia[] listCompanies) {
        this.listCompanies = listCompanies;
    }

    public int getNumCompanies() {
        return numCompanies;
    }

    public void setNumCompanies(int numCompanies) {
        this.numCompanies = numCompanies;
    }
    public Compañia getCompanies(int i) {
        return listCompanies[i];
    }
    public Compañia getCompanies(String name){
        boolean found = false;
        int i = 0;
        Compañia c = null;
        while (!found && i < listCompanies.length) {
            if(name.equals(listCompanies[i].getName())){
                found = true;
                c = listCompanies[i];
            }
            i++;
        }
        return c;
    }
}
