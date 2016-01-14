package com.chenliuliu.checkboxlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ListAdapter mListAdapter;
    private ArrayList<EquipmentBean> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.list);
        mListAdapter = new ListAdapter(this);
        mList.add(new EquipmentBean("1", true));
        mList.add(new EquipmentBean("2", false));
        mList.add(new EquipmentBean("3", true));
        mList.add(new EquipmentBean("4", true));
        mList.add(new EquipmentBean("5", true));
        mList.add(new EquipmentBean("6", false));
        mList.add(new EquipmentBean("7", true));
        mList.add(new EquipmentBean("8", true));
        mList.add(new EquipmentBean("9", true));
        mList.add(new EquipmentBean("10", true));
        mList.add(new EquipmentBean("11", false));
        mList.add(new EquipmentBean("12", true));
        mList.add(new EquipmentBean("13", false));
        mList.add(new EquipmentBean("14", true));
        mList.add(new EquipmentBean("15", true));
        mList.add(new EquipmentBean("16", true));
        mList.add(new EquipmentBean("17", false));
        mList.add(new EquipmentBean("18", true));
        mList.add(new EquipmentBean("19", true));
        mList.add(new EquipmentBean("20", true));
        mList.add(new EquipmentBean("21", true));
        mList.add(new EquipmentBean("22", false));
        mList.add(new EquipmentBean("23", false));
        mList.add(new EquipmentBean("24", true));
        mList.add(new EquipmentBean("25", true));
        mList.add(new EquipmentBean("26", true));
        mList.add(new EquipmentBean("27", false));
        mList.add(new EquipmentBean("28", true));
        mList.add(new EquipmentBean("29", true));
        mList.add(new EquipmentBean("30", true));
        mList.add(new EquipmentBean("31", true));
        mList.add(new EquipmentBean("32", false));
        mList.add(new EquipmentBean("33", true));
        mList.add(new EquipmentBean("34", false));
        mList.add(new EquipmentBean("35", true));
        mList.add(new EquipmentBean("36", true));
        mList.add(new EquipmentBean("37", true));
        mList.add(new EquipmentBean("38", false));
        mList.add(new EquipmentBean("39", true));
        mList.add(new EquipmentBean("40", true));
        mList.add(new EquipmentBean("41", true));
        mList.add(new EquipmentBean("42", true));
        mList.add(new EquipmentBean("43", false));
        mListAdapter.setList(mList);
        mListView.setAdapter(mListAdapter);
    }
}
