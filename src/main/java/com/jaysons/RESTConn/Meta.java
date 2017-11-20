package com.jaysons.RESTConn;
public class Meta {
	private int status;
	private Pagination pagination;
	private Results results;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	public Results getResults() {
		return results;
	}
	public void setResults(Results results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "Meta [status=" + status + ", pagination=" + pagination + ", results=" + results + "]";
	}
	

}
