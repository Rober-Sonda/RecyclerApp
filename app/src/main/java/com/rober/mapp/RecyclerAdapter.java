package com.rober.mapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.NumerosViewHolder> {

    private int NumberListAdapter;
    
    public RecyclerAdapter(int NumberListAdapter){

        this.NumberListAdapter = NumberListAdapter;
    }

    @NonNull
    @Override
    public NumerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context myContext = parent.getContext();
        int layoutIdParaListItem = R.layout.row_number_list; //buscamos el id del item de la lista
        LayoutInflater inflater = LayoutInflater.from(myContext); //aca decimos desde donde queremos inflar la vista
        boolean attachToParentFast = false; //para cuando cree la vista

        View view = inflater.inflate(layoutIdParaListItem,parent,attachToParentFast);

        NumerosViewHolder viewHolder = new NumerosViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumerosViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return NumberListAdapter;
    }

    //aca creamos la vista de cada item (viewholder) del frameLayout
    // aca vamos a pasar los elementos que queremos insertar dentro de cada item de la Lista

    class NumerosViewHolder extends RecyclerView.ViewHolder{

        TextView myListNumView;
        public NumerosViewHolder(@NonNull View itemView) {
            super(itemView);
            myListNumView = itemView.findViewById(R.id.id_TxtViewListaNumeros);
        }

        void bind(int listaIndex){

            myListNumView.setText(String.valueOf(listaIndex));

        }
    }
}
