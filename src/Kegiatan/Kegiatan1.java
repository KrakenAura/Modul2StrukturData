package Kegiatan;
import java.util.ArrayList;

public class Kegiatan1 {
    public static void main(String[] args) {
        ArrayList <String> hewan = new ArrayList<>();
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        System.out.println("Output awal : "+hewan);
        hewan.add("Badak");
        hewan.add("Bebek");

        /*int firstMatch = hewan.indexOf("Bebek");
        int lastMatch = hewan.lastIndexOf("Bebek");
        System.out.println("Posisi Index : "+firstMatch+" "+ lastMatch);*/

        for(int i = 0; i < hewan.size();i++){
            if(hewan.get(i).equals("Bebek")){
                System.out.println("Index Bebek : "+i);
            }
        }

        hewan.remove(1);
        System.out.println("\nOutput setelah menghapus Bebek Pertama: ");
        System.out.println(hewan+"\n");

        System.out.println("Index ke-0 : "+hewan.get(0));
        System.out.println("Index ke-2 : "+hewan.get(2));

        System.out.println("Output setelah index pertama dihapus : ");
        hewan.remove(0);
        System.out.println(hewan+"\n");

        System.out.println("Output setelah modifikasi index ke-0 dan tambahan index ke-2");
        hewan.set(0,"Ular");
        hewan.add(2,"Itik");
        System.out.println(hewan);

        System.out.println("\nOutput setelah menghapus index ke-1 sampai ke-5 : ");
        hewan.subList(1,5).clear();
        System.out.println(hewan);

        System.out.println("\nElemen pertama : "+hewan.get(0));
        System.out.println("Elemen terakhir : "+hewan.get(hewan.size()-1));
        System.out.println("Jumlah elemen : "+hewan.size());

        System.out.println("Index elemen badak : "+hewan.indexOf("Badak"));


    }
}
