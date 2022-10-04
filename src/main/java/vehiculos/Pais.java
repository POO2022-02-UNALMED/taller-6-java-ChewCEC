import java.util.Hashtable;

public class Pais {
    String nombre;
    static Hashtable <String, Integer> lista_paises = new Hashtable <String, Integer>();

    public Pais (String nombre) {
        this.nombre = nombre;
        if (lista_paises.containsKey(nombre)) {
            lista_paises.put(nombre, lista_paises.get(nombre) + 1);
        } else {
            lista_paises.put(nombre, 1);
        }
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static String paisMasVendedor() {
        int max = 0;
        String pais = "";
        for (String key : lista_paises.keySet()) {
            if (lista_paises.get(key) > max) {
                max = lista_paises.get(key);
                pais = key;
            }
        }
        return pais;
    }

}

