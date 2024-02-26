package opgave03.models;

public class Object<T> implements Ring<T>{
    private T[] items;
    private int size;

    public Object(int capacity) {
        @SuppressWarnings("unchecked")
        T[] empty = (T[]) new java.lang.Object[capacity];
        items = empty;
        size = 0;
    }

    public Object() {
        this(10);
    }

    @Override
    public void advance() {

    }

    @Override
    public T getCurrentItem() {
        return null;
    }

    @Override
    public void add(T item) {

    }

    @Override
    public boolean removeItem(T item) {
        return false;
    }

    @Override
    public T removeCurrentItem() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
