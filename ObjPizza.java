import java.util.LinkedList;
import java.util.Scanner;
public class ObjPizza {
    
    String TipoPizza;
    String Tamaño;
    Double Precio;
    int cantidadPorciones;
    Scanner sc = new Scanner(System.in);
    public String getTipoPizza() {
        return TipoPizza;
    }
    public void setTipoPizza(String tipoPizza) {
        TipoPizza = tipoPizza;
    }
    public String getTamaño() {
        return Tamaño;
    }
    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }
    public Double getPrecio() {
        return Precio;
    }
    public void setPrecio(Double precio) {
        Precio = precio;
    }
    public int getCantidadPorciones() {
        return cantidadPorciones;
    }
    public void setCantidadPorciones(int cantidadPorciones) {
        this.cantidadPorciones = cantidadPorciones;
    }
    public LinkedList<ObjPizza> LlenarRegistro(LinkedList<ObjPizza> Lista){
        boolean continuar = true;
        int opt = 0;
        while (continuar) {
            ObjPizza obj = new ObjPizza();
            System.out.println("Ingrese el tipo de pizza");
            obj.setTipoPizza(sc.next());
            System.out.println("Ingrese el tamaño");
            obj.setTamaño(sc.next());
            System.out.println("Ingrese el precio");
            obj.setPrecio(sc.nextDouble());
            System.out.println("Ingrese las porciones");
            obj.setCantidadPorciones(sc.nextInt());
            Lista.add(obj);
            System.out.println("¿Desea continuar?"+"\n1: Sí"+"\n2: No");
            while (!sc.hasNextInt()){
                System.out.println("Por favor ingrese un número");
                sc.next();
            }
            opt = sc.nextInt();
            if (opt ==2 ){
                continuar = false;
            }
        }
        return Lista;
    }
    public void Mostrar(LinkedList<ObjPizza> Lista){
       
        for (ObjPizza obj : Lista){
            System.out.println("El Tipo de pizza es: " + obj.getTipoPizza()+"\n"+
                               "El Tamaño es: " + obj.getTamaño()+"\n"+
                               "El Precio: " + obj.getPrecio()+"\n"+
                               "La cantidad de porciones es:" + obj.getCantidadPorciones());
            
        }
    
}

public ObjPizza Buscarregistro(String nombre, LinkedList<ObjPizza> Lista)
{
    ObjPizza objResult = new ObjPizza();
    for (ObjPizza obj : Lista) {
        if(obj.getTipoPizza().equalsIgnoreCase(nombre)){
            objResult.setTipoPizza(nombre);
            objResult.setTamaño(obj.getTamaño());
            objResult.setPrecio(obj.getPrecio());
            objResult.setCantidadPorciones(obj.getCantidadPorciones());
        }
    }
    return objResult;
}
public int LLenarPorciones(){
    
    System.out.println("Seleccione el tamaño"+"\n"+"\n1: Personal"+"\n2: Mediana"+"\n3: Grande"+"\n4: Familiar");
    int sele = sc.nextInt();
    switch (sele){
        case 1:
            setCantidadPorciones(4);
        break;
    }

}
        
}
