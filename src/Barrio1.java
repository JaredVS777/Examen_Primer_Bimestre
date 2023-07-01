public class Barrio1 extends Ciudad1{
    //Atributos
    private String nombre_barrio1;
    //Metodo super
    public Barrio1(){
        super();
    }
    //Constrcutor
    public Barrio1(String nombre_pais, String nombre_region1, String nombre_ciudad1, String nombre_barrio1) {
        super(nombre_pais, nombre_region1, nombre_ciudad1);
        this.nombre_barrio1 = nombre_barrio1;
    }
    //Getters and Setters
    public String getNombre_barrio1() {
        return nombre_barrio1;
    }

    public void setNombre_barrio1(String nombre_barrio1) {
        this.nombre_barrio1 = nombre_barrio1;
    }

    //Metodo
    public void Barrios1(){
        System.out.println("Este es el metodo Barrios1 de clase Barrio1");
    }

}
