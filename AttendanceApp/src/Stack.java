public class Stack {
    public String[] array= new String[20];
    public int top = -1;
    public int capacity = 20;

    public boolean isFull() { return top == capacity - 1; }
    public boolean isEmpty() { return top == -1; }

    String pop() {
        if (isEmpty()) { return null; }

        String deletedValue = array[top];
        array[top] = null;
        top--;
        return deletedValue;
    }

    void push(String value) {
        if (isFull()) { return; }
        top++;
        array[top] = value;
    }

    String printStack() {

        String result = "{";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) { break; }
            result += (i + ". " + array[i] + ", ");
        }
        result+= "} ";
        return result;
    }
}
