class Person {
  String name;
  int age;
  String gender;
  Address addr;
  
  Person(String name, int age, String gender, Address addr) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.addr = addr;
  }
}

class Address {
  String city;
  String state;
  
  Address(String city, String state) {
    this.city = city;
    this.state = state;
  }
}

class ExamplesPerson {
  ExamplesPerson() {}
  
  Address x = new Address("Boston", "MA");
  Address y = new Address("Warwick", "RI");
  Address z = new Address("Nashua", "NH");
  Person a = new Person("Tim", 20, "M", this.y);
  Person b = new Person("Pat", 19, "F", this.x);
  Person c = new Person("Kim", 17, "F", this.x);
  Person d = new Person("Dan", 22, "M", this.z);
  Person e = new Person("Frank", 19, "M", this.x);
  Person f = new Person("Roldan", 20, "M", this.z);
}