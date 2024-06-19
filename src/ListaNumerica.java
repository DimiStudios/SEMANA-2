import java.util.Scanner;

public class ListaNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista listita = new Lista();

        listita.crearLista();
        listita.verLista();

        System.out.println("\n\nAgregar al inicio de la lista...");
        int ini = sc.nextInt();
        listita.insertaXCabeza(ini);
        listita.verLista();

        System.out.println("\n\n Agregar al final de la lista...");
        int fin = sc.nextInt();
        listita.insertaXCola(fin);
        listita.verLista();

        System.out.println("\n\nINGRESAR ELEMENTO DESPUÉS");
        System.out.println("Ingrese el elemento: ");
        int nuevo = sc.nextInt();
        System.out.println("Después de qué elemento ingresar: ");
        int testigo = sc.nextInt();
        listita.insertaDespues(testigo, nuevo);
        listita.verLista();

        System.out.println("\n\nINGRESAR ELEMENTO ANTES");
        System.out.println("Ingrese el elemento: ");
        int ele = sc.nextInt();
        System.out.println("Antes de qué elemento ingresar: ");
        int loco = sc.nextInt();
        listita.insertarAntes(loco, ele);
        listita.verLista();

        System.out.println("\n\nELIMINAR ELEMENTO");
        System.out.println("Ingrese el elemento a eliminar: ");
        int eliminar = sc.nextInt();
        listita.borrarNodo(eliminar);
        listita.verLista();
    }
}