package Lists;

public class ListApp {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.display();
        System.out.println(list.find("B"));

        LinkedList<People> peopleList = new LinkedList<People>();
        peopleList.insert(new People("Vanya", 22));
        peopleList.insert(new People("Vasya", 18));


            if  ( peopleList.find (new People("Artem", 22)  ) ==null)
                System.out.println("Нет в списке");
            else
                System.out.println("Есть в списке");
    }
}