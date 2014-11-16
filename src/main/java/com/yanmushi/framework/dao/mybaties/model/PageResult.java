package com.yanmushi.framework.dao.mybaties.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.yanmushi.framework.core.model.PageData;
import com.yanmushi.framework.core.model.Pageable;
import com.yanmushi.framework.core.model.Pagination;


public class PageResult<T> extends PageData<T> implements Pageable<T>, List<T> {

	public PageResult(List<T> contents, Pagination pagination) {
		super(pagination, contents);
	}

	@Override
	public Pagination getPagination() {
		return pagination;
	}

	@Override
	public List<T> getDatas() {
		return datas;
	}

	@Override
	public int size() {
		return datas.size();
	}

	@Override
	public boolean isEmpty() {
		return datas.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return datas.contains(o);
	}

	@Override
	public Iterator<T> iterator() {
		return datas.iterator();
	}

	@Override
	public Object[] toArray() {
		return datas.toArray();
	}

	@Override
	public <E> E[] toArray(E[] a) {
		return datas.toArray(a);
	}

	@Override
	public boolean add(T e) {
		return datas.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return datas.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return datas.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return datas.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return datas.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return datas.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return datas.retainAll(c);
	}

	@Override
	public void clear() {
		datas.clear();
	}

	@Override
	public T get(int index) {
		return datas.get(index);
	}

	@Override
	public T set(int index, T element) {
		return datas.set(index, element);
	}

	@Override
	public void add(int index, T element) {
		datas.add(index, element);
	}

	@Override
	public T remove(int index) {
		return datas.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return datas.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return datas.lastIndexOf(o);
	}

	@Override
	public ListIterator<T> listIterator() {
		return datas.listIterator();
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return datas.listIterator(index);
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return datas.subList(fromIndex, toIndex);
	}

}
