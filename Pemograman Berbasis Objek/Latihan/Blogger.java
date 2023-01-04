public class Blogger{
    public static void main(String[] args) {
     int i, j,k;
     for (i=1; i<=5; i++) {
      for (j=1; j<=i; j++) {
       
       /*untuk mencetak bintang tanpa baris baru kita 
       gunakan print bukan println*/
        System.out.print("*"); 
      }
      System.out.println(); //ini untuk menciptakan line baru
     }
     for (i=4;i>=1;i--) {
      /*untuk mencetak spasi */
      for (j=5;j>i ; j--) {
       System.out.print(" ");
      }
      for (k=1; k<=j; k++) {
       System.out.print("*");
      }
      System.out.println(); // mencetak baris baru
     }
    }
   }