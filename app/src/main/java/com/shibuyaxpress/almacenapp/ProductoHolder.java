package com.shibuyaxpress.almacenapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by misaki on 10/30/17.
 */

public class ProductoHolder extends RecyclerView.ViewHolder{

    public ImageView fotoImage;
    public TextView nombreText;
    public TextView precioText;
    public ImageButton menuButton;

    public ProductoHolder(View itemView) {
        super(itemView);
        fotoImage=itemView.findViewById(R.id.foto_image);
        nombreText=itemView.findViewById(R.id.nombre_text);
        precioText=itemView.findViewById(R.id.precio_text);
        menuButton = itemView.findViewById(R.id.menu_button);
    }

}
