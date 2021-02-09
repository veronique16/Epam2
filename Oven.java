package com.company;

import java.util.ArrayList;
import java.util.List;

public class Oven extends HouseholdAppliances {
    public int Power_Consumption;
    public int Weight;
    public int Capacity;
    public int Depth;
    public double Height;
    public double Width;


    @Override
    ArrayList<String> getParametres() {
        ArrayList<String> parametres = new ArrayList<String>();
        parametres.add("POWER_CONSUMPTION");
        parametres.add("WEIGHT");
        parametres.add("CAPACITY");
        parametres.add("DEPTH");
        parametres.add("HEIGHT");
        parametres.add("WIDTH");
        parametres.add("PRICE");
        return parametres;
    }

    @Override
    void initializeFields(ArrayList<String> values) {
        Power_Consumption=Integer.parseInt(values.get(0));
        Weight=Integer.parseInt(values.get(1));
        Capacity=Integer.parseInt(values.get(2));
        Depth=Integer.parseInt(values.get(3));
        Height=Double.parseDouble(values.get(4));
        Width=Double.parseDouble(values.get(5));
        Price=Integer.parseInt(values.get(6));
    }

    @Override
    String getInformation() {
        String Information="Oven: power consumption - "+Power_Consumption+", weight - "+Weight+", capacity - "+
                Capacity+", depth - "+Depth+", height - "+Height+", width - "+Width+", price - "+Price;
        return Information;
    }
}
