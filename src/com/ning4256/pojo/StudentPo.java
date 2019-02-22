package com.ning4256.pojo;

public class StudentPo {
	private int sid;
	private String sname;
	private int sage;
	public int getsid() {
		return sid;
	}
	public void setsid(int sid) {
		this.sid = sid;
	}
	public String getsname() {
		return sname;
	}
	public void setsname(String sname) {
		this.sname = sname;
	}
	public int getsage() {
		return sage;
	}
	public void setsage(int sage) {
		this.sage = sage;
	}
	public StudentPo() {
		
	}
	public StudentPo(int sid, String sname, int sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "StudentPo [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}
	
	
}
