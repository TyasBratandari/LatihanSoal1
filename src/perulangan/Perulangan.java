package perulangan;

/**
 *
 * @author Tyas
 */
public class Perulangan {
    
    public static void main(String[] args) {
    
        int a,b; //inisialisasi variabel dengan tipe data integer
        a = 3; // variabel a sebagai suku pertama dengan nilai 3
        System.out.println("Nilai suku pertama  = " + a); // kode out put untuk menampilkan hasil nilai suku pertama
        b = 5; //variabel b adalah jumlah selisih setiap suku suku lainya yang bernilai 5
        System.out.println("Nilai selisih tiap suku = " +b); // kode out put untuk menampilkan selisih setiap suku
        
        for (int i = 1; i <= 10 ; i++ ){ //perulangan
            
            int Un = a + ( i - 1) * b; // sebagai operator dengan rumus mencari suku ke-n
            System.out.println("Nilai suku ke-" + i + " adalah = " + Un); // untuk menampilkan hasil suku ke-n sesuai perulangan dengan rumus tersebut

            int Sn = (a + Un) * i / 2; // sebagai operator dengan rumus mencari jumlah ke-n suku
            System.out.println("Jumlah Deret Aritmatika dengan suku ke-" + i + " adalah = " + Sn); // untuk menampilkan hasil jumlah suku ke-n sesuai perulangan dengan rumus tersebut
        }
                
    }
    
}
