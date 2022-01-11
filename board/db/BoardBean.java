package com.board.db;

import java.sql.Date;

public class BoardBean {
	private int bo_num;
	private String bo_name;
	private String bo_pass;
	private String bo_title;
	private String bo_content;
	private int bo_readCount;
	private Date bo_time;
	
	public int getBo_num() {
		return bo_num;
	}
	public void setBo_num(int bo_num) {
		this.bo_num = bo_num;
	}
	public String getBo_name() {
		return bo_name;
	}
	public void setBo_name(String bo_name) {
		this.bo_name = bo_name;
	}
	public String getBo_pass() {
		return bo_pass;
	}
	public void setBo_pass(String bo_pass) {
		this.bo_pass = bo_pass;
	}
	public String getBo_title() {
		return bo_title;
	}
	public void setBo_title(String bo_title) {
		this.bo_title = bo_title;
	}
	public String getBo_content() {
		return bo_content;
	}
	public void setBo_content(String bo_content) {
		this.bo_content = bo_content;
	}
	public int getBo_readCount() {
		return bo_readCount;
	}
	public void setBo_readCount(int bo_readCount) {
		this.bo_readCount = bo_readCount;
	}
	public Date getBo_time() {
		return bo_time;
	}
	public void setBo_time(Date bo_time) {
		this.bo_time = bo_time;
	}
	
	public BoardBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardBean(int bo_num, String bo_name, String bo_pass, String bo_title, String bo_content,
			int bo_readCount, Date bo_time) {
		super();
		this.bo_num = bo_num;
		this.bo_name = bo_name;
		this.bo_pass = bo_pass;
		this.bo_title = bo_title;
		this.bo_content = bo_content;
		this.bo_readCount = bo_readCount;
		this.bo_time = bo_time;
	}
	
	@Override
	public String toString() {
		return "BoardBean [bo_num=" + bo_num + ", bo_name=" + bo_name + ", bo_pass=" + bo_pass + ", bo_title="
				+ bo_title + ", bo_content=" + bo_content + ", bo_readCount=" + bo_readCount + ", bo_time=" + bo_time
				+ "]";
	}
	
}
