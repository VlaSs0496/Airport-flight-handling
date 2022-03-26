package ProyectoAeropuerto;

public class Vuelo {
    private String identifier;
    private String cityOfOrigin;
    private String destinationCity;
    private double price;
    private int numMaxPassengers;
    private int numActualPassengers;
    private Pasajero listOfPassengers[];

    public Vuelo(String identifier, String cityOfOrigin, String destinationCity, double price, int numMaxPassengers) {
        this.identifier = identifier;
        this.cityOfOrigin = cityOfOrigin;
        this.destinationCity = destinationCity;
        this.price = price;
        this.numMaxPassengers = numMaxPassengers;
        this.numActualPassengers = 0;
        this.listOfPassengers = new Pasajero[numMaxPassengers];

    }

    public void insertPassenger(Pasajero passenger) {
        listOfPassengers[numActualPassengers] = passenger;
        numActualPassengers++;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCityOfOrigin() {
        return cityOfOrigin;
    }

    public void setCityOfOrigin(String cityOfOrigin) {
        this.cityOfOrigin = cityOfOrigin;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumMaxPassengers() {
        return numMaxPassengers;
    }

    public void setNumMaxPassengers(int numMaxPassengers) {
        this.numMaxPassengers = numMaxPassengers;
    }

    public Pasajero[] getListOfPassengers() {
        return listOfPassengers;
    }

    public void setListOfPassengers(Pasajero[] listOfPassengers) {
        this.listOfPassengers = listOfPassengers;
    }

    public Pasajero getPassenger(int i) {
        return listOfPassengers[i];
    }

    public Pasajero getPassenger(String passport) {
        boolean found = false;
        int i = 0;
        Pasajero pas = null;
        while (!!found && (i < listOfPassengers.length)) {

            if (passport.equals(listOfPassengers[i].getPassport())) {
                found = true;
                pas = listOfPassengers[i];
            }
            i++;
        }
        return pas;
    }

}
