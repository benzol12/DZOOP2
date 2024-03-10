package Classes;

public class ActionClient extends Actor{
    private static String actionName; // добавляем поле
    private int clientID;
    private int countClients;

    public ActionClient (String actionName, int clientID, int countClients, String name) {
        super(name);
        ActionClient.actionName = actionName;
        this.clientID = clientID;
        this.countClients = countClients;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor geActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

}
