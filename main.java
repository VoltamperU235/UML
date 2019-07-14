class principal
{
public static void main(String[] args) {
    System.out.println("Iniciando protocolos");
    System.out.println("Simulador de mascotas V1.0 beta");
    System.out.println("");


    jefe Dex = new jefe("Dex");
    juguete Ball = new juguete("A");
    perro Doggy = new perro("Doggy",100,Dex,Ball);


    //Aqui colocar las acciones que hara el perro
    
    Doggy.golpe_en_el_hocico();

}
}