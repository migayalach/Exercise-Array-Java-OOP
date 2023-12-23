/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author miguel
 */
public abstract class Exercise {

    protected int[] vector;
    protected int size;

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

}
