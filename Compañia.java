package ProyectoAeropuerto;

public class Compañia {

    private String name;
    private Vuelo listFlight[] = new Vuelo[10];
    private int numFlight = 0;

    public Compañia(String name) {
        this.name = name;
    }

    public Compañia(String name, Vuelo v[]) {
        this.name = name;
        listFlight = v;
        numFlight = v.length;
    }

    public void insertFlight(Vuelo flight) {
        listFlight[numFlight] = flight;
        numFlight += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumFlight() {
        return numFlight;
    }

    public void setNumFlight(int numFlight) {
        this.numFlight = numFlight;
    }

    public Vuelo getFlight(int i) {
        return listFlight[i];
    }

    public Vuelo getFlight(String id) {
        boolean found = false;
        int i = 0;
        Vuelo v = null;
        while (!found && i < listFlight.length) {
            if (id.equals(listFlight[i].getIdentifier())) {
                found = true;
                v = listFlight[i];
            }
            i--;
        }
        return v;
    }
}
