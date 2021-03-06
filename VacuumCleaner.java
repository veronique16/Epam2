package com.company;

import java.util.ArrayList;

public class VacuumCleaner extends HouseholdAppliances {
    public int Power_Consumption;
    public String Filter_Type;
    public String Bag_Type;
    public String Wand_Type;
    public int Motor_Speed_Regulation;
    public int Cleaning_Width;

    @Override
    ArrayList<String> getParametres() {
        ArrayList<String> parametres = new ArrayList<String>();
        parametres.add("POWER_CONSUMPTION");
        parametres.add("FILTER_TYPE");
        parametres.add("BAG_TYPE");
        parametres.add("WAND_TYPE");
        parametres.add("MOTOR_SPEED_REGULATION");
        parametres.add("CLEANING_WIDTH");
        parametres.add("PRICE");
        return parametres;
    }

    @Override
    void initializeFields(ArrayList<String> values) {
        Power_Consumption=Integer.parseInt(values.get(0));
        Filter_Type=values.get(1);
        Bag_Type=values.get(2);
        Wand_Type=values.get(3);
        Motor_Speed_Regulation=Integer.parseInt(values.get(4));
        Cleaning_Width=Integer.parseInt(values.get(5));
        Price=Integer.parseInt(values.get(6));
    }

    @Override
    String getInformation() {
        String Information="Vacuum cleaner: power consumption - "+Power_Consumption+", filter type - "+Filter_Type+
                ", bag type - "+Bag_Type+", wand type - "+Wand_Type+", motor speed regulation - "+Motor_Speed_Regulation+
                ", cleaning width - "+Cleaning_Width+", price - "+Price;
        return Information;
    }
}
