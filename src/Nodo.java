import java.util.Scanner;

public class Nodo {
    // atributos
    int dato;
    Nodo sgte;

    // constructor
    public Nodo(int x) {
        dato = x;
        sgte = null;
    }

    public Nodo(int x, Nodo n) {
        dato = x;
        sgte = n;
    }

    // getter and setter
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
}