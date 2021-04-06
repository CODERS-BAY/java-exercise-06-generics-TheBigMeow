package application;

import list.SortedLinkedList;
import list.SortedList;
import model.Animal;
import model.Persons;

public class Main {
    public static void main(String[] args) {
       /*
            test your implementation here
        */
        SortedList sl = new SortedLinkedList<Double>();
        sl.insert(20.5);
        sl.insert(5.0);
        sl.insert(10.0);
        sl.insert(12.0);
        System.out.println(sl.get(0));
        System.out.println(sl.get(3));
        System.out.println(sl.get(99));

        sl.delete(0);
        System.out.println(sl.get(0));

        System.out.println(sl);

        SortedList empty = new SortedLinkedList<Integer>();
        System.out.println(empty);

        System.out.println(empty.get(99));

        System.out.println(empty.delete(99));

        SortedList strings = new SortedLinkedList<String>();
        strings.insert("F");
        strings.insert("B");
        strings.insert("A");
        strings.insert("E");
        strings.insert("a");
        strings.insert("c");
        strings.insert("*");
        System.out.println(strings);

        SortedList animals = new SortedLinkedList<Animal>();
        animals.insert(new Animal("Cat"));
        animals.insert(new Animal("Dog"));
        animals.insert(new Animal("Bird"));
        animals.insert(new Animal("Fish"));


        System.out.println(animals);

        System.out.println(animals.get(2));

        System.out.println("Anzahl: " + animals.size());

        SortedList age = new SortedLinkedList<Persons>();
        age.insert(new Persons("Herbert", 43));
        age.insert(new Persons("Traudi", 80));
        age.insert((new Persons("Hugo", 3)));
        age.insert(new Persons("Adelheid", 25));

        System.out.println(age);
    }
}