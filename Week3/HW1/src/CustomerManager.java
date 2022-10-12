public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager){ //Interfaceler referans tiplidir. Parametre olarak kullanabilirim.
        _customer = customer;                                                 // Polymorphism
        _creditManager = creditManager;

    }

    public void Save(){
        System.out.println("Müşteri Kaydedildi " );
    }

    public void Delete(){
        System.out.println("Müşteri Silindi " );
    }

    public void GiveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi");


    }
}
