package org.example.Seminar6.hw.Nb;

import java.util.*;

public class UI {
    private static Scanner scanner = new Scanner(System.in);

    public int getCriteria(){
        String text = "Select criteria: ";
        List<String> properties = propertiesForMenu();
        for (int i = 0; i < properties.size(); i++)
        {
            text += "\n" + (i + 1) + ". " + getPropertyDescription(properties.get(i));
        }
        System.out.println();
        int value = scanner.nextInt();
        return value;
    }

    public String getPropertyDescription(String property){
        Map<String, String> descriptionsProperties = descriptionsProperties();
        return descriptionsProperties.get(property);
    }

    public Map<String, String> descriptionsProperties(){
        Map<String, String> mapProperties = new HashMap<>();

        mapProperties.put("id", "Артикул");
        mapProperties.put("fabricator", "Производитель");
        mapProperties.put("size_ram", "Размер RAM");
        mapProperties.put("type_hd", "Тип HD");
        mapProperties.put("size_hd", "Размер HD");
        mapProperties.put("price", "Цена");

        return mapProperties;
    }

    public List<String> propertiesForMenu(){
        List<String> listProperties = new ArrayList<>();

        listProperties.add("id");
        listProperties.add("fabricator");
        listProperties.add("size_ram");
        listProperties.add("type_hd");
        listProperties.add("size_hd");
        listProperties.add("price");

        return listProperties;
    }
}
