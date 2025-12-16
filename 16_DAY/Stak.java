// package 16_DAY;

// public Stack & Queue (LIFO / FIFO) + Real Problems
// 🎯 Today’s Goals
// Stack concept
// Queue concept
// Stack using array + LinkedList
// Queue using array + LinkedList
// 2 practice questions
// 1 mini project

// Practice Questions
// Q1️⃣ Valid Parentheses (Stack Problem)
// Input: "(()[]{})"
// Check balanced or not using stack.

// Q2️⃣ Reverse Queue
// Queue me {1,2,3,4,5} push karo
// Output: 5 4 3 2 1
// (Hint: Queue → Stack → Queue)

// 🛠 Mini Project – “Call Center Customer Line”
// Using Queue:
// 5 customers enqueue karo
// 2 serve (remove/dequeue)
// Current queue print karo
// Agar queue empty ho jaye to custom message show karo

import java.util.Stack;

public class Stak {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println(stack); // [10, 20, 30]

    System.out.println(stack.pop()); // 30
    System.out.println(stack.peek()); // 20
  }
}