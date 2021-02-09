package com.company;

import java.util.ArrayList;

public class Kettle extends HouseholdAppliances {
    public double Volume;
    public int Battery_Capacity;
    public int Temperature_Maintenance;
    public double Cord_Length;

    @Override
    ArrayList<String> getParametres() {
        ArrayList<String> parametres = new ArrayList<String>();
        parametres.add("VOLUME");
        parametres.add("BATTERY_CAPACITY");
        parametres.add("TEMPERATURE_MAINTENANCE");
        parametres.add("CORD_LENGTH");
        parametres.add("PRICE");
        return parametres;
    }

    @Override
    void initializeFields(ArrayList<String> values) {
        Volume=Double.parseDouble(values.get(0));
        Battery_Capacity=Integer.parseInt(values.get(1));
        Temperature_Maintenance=Integer.parseInt(values.get(2));
        Cord_Length=Double.parseDouble(values.get(3));
        Price=Integer.parseInt(values.get(4));
    }

    @Override
    String getInformation() {
        String Information="Kettle: volume - "+Volume+", battery capacity - "+Battery_Capacity+
                ", temperature maintenance - "+Temperature_Maintenance+", cord length - "+Cord_Length+
                ", price - "+Price;
        return Information;
    }
}
