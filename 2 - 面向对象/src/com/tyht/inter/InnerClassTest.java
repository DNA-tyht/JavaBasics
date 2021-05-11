package com.tyht.inter;

public class InnerClassTest {
	
	public static void main(String[] args) {
		
		Person.Dog dog = new Person.Dog();
		dog.show();
		Person person = new Person();
		Person.Bird bird = person.new Bird();
	}
}

class Person{
	
	String name;
	//成员内部类
	static class Dog{
		String name;
		public void show() {
			System.out.println("狗");
		}
	}
	
	class Bird{
		String name;
		public void show() {
			System.out.println("鸟");
			eat();
		}
		
		public void display(String name) {
			//方法的形参
			System.out.println(name);
			//内部类的属性
			System.out.println(this.name);
			//外部类的属性
			System.out.println(Person.this.name);
		}
	}
	
	public void eat() {
		System.out.println("吃饭");
	}

	//局部内部类
	public Person() {
		class CC{
		}
	}
	public void method() {
		class AA{
		}
		
		{
			class BB{
			}
		}
	}
}