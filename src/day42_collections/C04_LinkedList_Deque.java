package day42_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_LinkedList_Deque {

    public static void main(String[] args) {

        // Deque double ended queue demektir
        // method'lar basa ve sona uygulanacak sekilde 2'ye ayrilir

        Deque<Integer> sayilar = new LinkedList<>();

        sayilar.add(4); // sona ekler
        sayilar.addLast(5); // sona ekler
        // This method is equivalent to add.
        // bu method add ile ayni islevi yapar
        System.out.println(sayilar); // [4, 5]
        sayilar.addFirst(9); // basa 9 ekler

        System.out.println(sayilar); // [9, 4, 5]
        sayilar.add(4);
        sayilar.add(7); //
        sayilar.add(3); //
        sayilar.add(5); //
        sayilar.add(8); //
        System.out.println(sayilar); // [9, 4, 5, 4, 7, 3, 5, 8]

        System.out.println(sayilar.remove()); // 9
        // deque'in basindaki elemani siler ve bize getirir
        System.out.println(sayilar); // [4, 5, 4, 7, 3, 5, 8]

        System.out.println(sayilar.removeLast()); // 8
        System.out.println(sayilar); // [4, 5, 4, 7, 3, 5]

        System.out.println(sayilar.removeFirstOccurrence(5)); // true
        System.out.println(sayilar); // [4, 4, 7, 3, 5]

        System.out.println(sayilar.removeLastOccurrence(4)); // true
        System.out.println(sayilar); // [4, 7, 3, 5]


        sayilar.push(8);
        // Pushes an element onto the stack represented by this deque
        // (in other words, at the head of this deque)
        // if it is possible to do so immediately without violating capacity restrictions,
        // throwing an IllegalStateException if no space is currently available.
        // This method is equivalent to addFirst.

        // addFirst() ile ayni islevi yapar
        // aralarindaki fark push() kapasite sinirlamasi yoksa ekler
        // kapasite sinirlamasi varsa IllegalStateException firlatir




























    }
}
