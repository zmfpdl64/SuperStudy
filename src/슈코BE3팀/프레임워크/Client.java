package 슈코BE3팀.프레임워크;

import 슈코BE3팀.프레임워크라이브러리IOC.연습코드.MyFramework;

public class Client {
    private final Service service;

    public Client(Service service) {
        this.service = service;
    }

    public void performAction() {
        service.doSomething();
    }

    public static void main(String[] args) {
        MyFramework framework = new MyFramework();
        Service service = new ServiceImpl();
        framework.register(Service.class, service);

        Client client = new Client(framework.resolve(Service.class));
        client.performAction();
    }
}
