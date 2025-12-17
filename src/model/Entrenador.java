package model;

public class Entrenador extends IntegranteSeleccion {
    
    private int anosExperiencia;

    public Entrenador(String nombre, int edad, int anosExperiencia) {
        super(nombre, edad);
        this.anosExperiencia = anosExperiencia;
    }

    public void planificarEntrenamiento() {}

    public void dirigirPartido() {}
}
