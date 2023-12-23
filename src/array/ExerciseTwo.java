/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author miguel
 */
public class ExerciseTwo extends Exercise {

    public ExerciseTwo(int size) {
        super(size);
    }

    Helpers helpers = new Helpers();

    @Override
    public void ejecution() {
        int i;
        for (i = 1; i <= size; i++) {
            vector[i] = helpers.fibonnaci(i);
        }
    }

}
