/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author miguel
 */
public class ExerciseSix extends Exercise {

    public ExerciseSix(int size) {
        super(size);
    }

    @Override
    public void ejecution() {
        int i = 1, j, aux = 0, ini = 0, sw = 0;
        while (i <= size) {
            if (vector[i] % 2 == 0) {
                aux = vector[i];
                for (j = i; j > ini; j--) {
                    vector[j] = vector[j - 1];
                }
                vector[ini] = aux;
                sw = 0;
                i += ini;
                ini = 0;
            } else {
                if (sw == 0) {
                    sw = 1;
                    ini = i;
                }
                i++;
            }
        }
    }

}
