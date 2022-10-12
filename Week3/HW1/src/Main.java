
public class Main {

    public static void main(String[] args) {

    	//Example 1
		//Referans Tipleri
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);


		//Example 2
		int[] sayilar1 = new int [] {1,2,3};
		int[] sayilar2 = new int [] {10,20,30};
		sayilar1 = sayilar2;

		sayilar2[0]=1000;
		System.out.println(sayilar1[0]);

		//---------------------------------------------

		/*CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();


		Customer customer = new Customer(); //Instance creation
		customer.Id = 1;
		customer.City = "Ankara";



		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();


		Company company = new Company();
		company.TaxNumber = "34335454";
		company.CompanyName ="Arçelik";
		company.Id = 100;


		Person person = new Person();
		person.FirstName = "Rabi";
		person.NationalyIdentity = "";
		person.LastName = "ASDHF";


		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();*/

		//-----------------------------------

		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.GiveCredit();





		









    }
}
