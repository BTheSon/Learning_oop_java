package qnu.fit.dse.oop.lab06.hashsetdemo.test;
import qnu.fit.dse.oop.lab06.hashsetdemo.*;

public class TestHashSetDemo {
    public static void main(String[] args) {
        HashSetCreationExample hashSetCreation = new HashSetCreationExample();
        HashSetRetrieveElementExample hashSetElements = new HashSetRetrieveElementExample();
        HashSetRemoveElementExample hasSetRemove = new HashSetRemoveElementExample();
        HashSetIterationExample hasSetIterator = new HashSetIterationExample();

        hashSetCreation.createHashSet();
        hashSetElements.retrieveElement();
        hasSetRemove.removeElements();
        hasSetIterator.hashSetIterator();
    }
}
