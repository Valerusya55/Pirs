public class Main {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addLast(1);         /* a */
        deque.addLast(2);
        deque.addLast(3);
        deque.addFirst(4);        /* б */
        deque.deleteLast();         /* в */
        deque.addFirst(5);       /* г */
        deque.addLast(6);        /* д */
        deque.print();              /* е */
        /*
        a) добавление 3х элементов в конец очереди
        б) добавление 1го элемента в начало очереди
        в) удаление 1го элемента из конца очереди
        г) добавление 1го элемента в начало очереди
        д) добавление 1го элемента в конец очереди
        е) получение из контейнера всех элементов (в одном направлении с начала в конец) (вывод в консоль)
        */
    }
}
