package ProyectoAeropuerto;
public class Pasajero {
    private String name;
    private String passport;
    private String national;
    
    public Pasajero(String name, String passport, String national) {
        this.name = name;
        this.passport = passport;
        this.national = national;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    
}
