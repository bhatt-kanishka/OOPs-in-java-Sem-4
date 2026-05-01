class Address {
 String city;

 Address(String city) {
  this.city = city;
 }
}

class Person {
 String name;
 Address address;

 Person(String name, Address address) {
  this.name = name;
  this.address = address;
 }

 Person(Person p) {
  this.name = p.name;
  this.address = new Address(p.address.city);
 }
}

class TestCopy {
 public static void main(String[] args) {
  System.out.println("Name: Kanishka Bhatt, Batch: 4, SAP ID: 590017366");

  Address addr = new Address("Delhi");
  Person p1 = new Person("Kanishka", addr);

  Person shallow = p1;
  shallow.address.city = "Mumbai";
  System.out.println("Output after shallow copy is: " + p1.address.city);

  Person deep = new Person(p1);
  deep.address.city = "Pune";

  System.out.println("Original city after deep copy is: " + p1.address.city);
  System.out.println("Copied city after deep copy is: " + deep.address.city);
 }
}