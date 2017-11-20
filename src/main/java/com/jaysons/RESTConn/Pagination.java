package com.jaysons.RESTConn;

public class Pagination {
 private int count;
 private int max;
 private int offset;
 private String sort;
 private String order;
 private int total;
 private String currentUrl;
 private String nextUrl;
 private String previousUrl;
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public int getMax() {
	return max;
}
public void setMax(int max) {
	this.max = max;
}
public int getOffset() {
	return offset;
}
public void setOffset(int offset) {
	this.offset = offset;
}
public String getSort() {
	return sort;
}
public void setSort(String sort) {
	this.sort = sort;
}
public String getOrder() {
	return order;
}
public void setOrder(String order) {
	this.order = order;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public String getCurrentUrl() {
	return currentUrl;
}
public void setCurrentUrl(String currentUrl) {
	this.currentUrl = currentUrl;
}
public String getNextUrl() {
	return nextUrl;
}
public void setNextUrl(String nextUrl) {
	this.nextUrl = nextUrl;
}
public String getPreviousUrl() {
	return previousUrl;
}
public void setPreviousUrl(String previousUrl) {
	this.previousUrl = previousUrl;
}
 
 
}
