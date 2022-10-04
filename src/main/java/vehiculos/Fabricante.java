import java.util.Hashtable;

public class Fabricante {
    static Hashtable <String, Integer> lista_fabricantes = new Hashtable <String, Integer>();
    String nombre;
    Pais pais;

    public Fabricante (String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public static String fabricaMayorVenstas() {
        int max = 0;
        String fabricante = "";
        for (String key : lista_fabricantes.keySet()) {
            if (lista_fabricantes.get(key) > max) {
                max = lista_fabricantes.get(key);
                fabricante = key;
            }
        }
        return fabricante;
    }


}
