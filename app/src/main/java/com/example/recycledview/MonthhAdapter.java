package com.example.recycledview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonthhAdapter extends RecyclerView.Adapter<MonthhAdapter.ViewHolder> {
    private List<MonthModel> monthList;

    public MonthhAdapter(List<MonthModel> monthList) {
        this.monthList = monthList;
    }

    @NonNull
    @Override
    public MonthhAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MonthhAdapter.ViewHolder holder, int position) {
        MonthModel monthModel = monthList.get(position);
        holder.monthTextView.setText(monthModel.getMonth_name());
    }
    @Override
    public int getItemCount() {
        return monthList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView monthTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            monthTextView = itemView.findViewById(R.id.textView);
        }
    }
}
