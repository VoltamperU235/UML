/**
 * jugete
 */
public class juguete {

    private int usos = 5;
    private String name = "";

    public juguete(String name_j) {
        name = name_j;
    }

    public boolean jugar() {
        boolean accion;
        if (usos > 0) {
            System.out.println("El juguete esta haciendo 'blop blop' ");
            accion = true;
        }else 
        {
            System.out.println("El juguete no hizo ningun sonido");
            accion = false;
        }
        usos--;
        if(usos<0){usos = 0;}
        return accion;
    }

}