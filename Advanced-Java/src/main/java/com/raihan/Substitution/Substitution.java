package com.raihan.Substitution;

import java.util.ArrayList;
import java.util.List;

public class Substitution {
    public static void build(Building building){
        System.out.println(building);
    }

    public static void printBuildings(List<? extends Building> buildingList){
        for(Building building: buildingList){
            System.out.print(building.toString() + " ");
        }
        System.out.println();
    }

    public static void addHousetoList(List<? super House> houseList){
        houseList.add(new House());
    }

    public static void main(String[] args){
        Building building = new Building();
        Office office = new Office();

        build(building);
        build(office);

        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building());
        buildingList.add(new Office());

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office());
        officeList.add(new Office());

        List<House> houseList = new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House());

        printBuildings(buildingList);
        printBuildings(officeList);
        printBuildings(houseList);

        addHousetoList(houseList);
        addHousetoList(buildingList);
    }
}
