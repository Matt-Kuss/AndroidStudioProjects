package com.example.drinkmixer;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] itens = new String[]{"Batida de sonho de Valsa", "Drink dos Deuses", "Sex On The Beach"};

        ArrayAdapter<String> array =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);

        setListAdapter(array);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent it = new Intent(this, DetailActivity.class);
        it.putExtra("drinkId", position);
        startActivity(it);

        String item = this.getListAdapter().getItem(position).toString();
        Toast.makeText(this,"Selecionado " + item, Toast.LENGTH_SHORT).show();

    }


    }





