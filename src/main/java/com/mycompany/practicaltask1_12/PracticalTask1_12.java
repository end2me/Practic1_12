package com.mycompany.practicaltask1_12;

import java.io.*;

class Plant implements Externalizable {
    private String name;
    private String type;
    private String color;
    private double height;
    private boolean isEdible;

    public Plant() {} 

    public Plant(String name, String type, String color, double height, boolean isEdible) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.height = height;
        this.isEdible = isEdible;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(type);
        out.writeObject(color);
        out.writeDouble(height);
        out.writeBoolean(isEdible);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        type = (String) in.readObject();
        color = (String) in.readObject();
        height = in.readDouble();
        isEdible = in.readBoolean();
    }

    @Override
    public String toString() {
        return "Название='" + name + '\'' +
                ", Тип='" + type + '\'' +
                ", Цвет='" + color + '\'' +
                ", Длина=" + height +
                ", Съедобность растения=" + isEdible;
    }
}