package com.learning.taskapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;



public class taskAdapter extends BaseAdapter {
    private Context context;

    private List<task> taskList;

    public taskAdapter(Context context, List<task> taskList){
        this.context = context;
        this.taskList = taskList;
    }
    @Override
    public int getCount() {
        return taskList.size();
    }

    @Override
    public Object getItem(int i) {
        return taskList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View contextView, ViewGroup viewGroup) {
        ViewHolder holder;
        if(contextView == null){
            contextView = LayoutInflater.from(context)
                    .inflate(R.layout.list_item, viewGroup, false);
            holder = new ViewHolder();
            holder.text = contextView.findViewById(R.id.textView);
            holder.check = contextView.findViewById(R.id.checkBox);
            contextView.setTag(holder);
        }else{
            holder = (ViewHolder) contextView.getTag();
        }
        task task = taskList.get(i);
        holder.text.setText(task.getName());
        holder.check.setChecked(task.gettaskStatus());
        return contextView;
    }

    static class ViewHolder{
        TextView text;
        CheckBox check;
    }
}
