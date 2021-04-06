package model;

public class Persons implements Comparable<Persons> {


    public String Name;
    public Integer age;

    public Persons(String name, Integer age) {
        Name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Persons o) {
        return age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Persons{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

}
