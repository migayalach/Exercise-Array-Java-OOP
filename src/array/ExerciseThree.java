/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author miguel
 */
public class ExerciseThree extends Exercise {

    public ExerciseThree(int size) {
        super(size);
    }

    @Override
    public void ejecution() {
        int i, x = 1, y = 1;
        for (i = 1; i <= size; i++) {
            if (y <= x) {
                vector[i] = 1;
                y++;
            } else {
                vector[i] = 0;
                y = 1;
                x++;
            }
        }
    }

}
