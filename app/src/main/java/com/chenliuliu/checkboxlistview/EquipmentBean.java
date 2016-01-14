package com.chenliuliu.checkboxlistview;

import java.io.Serializable;

/**
 * Created by liuliuchen on 15/11/27.
 */
public class EquipmentBean implements Serializable {
    private int id;
    private String name;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private boolean flag = false;

    public EquipmentBean(String s, boolean falg) {
        this.flag = falg;
        this.name = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
