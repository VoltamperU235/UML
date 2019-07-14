//Considere mi umbral positivo para todo x>=50 de lo contrario el perro esta enojado

public class perro {
    // Atributos de la clase Perro
    private String nombre;
    private int animo;
    private String jefe_name;
    private juguete funny;

    // Cambio el constructor predefinido y le solicito nombre
    public perro(String data, int animo_in, jefe jefe_in, juguete fun) {
        nombre = data;
        animo = animo_in;
        jefe_name = jefe_in.getNombre();
        funny = fun;
    }

    // Metodos de la clase Perro

    public void jugar_con_el() {
        System.out.println(nombre + " esta jugando contigo :D");
    }

    public void jugar_solo() {
        boolean remain = funny.jugar();
        if (remain) {
            System.out.println(nombre + " esta jugando con su juguete");
            System.out.println(nombre + ", su animo aumento 10, ahoa tiene: " + animo);
            animo += 10;
            if (animo > 100) {
                animo = 100;
            }
        } else {
            System.out.println(nombre + " no puede jugar");
            System.out.println(nombre + ", su animo no aumento :( , sigue en: " + animo);
        }

    }

    public String getNombre() {
        return (nombre + " " + jefe_name);
    }

    public void galleta() {
        animo += 15;
        if (animo > 100) {
            animo = 100;
        }
        System.out.println(nombre + ", les has dado una galleta");
        System.out.println(nombre + ", su animo aumento 15, ahora tiene: " + animo);

    }

    public void golpe_en_el_hocico() {
        animo -= 25;
        if (animo < 0) {
            animo = 0;
        }
        System.out.println(nombre + ", Le has pegado un madraso en la jeta");
        System.out.println(nombre + ", su animo disminuyo 25, ahora tiene: " + animo);
    }

    public void ladrar(jefe jefe_in) {

        if (jefe_in.getNombre() == jefe_name) {
            if (animo > 50) {
                System.out.println(nombre + " dice: Wof Wof");
            } else {
                System.out.println(nombre + " no quire ladrar, no esta de animo, solamente: " + animo);
            }
        } else {
            System.out.println(jefe_in.getNombre() + ", " + nombre + " te esta atacando por que no eres su jefe");
        }

        System.out.println();
    }

    private void atacar() {
        System.out.println(nombre + " esta atacando");
    }

}