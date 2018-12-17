package classwork.dataStruct;

public interface IQueue<Item> {
    public void enqueue(Item item);
    public Item dequeue();
    public int size();
    public boolean isEmpty();
}
