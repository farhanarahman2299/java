/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author lab-06
 */
public class Nesting {

    int m, n;

    Nesting(int x, int y) {
        m = x;
        n = y;
    }

    public int max() {
        if (m > n) {
            return m;
        } else {
            return n;
        }
    }

    public void display() {
        int a = max();
        System.out.println("Maxium:" + a);
    }
}
