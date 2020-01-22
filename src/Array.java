import java.util.*;

public class Array {
    private List<Integer> array;

    public Array(int length) {
        array = new ArrayList<Integer>();

        for (int i = 0; i < length; i++) {
            array.add((int)(Math.random() * 10));
        }
    }

    public void print() {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }

    public void sort() {
        int in, out, temp;
        for (out = 1; out < array.size(); out++) {
            temp = array.get(out);
            in = out;
            System.out.println(out + " - проход, метка " + temp);
            while (in > 0 && array.get(in - 1) >= temp) {
                array.set(in, array.get(in - 1));
                --in;
            }
            array.set(in, temp);
            print();
        }
    }

}
