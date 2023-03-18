/**
 * @KeteranganFile Tugas Array_Sesi ke 4_Meiriska agustina
 * @author Meiriska
 */
public class Tugas_Sesi4_Meiriska agustina {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("- Tugas Array - Sesi ke 4 - Meiriska agustina -");
        System.out.println("------------------------------------------------\n");

        char hotel [][] = {
            // Kamar (Kolom) 1, 2, 3, 4, 5
            // Lantai (Baris) 1, 2, 3, 4          
            {'*', '*', '*', 'X', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', 'X'}
        };
        
        char kamarIsi = 'X';
        char kamarKosong = '*';
        int jumlahKamar = hotel.length;
        int jumlahKamarKosong = 0;
        
        for(int lantai = 0; lantai < jumlahKamar; lantai++){
            for(int kamar = 0; kamar < hotel[lantai].length; kamar++){
                if(hotel[lantai][kamar] == kamarIsi){
                    System.out.println("Tamu berada di Lantai "+ (lantai+1) /* atau (lantai-4) */ +" Kamar "+ (kamar+1));
                }
                
                if(hotel[lantai][kamar] == kamarKosong){
                    jumlahKamarKosong++;
                }
            }
        }
        System.out.println("\nJumlah kamar yang tersedia adalah " + jumlahKamarKosong + " kamar");
    }
}
