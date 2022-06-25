package com.kushagra.learningmad;

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

    SimpleRecyclerViewAdapter(ArrayList<SampleModel> passedData){
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

    }

    @Override
    public int getItemCount() {
        return meroData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            textView = itemView.findViewById(R.id.textView);
        }
    }
}
