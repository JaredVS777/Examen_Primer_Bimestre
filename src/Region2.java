public class Region2 extends Pais {
    //Atributos
    private String nombre_region2;
    //Metodo super
    public Region2(){
        super();
    }
    //Constructor
    public Region2(String nombre_pais, String nombre_region2) {
        super(nombre_pais);
        this.nombre_region2 = nombre_region2;
    }

    //Getters and Setters

    public String getNombre_region2() {
        return nombre_region2;
    }

    public void setNombre_region2(String nombre_region2) {
        this.nombre_region2 = nombre_region2;
    }

    //Metodos
    public void Regiones2(){
        System.out.println("Este es el metodo Regiones2 de clase Region2");
    }
}
