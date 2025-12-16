package main;

class Student {
  static String school = "DPS";

  static void show() {
    System.out.println("School: " + school);
  }
}

class Counter {
  static int count;

  Counter() {
    count++;
  }
}

class Bike {

  // final int speedLimit = 120;
  int speedLimit = 120;

  Bike(int speed) {
    this.speedLimit = speed;
    System.out.println(this.speedLimit);
  }
}