package com.example.android3l1;



import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<BookModel>list;
    private LayoutInflater inflater;
    private Context context;

    public RecyclerAdapter (List<BookModel>list, Context context) {
        this.list = list;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.book_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.txtTitle.setText(list.get(position).getTitle());
        holder.iconImage.setImageResource(list.get(position).getIcon());
        holder.iconImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickI(position);
            }
        });
        holder.txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickI(position);
            }
        });
    }
     public void clickI(int position){
         Intent intent = new Intent(context, AboutItemActivity.class);
         intent.putExtra("book", list.get(position).getTitle());
         context.startActivity(intent);
     }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        ImageView iconImage;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.item_icon);
            txtTitle = itemView.findViewById(R.id.item_title_txt);
        }
    }
}
