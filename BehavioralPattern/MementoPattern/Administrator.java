package BehavioralPattern.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Administrator {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
