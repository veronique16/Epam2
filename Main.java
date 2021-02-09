package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<HouseholdAppliances> technics = readFile("C:\\Users\\user\\Downloads\\Telegram Desktop\\appliances_db.txt");
        for (int i=0;i<technics.size(); i++) {
            System.out.println(technics.get(i).getInformation());
        }
        for (int i=0; i<technics.size();i++){
            if (technics.get(i) instanceof Kettle){
                System.out.println(technics.get(i).getInformation());
            }
        }
        int minPrice=technics.get(0).Price;
        for (int i=1; i<technics.size();i++){
            if (technics.get(i).Price<minPrice){
                minPrice=technics.get(i).Price;
            }
        }
        System.out.println("The minimal price is "+minPrice);
    }

    public static ArrayList<HouseholdAppliances> readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<HouseholdAppliances> householdAppliances = new ArrayList<HouseholdAppliances>();
        while(( line = reader.readLine() ) != null){
            if (line.equals("")){
                continue;
            }
            int index=line.indexOf(':');
            String name=line.substring(0, index);
            HouseholdAppliances ha = HouseholdAppliances.getTech(name.trim());
            ArrayList<String> param=ha.getParametres();
            ArrayList<String> values=new ArrayList<>();
            for (int i=0; i<param.size(); i++) {
                int start_index=line.indexOf(param.get(i))+param.get(i).length()+1;
                int end_index= i+1 == param.size() ?
                        line.length():
                        line.indexOf(param.get(i+1))-2;
                String value=line.substring(start_index, end_index);
                values.add(value.trim());
            }
            ha.initializeFields(values);
            householdAppliances.add(ha);

        }
        return householdAppliances;

    }
}
