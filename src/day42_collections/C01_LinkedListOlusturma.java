package day42_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedListOlusturma {

    public static void main(String[] args) {


        // List<Integer> sayilar1 = new List<>();
        // List, Queue ve Deque Interface olduklarindan OBJE olusturulamaz
        // AMMA child class'in constructor'larini kullanabilirler

        List<Integer> sayilar1 = new LinkedList<>();

        Queue<Integer> sayilar2 = new LinkedList<>();

        Deque<Integer> sayilar3 = new LinkedList<>();

        // sayilar1, sayilar2 ve sayilar3 objelerinin HEPSI
        // LinkedList class'inin objeleridir
        // Hepsi ayni class'in objesi olduklari halde
        // Data turleri farkli interface'ler secildigi icin
        // bu 3 obje cok farkli ozellikler gosterir

    }
}
