package com.java.List;

public class List<E> implements AbstractList<E> {

    private Object[] array;
    private int capacity;
    private int size;

    private void makeRoom() {
        capacity *= 2;
        Object[] temp = new Object[capacity];
        System.arraycopy(array, 0, temp, 0, capacity / 2);
        array = temp;
    }

    public List() {
        array = new Object[8];
        capacity = 8;
        size = 0;
    }

    @Override
    public void add(E element) {
        if (capacity == size)
            makeRoom();
        array[size] = element;
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size)
            return;
        if (capacity == size)
            makeRoom();
        for (int i = size; i > index; i--)
            array[i] = array[i-1];
        array[index] = element;
        size++;
    }

    @Override
    public void clear() {
        array = new Object[0];
        size = 0;
        capacity = 0;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++)
            if (array[i] == element)
                return true;
        return false;
    }

    @Override
    public boolean equals(List<E> list) {
        if (this.size != list.size || this.capacity != list.capacity)
            return false;
        for (int i = 0; i < size; i++)
            if (this.array[i] != list.array[i])
                return false;
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size)
            return null;
        return (E) array[index];
    }

    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < size; i++)
            if (array[i] == element)
                return i;
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size)
            return;
        for (int i = index; i < size-1; i++)
            array[i] = array[i+1];
        array[size-1] = 0;
        size--;
    }

    @Override
    public void remove(Object element) {
        remove(indexOf(element));
    }

    @Override
    public void set(int index, Object element) {
        if (index < 0 || index >= size)
            return;
        array[index] = element;
    }

    @Override
    public int size() {
        return size;
    }
}
