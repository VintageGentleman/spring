package com.ezen.springdatabase.common;

import java.util.ArrayList;
import java.util.List;

public class Pagination {

	public static final int PAGENUM = 10;
	private final int POSINUM = 5;
	private int firstPage;
	private int lastPage;
	private int currPage;
	
	public Pagination(int totalNum) {
		firstPage = 1;
		lastPage = calLastPage(totalNum);
	}
	
	private int calLastPage(int totalNum) {
		return totalNum % PAGENUM == 0 ? totalNum / PAGENUM : totalNum / PAGENUM + 1;
	}
	
	public int getFirstPage() {
		return firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public List<Integer> getPageList() {
		if(currPage > lastPage || currPage < 0) return null;
		
		List<Integer> list = new ArrayList<>();
		
		int currPosition = currPage % POSINUM == 0 ? currPage / POSINUM : currPage / POSINUM + 1; 
		int firstBtn = (currPosition - 1) * POSINUM + 1;
		int lastBtn = firstBtn + POSINUM - 1;
		
		for(int i = firstBtn; i <= lastBtn && i <= lastPage; ++i) {
			list.add(i);
		}
		
		return list;
	}
	
}
