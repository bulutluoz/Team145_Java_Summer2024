package day42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList_Queue {

    public static void main(String[] args) {

        Queue<Integer> sayilar2 = new LinkedList<>();
        Queue<Integer> sayilar3 = new LinkedList<>();

        // inheritance hatirlatma :
        // sayilar2 objesi LinkedList objesidir
        // ANCAK data turu Queue secildiginden
        // TUM QUEUE'lar ile ortak ozelliklerini gorebiliriz

        // Queue ==> kuyruk
        // eklenenler sona eklenir
        // silinenler bastan silinir

        sayilar2.add(3);
        sayilar2.add(5);
        sayilar2.add(7);
        sayilar2.add(1);

        System.out.println(sayilar2); // [3, 5, 7, 1]

        sayilar2.remove();
        System.out.println(sayilar2); // [5, 7, 1]


        System.out.println(sayilar2.peek()); // 5
        // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        // queue'nun basindaki elementi silmeden bize getirir, liste bos ise null dondurur
        System.out.println(sayilar2); // [5, 7, 1]

        System.out.println(sayilar3); // []
        System.out.println(sayilar3.peek()); // null


        System.out.println(sayilar2.element()); // 5
        // Retrieves, but does not remove, the head of this queue.
        // queue'nun basindaki elementi silmeden bize getirir
        // This method differs from peek only in that it throws an exception if this queue is empty.
        // peek'den farki, bos queue'da kullanilirsa exception firlatmasidir
        System.out.println(sayilar2); // [5, 7, 1]

        // System.out.println(sayilar3.element()); // NoSuchElementException


        System.out.println(sayilar2.poll()); // 5
        // Retrieves and removes the head of this queue, or returns null if this queue is empty
        // ilk elementi siler ve bize getirir, queue bos ise null getirir
        System.out.println(sayilar2); // [7, 1]

        System.out.println(sayilar3.poll()); // null


        sayilar2.offer(9);
        // Inserts the specified element into this queue
        // if it is possible to do so immediately without violating capacity restrictions.
        // When using a capacity-restricted queue,
        // this method is generally preferable to add,
        // which can fail to insert an element only by throwing an exception.
        System.out.println(sayilar2); // [7, 1, 9]
        // add() ile ayni islemi yapar
        // aralarindaki fark
        // add() mutlaka ekler,
        // offer() ise eklemeyi teklif eder
        // Eger bir kapasite sinirlamasi yoksa EKLENIR
        // kapasite sinirlamasi varsa exception firlatir



    }
}
