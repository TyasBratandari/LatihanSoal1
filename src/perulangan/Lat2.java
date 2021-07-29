package perulangan;

/**
 *
 * @author Tyas
 */
public class Lat2 {
    
    public static void main(String[] args){
        int a,b; // inisialisasi variabel tipe data
        for (a=0; a<=4; a++){ // perulangan untuk variable a
            for (b=0 ; b<a; b++); // perulangan untuk variable b
            
            System.out.println("*"); // kode out put utuk menampilkan bintang yang pertama untuk membentuk 
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
        }
    }
}
