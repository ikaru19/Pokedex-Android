package com.syafrizal.dtsproyek1.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.SimpleClickListener;
import com.peekandpop.shalskar.peekandpop.PeekAndPop;
import com.squareup.picasso.Picasso;
import com.syafrizal.dtsproyek1.GenerateData;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.adapters.PokemonAdapter;
import com.syafrizal.dtsproyek1.models.Pokemon;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PokemonsFragment extends Fragment  {

    RecyclerView rvPokemons;
    PokemonAdapter adapter;
    List<Pokemon> pokemons;


    public PokemonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pokemons, container, false);
        rvPokemons = view.findViewById(R.id.rvPokemons);
        pokemons = GenerateData.getPokemons();
        adapter = new PokemonAdapter(pokemons);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        adapter.isFirstOnly(false);
        rvPokemons.setAdapter(adapter);
        rvPokemons.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(getContext(), "onItemClick" + position, Toast.LENGTH_SHORT).show();
            }
        });
        adapter.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(BaseQuickAdapter adapter, final View view, int position) {
                Pokemon item = pokemons.get(position);
                PeekAndPop peekAndPop = new PeekAndPop.Builder(getActivity())
                        .peekLayout(R.layout.item_peek_pokemon)
                        .longClickViews(view)
                        .parentViewGroupToDisallowTouchEvents(rvPokemons)
                        .build();
                View peekView = peekAndPop.getPeekView();
                ImageView imageViewPokemon = peekView.findViewById(R.id.imageViewPeek);
                TextView tvTitle = peekView.findViewById(R.id.textViewPeekName);
                TextView tvType = peekView.findViewById(R.id.textViewPeekType);
                TextView tvHP = peekView.findViewById(R.id.textViewHP);
                TextView tvAttack = peekView.findViewById(R.id.textViewAttack);
                TextView tvDef = peekView.findViewById(R.id.textViewDefense);
                TextView tvSpeed = peekView.findViewById(R.id.textViewSpeed);
                TextView tvSpAtt = peekView.findViewById(R.id.textViewSpAtk);
                TextView tvSpDef = peekView.findViewById(R.id.textViewSpDef);


                tvTitle.setText(item.getName());
                tvType.setText(item.getType());
                tvHP.setText(""+item.getHp());
                tvAttack.setText(""+item.getAttack());
                tvDef.setText(""+item.getDefense());
                tvSpeed.setText(""+item.getSpeed());
                tvSpAtt.setText(""+item.getSpeedattack());
                tvSpDef.setText(""+item.getSpeeddef());
                Picasso.get().load(item.getPicture())
                        .placeholder(R.drawable.ic_launcher_background)
                        .into(imageViewPokemon);
                return true;

            }
        });

        return view;
    }

}
