public class Ciudad2 extends Region2 {
    //Atributos
    private String nombre_ciudad2;

    //Metodo super
    public Ciudad2(){
        super();
    }

    //Constructor
    public Ciudad2(String nombre_pais, String nombre_region2, String nombre_ciudad2) {
        super(nombre_pais, nombre_region2);
        this.nombre_ciudad2 = nombre_ciudad2;
    }

    //Getters and Setters
    public String getNombre_ciudad2() {
        return nombre_ciudad2;
    }

    public void setNombre_ciudad2(String nombre_ciudad2) {
        this.nombre_ciudad2 = nombre_ciudad2;
    }

    //Metodos
    public void Ciudades2(){
        System.out.println("Este es el metodo Ciudades2 de clase Region2");
    }
}
