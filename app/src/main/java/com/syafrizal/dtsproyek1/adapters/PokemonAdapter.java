package com.syafrizal.dtsproyek1.adapters;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.squareup.picasso.Picasso;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.models.Pokemon;

import java.util.List;

public class PokemonAdapter extends BaseQuickAdapter<Pokemon , BaseViewHolder> {

    public PokemonAdapter(@Nullable List<Pokemon> data) {
        super(R.layout.item_pokemon,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Pokemon item) {
       ImageView imageViewPokemon =  helper.getView(R.id.imageViewPokemon);
        TextView textViewName = helper.getView(R.id.textViewPokemonName);
        TextView textViewType = helper.getView(R.id.textViewPokemonType);

        Picasso.get().load(item.getPicture())
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageViewPokemon);

        textViewName.setText(item.getName());
        textViewType.setText(item.getType());
    }
}
