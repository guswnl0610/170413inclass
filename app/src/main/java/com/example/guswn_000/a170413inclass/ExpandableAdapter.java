package com.example.guswn_000.a170413inclass;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;

import java.util.ArrayList;

/**
 * Created by guswn_000 on 2017-04-13.
 */

public class ExpandableAdapter extends BaseExpandableListAdapter {

    ArrayList<Groupdata> groupdata;
    @Override
    public int getGroupCount() {
        return groupdata.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return groupdata.get(groupPosition).childlist.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupdata.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return groupdata.get(groupPosition).childlist.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        //layoutinflater써서 막 그거 하고
        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
