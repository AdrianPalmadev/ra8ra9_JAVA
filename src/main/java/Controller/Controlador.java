package Controller;

//------------------------------------------------
// NETBEANS
import DAO_Controller.DAOSQL;
import static DAO_Controller.DAOSQL.*;
// PROYECTO
import Model.*;
import Excepcion.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para controlar HashSet
 *
 * @author Usuario
 */
public class Controlador {

    /**
     * Funcion para crear planetas
     *
     * @param p De entrada tiene un objeto tipo Planeta p
     * @throws PlanetaExcepcion Si hay un error lo lanza
     */
    public static void createplaneta(Planeta p) throws PlanetaExcepcion {

        DAOSQL daoPla = new DAOSQL();

        int registeredPlanets;
        try {
            registeredPlanets = daoPla.insertpla(p);

        } catch (DAO_Excep ex) {
            throw new PlanetaExcepcion(p.getName() + " has been registered.");
        }

    }

    public static Ser getSer(Ser s) throws DAO_Excep {
        DAOSQL d = new DAOSQL();

        for (Ser sp : d.obtainSeres()) {
            if (sp.equals(s)) {
                return sp;
            }
        }
        return null;
    }

    public static boolean getCiudadano() throws DAO_Excep {
        DAOSQL d = new DAOSQL();
        for (Ser ser : d.obtainSeres()) {
            if (ser instanceof Ser) {
                return true;
            }
        }
        return false;
    }

    public static Object noRepeatNombreSer(Ser s) throws DAO_Excep {
        DAOSQL d = new DAOSQL();

        for (Ser w : d.obtainSeres()) {
            if (s.getName().equals(w.getName())) {
                return w;
            }
        }
        return null;
    }

    public static void getValidPlanet(Ser s, Planeta p) throws SerExcepcion, DAO_Excep {
        DAOSQL d = new DAOSQL();

        ArrayList<Ser> as = new ArrayList<Ser>();

        for (Ser s1 : d.obtainSeres()) {
            if (s1.getPlanet().equals(p)) {
                as.add(s1);
            }
        }
        if (as.size() < p.getPopulationMax()) {
            if (noRepeatNombreSer(s) == null) {
//                Si s es Specie Andoriano
                if (s instanceof Vulcaniano) {
                    for (Ser existente : as) {
                        //coincide en el mismo lugar que un vulcaniano
                        if (existente instanceof Andoriano) {
                            throw new SerExcepcion(" En el " + p.getName() + " existe un Andoriano");
                        }
                    }
//        Si s es tipo Andoriano
                } else if (s instanceof Andoriano) {
                    for (Ser existente : as) {
                        //coincide en el mismo lugar que un vulcaniano
                        if (existente instanceof Vulcaniano) {
                            throw new SerExcepcion(" En el " + p.getName() + " existe un Vulcaniano");
                        }
                    }
//            Si es tipo klingon
                } else if (s instanceof Klingon) {
//            Si el clima es de tipo Calido
                    if (p.getClime().equalsIgnoreCase("Calido")) {
                        throw new SerExcepcion("No puede vivir en este planeta porque es de clima " + p.getClime() + ".");
                    }
//            Si s es tipo Nibirianos
                } else if (s instanceof Nibiriano) {
                    Nibiriano n = (Nibiriano) s;
                    // Si es vegetariano, necesita flora roja
                    if (n.esVegetariano() && !p.isFlora()) {
                        throw new SerExcepcion("No puede vivir en este planeta porque es no tiene flora.");
                        // Si es carnivoro, necesita fauna marina
                    } else if (n.esCarnivoro() && !p.isAquatic()) {
                        throw new SerExcepcion("No puede vivir en este planeta porque es no tiene fauna marina.");
                    }
//            Si s es tipo Ferengi
                } else if (s instanceof Ferengi) {
//            Si el clima es tipo Frio
                    if (p.getClime().contains("Frio")) {
                        System.out.println(s.toString());
                        throw new SerExcepcion("No puede vivir en este planeta porque es de clima " + p.getClime() + ".");
                    }
                }
            } else {
                throw new SerExcepcion("El nombre:  " + s.getName() + " ya esta en uso.");
            }
        } else {
            throw new SerExcepcion("[!] El planeta " + p.getName() + "a llegado a su capacidad máxima .");
        }
    }

    public static Planeta getPlanetaSer(Ser s) throws DAO_Excep {
        DAOSQL d = new DAOSQL();
        for (Planeta p : d.obtainPlanets()) {
            for (Ser sp : d.obtainSeres()) {
                if (sp.equals(s)) {
                    return p;
                }
            }
        }
        return null;
    }

    public static Planeta getPlanet(Planeta p) throws DAO_Excep {
        DAOSQL d = new DAOSQL();
        if (d.obtainPlanets().contains(p)) {
            for (Planeta ps : d.obtainPlanets()) {
                if (ps.equals(p)) {
                    return ps;
                }
            }
        }
        return null;
    }

    public static void createser(Ser o, Planeta p) throws SerExcepcion, DAO_Excep {
        DAOSQL d = new DAOSQL();
        getValidPlanet(o, p);
        switch (o) {
            case Andoriano a ->
                d.insertand(a, p);
            case Ferengi a ->
                d.insertfer(a, p);
            case Humano a ->
                d.inserthum(a, p);
            case Klingon a ->
                d.insertkli(a, p);
            case Nibiriano a ->
                d.insertnib(a, p);
            case Vulcaniano a ->
                d.insertvul(a, p);
            default -> {
            }
        }
    }

}
