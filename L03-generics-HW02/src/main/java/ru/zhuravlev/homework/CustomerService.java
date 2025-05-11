package ru.zhuravlev.homework;

import java.util.*;

public class CustomerService {
    // todo: 3. надо реализовать методы этого класса
    // важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны
    Map<Customer, String> map = new LinkedHashMap<>();
//    Comparator<Customer> comp = new Comparator<Customer>() {
//        @Override
//        public int compare(Customer o1, Customer o2) {
//            if (o1.getScores() > o2.getScores()) {
//
//                return (int) o1.getScores();
//            } else {
//                return (int) o2.getScores();
//            }
//        }
//    };

TreeMap<Customer, String> treeMap = new TreeMap<>(new Comparator<Customer>() {
    @Override
    public int compare(Customer o1, Customer o2) {
        return (int)(o1.getScores() - o2.getScores());
    }
});
    public Map.Entry<Customer, String> getSmallest() {
        // Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
        Map.Entry<Customer, String> tempEntry = null;
        long temp = Long.MAX_VALUE;
        for (Map.Entry<Customer, String> entry : treeMap.entrySet())
            if (entry.getKey().getScores() < temp) {
                temp = entry.getKey().getScores();
                tempEntry = entry;
            }
        return tempEntry;
    }

//    new Customer(10, "Key", 20)
    public Map.Entry<Customer, String> getNext(Customer customer) {

        return null; // это "заглушка, чтобы скомилировать"
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }
}
