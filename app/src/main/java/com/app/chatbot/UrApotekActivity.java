package com.app.chatbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import com.app.chatbot.Adapter.ApotekAdapter;
import com.app.chatbot.Data.ApotekData;
import com.app.chatbot.Model.Apotek;

import java.util.ArrayList;

public class UrApotekActivity extends AppCompatActivity {

    ApotekAdapter apotekAdapter;
    SearchView searchView;
    private RecyclerView rv;
    private final ArrayList<Apotek> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ur_apotek);

        searchView = findViewById(R.id.search);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                apotekAdapter.getFilter().filter(newText);
                return false;
            }
        });

        rv = findViewById(R.id.rvApotek);
        rv.setHasFixedSize(true);

        list.addAll(ApotekData.getList());
        showRecyclerView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    private void showRecyclerView() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        apotekAdapter = new ApotekAdapter(list);
        rv.setAdapter(apotekAdapter);
    }
}