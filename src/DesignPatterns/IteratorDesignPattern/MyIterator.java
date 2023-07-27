package DesignPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MyIterator {
    List<User>list = new ArrayList<User>();
    int length ;
    int position = 0;

    boolean hasNext(){
        if(position>=length){
            return false;
        }
        return true;
    }
    User next(){
        User u  = list.get(position);
        position+=1;
        return u;
    }
    public MyIterator(List<User>list){
      this.list= list;
        length = list.size();
    }
}
