/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author miguel
 */
public class ExerciseFive extends Exercise {

    public ExerciseFive(int size) {
        super(size);
    }

    @Override
    public void ejecution() {
        int i, j, k;
        for (i = 1; i <= size; i++) {
            j = i + 1;
            while (j <= size) {
                if (vector[i] == vector[j]) {
                    for (k = j; k <= size - 1; k++) {
                        vector[k] = vector[k + 1];
                    }
                    size--;
                } else {
                    j++;
                }
            }
        }
    }

}
