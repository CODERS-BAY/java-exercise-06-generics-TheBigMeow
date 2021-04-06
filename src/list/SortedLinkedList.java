package list;

public class SortedLinkedList<S extends Comparable<S>> implements SortedList<S> {

    private int count = 0;

    private Node head;

    @Override
    public void insert(S element) {
        Node n = new Node(element, null);
        Node pred = null;
        Node succ = head;
        while (succ != null && element.compareTo(succ.Element) > 0 ){
            pred = succ;
            succ = succ.Next;
        }
        if (pred == null) {
            head = n;
        }
        else {
            pred.Next = n;
        }
        n.Next = succ;
        count++;
    }

    @Override
    public boolean delete(int index) {
        Node pred = null;
        Node n = head;
        int i = 0;
        while(i < index && n != null){
            pred = n;
            n = n.Next;
            i++;
        }
        if (n != null){
            if(pred == null){
                head = n.Next;
            }else {
                pred.Next = n.Next;
            }
            count--;
            return true;
        }

        return false;
    }

    @Override
    public S get(int index) {
        Node n = head;
        int i = 0;
        while(i < index && n != null){
            n = n.Next;
            i++;
        }
        if (n != null) {
            return n.Element;
        }
        return null;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        String s = "";
        Node n = head;
        while(n != null){
            s += "|" + n.Element;
            n = n.Next;
        }

        return s;
    }

    private class Node {
        public Node(S element, Node next) {
            Element = element;
            Next = next;
        }

        public S Element;
        public Node Next;
    }
}
