package com.chenliuliu.checkboxlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuliuchen on 16/1/14.
 */
public class ListAdapter extends ArrayListAdapter<EquipmentBean> {

    private List<Flag> typeList = new ArrayList<Flag>();

    public ListAdapter(Context context) {
        super(context);
    }

    private void initData() {
        for (EquipmentBean cartBean : mList) {
            Flag type;
            if (cartBean.isFlag()) {
                type = Flag.Checked;
            } else {
                type = Flag.UnCheck;
            }
            typeList.add(type);
        }
    }

    @Override
    public void setList(ArrayList<EquipmentBean> list) {
        super.setList(list);
        initData();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_equipment, parent, false);
            vh = new ViewHolder();
            vh.cb_name = (CheckBox) convertView.findViewById(R.id.cb_equipment);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.cb_name.setOnCheckedChangeListener(null);
        bindView(vh, position);
        return convertView;
    }

    private void bindView(ViewHolder vh, final int position) {
        vh.cb_name.setText(mList.get(position).getName());
        vh.cb_name.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mList.get(position).setFlag(true);
                    typeList.set(position, Flag.Checked);
                } else {
                    mList.get(position).setFlag(false);
                    typeList.set(position, Flag.UnCheck);

                }
            }
        });
        if (typeList.get(position) == Flag.Checked) {
            vh.cb_name.setChecked(true);
        } else if (typeList.get(position) == Flag.UnCheck) {
            vh.cb_name.setChecked(false);
        }
    }

    class ViewHolder {
        CheckBox cb_name;
    }

    public enum Flag {
        Checked, UnCheck;
    }
}
