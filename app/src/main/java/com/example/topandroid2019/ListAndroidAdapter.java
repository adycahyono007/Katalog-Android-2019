package com.example.topandroid2019;

        import android.content.Context;
        import android.content.Intent;
        import android.net.Uri;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.bumptech.glide.Glide;
        import com.bumptech.glide.request.RequestOptions;

        import java.util.ArrayList;


public class ListAndroidAdapter extends RecyclerView.Adapter<ListAndroidAdapter.ListViewHolder> {
    private ArrayList<Android> listAndroid;
    Context c;

    public ListAndroidAdapter(ArrayList<Android> list, Context c) {
        this.listAndroid = list;
        this.c = c;
    }

    private OnItemClickCallback onItemClickCallback;

    public ListAndroidAdapter(ArrayList<Android> list) {
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_android, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Android android = listAndroid.get(position);
        final String images = android.getPhoto();
        final String name = android.getName();
        final String spec = android.getSpec();
        Glide.with(holder.itemView.getContext())
                .load(android.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.imgPhoto.setImageURI(Uri.parse(images));
        holder.tvName.setText(name);
        holder.tvSpec.setText(spec);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetail(images, name, spec);
            }
        });

    }

    public interface OnItemClickCallback {
        void onItemClicked(Android android);
    }

    @Override
    public int getItemCount() {
        return listAndroid.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        TextView tvName, tvSpec;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvSpec = itemView.findViewById(R.id.tv_item_Spec);
        }
    }

    private void openDetail(String... details) {
        Intent i = new Intent(c, DetailActivity.class);
        i.putExtra("IMAGES_KEY", details[0]);
        i.putExtra("TITLE_KEY", details[1]);
        i.putExtra("ISI_KEY", details[2]);
        c.startActivity(i);

    }
}
