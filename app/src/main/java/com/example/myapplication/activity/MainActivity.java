package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.ElementListAdapter;
import com.example.myapplication.data.ListSong;
import com.example.myapplication.element.AlbumElemnet;
import com.example.myapplication.element.BaseListElement;
import com.example.myapplication.element.SongsElement;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    ElementListAdapter adapter;

    List<BaseListElement> listOfflineElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        listOfflineElement = new ArrayList<>();
        addElement();
        listView.setAdapter(adapter);
        ListSong.getListSong();
    }
    private void addElement(){
        listOfflineElement.add(new SongsElement(this));
        listOfflineElement.add(new AlbumElemnet(this));
        adapter = new ElementListAdapter(this, listOfflineElement);
    }

}