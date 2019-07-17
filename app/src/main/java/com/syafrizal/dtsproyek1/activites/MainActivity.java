package com.syafrizal.dtsproyek1.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.models.Pokemon;

public class MainActivity extends AppCompatActivity {
    Pokemon pokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokemon = getIntent().getParcelableExtra("Pokemon");
        initView();
    }

    private void initView(){
        ConstraintLayout background = findViewById(R.id.detailBackground);
        TextView name = findViewById(R.id.textViewDetailName);
        TextView seed = findViewById(R.id.textViewDetailSeed);
        TextView type = findViewById(R.id.textViewDetailType);
        TextView hp = findViewById(R.id.textViewHPDetail);
        TextView atk = findViewById(R.id.textViewATKDetail);
        TextView def = findViewById(R.id.textViewDEFDetail);
        TextView sdef = findViewById(R.id.textViewSDEFDetail);
        TextView satk =  findViewById(R.id.textViewSATKDetail);
        TextView speed = findViewById(R.id.textViewSPDDetail);
        TextView abilities = findViewById(R.id.textViewDetailAbilities);
        TextView weight = findViewById(R.id.textViewWeight);
        TextView height = findViewById(R.id.textViewHeightDetail);
        ImageView imageViewPokemon = findViewById(R.id.imageViewDetail);
        Button button = findViewById(R.id.btnShare);

        if (pokemon.getType().equalsIgnoreCase("grass")){
            background.setBackgroundColor(getResources().getColor(R.color.colorGrass));
            type.setTextColor(getResources().getColor(R.color.colorGrass));
        }else if (pokemon.getType().equalsIgnoreCase("fire")){
            background.setBackgroundColor(getResources().getColor(R.color.colorFire));
            type.setTextColor(getResources().getColor(R.color.colorFire));
        }else if (pokemon.getType().equalsIgnoreCase("water")){
            background.setBackgroundColor(getResources().getColor(R.color.colorWater));
            type.setTextColor(getResources().getColor(R.color.colorWater));
        }else{
            background.setBackgroundColor(getResources().getColor(R.color.colorUnknown));
            type.setTextColor(getResources().getColor(R.color.colorUnknown));
        }

        name.setText(pokemon.getName());
        seed.setText(pokemon.getSeed());
        type.setText(pokemon.getType());
        hp.setText(""+pokemon.getHp());
        atk.setText(""+pokemon.getAttack());
        def.setText(""+pokemon.getDefense());
        sdef.setText(""+pokemon.getSpeed());
        satk.setText(""+pokemon.getSpeedattack());
        speed.setText(""+pokemon.getSpeeddef());
        abilities.setText(pokemon.getAbillities());
        weight.setText(""+pokemon.getWeight()+" kg");
        height.setText(""+pokemon.getHeight()+" m");
        Picasso.get().load(pokemon.getPicture())
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageViewPokemon);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ShareActivity.class);
                intent.putExtra("Pokemon",pokemon);
                startActivity(intent);
            }
        });
    }
}
