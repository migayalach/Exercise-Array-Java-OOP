/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author miguel
 */
public class ExerciseOne extends Exercise {

    public ExerciseOne(int size) {
        super(size);
    }

    @Override
    public void ejecution() {
        int i, r = 2;
        for (i = 1; i <= size; i++) {
            vector[i] = r;
            r = r + 2;
        }
    }

}
