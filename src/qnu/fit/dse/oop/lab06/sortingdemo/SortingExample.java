package qnu.fit.dse.oop.lab06.sortingdemo;

import qnu.fit.dse.oop.lab06.model.Fruit;

import java.util.*;


public class SortingExample {
    public void sortArray() {
        System.out.println("sortArray() !!");

        String[] fruits = new String[] {"Apple", "Orange", "Banana"};
        Arrays.sort(fruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits " + i + fruits[i]);
        }
    }

    public void sortArrayList() {
        System.out.println("sortArrayList() !!!");

        List<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        Collections.sort(fruits);

        int i = 0;
        for (String temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp);
        }
    }

    public void sortElementWithComparable() {
        System.out.println("sortElementWithComparable() !!!");

        Fruit[] fruits = new Fruit[3];

        Fruit apple = new Fruit("Apple", "Apple description", 100);
        Fruit orange = new Fruit("Orange", "Orange description", 120);
        Fruit banana = new Fruit("Banana", "Banana description", 90);

        fruits[0] = apple;
        fruits[1] = orange;
        fruits[2] = banana;

        Arrays.sort(fruits);

        int i = 0;
        for (Fruit temp : fruits) {
        System.out.println("fruits " + ++i + " : " +
                temp.getFruitName() + ", Quantity : " + temp.getQuantity());
        }
    }

    public void sortElementComparator() {
        System.out.println("sortElementComparator() !!!");

        List<Fruit> fruitList = new ArrayList<>();
        Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);
        Fruit apple = new Fruit("Apple", "Apple description", 100);
        Fruit orange = new Fruit("Orange", "Orange description", 80);
        Fruit banana = new Fruit("Banana", "Banana description", 90);

        fruitList.add(pineappale);
        fruitList.add(apple);
        fruitList.add(orange);
        fruitList.add(banana);

        System.out.println("Fruits : " + fruitList);
// Sort fruits by fruit name
        Comparator<Fruit> fruitNameComparator = new Comparator<Fruit>() {

            @Override
            public int compare(Fruit obj1, Fruit obj2) {
                String fruitName1 = obj1.getFruitName().toUpperCase();
                String fruitName2 = obj2.getFruitName().toUpperCase();
                return fruitName1.compareTo(fruitName2);
            }
        };

        Collections.sort(fruitList, fruitNameComparator);
        System.out.println("\nFruits (Sorted by fruit name) : " + fruitList);


        Comparator<Fruit> quantiyComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit obj1, Fruit obj2) {
                if (obj1.getQuantity() < obj2.getQuantity())
                    return -1;
                else if (obj1.getQuantity() > obj2.getQuantity())
                    return 1;
                else
                    return 0;
            }
        };
        Collections.sort(fruitList, quantiyComparator);
        System.out.println("\nFruits (Sorted by quantiy) : " + fruitList);
    }

}
