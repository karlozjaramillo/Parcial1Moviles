package com.cj.parcial1moviles;

public class Producto {

    String nombre;
    int codigo;
    int valor;
    String descripcion;
    String categoria;
    boolean iva;

    public Producto(String nombre, int codigo, int valor, String descripcion, String categoria, boolean iva) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.valor = valor;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return nombre + "\n" +
                "Código: "+codigo + "\n" +
                "Valor: $" + valor + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Categoría: " + categoria + "\n" +
                "IVA=" + iva;
    }
}
