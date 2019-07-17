package com.syafrizal.dtsproyek1.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.models.Pokemon;

public class ShareActivity extends AppCompatActivity {
    TextView textViewEmail ;
    Pokemon pokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        pokemon = getIntent().getParcelableExtra("Pokemon");
        textViewEmail = findViewById(R.id.editTextEmail);
    }

    public void btnShare(View view) {
        String email = textViewEmail.getText().toString();
        if(!isValidEmail(email.trim())) {
            Toast.makeText(view.getContext(), "Email is not vaild!", Toast.LENGTH_LONG).show();
        }else{
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
            i.putExtra(Intent.EXTRA_SUBJECT, "My Favorite Pokemon is "+pokemon.getName());
            i.putExtra(Intent.EXTRA_TEXT, "I love "+pokemon.getName()+". Here are the description of my pokemon \'"+pokemon.getSeed()+"\'");
            startActivity(i.createChooser(i, "Choose email client"));
        }

    }

    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
