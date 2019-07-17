package com.syafrizal.dtsproyek1.fragments;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.syafrizal.dtsproyek1.GenerateData;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.activites.ItemDetailActivity;
import com.syafrizal.dtsproyek1.activites.MainActivity;
import com.syafrizal.dtsproyek1.adapters.ItemAdapter;
import com.syafrizal.dtsproyek1.generator.ServiceGenerator;
import com.syafrizal.dtsproyek1.models.Item;
import com.syafrizal.dtsproyek1.models.Pokemon;
import com.syafrizal.dtsproyek1.services.ItemService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemsFragment extends Fragment {

    private RecyclerView rvItems;
    private List<Item> items;
    ItemService itemService;
    ItemAdapter adapter;

    public ItemsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_items, container, false);
        rvItems = view.findViewById(R.id.rvItems);

        itemService = ServiceGenerator.createService(ItemService.class);


        adapter = new ItemAdapter(items);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        adapter.isFirstOnly(false);

        rvItems.setAdapter(adapter);
        rvItems.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Item item = items.get(position);
                Intent intent = new Intent(getActivity(), ItemDetailActivity.class);
                intent.putExtra("Item",item);
                startActivity(intent);
            }
        });

        getData();

        return view;
    }

    private void getData(){
        final ProgressDialog progress = new ProgressDialog(getContext());
        progress.setMessage("Getting data....");
        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
        progress.show();
        Call<List<Item>> listCall = itemService.getItems();
        listCall.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                int resCode = response.code();
                Log.d("RETROFITTAG",String.valueOf(resCode));
                Log.d("RETROFITTAG",response.toString());
                if (resCode == 200){
                    List<Item> items = response.body();
                    ItemsFragment.this.items = items;
                    adapter.refill(items);
                    adapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(getContext(), "Something went wrong...", Toast.LENGTH_SHORT).show();
                }

                progress.dismiss();
            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                Toast.makeText(getContext(), "Something went wrong...", Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }
        });

    }

}
