package com.kaanilkyaz.dataStructures.DynamicArray;

public class DynamicArray<String> {
    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public String get(int index) {
        return (String) data[index];
    }

    public void set(int index, String value) {
        data[index] = value;
    }

    public void insert(int index, String value) {
        // Check size
        if (size == initialCapacity) {
            resize();
        }

        // Copy up
        for (int j = size; j > index; j--) {
            data[j] = data[j - 1];
        }

        // Insert
        data[index] = value;
        size++;
    }

    public void delete(int index) {
        for(int i = index; i<size - 1;i++){
            data[i] = data[i + 1];
        }
        size --;
        if(index == size){
            data[index] = null;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean hasContains(String value) {
        for(int i = 0; i<size-1;i++){
            String currentValue = (String)data[i];
            if(currentValue.equals(value)){
                return true;
            }
        }
        return false;
    }

    private void resize() {
        Object[] newData = new Object[initialCapacity*2];
        for(int i = 0; i<initialCapacity;i++){
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity *= 2;
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("data[i] = " + data[i]);
        }
    }

    public void add(String value) {

        if(size == initialCapacity){
            resize();
        }
        data[size] = value;
        size++;
    }
}
