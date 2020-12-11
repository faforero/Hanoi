package parcialfabianforero;

/**
 *
 * @author estudiante
 */
public class Nodocola {

    String info;
    Nodocola sig;
    Nodocola ant;

    public Nodocola(String info) {
        this.info = info;
        sig = ant = null;
    }
}
