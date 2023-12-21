package com.simplilearnjavapractice;

public class ClassesObjectsAndConstructors {
	//Defining a class called "Person"
	class Person {
	 // Fields or instance variables
	 private String name;
	 private int age;

	 // Constructor - used to initialize objects of the class
	 public Person(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }

	 // Method to get the person's details
	 public String getDetails() {
	     return "Name: " + name + ", Age: " + age;
	 }

	 public static void main(String[] args) {
	     // Creating objects (instances) of the Person class using the constructor
	     Person person1 = new Person("Alice", 25);
	     Person person2 = new Person("Bob", 30);

	     // Accessing object methods to get details
	     System.out.println("Person 1 Details: " + person1.getDetails());
	     System.out.println("Person 2 Details: " + person2.getDetails());
	 }
	}



