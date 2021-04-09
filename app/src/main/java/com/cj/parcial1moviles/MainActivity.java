package com.cj.parcial1moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private EditText txtCodigo;
    private EditText txtValor;
    private EditText txtDescripcion;
    private Spinner spCategoria;
    private Spinner spIva;
    private ListView lvLista;
    private Button btnAgregar;
    private Button btnPromedio;
    private Button btnBaratos;
    private Button btnCostosos;
    private Button btnSiguiente;
    private ArrayAdapter<String> adapter;
    private ArrayList<Producto> productos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtCodigo = findViewById(R.id.txtCodigo);
        txtValor = findViewById(R.id.txtValor);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        spCategoria = findViewById(R.id.spCategoria);
        spIva = findViewById(R.id.spIva);
        lvLista = findViewById(R.id.lvLista);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnPromedio = findViewById(R.id.btnPromedio);
        btnBaratos = findViewById(R.id.btnBaratos);
        btnCostosos = findViewById(R.id.btnCostosos);
        btnSiguiente = findViewById(R.id.btnSiguiente);
        btnAgregar.setOnClickListener(this);
        btnPromedio.setOnClickListener(this);
        btnBaratos.setOnClickListener(this);
        btnCostosos.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);

        ArrayAdapter<CharSequence> adapterCategorias = ArrayAdapter.createFromResource(this,
                R.array.categorias, android.R.layout.simple_spinner_item);
        spCategoria.setAdapter(adapterCategorias);

        ArrayAdapter<CharSequence> adapterIva = ArrayAdapter.createFromResource(this,
                R.array.iva, android.R.layout.simple_spinner_item);
        spIva.setAdapter(adapterIva);

        //Productos para llenar la lista
        Producto p1 = new Producto("Prod1", 1, 100, "desc", "Frutas y Verduras", "I.V.A.=SÍ");
        Producto p2 = new Producto("Prod2", 2, 200, "desc", "Panadería y Dulces", "I.V.A.=NO");
        Producto p3 = new Producto("Prod3", 3, 300, "desc", "Huevos, Lácteos y Café", "I.V.A.=NO");
        Producto p4 = new Producto("Prod4", 4, 400, "desc", "Zumos y Bebidas", "I.V.A.=NO");
        Producto p5 = new Producto("Prod5", 5, 500, "desc", "Frutas y Verduras", "I.V.A.=SÍ");
        Producto p6 = new Producto("Prod6", 6, 600, "desc", "Panadería y Dulces", "I.V.A.=NO");
        Producto p7 = new Producto("Prod7", 7, 700, "desc", "Huevos, Lácteos y Café", "I.V.A.=NO");
        Producto p8 = new Producto("Prod8", 8, 800, "desc", "Zumos y Bebidas", "I.V.A.=NO");
        Producto p9 = new Producto("Prod9", 9, 900, "desc", "Frutas y Verduras", "I.V.A.=SÍ");
        Producto p10 = new Producto("Prod10", 10, 1000, "desc", "Panadería y Dulces", "I.V.A.=NO");
        Producto p11 = new Producto("Prod11", 11, 1100, "desc", "Huevos, Lácteos y Café", "I.V.A.=NO");
        Producto p12 = new Producto("Prod12", 12, 1200, "desc", "Zumos y Bebidas", "I.V.A.=NO");
        Producto p13 = new Producto("Prod13", 13, 1300, "desc", "Frutas y Verduras", "I.V.A.=SÍ");
        Producto p14 = new Producto("Prod14", 14, 1400, "desc", "Panadería y Dulces", "I.V.A.=NO");
        Producto p15 = new Producto("Prod15", 15, 1500, "desc", "Huevos, Lácteos y Café", "I.V.A.=NO");
        Producto p16 = new Producto("Prod16", 16, 1600, "desc", "Zumos y Bebidas", "I.V.A.=NO");
        Producto p17 = new Producto("Prod17", 17, 1700, "desc", "Frutas y Verduras", "I.V.A.=SÍ");
        Producto p18 = new Producto("Prod18", 18, 1800, "desc", "Panadería y Dulces", "I.V.A.=NO");
        Producto p19 = new Producto("Prod19", 19, 1900, "desc", "Huevos, Lácteos y Café", "I.V.A.=NO");
        Producto p20 = new Producto("Prod20", 20, 2000, "desc", "Zumos y Bebidas", "I.V.A.=NO");
        Producto p21 = new Producto("Prod21", 21, 2100, "desc", "Frutas y Verduras", "I.V.A.=SÍ");
        Producto p22 = new Producto("Prod22", 22, 2200, "desc", "Panadería y Dulces", "I.V.A.=NO");
        Producto p23 = new Producto("Prod23", 23, 2300, "desc", "Huevos, Lácteos y Café", "I.V.A.=NO");
        Producto p24 = new Producto("Prod24", 24, 2400, "desc", "Zumos y Bebidas", "I.V.A.=NO");
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        productos.add(p9);
        productos.add(p10);
        productos.add(p11);
        productos.add(p12);
        productos.add(p13);
        productos.add(p14);
        productos.add(p15);
        productos.add(p16);
        productos.add(p17);
        productos.add(p18);
        productos.add(p19);
        productos.add(p20);
        productos.add(p21);
        productos.add(p22);
        productos.add(p23);
        productos.add(p24);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAgregar:
                agregarProducto();
                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, productos);
                lvLista.setAdapter(adapter);
                break;
            case R.id.btnBaratos:
                ordenarMenorMayorPrecio();
                ArrayList<String> listaBaratos = new ArrayList<>();
                String mensajeBaratos = "Los 10 productos más baratos son:" + "\n";
                for (int i = 0; i < 10; i++) {
                    mensajeBaratos += productos.get(i).getNombre() + " - " + productos.get(i).getValor() + "\n";
                }
                listaBaratos.add(mensajeBaratos);
                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaBaratos);
                lvLista.setAdapter(adapter);
                break;
            case R.id.btnCostosos:
                ordenarMenorMayorPrecio();
                Collections.reverse(productos);
                ArrayList<String> listaCostosos = new ArrayList<>();
                String mensajeCostosos = "Los 10 productos más costosos son:" + "\n";
                for (int i = 0; i < 10; i++) {
                    mensajeCostosos += productos.get(i).getNombre() + " - " + productos.get(i).getValor() + "\n";
                }
                listaCostosos.add(mensajeCostosos);
                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaCostosos);
                lvLista.setAdapter(adapter);
                break;
            case R.id.btnPromedio:
                ArrayList<String> listaPromedio = new ArrayList<>();
                String mensajePromedio = "El valor promedio de los productos es: $" + valorPromedio();
                listaPromedio.add(mensajePromedio);
                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaPromedio);
                lvLista.setAdapter(adapter);
                break;
            case R.id.btnSiguiente:
                Intent myIntent = new Intent(this, Exentos.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("productos", productos);
                myIntent.putExtras(bundle);
                startActivity(myIntent);
                break;
        }
    }

    private void agregarProducto() {
        String nombre = txtNombre.getText().toString();
        String codigo = txtCodigo.getText().toString();
        String valor = txtValor.getText().toString();
        String descripcion = txtDescripcion.getText().toString();
        String categoria = spCategoria.getSelectedItem().toString();
        String iva = spIva.getSelectedItem().toString();

        Producto producto = new Producto(nombre, Integer.parseInt(codigo), Integer.parseInt(valor), descripcion, categoria, iva);
        productos.add(producto);
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.getText().clear();
        txtCodigo.getText().clear();
        txtValor.getText().clear();
        txtDescripcion.getText().clear();
        spCategoria.setSelection(0);
        spIva.setSelection(0);
    }

    private void ordenarMenorMayorPrecio() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return new Integer(p1.getValor()).compareTo(new Integer(p2.getValor()));
            }
        });
    }

    private Double valorPromedio() {
        int contador = 0;
        double valorTotal = 0;
        double promedio;
        for (Producto producto : productos) {
            valorTotal += producto.getValor();
            contador++;
        }
        promedio = valorTotal / contador;
        return promedio;
    }
}