public class Satelites extends Astros {
    //  Atributos
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private Planetas planetaAlQuePertenece;


    //  Constructor
    public Satelites (){
        super();
        this.orbitaPlanetaria=0;
        this.distanciaAlPlaneta=0;
        this.planetaAlQuePertenece=null;

    }
    public Satelites(String nombre, double distanciaAlPlaneta, double orbitaPlanetaria, Planetas planetaAlQuePertenece, double radioEcuatorial, double masa, double gravedad, double temperaturaMedia, double rotacionSobreSuEje) {
        super(nombre,radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad);
        this.setDistanciaAlPlaneta(distanciaAlPlaneta);
        this.setOrbitaPlanetaria(orbitaPlanetaria);
        this.setPlanetaAlQuePertenece(planetaAlQuePertenece);
    }

    //   Getters y Setters
    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planetas getPlanetaAlQuePertenece() {
        return planetaAlQuePertenece;
    }

    public void setPlanetaAlQuePertenece(Planetas planetaAlQuePertenece) {
        this.planetaAlQuePertenece = planetaAlQuePertenece;
    }

    //  Metodos
    @Override
    public void muestra() {
        System.out.println("Info del Satelite ( "+this.getName() +")");
        System.out.println("------------------");
        super.muestra();
        System.out.println("Tiene una distancia con respecto a " + this.planetaAlQuePertenece.getName() +
                            " de: " + this.distanciaAlPlaneta +
                            "\nSu orbita planetaria es: " + this.orbitaPlanetaria);
        System.out.println("------------------");
    }
}
