package basic.Queue;

import basic.LinkedList.LinkedList;

public class Queue extends LinkedList {
    public void offer(Object value){
        this.add(value);
    }

    public Object poll(){
        return this.remove(0);
    }
}
