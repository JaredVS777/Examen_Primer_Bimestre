public class Region1 extends Pais{
    //Atributos
    private String nombre_region1;
    //Metodo super
    public Region1(){
        super();
    }

    //Constructor
    public Region1(String nombre_pais, String nombre_region1) {
        super(nombre_pais);
        this.nombre_region1 = nombre_region1;
    }

    //Getters and Setters

    public String getNombre_region1() {
        return nombre_region1;
    }

    public void setNombre_region1(String nombre_region1) {
        this.nombre_region1 = nombre_region1;
    }

    public void Regiones1(){
        System.out.println("Este es el metodo Regiones1 de clase Region1");
    }
}
