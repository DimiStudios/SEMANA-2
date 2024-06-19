import java.util.Scanner;

public class Lista {
    private Nodo primero;
    Nodo ultimo;

    public Lista() {
        primero = null;
    }

    private int leerEntero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un entero válido: ");
        int valor = sc.nextInt();
        return valor;
    }

    public Lista crearLista() {
        int x;
        primero = null;
        primero = new Nodo(leerEntero(), primero);
        ultimo = primero;
        do {
            x = leerEntero();
            if (x != -1)
                primero = new Nodo(x, primero);
        } while (x != -1);
        return this;

    }

    public void verLista() {
        Nodo aux = primero;
        while (aux != null) {
            System.out.print(aux.dato + " - ");
            aux = aux.sgte;
        }
    }

    // operaciones de insersión

    public Lista insertaXCabeza(int entrada) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.sgte = primero;
        primero = nuevo;
        return this;
    }

    public Lista insertaXCola(int entrada) {
        ultimo.sgte = new Nodo(entrada);
        ultimo = ultimo.sgte;
        return this;
    }

    public Nodo buscarNodo(int valor) {
        Nodo n, buscado = null;
        n = primero;
        while (n != null) {
            if (n.dato == valor)
                buscado = n;
            n = n.sgte;
        }
        return buscado;
    }

    public Lista insertaDespues(int testigo, int entrada) {
        Nodo nuevo, anterior;
        anterior = buscarNodo(testigo);
        if (anterior != null) {
            nuevo = new Nodo(entrada);
            nuevo.sgte = anterior.sgte;
            anterior.sgte = nuevo;
        }
        return this;
    }

    public Nodo buscarNodoAnterior(int valor) {
        Nodo n, anterior = null;
        n = primero;
        while (n != null) {
            if (n.dato == valor) {
                return anterior;
            }
            anterior = n;
            n = n.sgte;
        }
        return null;
    }

    public Lista insertarAntes(int loco, int entrada) {
        Nodo nuevo = new Nodo(entrada);
        Nodo nodoLoco = buscarNodo(loco);

        if (nodoLoco == null) {
            nuevo.sgte = primero;
            primero = nuevo;
        } else {
            nuevo.sgte = nodoLoco;
            if (nodoLoco == primero) {
                primero = nuevo;
            } else {
                Nodo anterior = buscarNodoAnterior(loco);
                anterior.sgte = nuevo;
            }
        }
        return this;
    }

    public Lista borrarNodo(int x) {
        Nodo nodo = buscarNodo(x);
        if (nodo != null) {
            Nodo anterior = buscarNodoAnterior(x);
            if (anterior == null) {
                primero = nodo.sgte;
            } else {
                anterior.sgte = nodo.sgte;
            }
        }
        return this;
    }
}