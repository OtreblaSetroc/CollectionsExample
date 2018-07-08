package cic.ipn.mx.collectionsexample.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cic.ipn.mx.collectionsexample.R;
import cic.ipn.mx.collectionsexample.model.SongModel;

public class SongListViewAdapter extends BaseAdapter{

    private List<SongModel> songs;

    public SongListViewAdapter(List<SongModel> songs){
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
            reusableView = inflater.inflate(R.layout.listview_item_layout,parent,false);
        }

        TextView tvTittle = reusableView.findViewById(R.id.tvTittle);
        TextView tvArtist = reusableView.findViewById(R.id.tvArtist);
        TextView tvDuration = reusableView.findViewById(R.id.tvDuration);


        SongModel song = this.getItem(position);

        /*Traigo la referencia es decir el nombre de sus campos y los utilizo*/
        /*tvTittle.setText(song.getTittle());
        tvArtist.setText(song.getArtist());
        tvDuration.setText(song.getDuration());*/



        return reusableView;
    }


}
