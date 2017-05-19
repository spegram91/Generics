import java.util.Arrays;

/**
 * Created by stephenpegram on 5/18/17.
 */
public class MyArrayList<E> {

    Object[] myList;

    private int length;

    @SuppressWarnings("unchecked")
    public MyArrayList(){
        myList = (E[]) new Object[0];
        length = 0;
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int size){
        myList = (E[]) new Object[size];
        length = 0;
    }




    public void add(E element){
        if(length == myList.length){
            myList = Arrays.copyOf(myList, length + 1);
        }
        myList[length++] = element;
    }

    public void add(E element, int index){
        if(length == myList.length){
            myList = Arrays.copyOf(myList, length + 1);
        }
        //System.arraycopy(myList, index, myList, index+1, myList.length-1);
        for(int i = myList.length - 2; i >= index; i--){
            myList[i] = myList[i - 1];
        }
        myList[index] = element;
        length++;
    }



    @SuppressWarnings("unchecked")
    public E get(int index){
        return (E) myList[index];
    }

    public E remove(int index){
        E removedElement = (E) myList[index];
        for(int i = index; i < myList.length - 1; i++){
            myList[i] = myList[i+1];
        }
        myList = Arrays.copyOf(myList, --length);
        return removedElement;
    }

    public E set(E element, int index){
        E replacedElement = (E) myList[index];
        myList[index] = element;
        return replacedElement;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        myList = (E[]) new Object[0];
        length = 0;
    }


    public boolean isEmpty(){
        return (length == 0);
    }

    public boolean contains(Object obj){
        for(Object o : myList){
            if(o.equals(obj))
                return true;
        }
        return false;
        }


    public int size(){
        return length;
    }


}
