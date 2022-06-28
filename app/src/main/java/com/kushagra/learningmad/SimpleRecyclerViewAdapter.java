package com.kushagra.learningmad;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SimpleRecyclerViewAdapter
        extends
        RecyclerView.Adapter
                <SimpleRecyclerViewAdapter.ViewHolder> {

    ArrayList<SampleModel> meroData = new ArrayList<>();
    Context recyclerKoContext;

    SimpleRecyclerViewAdapter(Context context,
                              ArrayList<SampleModel> passedData){
        recyclerKoContext = context;
        meroData = passedData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_simple_recycler_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.textView.setText(meroData.get(position));

        holder.number.setText(Integer.toString(position+1));

        holder.name.setText(meroData.get(position).userName);

        holder.subTitle.setText(meroData.get(position).address);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(
                        recyclerKoContext,
                        DetailsActivity.class);
                intent.putExtra(
                        "name",
                        meroData.get(position).userName
                );
                recyclerKoContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return meroData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView number, name, subTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.number);
            name = itemView.findViewById(R.id.name);
            subTitle = itemView.findViewById(R.id.subtitle);
        }
    }
}
