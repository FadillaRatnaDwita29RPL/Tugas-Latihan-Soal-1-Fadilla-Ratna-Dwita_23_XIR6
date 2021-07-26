package latihans1;

public class LatihanS1 {

    public static void main(String[] args) {
        System.out.println("===== Latihan Soal 1 =====");
        System.out.println( );
         
         int n, x, y, Un, Sn; //Membuat variabel dengan tipe data integer
         n = 10; //variabel n yang merupakan batas dari jumlah suku yaitu suku ke-10
         x = 3; //variabel x bernilai 3 yang merupakan nilai dari suku pertama
         y = 5; //variabel y bernilai 5 yang merupakan selisih atau beda dari setiap suku
         Un = 0; 
         
         for(int i=1;  i<=n;  i++){ //perulangan , 
             Un = x + (i - 1) * y; //untung menghitung nilai dari setiap suku (suku ke-n)
             
             System.out.println("Nilai suku ke-" + i + " adalah = " + Un); //Mencetak nilai dari suku ke-n yang dihitung menggunakan perulangan
        }
            Sn = (x+Un) * n/2;  //rumus untuk menghitung jumlah keseluruhan dari deret bilangan
            System.out.println("Jumlah deret aritmatika yang terdiri dari " + n +" suku adalah " +  Sn);


    }
    
}
