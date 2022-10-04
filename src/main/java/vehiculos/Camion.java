import java.util.ArrayList;

public class Camion extends Vehiculo {
    private int ejes;
    static int totalCamiones;
    ArrayList<Camion> camiones = new ArrayList<Camion>();

    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,
            Fabricante fabricante, int ejes) {
        super(placa, 2, 100, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        camiones.add(this);
        totalCamiones++;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }




}
