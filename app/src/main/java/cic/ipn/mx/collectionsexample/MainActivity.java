package cic.ipn.mx.collectionsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cic.ipn.mx.collectionsexample.adapters.SongListViewAdapter;
import cic.ipn.mx.collectionsexample.model.SongModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<SongModel> songs = this.generateDummyList(8);

        SongListViewAdapter adapter = new SongListViewAdapter(songs);

        ListView lvSongs = findViewById(R.id.lvCanciones);
        lvSongs.setAdapter(adapter);

        lvSongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SongModel presionada = songs.get(position);
                Toast.makeText(MainActivity.this,"Presionó: "+ presionada, Toast.LENGTH_LONG).show();
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
