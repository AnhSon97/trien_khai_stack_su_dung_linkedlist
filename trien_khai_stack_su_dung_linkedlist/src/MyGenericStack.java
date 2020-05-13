import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T>{
    private LinkedList<T> stack;
    MyGenericStack(){
        stack = new  LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        GenericStackClient.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        GenericStackClient.stackOfIStrings();
    }
}
