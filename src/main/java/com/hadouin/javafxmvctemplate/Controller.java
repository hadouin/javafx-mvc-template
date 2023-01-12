package com.hadouin.javafxmvctemplate;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Subscriber> subscribers = new ArrayList<>();
    private Context context;

    public Controller(Context context) {
        this.context = context;
        this.context.setController(this);
    }

    /**
     * Adds a subscriber to the list
     * @param subscriber
     */
    public void subscribe(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    /**
     * Remove subscriber from the list
     * @param subscriber
     */
    public void unsubscribe(Subscriber subscriber){
        this.subscribers.remove(subscriber);
    }

    /**
     * Loop through the subscriber list to update
     */
    public void notifySubscribers(){
        for (Subscriber subscriber: subscribers) {
            subscriber.update(context);
        }
    }

    public void receiveNewString(String string){
        this.context.setTheString(string);
        notifySubscribers();
    }
}
