public class Main {
    public static void main(String[] args) {
        int sayi=220;
        int sayi2=284;
        int toplam=0;
        int toplam1=0;

        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                toplam=toplam+i;

            }
        }
        for (int i=1;i<sayi2;i++){
            if (sayi2%i==0){
                toplam1=toplam1+i;

            }
        }
        if (sayi==toplam1 && sayi2==toplam){
            System.out.println("Bu iki sayı arkadaştır.");
        }else{
            System.out.println("Bu iki sayı arkadaş değildir");
        }
    }
}
