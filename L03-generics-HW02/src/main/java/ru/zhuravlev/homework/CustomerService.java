package ru.zhuravlev.homework;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {
    // todo: 3. надо реализовать методы этого класса
    // важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны
    private final TreeMap<Customer, String> treeMap = new TreeMap<>(
            Comparator.comparingLong(Customer::getScores)
    );

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> entry = treeMap.firstEntry();
        if (entry == null) {
            return null;
        }
        Customer customerCopy = new Customer(
                entry.getKey().getId(),
                entry.getKey().getName(),
                entry.getKey().getScores()
        );
        return new AbstractMap.SimpleEntry<>(customerCopy, entry.getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> entry = treeMap.higherEntry(customer);
        if (entry == null) {
            return null;
        }
        Customer customerCopy = new Customer(
                entry.getKey().getId(),
                entry.getKey().getName(),
                entry.getKey().getScores()
        );
        return new AbstractMap.SimpleEntry<>(customerCopy, entry.getValue());
    }

    public void add(Customer customer, String data) {
        Customer copy = new Customer(customer.getId(), customer.getName(), customer.getScores());
        treeMap.put(copy, data);
    }
}
