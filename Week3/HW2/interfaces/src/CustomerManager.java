public class CustomerManager { //İş kodları yazılır..


    private ICustomerDal customerDal;
    public CustomerManager (ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        customerDal.add();

    }
}
