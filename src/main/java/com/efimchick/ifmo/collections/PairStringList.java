package com.efimchick.ifmo.collections;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

class PairStringList implements List<String> {
    ArrayList<String> list = new ArrayList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(final Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) list.toArray();
    }

    @Override
    public boolean add(final String s) {
        return (list.add(s) && list.add(s));
    }

    @Override
    public boolean remove(final Object o) {
        return (list.remove(o));
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return list.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return list.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public void replaceAll(UnaryOperator<String> operator) {
        list.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super String> c) {
        list.sort(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public String set(int index, String element) {
        list.set(index+1, element);
        return list.set(index, element);

    }

    @Override
    public void add(int index, String element) {
        list.add(index, element);
        list.add(index+1, element);
    }

    @Override
    public String remove(int index) {
        if(list.get(index-1).equals(list.get(index)))
            list.remove(index-1);
        if(list.get(index+1).equals(list.get(index)))
            list.remove(index+1);
        return list.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public ListIterator<String> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator<String> spliterator() {
        return list.spliterator();
    }
}
