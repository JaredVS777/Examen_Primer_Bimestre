import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        try {
            ArrayList<Barrio1>miBarrio1= new ArrayList<Barrio1>();
            ArrayList<Barrio2>miBarrio2 = new ArrayList<Barrio2>();
            ArrayList<Ciudad3>miCiudad3 = new ArrayList<Ciudad3>();


            miBarrio1.add(new Barrio1("Ecuador", "Sierra", "Quito","Ferroviaria"));
            miBarrio2.add(new Barrio2("Ecuador", "Costa", "Guayaquil","Samborodon"));
            miCiudad3.add(new Ciudad3("Ecuador","Costa", "Manta"));


            System.out.println("\n\t ---DATOS DEL BARRIO1---");
            System.out.println("Nombre del Barrio: "+ miBarrio1.get(0).getNombre_barrio1());
            System.out.println("Nombre de la ciudad: "+ miBarrio1.get(0).getNombre_ciudad1());
            System.out.println("Ciudad de la region: "+ miBarrio1.get(0).getNombre_region1());
            System.out.println("Nombre del pais: "+ miBarrio1.get(0).getNombre_pais());


            System.out.println("\n\t ---DATOS DEL BARRIO2---");
            System.out.println("Nombre del Barrio: "+ miBarrio2.get(0).getNombre_barrio2());
            System.out.println("Nombre de la ciudad: "+ miBarrio2.get(0).getNombre_ciudad2());
            System.out.println("Ciudad de la region: "+ miBarrio2.get(0).getNombre_region2());
            System.out.println("Nombre del pais: "+ miBarrio2.get(0).getNombre_pais());

            System.out.println("\n\t ---DATOS CIUDAD3---");
            System.out.println("Nombre de la ciudad: "+ miCiudad3.get(0).getNombre_ciudad3());
            System.out.println("Ciudad de la region: "+ miCiudad3.get(0).getNombre_region2());
            System.out.println("Nombre del pais: "+ miCiudad3.get(0).getNombre_region2());


        }catch (Exception ex){
            System.out.println("\n\t\tSe ha producido un error \n");
        }
    }
}
