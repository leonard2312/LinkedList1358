/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.modelo;

/**
 *
 * @author leona
 */
public class Empleado {
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private float sueldoBase;
    private int anioIngreso;
    private int horasExtra;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterno, String materno, float sueldoBase, int anioIngreso, int horasExtra) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
        this.horasExtra = horasExtra;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public int getId() {
        return id;
    }

    public String getMaterno() {
        return materno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public String toString(){
        return "\nEmpleado{" + "\nid=" + id + "\nNombre=" + nombre + "\nApellido Paterno=" + paterno + "\nApellido Materno=" + materno + "\nNombre=" + nombre + "\nS base=" + sueldoBase + "\nAnio=" + anioIngreso + "\nHoras=" + horasExtra;
    }
}
