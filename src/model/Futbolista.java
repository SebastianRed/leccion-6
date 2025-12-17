package model;

public class Futbolista extends IntegranteSeleccion {
    
    private String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        super(nombre, edad);
        this.posicion = posicion;
    }

    public void entrenar() {}
    
    public void jugarPartido() {}

    public void descansar() {}
    
}