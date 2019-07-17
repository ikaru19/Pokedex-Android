package com.syafrizal.dtsproyek1.adapters;

import android.content.Context;
import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.squareup.picasso.Picasso;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.models.Pokemon;

import java.util.List;

import static com.syafrizal.dtsproyek1.R.color.colorGrass;

public class PokemonAdapter extends BaseQuickAdapter<Pokemon , BaseViewHolder> {
    Context context;

    public PokemonAdapter(@Nullable List<Pokemon> data,Context context) {
        super(R.layout.item_pokemon,data);
        this.context = context;
    }



    @Override
    protected void convert(BaseViewHolder helper, Pokemon item) {
       ImageView imageViewPokemon =  helper.getView(R.id.imageViewPokemon);
        TextView textViewName = helper.getView(R.id.textViewPokemonName);
        TextView type = helper.getView(R.id.textViewPokemonType);

        if (item.getType().equalsIgnoreCase("grass")){
            type.setTextColor(context.getResources().getColor(colorGrass));
        }else if (item.getType().equalsIgnoreCase("fire")){
            type.setTextColor(context.getResources().getColor(R.color.colorFire));
        }else if (item.getType().equalsIgnoreCase("water")){
            type.setTextColor(context.getResources().getColor(R.color.colorWater));
        }else{
            type.setTextColor(context.getResources().getColor(R.color.colorUnknown));
        }

        Picasso.get().load(item.getPicture())
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageViewPokemon);

        textViewName.setText(item.getName());
        type.setText(item.getType());
    }

    public void refill(List<Pokemon> data){
      super.mData = data;
    }
}
