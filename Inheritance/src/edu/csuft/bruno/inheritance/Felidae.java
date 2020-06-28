package edu.csuft.bruno.inheritance;

/**
 * Felidae类
 *
 */
public class Felidae extends Animal {

    public Felidae(int age, float weight) {
        super(age, weight);
    }

    public Felidae() {
        super();
    }

    public void Meowing() {
        System.out.print("producing the meowing meowing sound.");
    }
}
