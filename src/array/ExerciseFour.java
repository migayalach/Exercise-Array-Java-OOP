/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author miguel
 */
public class ExerciseFour extends Exercise {

    public ExerciseFour(int size) {
        super(size);
    }

    @Override
    public void ejecution() {
        int n = size;
        int i, d, aux;
        if (size % 2 == 0) {
            d = (size / 2);
        } else {
            d = (size - 1) / 2;
        }

        for (i = 1; i <= d; i++) {
            aux = vector[i];
            vector[i] = vector[n];
            vector[n] = aux;
            n--;
        }
    }

}
