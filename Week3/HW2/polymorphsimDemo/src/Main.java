public class Main {

    public static void main(String[] args) {

        //Polymorphisim
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsolLogger()};
//        for (BaseLogger logger: loggers){
//            logger.Log("Log mesajı ");
//        }

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
    }
}
