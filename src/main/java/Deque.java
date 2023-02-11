import java.util.Arrays;

public class Deque {
    private static final int
            DEFAULT_SIZE = 1,
            GROW_COEF = 2;

    private int[] array;
    private int countElements = 0;

    public Deque() {
        array = new int[DEFAULT_SIZE];
    }

    public int getCountElements() {
        return countElements;
    }

    public int getSize() {
        return array.length;
    }

    public void addFirst(int i) {
        ensureCapacity();
        System.arraycopy(array, 0, array, 1, countElements);
        array[0] = i;
        countElements++;
    }

    public void addLast(int i) {
        ensureCapacity();
        array[countElements++] = i;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("The deque is empty\n");
            return;
        }
        array = Arrays.copyOfRange(array, 1, array.length);
        countElements--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("The deque is empty\n");
            return;
        }
        array = Arrays.copyOf(array, array.length - 1);
        countElements--;
    }

    public boolean isEmpty() {
        return countElements == 0;
    }

    public int[] result() {
        return array;
    }


    public void print() {
        if (isEmpty()) {
            System.out.println("The deque is empty\n");
            return;
        }
        for (int i = 0; i < countElements; i++) {
            System.out.println(array[i]);
        }
    }

    private void ensureCapacity() {
        if (countElements + 1 > array.length) {
            array = Arrays.copyOf(array, array.length * GROW_COEF);
        }
    }
}
