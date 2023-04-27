import javax.swing.*;

public abstract class Astros {
//    Atributos
    private double radioEcuatorial;
    private double rotacionSobreSuEje;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;
    private  String name;

//    Constructor
    public Astros (){
        this.name = "";
        this.radioEcuatorial = 0;
        this.rotacionSobreSuEje = 0;
        this.masa = 0;
        this.temperaturaMedia = 0;
        this.gravedad = 0;
    }

    public Astros(String name, double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad) {
        this.setName(name);
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreSuEje = rotacionSobreSuEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

//    Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public double getRotacionSobreSuEje() {
        return rotacionSobreSuEje;
    }

    public void setRotacionSobreSuEje(double rotacionSobreSuEje) {
        this.rotacionSobreSuEje = rotacionSobreSuEje;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

//    To String
    @Override
    public String toString() {
        return "Soy un astro";
    }

//    Metodos
    public void muestra() {
        System.out.println("El radio ecuatorial es de: " + this.radioEcuatorial + "\nLa rotacion sobre su eje es de: "
                + this.rotacionSobreSuEje + "\nSu masa es de: " + this.masa + "\nLa temperatura es de: " + this.temperaturaMedia +
                "\nSu gravedad es de:  " + this.gravedad);
    }


}
