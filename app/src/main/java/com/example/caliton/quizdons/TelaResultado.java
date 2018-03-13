package com.example.caliton.quizdons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TelaResultado extends AppCompatActivity {

    public Button btnVoltar;
    public TextView viewResult;
    public String[] dons = {"Profecia", "Servir", "Ensinar", "Exortar", "Contribuir", "Governar", "Misericordia"};
    public TextView m, n, o, p, u, t, s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultado);

        int resposta = (int) getIntent().getSerializableExtra("resultado");

        int a = (int) getIntent().getSerializableExtra("profecia");
        int b = (int) getIntent().getSerializableExtra("servir");
        int c = (int) getIntent().getSerializableExtra("ensinar");
        int d = (int) getIntent().getSerializableExtra("exortar");
        int e = (int) getIntent().getSerializableExtra("contribuir");
        int f = (int) getIntent().getSerializableExtra("governar");
        int g = (int) getIntent().getSerializableExtra("misericordia");



        // m = Profecia
        // n = Servir
        // o = Ensinar
        // p = Exortar
        // u = Contribuir
        // r = Governar
        // s = Misericórdia
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        viewResult = (TextView) findViewById(R.id.txtResult);

        m = (TextView) findViewById(R.id.m);
        n = (TextView) findViewById(R.id.n);
        o = (TextView) findViewById(R.id.o);
        p = (TextView) findViewById(R.id.p);
        u = (TextView) findViewById(R.id.u);
        t = (TextView) findViewById(R.id.r);
        s = (TextView) findViewById(R.id.s);



        viewResult.setText(dons[resposta]);

        m.setText("Profecia: " +  a);
        n.setText("Servir: " +  b);
        o.setText("Ensinar: " +  c);
        p.setText("Exortar: " +  d);
        u.setText("Contribuir: " +  e);
        t.setText("Governar: " +  f);
        s.setText("Misericórdia: " +  g);




        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
