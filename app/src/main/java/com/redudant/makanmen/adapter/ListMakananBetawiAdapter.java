package com.redudant.makanmen.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.redudant.makanmen.R;
import com.redudant.makanmen.model.MenuMakanan;

import java.util.ArrayList;

public class ListMakananBetawiAdapter extends RecyclerView.Adapter<ListMakananBetawiAdapter.ListMenuMakananBetawiViewHolder> {

    private ArrayList<MenuMakanan> listMenuMakananBetawi;

    public ListMakananBetawiAdapter(ArrayList<MenuMakanan> listMenuMakananBetawi) {
        this.listMenuMakananBetawi = listMenuMakananBetawi;
    }


    @NonNull
    @Override
    public ListMenuMakananBetawiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_row_menumakantradisionalbetawi, parent, false);

        return new ListMenuMakananBetawiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMenuMakananBetawiViewHolder holder, int position) {

        MenuMakanan menuMakanan = listMenuMakananBetawi.get(position);

        Glide.with(holder.itemView.getContext())
                .load(menuMakanan.getPhoto())
                .apply(new RequestOptions().override(55, 255))
                .into(holder.imageItemPhoto);

        holder.tvTitle.setText(menuMakanan.getTitle());
        holder.tvSubmenu.setText(menuMakanan.getSubtitle());

    }

    @Override
    public int getItemCount() {
        return listMenuMakananBetawi.size();
    }

    public class ListMenuMakananBetawiViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle, tvSubmenu;
        private ImageView imageItemPhoto;

        public ListMenuMakananBetawiViewHolder(@NonNull View itemView) {
            super(itemView);

            imageItemPhoto = itemView.findViewById(R.id.image_item_photo);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvSubmenu = itemView.findViewById(R.id.tv_submenu);
        }
    }
}
