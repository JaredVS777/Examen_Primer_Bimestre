public class Barrio2 extends Ciudad2{
    //Atributos
    private String nombre_barrio2;
    //Metodo super
    public Barrio2(){
        super();
    }
    //Constrcutor
    public Barrio2(String nombre_pais, String nombre_region2, String nombre_ciudad2, String nombre_barrio2) {
        super(nombre_pais, nombre_region2, nombre_ciudad2);
        this.nombre_barrio2 = nombre_barrio2;
    }
    //Getters and Setters

    public String getNombre_barrio2() {
        return nombre_barrio2;
    }

    public void setNombre_barrio2(String nombre_barrio2) {
        this.nombre_barrio2 = nombre_barrio2;
    }
    //Metodos
    public void Barrios2(){
        System.out.println("Este es el metodo Barrios2 de clase Barrio2");
    }
}
