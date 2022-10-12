abstract class BaseCreditManager implements ICreditManager {

    public abstract void calculate();//Ortak değil her yerde değişken. O yüzden abstract olarak bıraktık.

    public void save(){  //Her yerde ortak.
        System.out.println("Kaydedildi");

    }




}
