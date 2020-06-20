package ds_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Color {
    final String color;
    final String site;

    Color(String color, String site) {
        this.color = color;
        this.site = site;
    }

    public String getColor() {
        return this.color;
    }

    public String getSite() {
        return this.site;
    }

    public String toString(){
        return "[Color : " + this.color + " : " + this.site + " ]";
    }

}

public class ColorReverseSort {
    public static void main(String[] args) {
        Color[] arrColors = {
            new Color("red","vadodara"),
            new Color("green","ahmedabad"),
            new Color("blue","surat"),
            new Color("red","vadodara"),
            new Color("green","ahmedabad"),
            new Color("blue","surat"),
            new Color("red","vadodara"),
            new Color("green","ahmedabad"),
            new Color("blue","surat"),
            new Color("red","vadodara"),
            new Color("green","ahmedabad"),
            new Color("blue","surat")
        };

        List<Color> colorList = Stream.of(arrColors).collect(Collectors.toList());
        System.out.println(colorList);

        List<Color> sortedColors = colorList.stream().sorted(Comparator.comparing(Color::getSite)).collect(Collectors.toList());
        System.out.println(sortedColors);
    }

}