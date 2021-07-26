package latihan1;

public class Latihan1 {

   
    public static void main(String[] args) {
         System.out.println("===== Latihan Soal 1 =====");
        System.out.println( );
         
         int n = 48; //Membuat variabel n dengan nilai 48
         int jumlah = 0; //Membuat variabel jumlah dengan nilai 0
         
         for(int i=3; i<=n ; i+=5){ // i = 3 --> untuk suku pertama/awal adalah 3, 
                                              // dengan i<=n maka nilai i kurang dari sama dengan n yaitu 48, maka batas akhirnya adalah 48
                                              //i+=5, maka setiap sekali perulangan, nilai i akan bertambah 5
             jumlah= jumlah + i; // menghitung jumlah keseluruhan deret bilangan yaitu dengan jumlah adalah hasil dari jumlah ditambah dengan i
            System.out.print(i + " "); //mencetak nilai i
        }
         System.out.println( );
         System.out.println("Jumlah deret bilangan = " + jumlah); //mencetak nilai jumlah
    }
    
}
