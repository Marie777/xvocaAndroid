package voca.xvocaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_details);

        ArrayList<String> sentences = new ArrayList<>(10);
        sentences.add("TEST Sentence");
        sentences.add("TEST Sentence1");
        sentences.add("TEST Sentence2");
        sentences.add("TEST Sentence3");

        ListView listView = findViewById(R.id.listViewSentences);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_view, sentences);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            //-TODO- Like, save location, user
        });


        Toolbar toolbar = findViewById(R.id.toolbarWordDetails);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        //--TODO - add new sentence

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_word_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.sentence_origin:
                Toast.makeText(this,"Map",Toast.LENGTH_SHORT).show();
                //Log.d("TAG","here");
                //TODO: redirect to map activity
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
