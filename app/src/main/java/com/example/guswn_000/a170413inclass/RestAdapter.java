package com.example.guswn_000.a170413inclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by guswn_000 on 2017-04-13.
 */

public class RestAdapter extends BaseAdapter
{
    ArrayList<RestInfo> data = new ArrayList<>();
    Context context;

    public RestAdapter(Context context,ArrayList<RestInfo> data) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() //어댑터에 있는 데이터개수
    {
        return data.size();
    }

    @Override
    public Object getItem(int position) //현재위치에있는아이템
    {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position; //얜 별로 안쓰니 그냥 이거 넣는다
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) //현재번호에해당하는화면구성 얘가젤중요
    {
//        ViewHolder viewHolder = new ViewHolder();


        //position ==지금위치 convertview = 지금보여지는뷰
        //보여지는 리스트가 5개면 이게 5번 불려져서 막 데이터를 세팅함. 스크롤 내리면 convertview로 받아서 데이터만 바꿔치기
        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            //viewHolder.title = (TextView)convertView.findViewById(R.id.tvname);
            //viewHolder.tel = (TextView)convertView.findViewById(R.id.tvtel);
            //convertView.setTag(viewHolder);
        }
//        else
//        {
//            viewHolder = (ViewHolder)convertView.getTag();
//        }
        TextView t1 = (TextView)convertView.findViewById(R.id.tvname);
        TextView t2 = (TextView)convertView.findViewById(R.id.tvtel);
        ImageView imgv = (ImageView)convertView.findViewById(R.id.imageView);

        RestInfo one = data.get(position);

//        viewHolder.title.setText(one.getName());

        t1.setText(one.getName());
        t2.setText(one.getTel());
        return convertView;
    }

    //뷰를 이렇게만들기도함
//
//    class ViewHolder{
//        TextView title;
//        TextView tel;
//        ImageView imgno;
//    }







    Comparator<RestInfo> nameAsc = new Comparator<RestInfo>() {
        @Override
        public int compare(RestInfo o1, RestInfo o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };


    Comparator<RestInfo> nameDesc = new Comparator<RestInfo>() {
        @Override
        public int compare(RestInfo o1, RestInfo o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    final static int NAME_ASC = 0;
    final static int NAME_DESC = 1;

    public void setsort(int sorttype)
    {
        if (sorttype == NAME_ASC)
        {
            Collections.sort(data,nameAsc);
            this.notifyDataSetChanged(); // 얘의 this는 어댑터
        }
        else if (sorttype == NAME_DESC)
        {
            Collections.sort(data,nameAsc);
            this.notifyDataSetChanged(); // 얘의 this는 어댑터
        }
    }
}
