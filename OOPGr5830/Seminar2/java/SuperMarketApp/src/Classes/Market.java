package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarcketBehaviour,iQueueBehaviour, iReturnOrder {

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.geActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.printf(actor.geActor().getName() + " клиент сделал заказ ");

            }
        }

    }


    @Override
    public void setTakeRefound(boolean val) {



    }

    @Override
    public void setMakeRefound(boolean val) {
        for (iActorBehaviour actor : queue) {
            actor.setMakeOrder(true);
            System.out.printf(actor.geActor().getName() + " клиент выбрал заказ для возврата"); // фактически поведение такое же как и когда делает заказ.
            // Если дальше развивать тему надо посмотреть как сделать так что бы невозможно вернуть некупленный  товар.  сделать лист для товара в
            // отдельном классе, добавить id товара id заказа функцию что если есть совпадения по id заказа и некоторым другим параметрам то этот
            // товар наш и мы можем его принять. Или сделать публичный id заказа и закрытый. Брать публичный id находить закрытый и по нему сверять.
            // Можно что то придумать связанное с имитовставкой и алгоритмами RSA ... но это уже Остапа понесло.
        }
    }

    @Override
    public Actor geActor() {
        return null;
    }
}
    

