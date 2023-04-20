package module3.HW5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet<T> {
    List<T>[] array;
    int CAPACITY = 10;
    public MyHashSet(){
        array = new LinkedList[CAPACITY];
    }

    public boolean add(T value){
        int hash = getHash(value);
        if(array[hash] == null)
            array[hash] = new LinkedList<>();
        if(array[hash].stream().noneMatch(el -> el == value)){
            array[hash].add(value);
            return true;
        }
        return false;
    }

    public T remove(T value){
        int hash = getHash(value);
        if(array[hash] == null)
            return null;
        T removed = array[hash].stream().filter(el -> el.equals(value)).findAny().orElse(null);
        array[hash].remove(removed);
        return removed;
    }

    private int getHash(T element){
        return (element.hashCode() & 0xfffffff) % CAPACITY;
    }
    public void printSet(){
        System.out.println(Arrays.deepToString(array));
    }
}
