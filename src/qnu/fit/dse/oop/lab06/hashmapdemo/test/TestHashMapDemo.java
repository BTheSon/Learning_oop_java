package qnu.fit.dse.oop.lab06.hashmapdemo.test;
import qnu.fit.dse.oop.lab06.hashmapdemo.HashMapExample;

public class TestHashMapDemo {
    public static void main(String[] args) {
        HashMapExample hashMapExample = new HashMapExample();

        hashMapExample.createHashMap();
        hashMapExample.createEmloyeeMap();
        hashMapExample.accessKeys();
        hashMapExample.obtainEntryKeySetValues();
        hashMapExample.iterateHashMap();
        hashMapExample.removeKeys();
    }
}
