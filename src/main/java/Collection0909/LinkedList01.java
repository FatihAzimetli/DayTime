package Collection0909;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        //Soru Bir müzik Calma senaryosu olusturun ve bunda Arraylist ile Linkedlist ile cözümleyin

        // ArrayList ve LinkedList kullanarak müzik çalma listesi oluşturuluyor.
        List<String> arrayListPlaylist = new ArrayList<>();
        List<String> linkedListPlaylist = new LinkedList<>();

        // Şarkılar ekleniyor
        arrayListPlaylist.add("Şarkı 1");
        arrayListPlaylist.add("Şarkı 2");
        arrayListPlaylist.add("Şarkı 3");

        linkedListPlaylist.add("Şarkı A");
        linkedListPlaylist.add("Şarkı B");
        linkedListPlaylist.add("Şarkı C");

        // ArrayList ile müziği çal
        System.out.println("ArrayList ile Müzik Çalma Listesi:");
        playMusic(arrayListPlaylist);

        // LinkedList ile müziği çal
        System.out.println("\nLinkedList ile Müzik Çalma Listesi:");
        playMusic(linkedListPlaylist);
    }

    public static void playMusic(List<String> playlist) {
        for (String song : playlist) {
            System.out.println("Şarkı Çalınıyor: " + song);
        }




    }
}
