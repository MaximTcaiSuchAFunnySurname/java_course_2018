package classwork.dataStruct;

public class Main {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        for (int i =0; i< 5; i++){
            stack.push(i);
        }
        for(int i = 0; i < 5; i++){
            System.out.println(stack.pop());
        }
        Integer[] array = new Integer[]{0,1,2,3,4};
        for (int i = 0; i < 5; i++){
            System.out.println(array[array.length-i-1]);
        }
        LinkedStack<String> bag = new LinkedStack<String>();
        bag.push("Book");
        bag.push("Pen");
        bag.push("Pencil");
        for (int i = 0; i <= bag.size()+1; i++){
            System.out.println(bag.pop());
        }
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i< 4; i++){
            q.enqueue(i);
        }
        for (int i = 0; i < 4; i++){
            System.out.println(q.dequeue());
        }
    }
}
