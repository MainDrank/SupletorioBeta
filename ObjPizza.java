

import java.util.LinkedList;
import java.util.Scanner;
public class ObjVehiculo {
    String Marca;
    String Tipo;
    String Color;
    Double Precio;
    
    Scanner sc = new Scanner(System.in);
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public Double getPrecio() {
        return Precio;
    }
    public void setPrecio(Double precio) {
        Precio = precio;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public LinkedList<ObjVehiculo> LlenarRegistro(LinkedList<ObjVehiculo> Lista){
        boolean flag = true;
        int opcion = 0;
        while (flag) {
            ObjVehiculo venta = new ObjVehiculo();
            System.out.println("Ingrese el tipo de vehículo que desea:");
            venta.setTipo(sc.next());
            System.out.println("Ingrese la marca del vehículo:");
            venta.setMarca(sc.next());
            System.out.println("¿De qué color desea su vehículo?:");
            venta.setColor(sc.next());
            System.out.println("Ingrese el precio del vehículo:");
            venta.setPrecio(sc.nextDouble());
            Lista.add(venta);
            System.out.println("¿Desea continuar?"+"\n1: Sí"+"\n2: No");
           
            opcion = sc.nextInt();
            if (opcion == 2 ){
                flag = false;
            }
        }
        return Lista;
    }
    public void Mostrar(LinkedList<ObjVehiculo> Lista){
       
        for (ObjVehiculo venta : Lista){
            System.out.println("El Tipo de vehículo es: " + venta.getTipo() +"\n"+
                               "La marca de su "+ venta.getTipo() +" es: " + venta.getMarca()+"\n"+
                               "El color de su "+ venta.getTipo() +" es: " + venta.getColor()+"\n"+
                               "El precio de su vehículo es:" + venta.getPrecio()+ "\n");
            
        }
    
}

public ObjVehiculo Buscarregistro(String tip, LinkedList<ObjVehiculo> Lista)
{
    ObjVehiculo consulta = new ObjVehiculo();
    for (ObjVehiculo venta : Lista) {
        if(venta.getTipo().equalsIgnoreCase(tip)){
            consulta.setTipo(tip);
            consulta.setMarca(venta.getMarca());
            consulta.setColor(venta.getColor());
            consulta.setPrecio(venta.getPrecio());
        }
    }
    return consulta;
}

        
}
