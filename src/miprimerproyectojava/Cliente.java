
package miprimerproyectojava;

/**
 * @author 00140291
 */
public class Cliente {
    /* Estos son los atrtibutos de la clase cliente*/
   
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;
    
    /* Estops son los metodos dentro de la cliente cliente*/
    /* metodo set nos permite asignar datos a los atributos y 
    el metodo get nos permite presentar los datos de los atributos*/
    
   
    /* METODOS SET............*/
    
    public void setNombre(String nombre){
        this.nombre=nombre; 
    }
    
     public void setDireccion(String direccion){
        this.direccion=direccion; 
     }
     
      public void setTelefono(String telefono){
        this.telefono=telefono;
      }
      
        public void setEdad(int edad){
        this.edad=edad;
      } 
        
      /* METODOS GET ...................*/
        
        public String getNombre (){
          return nombre;
      }
      
      public String getDireccion (){
          return direccion;
      }
      
       public String getTelefono (){
          return telefono;
      }
       
       public int getEdad (){
          return edad;
      }
}
