package com.example.drinkmixer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int drinkId = 3;
        Intent it = getIntent();
        String[] drinks =
                new String[]{"Batida De Sonho de Valsa", "Drink dos Deuses", "Sex on The Beach"};
        String[] ingredients =
                new String[]{
                        "3 bombons Sonho de Valsa \n" +
                        "1 lata de Leite Condensado \n" +
                        "1/2 garrafa de Pinga \n" +
                        "1 latinha de guaraná \n"};

        String[] preparation =
                new String[]{
                        " 1. Bater tudo no liquidificador, ficando os chocolates crocantes por cima. \n" +
                                " 2. Servir Gelado. \n"};



        TextView drinkName = findViewById(R.id.textViewDrinkName);
        TextView ingBox = findViewById(R.id.textViewIngredientes);
        TextView prepBox = findViewById(R.id.textViewPreparo);

        if (it != null)

            drinkId = it.getIntExtra("drinkId", 3);

        if (drinkId == 3) {
            drinkName.setText("");
            ingBox.setText("");
            prepBox.setText("");
            Toast.makeText(
                    this, "Drink não encontrado", Toast.LENGTH_LONG).show();
        } else {
            drinkName.setText(drinks[drinkId]);
            ingBox.setText(ingredients[drinkId]);
            prepBox.setText(preparation[drinkId]);

        }




    }

}
