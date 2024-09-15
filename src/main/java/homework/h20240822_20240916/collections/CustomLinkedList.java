package homework.h20240822_20240916.collections;
//source : https://www.prepbytes.com/blog/linked-list/how-to-implement-generic-linkedlist-in-java/
class node<T> {
    // Stores data of the node
    T data;
    // Store address of the node
    node<T> next;
    // Constructor
    node(T data) {
        this.data = data;
        this.next = null;
    }
}
class list<T> {
    // Head of the node
    node<T> head;
    //Store length of the linked list
    private int len = 0;
    // Constructor
    list() {
        this.head = null;
    }
    // Method addNode(T data): This method add a new element at the end
    void addNode(T data) {
        // creating a new generic node
        node<T> temp = new node<>(data);
        // check if list is empty
        if (this.head == null) {
            head = temp;
        }
        // if list exists
        else {
            node<T> X = head;
            // Iterate the List
            while (X.next != null) {
                X = X.next;
            }
            X.next = temp;
        }
        // Increase the len after adding new node
        len++;
    }
    // Method addNode(int pos,T data): It will add a new element at a particular position
    void addNode(int pos, T data) {
        // Check position if its valid or not
        if (pos > len + 1) {
            System.out.println("Position not found");
            return;
        }
        // if new node is to be added in the beginning
        if (pos == 1) {
            node<T> temp = head;
            head = new node<T>(data);
            head.next = temp;
            return;
        }
        // Temporary node to store previous head
        node<T> temp = head;
        node<T> prev = new node<T>(null);
        // Interating
        while (pos - 1 > 0) {
            prev = temp;
            temp = temp.next;
            pos--;
        }
        prev.next = new node<T>(data);
        prev.next.next = temp;
    }
    // Method removeNode(T key): It will remove a node from the LinkedList
    void removeNode(T key) {
        node<T> prev = new node<>(null);
        prev.next = head;
        node<T> next = head.next;
        node<T> temp = head;
        // This will check whether the value is present or not
        boolean exists = false;
        if (head.data == key) {
            head = head.next;
            // Node is present which we will want to remove
            exists = true;
        }
        while (temp.next != null) {
            // Convert the value to be compared to string
            if (String.valueOf(temp.data).equals(String.valueOf(key))) {
                prev.next = next;
                exists = true;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;
        }
        if (exists == false && String.valueOf(temp.data).equals(String.valueOf(key))) {
            prev.next = null;
            exists = true;
        }
        // When the node which we want to delete exists
        if (exists) {
            // reduce the len of linked list
            len--;
        }
        // If it does not exist
        else {
            System.out.println("Not found in linked list");
        }
    }
    public String toString() {
        String S = "{";
        node<T> X = head;
        if (X == null)
            return S + "}";
        while (X.next != null) {
            S += String.valueOf(X.data) + "->";
            X = X.next;
        }
        S += String.valueOf(X.data);
        return S + "}";
    }
}
public class CustomLinkedList {
    public static void main(String[] args) {
        // Creating new linked list of int type
        list<Integer> list1 = new list<>();
        list1.addNode(01);
        list1.addNode(215);
        list1.addNode(639);
        list1.addNode(21, 345);
        System.out.println("Original list 1: " + list1);
        list1.removeNode(639);
        System.out.println("New list 1 after removing a node from the list: " + list1);
        System.out.println();
        // Create new linked list of string type
        list<String> list2 = new list<>();
        list2.addNode("a");
        list2.addNode("b");
        System.out.println("Original list 2: " + list2);
        list2.addNode(1, "c");
        System.out.println("New list 2 after adding element: " + list2);
    }
}