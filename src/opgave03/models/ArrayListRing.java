package opgave03.models;

import java.util.ArrayList;

public class ArrayListRing<T> implements Ring<T> {
    private final ArrayList<T> items = new ArrayList<>();
    private T currentItem;

    public ArrayListRing() {
        currentItem = null;
    }


    @Override
    public void advance() {
        if (!isEmpty()) {
            if (items.indexOf(currentItem) < items.size() - 1) {
                currentItem = items.get(items.indexOf(currentItem) + 1);
            } else {
                currentItem = items.getFirst();
            }
        }
    }

    @Override
    public T getCurrentItem() {
        if (!isEmpty()) {
            return currentItem;
        } else {
            throw new EmptyRingException("No Items");
        }
    }

    @Override
    public void add(T item) {
        if (!items.contains(item)) {
            items.add(item);
        }

    }

    @Override
    public boolean removeItem(T item) {
        if (!isEmpty()) {
            for (T t : items) {
                if (t == item) {
                    items.remove(t);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public T removeCurrentItem() {
        if (!isEmpty()) {
            items.remove(currentItem);
            advance();
            return currentItem;
        } else {
            throw new EmptyRingException("No Items");
        }
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }
}
