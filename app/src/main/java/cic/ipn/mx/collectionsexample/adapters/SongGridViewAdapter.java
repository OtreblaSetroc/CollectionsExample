package cic.ipn.mx.collectionsexample.adapters;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cic.ipn.mx.collectionsexample.R;
import cic.ipn.mx.collectionsexample.model.SongModel;

public class SongGridViewAdapter extends BaseAdapter{

    private List<SongModel> songs;

    public SongGridViewAdapter(List<SongModel> songs){
        this.songs = songs;
    }

    @Override
    public int getCount() {
        return this.songs.size();
    }

    @Override
    public SongModel getItem(int position) {
        return this.songs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.getItem(position).hashCode();
    }

    @Override
    public View getView(int position, View reusableView, ViewGroup parent) {

        if(reusableView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            reusableView = inflater.inflate(R.layout.gridview_item_layout,parent,false);




        }
String azul="#0e467d";
        String blanco="#edf8d8";
        String aux = null;
        if (position%2==0){
            paint(azul,reusableView);
        }else{
            aux=azul;
            azul=blanco;
            paint(blanco,reusableView);


        }




        /*tablero ajedrez*/
       /* if (position%2==0){
            float c=position/2;
            pinta(c,reusableView);
        }else {
            float c=((position-1)/2)+1;
            pinta(c,reusableView);
        }*/



        TextView tvTittle = reusableView.findViewById(R.id.tvTittle);
        TextView tvArtist = reusableView.findViewById(R.id.tvArtist);
        TextView tvDuration = reusableView.findViewById(R.id.tvDuration);

        SongModel song = this.getItem(position);

        /*Traigo la referencia es decir el nombre de sus campos y los utilizo*/
       /* tvTittle.setText(song.getTittle());
        tvArtist.setText(song.getArtist());
        tvDuration.setText(song.getDuration());*/

        tvTittle.setText("Hola");
        tvArtist.setText("");
        tvDuration.setText("");

        return reusableView;
    }

    public void pinta(float c,View v){
        if (c%2==0){
            v.setBackgroundColor(Color.parseColor("#0e467d"));
        }else {
            v.setBackgroundColor(Color.parseColor("#edf8d8"));
        }

    }
    public void paint(String color,View v){
        v.setBackgroundColor(Color.parseColor(color));

    }


}
