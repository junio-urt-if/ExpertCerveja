package com.example.novatec.dracarys.cervejaadvice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class BuscarCervejaActivity extends AppCompatActivity {

    private ExpertCerveja expert = new ExpertCerveja();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_cerveja);
    }

    //Método chamado quando o botão é clicado
    public void onClickBuscarCervejaListView(View view) {
        //Pega uma referencia para o ListView
        ListView listViewCervejas = (ListView) findViewById(R.id.listViewCervejas);
        //Pega uma referencia para o Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Pega o item selecionado no Spinner
        String tipoCerveja = String.valueOf(color.getSelectedItem());
        //Get recommendations from the BeerExpert class
        List<String> listMarcas = expert.getMarcas(tipoCerveja);

        // Vamos instanciar a classe ArrayAdapter tipando ela com dados do tipo String.
        // construtor da classe vamos passar os seguintes parâmetros de forma
        // sequencial: Context, ID do layout e a Array de dados.
        // estamos utilizando o layout android.R.layout.simple_list_item_1 padrão para a linha da ListView.
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listMarcas);

        // Depois adicionamos o Adapter dentro da nossa ListView utilizando o método setAdapter().
        listViewCervejas.setAdapter(adapter);

    }

    //Método chamado quando o botão é clicado
    public void onClickBuscarCerveja(View view) {
        //Pega uma referencia para o TextView
        TextView marcas = (TextView) findViewById(R.id.marcas);
        //Pega uma referencia para o Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Pega o item selecionado no Spinner
        String tipoCerveja = String.valueOf(color.getSelectedItem());
        //Get recommendations from the BeerExpert class
        List<String> listMarcas = expert.getMarcas(tipoCerveja);
        StringBuilder marcasFormatada = new StringBuilder();
        for (String marca : listMarcas) {
            marcasFormatada.append(marca).append('\n');
        }

        //Mostrar a cerveja
        marcas.setText(marcasFormatada);
        //marcas.setText(tipoCerveja);
    }
}

