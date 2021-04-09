package com.cj.parcial1moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private EditText txtCodigo;
    private EditText txtValor;
    private EditText txtDescripcion;
    private Spinner spCategoria;
    private Spinner spIva;
    private ListView lvLista;
    private Button btnAgregar;
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
        btnSiguiente = findViewById(R.id.btnSiguiente);
        btnAgregar.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);

        ArrayAdapter<CharSequence> adapterCategorias = ArrayAdapter.createFromResource(this,
                R.array.categorias, android.R.layout.simple_spinner_item);
        spCategoria.setAdapter(adapterCategorias);

        ArrayAdapter<CharSequence> adapterIva = ArrayAdapter.createFromResource(this,
                R.array.iva, android.R.layout.simple_spinner_item);
        spIva.setAdapter(adapterIva);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAgregar:
                agregarProducto();

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, productos);
                lvLista.setAdapter(adapter);
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
}