package com.company;

import java.util.ArrayList;

public class Refrigerator extends HouseholdAppliances {
    public int Power_Consumption;
    public int Weight;
    public int Freezer_Capacity;
    public double Overall_Capacity;
    public int Height;
    public int Width;

    @Override
    ArrayList<String> getParametres() {
        ArrayList<String> parametres = new ArrayList<String>();
        parametres.add("POWER_CONSUMPTION");
        parametres.add("WEIGHT");
        parametres.add("FREEZER_CAPACITY");
        parametres.add("OVERALL_CAPACITY");
        parametres.add("HEIGHT");
        parametres.add("WIDTH");
        parametres.add("PRICE");
        return parametres;
    }

    @Override
    void initializeFields(ArrayList<String> values) {
        Power_Consumption=Integer.parseInt(values.get(0));
        Weight=Integer.parseInt(values.get(1));
        Freezer_Capacity=Integer.parseInt(values.get(2));
        Overall_Capacity=Double.parseDouble(values.get(3));
        Height=Integer.parseInt(values.get(4));
        Width=Integer.parseInt(values.get(5));
        Price=Integer.parseInt(values.get(6));
    }

    @Override
    String getInformation() {
        String Information="Refrigerator: power consumption - "+Power_Consumption+", weight - "+Weight+
                ", freezer capacity - "+Freezer_Capacity+", overall capacity - "+Overall_Capacity+", height - "+
                Height+", width - "+Width+", price - "+Price;
        return Information;
    }
}
