

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        LinkedList<ObjVehiculo> Lista = new LinkedList<>();
        ObjVehiculo venta = new ObjVehiculo();
        while (flag){
            int opcion = 0;
            System.out.println("Ingrese la opción que desee:"+"\n1: Facturar una venta."+"\n2: Mostrar ventas"+"\n3: Buscar venta específica.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                Lista = venta.LlenarRegistro(Lista);
                break;
                case 2:
                    venta.Mostrar(Lista);
                break;
                case 3:
                    ObjVehiculo consulta = new ObjVehiculo();
                    String tip = "";
                    System.out.println("Ingrese el registro que desea buscar");
                    tip = sc.next();
                    consulta = consulta.Buscarregistro(tip, Lista);
                    System.out.println("El Tipo de vehículo es: " + consulta.getTipo() +"\n"+
                                       "La marca de su "+ consulta.getTipo() +" es: " + consulta.getMarca()+"\n"+
                                       "El color de su "+ consulta.getTipo() +" es: " + consulta.getColor()+"\n"+
                                       "El precio de su vehículo es:" + consulta.getPrecio()+ "\n");
                default:
                break;
            }
    }
    }
}

    


