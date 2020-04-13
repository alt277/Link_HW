package Lists;
import java.io.*;

class Node
{
    public long data;
    public Node next;

    public Node(long dd)
    { data = dd; }

    public void displayLink(){
        System.out.print(data + " ");
    }
}
class List {
    private Node first;

    public List() {
        first = null;
    }
    public Node getFirst(){
        return first;
    }

    public void setFirst(Node f) {
        first = f;
    }

    public boolean isEmpty() {
        return first == null;
    }
    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
      if ( !isEmpty()) {
        Node current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
            System.out.println("");
       }else
            System.out.println("Список пуст ");
  }
}

class ListIterator
{
    private Node current; // Текущий элемент списка
    private Node previous; // Предыдущий элемент списка
    private List MyList; // Связанный список

    public ListIterator(List list) {
        MyList = list;
        reset();
    }

    public void reset() {
        current = MyList.getFirst();
        previous = null;
    }

    public boolean isEnd() {
        return (current.next==null); }

    public void nextLink() {
        if( !MyList.isEmpty() && !isEnd()) {
            previous = current;
            current = current.next;
        } else
        System.out.println("Следующий элемент отсутствует!");
    }

    public Node getCurrent(){
             return current; }

    public void insertBefore(long dd) {
        Node newLink = new Node(dd);
        if(previous == null) {
            newLink.next = MyList.getFirst();
            MyList.setFirst(newLink);
            reset();
        }
        else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public void insertAfter(long dd) {
        Node newLink = new Node(dd);
        if( MyList.isEmpty() ) {
            MyList.setFirst(newLink);
            current = newLink;
        }
        else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink(); // Переход к новому элементу
        }
    }
    public long deleteCurrent() {
        if (!MyList.isEmpty()) {

            long value = current.data;
            if (previous == null) {
                MyList.setFirst(current.next);
                reset();
            } else {
                previous.next = current.next;
                if (isEnd())
                    reset();
                else
                    current = current.next;
            }
            return value;
        }else
            System.out.println("Список пуст");
            return -1;
    }
} 

class IterApp
{
    public static void main(String[] args) throws IOException {
        List list = new List();
        ListIterator iter1 = list.getIterator();
        long value;

        list.displayList();
        iter1.nextLink();
        iter1.deleteCurrent();

        iter1.insertBefore(-1);
        iter1.insertAfter(0); // Вставка элементов
        iter1.insertAfter(1);
        iter1.insertAfter(2);
        iter1.insertAfter(3);
          list.displayList();
        iter1.insertBefore(5);
        iter1.insertBefore(6);
          list.displayList();

        System.out.println( iter1.deleteCurrent());
          list.displayList();
        iter1.reset();
        iter1.nextLink();
        System.out.println(iter1.deleteCurrent());
          list.displayList();
        }
    }





