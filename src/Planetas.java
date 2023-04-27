import java.util.ArrayList;

public class Planetas extends Astros {
    //    Atributos
    private double distanciaAlSol;
    private double orbitaAlSol;
    private boolean tieneSatelites = false;
    private ArrayList<Satelites> listaSatelites;

    // Constructor
    public Planetas() {
        super();
        this.distanciaAlSol = 0;
        this.orbitaAlSol = 0;
        this.tieneSatelites = false;
        this.listaSatelites = new ArrayList<>();
    }

    public Planetas(String nombre, double distanciaAlSol, double orbitaAlSol, boolean tieneSatelites, double radioEcuatorial, double masa, double gravedad, double temperaturaMedia, double rotacionSobreSuEje) {
        super(nombre,radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad);
        this.setDistanciaAlSol(distanciaAlSol);
        this.setOrbitaAlSol(orbitaAlSol);
        this.setTieneSatelites(tieneSatelites);
        this.listaSatelites = new ArrayList<>();
    }

    //    Getters y Setters
    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public double getOrbitaAlSol() {
        return orbitaAlSol;
    }

    public void setOrbitaAlSol(double orbitaAlSol) {
        this.orbitaAlSol = orbitaAlSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public ArrayList<Satelites> getListaSatelites() {
        return listaSatelites;
    }

    public void setListaSatelites(Satelites sat) {
        this.listaSatelites.add(sat);
        this.setTieneSatelites(true);
    }

    //    Metodos
    @Override
    public void muestra() {
        System.out.println("Planeta " + this.getName() + ":");
        System.out.println("-----------------");
        super.muestra();
        System.out.println("Tiene una distancia con respecto al sol de: " + this.distanciaAlSol +
                            "\nSu orbita al sol es: " + this.orbitaAlSol);
        System.out.println("-----------------");
        if (this.tieneSatelites) {
            System.out.println("Tiene satelites");
        } else {
            System.out.println("No tiene satelites");
        }
        System.out.println("-----------------");

        System.out.println("--------Lista de Satelites---------");
        if (listaSatelites.size() != 0) {
            for (Satelites sat : listaSatelites
            ) {
                sat.muestra();
            }
        } else {
            System.out.println("No tiene satelites.");
        }
    }

}
