# Java Override
In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.  

Consider the following parent class :  

class Parent  
{  
&emsp;void show(int p)  
&emsp;{  
&emsp;&emsp;System.out.print(p+" ");  
&emsp;}  
&emsp;void print(int q){  
&emsp;&emsp;System.out.println(q+" ");  
&emsp;}  
}  

Also given a class named child which inherits from Parent class   
  
class Child extends Parent 
{  
&emsp;@Override  
&emsp;void show(int p) { System.out.print(p+" "); }  
}   
  
Your task is to create a method named print (which takes one integer as input ) in class Child which overrides the method print of the Parent class such that its prints the square of the input integer. In Main function instance of both classes are made and all methods are called in the editor.  
  
**Input:**  
The first line of input contains an integer T denoting the no of test cases then T test cases follow. First line of each test case contains four integers p,q,r,s.  
  
**Output:**  
Print the required output.  
  
**Link:** _https://www.geeksforgeeks.org/problems/java-override/1?page=1&difficulty=School&status=unsolved&sortBy=submissions_
