/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Random;

/**
 *
 * @author miguel
 */
public abstract class Exercise {

    protected int[] vector;
    protected int size;
    protected int limit = 10;

    public Exercise(int size) {
        this.vector = new int[100];
        this.size = size;
    }

    public abstract void ejecution();

    public void showArray() {
        int i;
        for (i = 1; i <= size; i++) {
            System.out.print("[" + vector[i] + "]\t");
        }
    }

    public void fillRandom() {
        int i, num;
        Random random = new Random();
        for (i = 1; i <= size; i++) {
            num = random.nextInt(limit);
            vector[i] = num;
        }
    }

}
