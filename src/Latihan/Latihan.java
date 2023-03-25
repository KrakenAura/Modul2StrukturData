package Latihan;
import java.util.*;

public class Latihan {
    public static void main(String[] args) {
        ArrayList <String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Nama Hewan yang ditambahkan : \n" + hewan);

        ArrayList <String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        System.out.println("Nama Hewan yang dihapus : \n"+deleteHewan);

        ArrayList deletedData = new ArrayList<>();
        for(String warna : deleteHewan){
            hewan.removeIf(h -> h.equals(warna));
            deletedData.add(warna);
        }
        System.out.println("Nama Hewan setelah dihapus : \n"+hewan);
    }
}
