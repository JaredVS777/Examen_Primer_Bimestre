public class Pais {
    //Atributos
    private String nombre_pais;
    //Metodo Super
    public Pais (){

    }

    //Constructor
    public Pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    //Getters and Setters


    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    //Metodos
    public void Paises(){
        System.out.println("Este es el metodo Paises de clase Pais");
    }

}
