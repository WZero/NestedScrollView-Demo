package com.zero.scrollview;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zero.scrollview.adapter.SimpleRecyclerAdapter;
import com.zero.scrollview.utils.KLog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SimpleRecyclerAdapter.AdapterViewHolder {

    private RecyclerView recyclerView;
    SimpleRecyclerAdapter adapter;
    private List<String> stringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.main_recycler);
        stringList = new ArrayList<>();
        addData();
        addData();
        addData();
        addData();
        addData();
        addData();
        addData();
        adapter = new SimpleRecyclerAdapter<>(getApplicationContext(), stringList, R.layout.main_item);
        recyclerView.setAdapter(adapter);
        adapter.setAdapterViewHolder(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayout.VERTICAL, false);
        layoutManager.setSmoothScrollbarEnabled(true);
        layoutManager.setAutoMeasureEnabled(true);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);


        adapter.setOnClickItemListener(new SimpleRecyclerAdapter.OnClickItemListener() {
            @Override
            public void onItemClick(View view, int position) {
                KLog.i(position + "-----" + stringList.get(position));
            }
        });
        adapter.getHeadView().addView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.main_head_item, adapter.getHeadView(), false));
        adapter.getFootView().addView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.main_foot_item, adapter.getFootView(), false));
    }

    private void addData() {
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
        stringList.add("123");
    }

    @Override
    public void onViewHolder(View itemView, int position) {
        TextView textView = (TextView) itemView.findViewById(R.id.item_text);
        textView.setText(stringList.get(position));
    }
}
