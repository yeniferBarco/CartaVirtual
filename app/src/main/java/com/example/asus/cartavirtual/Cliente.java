package com.example.asus.cartavirtual;

public class Cliente {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;

    public Cliente(){}

    public Cliente(String nombre, String apellido, String correo, String contrasena){
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.contrasena=contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo){
        this.correo=correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena){
        this.contrasena=contrasena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + nombre + "\n" + "Apellido: " + apellido +  "\n" + "Correo:" + correo +  "\n" + "Contraseña:" + contrasena);
        return sb.toString();
    }
}

