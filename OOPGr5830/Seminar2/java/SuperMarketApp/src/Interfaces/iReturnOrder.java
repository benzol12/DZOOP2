package Interfaces;

import Classes.Actor;

public interface iReturnOrder { //1. Создал класс

//    public void warrantyRefound(iActorBehaviour actor); // клиент вернул товар по гарантии
//    public void didNotFitProduct(); // клиенту не подошел товар
//    public void wrongProduct(); // клиенту не подошел товар
//    public void overdueProduct(); // товар просрочен
//    Это же свойства товара! это наверное надо в отдельный класс! и тогда наверно надо создавать папки Clients и Product разделить их по разным кучам убираю тогда все это из Market
//    public void setTakeRefound(boolean val);
    public void setMakeRefound(boolean val);
    public Actor geActor();



}
