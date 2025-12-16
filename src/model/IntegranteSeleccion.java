package model;

public abstract class IntegranteSeleccion {
    
    private String nombre;
    private int edad;

    public IntegranteSeleccion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void concentrarse() {}

    public void viajar() {}

} 