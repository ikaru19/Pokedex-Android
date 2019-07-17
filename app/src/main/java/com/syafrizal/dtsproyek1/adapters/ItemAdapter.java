package com.syafrizal.dtsproyek1.adapters;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.squareup.picasso.Picasso;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.models.Item;

import java.util.List;

import static com.syafrizal.dtsproyek1.R.color.colorGrass;

public class ItemAdapter extends BaseQuickAdapter<Item, BaseViewHolder> {

    public ItemAdapter(List<Item> data) {
        super(R.layout.item_pokemon, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Item item) {
        ImageView imageViewPokemon =  helper.getView(R.id.imageViewPokemon);
        TextView textViewName = helper.getView(R.id.textViewPokemonName);
        TextView type = helper.getView(R.id.textViewPokemonType);


        Picasso.get().load(item.getPicture())
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageViewPokemon);

        textViewName.setText(item.getName());
        type.setText("");
    }

    public void refill(List<Item> items){
        super.mData = items;
    }
}
