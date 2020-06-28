package edu.csuft.bruno.inheritance;

/**
 * Aninmal类
 *
 */
public class Animal {
    int age;
    float weight;

    public Animal() {

    }

    public void running() {
        System.out.print("running");
    }

    public void eating() {
        System.out.print("eating");
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Animal(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }
}
