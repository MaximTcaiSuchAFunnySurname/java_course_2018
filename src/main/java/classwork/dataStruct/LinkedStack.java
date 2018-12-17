package classwork.dataStruct;

public class LinkedStack<Item> implements IStack<Item> {
    private int size;
    private Node<Item> head;

    @Override
    public void push(Item item) {
        head = new Node<>(item, head);
        size++;
    }

    @Override
    public Item pop() {
        Item item = head.item;
        head = head.next;
        size--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ? true : false;

    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;

        public Node(Item item, Node<Item> next) {
            this.item = item;
            this.next = next;
        }

        public Item getItem() {
            return item;
        }

        public Node<Item> getNext() {
            return next;
        }
    }
}
