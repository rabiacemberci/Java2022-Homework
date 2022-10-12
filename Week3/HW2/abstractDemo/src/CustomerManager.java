public class CustomerManager {

    //Strategy Design Pattern

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }
}
