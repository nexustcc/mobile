package com.example.nexustcc.model;

public class Item {

    private int type;

    /*RECEBE OBJETOS DE QUALQUER OUTRA CLASSE*/

    private Object object;

    public Item () {

    }

    public Item(int type, Object object){
        this.type = type;
        this.object = object;

    }

    public int getType() { return type; }

    public void setType(int type) { this.type = type; }

    public Object getObject() { return object; }

    public void setObject(Object object) { this.object = object; }
}
