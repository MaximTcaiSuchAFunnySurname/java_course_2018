package classwork.dataStruct;

public class Queue<Item> implements IQueue<Item> {
    private Node<Item> tail;
    private Node<Item> head;
    private  int size;
    @Override
    public void enqueue(Item item) {
    Node<Item> temp = tail;
    tail = new Node<Item>(item);
    if (isEmpty()){
        head = tail;
    } else{
        temp.next = tail;
    }
    size++;
    }

    @Override
    public Item dequeue() {
        size--;
        Item item = head.item;
        head = head.next;
        return item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;

        public Node(Item item, Node<Item> next) {
            this.item = item;
            this.next = next;
        }

        public Node(Item item){

        }

        public Item getItem() {
            return item;
        }

        public Node<Item> getNext() {
            return next;
        }
    }
}
