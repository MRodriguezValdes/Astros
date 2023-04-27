import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public int leerOpcion() {
        return scanner.nextInt();
    }

    public String leerAstro() {
        scanner.nextLine();
        return scanner.nextLine().toLowerCase();
    }

    public ArrayList<Astros> generarListaDeAstros() {
        ArrayList<Astros> sistemaSolar = new ArrayList<>();
        Planetas mercurio = new Planetas("Mercurio", 57910000, 87.969, false, 2439.7, 3.3011e23, 3.7, 440, 58.646);
        Planetas venus = new Planetas("Venus", 108200000, 224.701, false, 6051.8, 4.8675e24, 8.87, 737, -243.025);
        Planetas tierra = new Planetas("Tierra", 149600000, 365.256, true, 6371, 5.97237e24, 9.81, 288, 0.99726968);
        Planetas marte = new Planetas("Marte", 227900000, 686.971, true, 3389.5, 6.4171e23, 3.71, 210, 1.025957);
        Planetas jupiter = new Planetas("Jupiter", 5.20, 11.9, true, 69.91, 1898, 24.8, 165, 0.41);
        Planetas ceres = new Planetas("Ceres", 2.7675, 4.60, false, 0.473, 9.3835e+20, 0.28, 167, 0.378);
        Planetas urano = new Planetas("Urano", 2870990000.0, 30685.0, true, 25559.0, 8.68e25, 8.69, 59.0, -17.2);
        Planetas neptuno = new Planetas("Neptuno", 4504300000.0, 60190.0, true, 24764.0, 1.02e26, 11.0, -200.0, 16.1);
        Planetas pluton = new Planetas("Plutón", 5906380000.0, 90720.0, true, 1188.3, 1.31e22, 0.62, -229.0, -6.4);
        Planetas saturno = new Planetas("Saturno", 1.4335E9, 10759.22, true, 60268, 5.6834E26, 10.44, -178, 0.445);

        Satelites luna = new Satelites("Luna", 384400, 27.321, tierra, 1737.1, 7.342e22, 1.62, 220, 27.321);
        Satelites deimos = new Satelites("Deimos", 23460, 1.263, marte, 6.2, 1.8e15, 0.003, 230, 1.263);
        Satelites phobos = new Satelites("Phobos", 9376, 0.3189, marte, 11.2667, 1.072e16, 0.0057, 230, 0.3189);
        Satelites io = new Satelites("Io", 421, 1.77, jupiter, 3643.2, 8.93e+22, 1.796, 110, 0.004);
        Satelites europa = new Satelites("Europa", 670900.0, 3.551, jupiter, 1560.8, 4.8e22, 1.31, -160.0, 3.6);
        Satelites ganymede = new Satelites("Ganímedes", 1070400.0, 7.154, jupiter, 2634.1, 1.5e23, 1.42, -160.0, 7.2);
        Satelites callisto = new Satelites("Calisto", 1882700.0, 16.689, jupiter, 2410.3, 1.1e23, 1.23, -140.0, 16.7);
        Satelites titan = new Satelites("Titán", 1221870.0, 15.945, saturno, 5149.5, 1.35e23, 1.35, -179.5, 15.9);
        Satelites iapetus = new Satelites("Iapetus", 3560820.0, 79.321, saturno, 1468.0, 1.8e21, 0.223, -143.0, 79.3);
        Satelites triton = new Satelites("Tritón", 354759.0, -5.876, neptuno, 1353.4, 2.1e22, 0.78, -235.0, -5.9);
        Satelites mimas = new Satelites("Mimas", 185539, 0.942422, saturno, 198.2, 3.75E19, 0.063, -173, 0.942422);
        Satelites encelado = new Satelites("Encélado", 238042, 1.370218, saturno, 252.1, 1.08E20, 0.113, -198, 1.370218);
        Satelites tetis = new Satelites("Tetis", 294619, 1.888086, saturno, 533, 6.18E20, 0.145, -187, 1.888086);
        Satelites dione = new Satelites("Dione", 377396, 2.737423, saturno, 561.7, 1.095E21, 0.232, -181, 2.737423);
        Satelites rea = new Satelites("Rea", 527108, 4.518212, saturno, 764.3, 2.316E21, 0.264, -209, 4.518212);
        Satelites hiperion = new Satelites("Hipérion", 1481010, 21.27661, saturno, 270.6, 5.62E18, 0.035, -220, 21.27661);


        tierra.setListaSatelites(luna);
        marte.setListaSatelites(deimos);
        marte.setListaSatelites(phobos);
        neptuno.setListaSatelites(triton);
        jupiter.setListaSatelites(europa);
        jupiter.setListaSatelites(ganymede);
        jupiter.setListaSatelites(callisto);
        jupiter.setListaSatelites(io);
        saturno.setListaSatelites(titan);
        saturno.setListaSatelites(mimas);
        saturno.setListaSatelites(encelado);
        saturno.setListaSatelites(tetis);
        saturno.setListaSatelites(dione);
        saturno.setListaSatelites(rea);
        saturno.setListaSatelites(hiperion);
        saturno.setListaSatelites(iapetus);

        sistemaSolar.add(tierra);
        sistemaSolar.add(mercurio);
        sistemaSolar.add(venus);
        sistemaSolar.add(marte);
        sistemaSolar.add(jupiter);
        sistemaSolar.add(ceres);
        sistemaSolar.add(urano);
        sistemaSolar.add(neptuno);
        sistemaSolar.add(pluton);
        sistemaSolar.add(luna);
        sistemaSolar.add(deimos);
        sistemaSolar.add(phobos);
        sistemaSolar.add(triton);
        sistemaSolar.add(europa);
        sistemaSolar.add(ganymede);
        sistemaSolar.add(callisto);
        sistemaSolar.add(io);
        sistemaSolar.add(titan);
        sistemaSolar.add(mimas);
        sistemaSolar.add(encelado);
        sistemaSolar.add(tetis);
        sistemaSolar.add(dione);
        sistemaSolar.add(rea);
        sistemaSolar.add(hiperion);
        sistemaSolar.add(iapetus);


        return sistemaSolar;
    }

    public Satelites seleccionarSatelite(ArrayList<Astros> sistemaSolar, String nombre) {
        for (Astros astro : sistemaSolar
        ) {
            if (Objects.equals(astro.getName().toLowerCase(), nombre) && astro instanceof Satelites) {
                return (Satelites) astro;
            }
        }
        return new Satelites();
    }

    public Planetas seleccionarPlaneta(ArrayList<Astros> sistemaSolar, String nombre) {
        for (Astros astro : sistemaSolar
        ) {
            if (Objects.equals(astro.getName().toLowerCase(), nombre) && astro instanceof Planetas) {
                return (Planetas) astro;
            }
        }
        return new Planetas();
    }



    public Astros menuSelecionDeAstro() {
        boolean solicitarAstro = true;
        String name = "";
        while (solicitarAstro) {
            System.out.println("Desea consultar:\n1.Un satelite \n2.Un planeta");
            switch (leerOpcion()) {
                case 1 -> {
                    solicitarAstro = false;
                    System.out.println("Ingrese el nombre del astro que desea consultar:");
                    name = leerAstro();
                    return  seleccionarSatelite(generarListaDeAstros(), name);

                }
                case 2 -> {
                    solicitarAstro = false;
                    System.out.println("Ingrese el nombre del astro que desea consultar:");
                    name = leerAstro();
                    return  seleccionarPlaneta(generarListaDeAstros(), name);
                }
                default -> System.out.println("No es una opcion correcta");
            }
        }
        return null;
    }

    public void menu() {
        System.out.println("Elige una opcion:");
        System.out.println("1.Mostrar toda la informacion del astro");
        System.out.println("2.Mostrar el nombre del astro");
        System.out.println("3.Mostrar gravedad");
        System.out.println("4.Masa");
        System.out.println("5.Temperatura media");
        System.out.println("6.Salir");
    }


    public void iniciarPrograma() {
        Astros astros= menuSelecionDeAstro();;
        int opcion = 1;
        boolean salir = false;
        while (!salir) {
            System.out.println("-----------------");
            menu();
            opcion = leerOpcion();
            switch (opcion) {
                case 1 -> astros.muestra();
                case 2 -> System.out.println(astros.getName());
                case 3-> System.out.println(astros.getGravedad());
                case 4 -> System.out.println(astros.getMasa());
                case 5 -> System.out.println(astros.getTemperaturaMedia());
                case 6 -> salir = true;
                default -> System.out.println("No es una opcion correcta");
            }


        }
    }


    public static void main(String[] args) {
        Main start = new Main();
        start.iniciarPrograma();
    }
}
