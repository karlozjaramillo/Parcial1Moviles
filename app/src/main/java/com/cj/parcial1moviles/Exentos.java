package com.cj.parcial1moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Exentos extends AppCompatActivity implements View.OnClickListener {

    private Button btnIva;
    private Button btnSinIva;
    private ListView lvLista;
    private ArrayAdapter<String> adapter;
    private ArrayList<Producto> ListObjetos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exentos);

        Bundle bundle = getIntent().getExtras();
        ListObjetos = bundle.getParcelableArrayList("productos");

        btnIva = findViewById(R.id.btnIva);
        btnSinIva = findViewById(R.id.btnSinIva);
        lvLista = findViewById(R.id.lvLista);
        btnIva.setOnClickListener(this);
        btnSinIva.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnIva:
                ArrayList<String> listaIva = new ArrayList<>();
                for (Producto prods: ListObjetos
                     ) {
                    if (prods.iva.equals("I.V.A.=SÍ")){
//                        listaIva.add();
                    }
                }
                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ListObjetos);
                lvLista.setAdapter(adapter);
                break;
            case R.id.btnSinIva:
                break;
        }
    }


}