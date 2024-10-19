import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    Run|Debug
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        LinkedList<ObjPizza> Lista = new LinkedList<>();
        ObjPizza obj = new ObjPizza();
        while (continuar){
            int opt = 0;
            System.out.println("Ingrese la opción que desee:"+"\n1: Llenar registro"+"\n2: Mostrar registros"+"\n3: Buscar registro");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                Lista = obj.LlenarRegistro(Lista);
                break;
                case 2:
                    obj.Mostrar(Lista);
                break;
                case 3:
                    ObjPizza objResult = new ObjPizza();
                    String tipo = "";
                    System.out.println("Ingrese el registro que desea buscar");
                    tipo = sc.next();
                    objResult = obj.Buscarregistro(tipo, Lista);


                default
                break
            }
    }
    }
}
