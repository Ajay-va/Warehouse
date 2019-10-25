package com.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product {
	private int pid;

	public Product() {
		super();
	}

	@PostConstruct
	public void ajay()  {
		
		System.out.println("afterproperties method with interfaces");
		
	}
	@PreDestroy
	public void varma() {
		
		System.out.println("destroy method with interfaces");
	}
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + "]";
	}
	
	

}
