package listas;


import listas.SinglyLinkedList;

class Main {
  public static void main(String[] args) {
    SinglyLinkedList sLL = new SinglyLinkedList();
    sLL.createDoubleLinkedList(5);

    sLL.insertInLinkedList(6, 0);
    sLL.insertInLinkedList(7, 2);

    sLL.insertInLinkedList(8, 2);
    System.out.println(sLL.size);
    /*
    sLL.insertInLinkedList(9, 0);
    sLL.traverseSinglyLinkedList();
    sLL.deleteSLL();
    sLL.traverseSinglyLinkedList();*/

  }
}
