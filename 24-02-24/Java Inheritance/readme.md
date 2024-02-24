# Java Inheritance
Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.

Consider the following class cls1:  
class cls1  
{  
&emsp;void add(int p,int q){  
        &emsp;&emsp;System.out.println(p+q);  
    &emsp;}  
}  
  
There is another class cls2 which extends class cls1:  
class cls2 extends cls1  
{  
    &emsp;void mul(int p,int q)  
    &emsp;{  
        &emsp;&emsp;System.out.println(p*q);  
    &emsp;}  
}  
    
So we can make object of a class cls2, which can use both mul and add methods. Main function is already created in the editor and instance of cls2 is also made. So the task is to add a method in class cls2 naming task() which will take 2 parameters as input i.e. a and b and print the sum of their squares i.e a2+b2. Changes in the main function has been made already.

**Input:**  
The input line contains T, denotes the number of testcase. Each testcase contains one line containing a and b separated by space.  
  
**Output:**  
For each testcase in new line, print the required answer.  
  
**Link:** _https://www.geeksforgeeks.org/problems/java-inheritance/1?page=1&difficulty=School&status=unsolved&sortBy=submissions_
