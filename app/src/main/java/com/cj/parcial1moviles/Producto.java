package com.cj.parcial1moviles;

import android.os.Parcel;
import android.os.Parcelable;

public class Producto implements Parcelable {

    String nombre;
    int codigo;
    int valor;
    String descripcion;
    String categoria;
    String iva;

    public Producto(String nombre, int codigo, int valor, String descripcion, String categoria, String iva) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.valor = valor;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.iva = iva;
    }

    protected Producto(Parcel in) {
        nombre = in.readString();
        codigo = in.readInt();
        valor = in.readInt();
        descripcion = in.readString();
        categoria = in.readString();
        iva = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(codigo);
        dest.writeInt(valor);
        dest.writeString(descripcion);
        dest.writeString(categoria);
        dest.writeString(iva);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Producto> CREATOR = new Creator<Producto>() {
        @Override
        public Producto createFromParcel(Parcel in) {
            return new Producto(in);
        }

        @Override
        public Producto[] newArray(int size) {
            return new Producto[size];
        }
    };

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

    public String isIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return nombre + "\n" +
                "Código: "+codigo + "\n" +
                "Valor: $" + valor + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Categoría: " + categoria + "\n" +
                iva;
    }
}
