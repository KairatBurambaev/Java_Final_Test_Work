import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {
    
    private String name;
    private int RAM;
    private int Hard_disk;
    private String Sys;
    private String Color;

    public Notebook(String name, int RAM, int Hard_disk, String Sys, String Color) {
        this.name = name;
        this.RAM = RAM;
        this.Hard_disk = Hard_disk;
        this.Sys = Sys;
        this.Color = Color;
    }
    public boolean validateObject(){
        return true;
    }
    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("Оперативная память");
        list.add("Объём ЖД");
        list.add("Операционная система");
        list.add("Цвет");
        return list;
    }
    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "Объём опретивной памяти:" + RAM +
                ", Объём ЖД: " + Hard_disk + '\'' +
                ", операционная система: " + Sys + '\'' +
                ", Цвет: " + Color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public int getHard_disk() {
        return Hard_disk;
    }
    public void setHard_disk(int Hard_disk) {
        this.Hard_disk = Hard_disk;
    }
    public String getSys() {
        return Sys;
    }
    public void setSys(String Sys) {
        this.Sys = Sys;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
}