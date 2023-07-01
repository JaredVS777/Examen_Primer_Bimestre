public class Ciudad1 extends Region1{
    //Atributos
    private String nombre_ciudad1;
    //Metodo super
    public Ciudad1(){
        super();
    }
    //Constrcutor
    public Ciudad1(String nombre_pais, String nombre_region1, String nombre_ciudad1) {
        super(nombre_pais, nombre_region1);
        this.nombre_ciudad1 = nombre_ciudad1;
    }

    //Getters and Setters
    public String getNombre_ciudad1() {
        return nombre_ciudad1;
    }
    public void setNombre_ciudad1(String nombre_ciudad1) {
        this.nombre_ciudad1 = nombre_ciudad1;
    }

    //Metodos
    public void Ciudades1(){
        System.out.println("Este es el metodo Ciudades1 de clase Region1");
    }
}
