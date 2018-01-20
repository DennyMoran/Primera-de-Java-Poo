
package miprimerproyectojava;


public class MiPrimerProyectoJava {

    public static void main(String[] args) {
       
        //CREO OBJETOS EN BASE A LA CLASE
        Cliente clien1=new Cliente ();
        Cliente clien2=new Cliente ();
        Cliente clien3=new Cliente ();
        
        clien1.setNombre("Huguito Lora");
        clien1.setDireccion("Los Girasoles #4, santiago");
        clien1.setTelefono("809-654-2524");
        clien1.setEdad(19);
        
        System.out.println(clien1.getNombre());
        System.out.println(clien1.getDireccion());
        System.out.println(clien1.getTelefono());
        System.out.println(clien1.getEdad());
    
        clien2.setNombre("Altagracia Hernandez");
        clien2.setDireccion("Las Carreras Calle Sanchez, santiago");
        clien2.setTelefono("809-654-7894");
        clien2.setEdad(80);
    
        System.out.println(clien2.getNombre());
        System.out.println(clien2.getDireccion());
        System.out.println(clien2.getTelefono());
        System.out.println(clien2.getEdad());
        
        clien3.setNombre("Mercedes Sosa");
        clien3.setDireccion("Villa Nueva #4, Santo Domingo");
        clien3.setTelefono("809-654-2524");
        clien3.setEdad(19);
    
        System.out.println(clien3.getNombre());
        System.out.println(clien3.getDireccion());
        System.out.println(clien3.getTelefono());
        System.out.println(clien3.getEdad());
    }
    
}
