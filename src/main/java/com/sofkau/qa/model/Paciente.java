package com.sofkau.qa.model;

public class Paciente {
    private  String id_paciente;
    private String cc;
    private String nombre;
    private String telefono;
    private String fechaNacimiento;
    private String historiaMedica;

    public Paciente() {
    }

    public Paciente(String id_paciente, String cc, String nombre, String telefono, String fechaNacimiento, String historiaMedica) {
        this.id_paciente = id_paciente;
        this.cc = cc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.historiaMedica = historiaMedica;
    }

    public String id_paciente() {
        return id_paciente;
    }

    public Paciente setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
        return this;
    }

    public String cc() {
        return cc;
    }

    public Paciente setCc(String cc) {
        this.cc = cc;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Paciente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String telefono() {
        return telefono;
    }

    public Paciente setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String fechaNacimiento() {
        return fechaNacimiento;
    }

    public Paciente setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public String historiaMedica() {
        return historiaMedica;
    }

    public Paciente setHistoriaMedica(String historiaMedica) {
        this.historiaMedica = historiaMedica;
        return this;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id_paciente='" + id_paciente + '\'' +
                ", cc='" + cc + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", historiaMedica='" + historiaMedica + '\'' +
                '}';
    }
}
