package qnu.fit.dse.oop.lab06.sortingdemo.test;
import qnu.fit.dse.oop.lab06.sortingdemo.SortingExample;
public class TestSortingDemo {
    public static void main(String[] args) {
        SortingExample sortingExample = new SortingExample();

        sortingExample.sortArray();
        sortingExample.sortArrayList();
        sortingExample.sortElementWithComparable();
        sortingExample.sortElementComparator();
    }
}
