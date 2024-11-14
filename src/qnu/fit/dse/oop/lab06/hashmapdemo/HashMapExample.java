package qnu.fit.dse.oop.lab06.hashmapdemo;

import qnu.fit.dse.oop.lab06.model.Employee;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    /*
    *
    *
    * */
    public void createHashMap() {
       System.out.println("createHashMap() !!");

       Map<String, Integer> numberMapping = new HashMap<>();

       numberMapping.put("One", 1);
       numberMapping.put("Two", 2);
       numberMapping.put("Three", 3);

       numberMapping.putIfAbsent("Four", 4);

       System.out.println(numberMapping);
    }

    public void createEmloyeeMap() {
        System.out.println("createEmloyeeMap() !!");
        Map<Integer, Employee> employeesMap = new HashMap<>();

        employeesMap.put(1201, new Employee(1201, "Eren Yeager", "Paradis"));
        employeesMap.put(1202, new Employee(1202, "Napoleon Bonaparte", "Paris"));
        employeesMap.put(1203, new Employee(1203, "David Martinez", "Night City"));

        System.out.println(employeesMap);
    }

    public void accessKeys() {
        System.out.println("accessKeys() !!");

        Map<String, String> userCityMapping = new HashMap<>();

        System.out.println("userCityMapping co rong khong?: " + userCityMapping.isEmpty());
        userCityMapping.put("Son", "Quy Nhon");
        userCityMapping.put("Xuyen", "Quang Binh");
        userCityMapping.put("Thao", "Kon Tum");

        System.out.println("userCityMapping HashMap: " + userCityMapping);

        System.out.println("Chung ta co thong tin thanh pho cua " + userCityMapping.size() + "Nguoi dung");

        String username = "Son";

        if (userCityMapping.containsKey(username))
            System.out.println(username + " song o " + userCityMapping.get(username));
        else
            System.out.println("Khong tim thay thong tin chi tiet ve thanh pho cho nguoi dung");

        if (userCityMapping.containsValue("Quy Nhon"))
            System.out.println("Co nguoi dung trong userCityMapping song o Night City");
        else
            System.out.println("Khong co nguoi dung trong userCityMapping song o Night City");


        userCityMapping.put(username, "Kon Tum");
        System.out.println(
                username  + " di chuyen toi thanh pho moi " +
                userCityMapping.get(username) + ",  userCityMapping moi: " +
                userCityMapping
        );

        System.out.println("Tuan o thann pho: " + userCityMapping.get("Tuan"));
    }

    public void removeKeys() {
        System.out.println("removeKeys() !!");

        Map<String, String> husbandWifeMapping = new HashMap<>();

        husbandWifeMapping.put("Eren", "Mikasa");
        husbandWifeMapping.put("Chris", "Quagmire");
        husbandWifeMapping.put("Steve", "Alex");

        System.out.println("Husband-Wife Mapping: " + husbandWifeMapping);

        String husband = "Eren";
        String wife = husbandWifeMapping.remove(husband);

        System.out.println("Couple (" + husband + " + " + wife + ") get divorced");

        System.out.println("New Mapping: " + husbandWifeMapping);

        boolean isRemoved = husbandWifeMapping.remove("Eren", "Aya");
        System.out.println("Did Eren get removed from the mapping?: " + isRemoved);

        wife = husbandWifeMapping.remove("David");
        if (wife == null)
            System.out.println("Locks like David is not married to anyone");
        else
            System.out.println("Removed David and his wife from the mapping");
    }

    public void obtainEntryKeySetValues() {
        System.out.println("obtainEntryKeySetValues() !!");

        Map<String, String> countryISOCodeMapping = new HashMap<>();
        countryISOCodeMapping.put("Vietnam", "VN");
        countryISOCodeMapping.put("Thailand", "TH");
        countryISOCodeMapping.put("Singapore", "SG");
        countryISOCodeMapping.put("South Korea", "KR");
        countryISOCodeMapping.put("Malaysia", "MY");

        Set<Map.Entry<String, String>> countryISOCodeEntries =
                countryISOCodeMapping.entrySet();
        System.out.println("countryISOCode entries: + "+ countryISOCodeEntries);

        Set<String> countries = countryISOCodeMapping.keySet();
        System.out.println("countries: " + countries);

        Collection<String> iseCodes = countryISOCodeMapping.values();
        System.out.println("isoCodes: " + iseCodes);
    }

    public void iterateHashMap() {
        System.out.println("iterateHashMap() !!!");

        Map<String, Double> employeeSalary = new HashMap<>();

        employeeSalary.put("Sarah", 85000.00);
        employeeSalary.put("Michael", 110000.00);
        employeeSalary.put("Emma", 92000.00);
        employeeSalary.put("James", 140000.00);
        employeeSalary.put("Lisa", 78000.00);

        System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
        employeeSalary.forEach((employee, salary) -> {
            System.out.println(employee + " => " + salary);
        });
        System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String, Double>> employeeSalaryEntries =
        employeeSalary.entrySet();

        for (Map.Entry<String, Double> entry : employeeSalaryEntries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n=== Iterating over the HashMap's entrySet using simple for-each loop ===");
        for (Map.Entry<String, Double> entry : employeeSalary.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n=== Iterating over the HashMap's keySet ===");
        employeeSalary.keySet().forEach(employee -> {
        System.out.println(employee + " => " +
            employeeSalary.get(employee));
        });
    }
}