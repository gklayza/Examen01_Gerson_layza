package com.gerson.usuario.examen01;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;




public class MainActivity extends ActionBarActivity {

    ListViewAdapter adapter;
    ListView lista;
    String[] restaurante = {
            "tacacho $2.50",
            "tallarines $13.00",
            "saltado $10.00",
            "Juane $5.00",
            "ceviche $15.00",
            "chaufa $5.00"

    };

    int[] imagenes = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.Lista);

        ArrayAdapter adap = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurante);

        lista.setAdapter(adap);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0:
                        Intent ii = new Intent(getApplicationContext(), Tacacho.class);
                        startActivity(ii);
                        break;
                    case 1:
                        Intent iii = new Intent(getApplicationContext(), Chaufa.class);
                        startActivity(iii);

                        break;
                    case 2:
                        Intent iiii = new Intent(getApplicationContext(), Saltado.class);
                        startActivity(iiii);

                        break;
                    case 3:
                        Intent iiiii = new Intent(getApplicationContext(), Juane.class);
                        startActivity(iiiii);

                        break;
                    case 4:
                        Intent iiiiii = new Intent(getApplicationContext(), Cebiche.class);
                        startActivity(iiiiii);

                        break;
                    case 5:
                        Intent iiiiiii = new Intent(getApplicationContext(), Tallarines.class);
                        startActivity(iiiiiii);

                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }
            }
        });


        final ListView lista = (ListView) findViewById(R.id.Lista);
        adapter = new ListViewAdapter(this, restaurante, imagenes);
        lista.setAdapter(adapter);


        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.Inicio);
        spec.setIndicator("Inicio");
        Toast cl = Toast.makeText(getApplicationContext(), "bienvenido a inicio", Toast.LENGTH_SHORT);
        cl.show();
        tabs.addTab(spec);


        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.Platos1);
        spec.setIndicator("Platos1");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab3");
        spec.setContent(R.id.Platos2);
        spec.setIndicator("Platos2");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.action_settings:  return true;
            case R.id.reportes:

                return true;
            case R.id.clientes:
                Toast toast1 = Toast.makeText(getApplicationContext(),"Cliente", Toast.LENGTH_SHORT);
                toast1.show();
                return true;
            case R.id.productos:
                Toast toast2 = Toast.makeText(getApplicationContext(),"Producto", Toast.LENGTH_SHORT);
                toast2.show();

                return true;
            case R.id.categoria:
                Toast toast3 = Toast.makeText(getApplicationContext(),"Categoria", Toast.LENGTH_SHORT);
                toast3.show();
                return true;
            case R.id.vendedor:
                Toast toast4 = Toast.makeText(getApplicationContext(),"Vendedor", Toast.LENGTH_SHORT);
                toast4.show();
                return true;
            case R.id.reporteP:
                Toast toast5 = Toast.makeText(getApplicationContext(),"Reporte Producto", Toast.LENGTH_SHORT);
                toast5.show();
                return true;
            case R.id.reporteV:
                Toast toast6 = Toast.makeText(getApplicationContext(),"Reporte Ventas", Toast.LENGTH_SHORT);
                toast6.show();

                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }
    public void Tacacho (View view) {
        startActivity(new Intent(this, Tacacho.class));

    }
    public void Tallarines (View view) {
        startActivity(new Intent(this, Tallarines.class));

    }
    public void Saltado (View view) {
        startActivity(new Intent(this, Saltado.class));

    }
    public void Juane (View view) {
        startActivity(new Intent(this, Juane.class));

    }
    public void Ceviche (View view) {
        startActivity(new Intent(this, Cebiche.class));

    }
    public void Chaufa (View view) {
        startActivity(new Intent(this, Chaufa.class));

    }


}
