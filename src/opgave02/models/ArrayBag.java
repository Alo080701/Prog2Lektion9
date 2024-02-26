package opgave02.models;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /**
     * Create a bag with the given capacity.
     */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /**
     * Create a bag with capacity 10.
     */
    public ArrayBag() {
        this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if (!isFull()) {
            for (E item : items) {
                if (item != newEntry){
                    items[size] = newEntry;
                    size = size + 1;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public E remove() {
        if (!isEmpty()) {
            items[size] = null;
            size = size - 1;

        }
        return items[size];
    }

    @Override
    public boolean remove(E anEntry) {
        if (!isEmpty()) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == anEntry) {
                    items[i] = null;
                    size = size - 1;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        if (!isEmpty()) {
            while (size != 0) {
                items[size] = null;
                size = size - 1;
            }
        }
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int tæller = 0;

        for (E item : items) {
            if (item == anEntry) {
                tæller++;
            }
        }
        return tæller;
    }

    @Override
    public boolean contains(E anEntry) {
        for (E item : items) {
            if (item == anEntry) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E[] toArray() {
        return null;
    }
}