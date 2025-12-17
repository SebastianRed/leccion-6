package model;

public class Masajista extends IntegranteSeleccion {

    private String especialidad;

    public Masajista(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void darMasaje() {
        System.out.println("El masajista " + this.getNombre() + " está dando un masaje de " + this.especialidad);
    }

    public void atenderLesion() {
        System.out.println("El masajista " + this.getNombre() + " está atendiendo una lesión.");
    };

}