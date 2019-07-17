package com.syafrizal.dtsproyek1.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.models.Item;

public class ItemDetailActivity extends AppCompatActivity {
    Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        item = getIntent().getParcelableExtra("Item");
        initView();

    }

    private void initView(){
        TextView name = findViewById(R.id.textViewItemName);
        TextView seed = findViewById(R.id.textViewItemDescription);
        ImageView imageViewItem = findViewById(R.id.imageViewDetailItem);

        name.setText(item.getName());
        seed.setText(item.getDescription());
        Picasso.get().load(item.getPicture())
                .placeholder(R.drawable.items_nav)
                .into(imageViewItem);
    }
}
