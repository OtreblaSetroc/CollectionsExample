package cic.ipn.mx.collectionsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cic.ipn.mx.collectionsexample.adapters.SongGridViewAdapter;
import cic.ipn.mx.collectionsexample.model.SongModel;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridView gridview = findViewById(R.id.gvCanciones);

        SongGridViewAdapter adapter = new SongGridViewAdapter(this.generateDummyList(50));

        gridview.setAdapter(adapter);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                GridView grid = (GridView) parent;

                ListAdapter adapter = grid.getAdapter();

                SongModel item = (SongModel) adapter.getItem(position);

                Toast.makeText(GridActivity.this, "Canción"+ item, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<SongModel> generateDummyList(int count) {
        List<SongModel> list = new ArrayList<>(count);
        for (int x = 1; x <= count; x++){
            SongModel song = new SongModel("Tittle"+x,"Artist"+x, String.format("%d:%d",x,(x*x)));

            list.add(song);
        }
        return list;
    }
}
