package MyLinkedList;

public class Main {
    
    public static void main(String[] args) {
       
        MyList m = new MyList();
        m.addLast(10);//10
        m.addLast(30);//10 30
        m.addFirst(60);//60 10 30
        m.addFirst(40);//40 60 10 30
        m.addFirst(50);//50 40 60 10 30
        m.removeAfter(50);//remove second node from the list which info < 50
        m.traversal();//50 40 60 30
    }
}
