package com.example.guswn_000.a170413inclass;

import java.util.ArrayList;

/**
 * Created by guswn_000 on 2017-04-13.
 */

public class Groupdata
{
    String groupname;
    ArrayList<String> childlist;

    public Groupdata(String groupname, ArrayList<String> datalist) {
        this.groupname = groupname;
        this.childlist = new ArrayList<String>();
    }
}
