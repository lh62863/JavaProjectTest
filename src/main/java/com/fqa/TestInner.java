package com.fqa;

import com.alibaba.fastjson.JSON;

public class TestInner {
	private String one;
	private String two;
	private Inner inner;
	
	
	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public String getTwo() {
		return two;
	}

	public void setTwo(String two) {
		this.two = two;
	}
	

	public Inner getInner() {
		return inner;
	}

	public void setInner(Inner inner) {
		this.inner = inner;
	}
	

	public static void main(String[] argv) {
		TestInner test = new TestInner();
		test.setOne("one");
		test.setTwo("two");
		Inner inner = test.new Inner();
		inner.setCity("city");
		inner.setName("name");
		test.setInner(inner);
		System.out.print(test);
	}
	
	public class Inner {
		private String name;
		private String city;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
	
}
