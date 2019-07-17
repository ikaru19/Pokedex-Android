package com.syafrizal.dtsproyek1.fragments;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.SimpleClickListener;
import com.peekandpop.shalskar.peekandpop.PeekAndPop;
import com.squareup.picasso.Picasso;
import com.syafrizal.dtsproyek1.GenerateData;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.activites.MainActivity;
import com.syafrizal.dtsproyek1.adapters.PokemonAdapter;
import com.syafrizal.dtsproyek1.generator.ServiceGenerator;
import com.syafrizal.dtsproyek1.models.Pokemon;
import com.syafrizal.dtsproyek1.services.PokemonService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.syafrizal.dtsproyek1.R.color.colorGrass;

/**
 * A simple {@link Fragment} subclass.
 */
public class PokemonsFragment extends Fragment  {

    private RecyclerView rvPokemons;
    private PokemonAdapter adapter;
    private List<Pokemon> pokemons;
    private PokemonService pokemonService;


    public PokemonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pokemons, container, false);
        rvPokemons = view.findViewById(R.id.rvPokemons);



        adapter = new PokemonAdapter(pokemons,getContext());
        pokemonService = ServiceGenerator.createService(PokemonService.class);
        getData();

        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        adapter.isFirstOnly(false);
        rvPokemons.setAdapter(adapter);
        rvPokemons.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Pokemon item = pokemons.get(position);
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("Pokemon",item);
                startActivity(intent);
            }
        });
        adapter.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(BaseQuickAdapter adapter, final View view, int position) {
              peekViewInit(view,position);
              return true;
            }
        });
        return view;
    }


    private void getData(){
        final ProgressDialog progress = new ProgressDialog(getContext());
        progress.setMessage("Getting data....");
        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
        progress.show();
        Call<List<Pokemon>> pokeCall = pokemonService.getPokemons();
        pokeCall.enqueue(new Callback<List<Pokemon>>() {
            @Override
            public void onResponse(Call<List<Pokemon>> call, Response<List<Pokemon>> response) {
                int resCode = response.code();
                Log.d("RETROFITTAG",String.valueOf(resCode));
                Log.d("RETROFITTAG",response.toString());
                if (resCode == 200){
                    List<Pokemon> pokemons = response.body();
                    PokemonsFragment.this.pokemons = pokemons;
                    adapter.refill(pokemons);
                    adapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(getContext(), "Something went wrong...", Toast.LENGTH_SHORT).show();
                }
                progress.dismiss();
            }

            @Override
            public void onFailure(Call<List<Pokemon>> call, Throwable t) {
                Toast.makeText(getContext(), "Something went wrong...", Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }
        });
    }


    private void peekViewInit(View view, int position){
        Pokemon item = pokemons.get(position);
        FrameLayout frame = getActivity().findViewById(R.id.frameLayout);
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


        if (item.getType().equalsIgnoreCase("grass")){
            tvType.setTextColor(getResources().getColor(colorGrass));
        }else if (item.getType().equalsIgnoreCase("fire")){
            tvType.setTextColor(getResources().getColor(R.color.colorFire));
        }else if (item.getType().equalsIgnoreCase("water")){
            tvType.setTextColor(getResources().getColor(R.color.colorWater));
        }else{
            tvType.setTextColor(getResources().getColor(R.color.colorUnknown));
        }

        tvTitle.setText(item.getName());
        tvType.setText(item.getType());
        tvHP.setText(""+item.getHp());
        tvAttack.setText(""+item.getAttack());
        tvDef.setText(""+item.getDefense());
        tvSpeed.setText(""+item.getSpeed());
        tvSpAtt.setText(""+item.getSpeedattack());
        tvSpDef.setText(""+item.getSpeeddef());
        Picasso.get().load(item.getPicture())
                .placeholder(R.drawable.pokemon_nav)
                .into(imageViewPokemon);
    }

}
