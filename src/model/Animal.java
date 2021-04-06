package model;

public class Animal implements Comparable<Animal> {
    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                '}';
    }

    public String Name;



    public Animal(String name) {
        Name = name;
    }

    @Override
    public int compareTo(Animal o) {
        return Name.compareTo(o.Name);
    }
}
