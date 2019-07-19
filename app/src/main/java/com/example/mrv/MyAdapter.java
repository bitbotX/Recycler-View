package com.example.mrv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyAdapterHolder> {

    private String pet_types_adapter[]=null,pet_desc_adapter[]=null;
    private Context mContext=null;
    public MyAdapter(Context mContext,String pet_type[],String pet_desc[]){
        this.mContext=mContext;
        pet_types_adapter=pet_type;
        pet_desc_adapter=pet_desc;
    }

    @NonNull
    @Override
    public MyAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mInflator=LayoutInflater.from(mContext);
        View myView=mInflator.inflate(R.layout.my_row_layout,parent,false);
        return new MyAdapterHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterHolder holder, int position) {
        holder.pet_type.setText(pet_types_adapter[position]);
        holder.pet_desc.setText(pet_desc_adapter[position]);
    }

    @Override
    public int getItemCount() {
        return pet_desc_adapter.length;
    }

    public class MyAdapterHolder extends RecyclerView.ViewHolder {

        private TextView pet_type=null,pet_desc=null;

        public MyAdapterHolder(@NonNull View itemView) {
            super(itemView);
            pet_type=(TextView)itemView.findViewById(R.id.t_main);
            pet_desc=(TextView)itemView.findViewById(R.id.t_desc);
        }
    }
}
