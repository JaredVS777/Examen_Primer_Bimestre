public class Ciudad3 extends Region2{
    //Atributos
    private String nombre_ciudad3;

    //Metodo super
    public Ciudad3(){
        super();
    }

    //Constructor
    public Ciudad3(String nombre_pais, String nombre_region2, String nombre_ciudad3) {
        super(nombre_pais, nombre_region2);
        this.nombre_ciudad3 = nombre_ciudad3;
    }

    //Getters and Seters
    public String getNombre_ciudad3() {
        return nombre_ciudad3;
    }

    public void setNombre_ciudad3(String nombre_ciudad3) {
        this.nombre_ciudad3 = nombre_ciudad3;
    }

    //Metodos
    public void Ciudades3(){
        System.out.println("Este es el metodo Ciudades3 de clase Region2");
    }
}
