package com.example.guswn_000.a170413inclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity
{
    ListView list1;
    EditText e1;
    ArrayList<String> data = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText);
        data.add("사과");
        data.add("바나나");
        data.add("포도");
        data.add("사과");
        data.add("바나나");
        data.add("포도");
        data.add("사과");
        data.add("바나나");
        data.add("포도");
        data.add("사과");
        data.add("바나나");
        data.add("포도");
        list1 = (ListView)findViewById(R.id.listview);
//        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,data);
        list1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        //라디오버튼. 체크박스 하려면 single 말고 multiple하면됨

        adapter.insert("키위",data.size()); // 어댑터에서 추가도 가능 이떄는 노티파이 안해줘도됨
        list1.setAdapter(adapter);
        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s)
            {
                //s는 에딧텍스트에 잇는거
                String search = s.toString();
                if(search.length() > 0)
                {
                    list1.setFilterText(search);
                }
                else
                {
                    list1.clearTextFilter();
                }
            }
        });

    }
    public void onClick(View v)
    {
        if(v.getId() == R.id.button)
        {
            data.add(e1.getText().toString());
            adapter.notifyDataSetChanged();
        }
        else if (v.getId() == R.id.bsort)
        {
            Collections.sort(data,nameAsc);
            adapter.notifyDataSetChanged();
        }

    }
    Comparator<String> nameAsc = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2); // 디센딩 오더 하고싶으면 o1 o2순서바꾸면됨
            //return o1.menu.compareTo(o2.menu); 이러면  레스토랑에서 메뉴이름정렬
        }
    };
}
class Restinfo {
    String menu = "";
    int price = 0;
}
