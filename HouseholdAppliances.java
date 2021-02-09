package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class HouseholdAppliances {
    public int Price;
    abstract ArrayList<String> getParametres();
    abstract void initializeFields(ArrayList<String> values);
    abstract String getInformation();

    static HouseholdAppliances getTech(String name) {
        switch (name) {
            case ("Oven"):
                return new Oven();
            case ("Laptop"):
                return new Laptop();
            case ("Refrigerator"):
                return new Refrigerator();
            case ("VacuumCleaner"):
                return new VacuumCleaner();
            case ("TabletPC"):
                return new TabletPC();
            case ("Speakers"):
                return new Speakers();
            case ("Kettle"):
                return new Kettle();
            default: return null;
        }

    }
}
