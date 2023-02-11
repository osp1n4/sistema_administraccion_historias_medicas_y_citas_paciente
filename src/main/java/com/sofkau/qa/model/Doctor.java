package com.sofkau.qa.model;

public class Doctor {
    private String id_medico;
    private String cc;
    private String nombre;
    private String telefono;
    private String listaPaciente;
    private String horarioDisponible;

    public Doctor() {
    }

    public Doctor(String id_medico, String cc, String nombre, String telefono, String listaPaciente, String horarioDisponible) {
        this.id_medico = id_medico;
        this.cc = cc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.listaPaciente = listaPaciente;
        this.horarioDisponible = horarioDisponible;
    }

    public String id_medico() {
        return id_medico;
    }

    public Doctor setId_medico(String id_medico) {
        this.id_medico = id_medico;
        return this;
    }

    public String cc() {
        return cc;
    }

    public Doctor setCc(String cc) {
        this.cc = cc;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Doctor setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String telefono() {
        return telefono;
    }

    public Doctor setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String listaPaciente() {
        return listaPaciente;
    }

    public Doctor setListaPaciente(String listaPaciente) {
        this.listaPaciente = listaPaciente;
        return this;
    }

    public String horarioDisponible() {
        return horarioDisponible;
    }

    public Doctor setHorarioDisponible(String horarioDisponible) {
        this.horarioDisponible = horarioDisponible;
        return this;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id_medico='" + id_medico + '\'' +
                ", cc='" + cc + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listaPaciente='" + listaPaciente + '\'' +
                ", horarioDisponible='" + horarioDisponible + '\'' +
                '}';
    }
}
