Question:- Write a program to implement a Stack using Array. Your task is to use the class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. 

Example 1:-

Input: 
push(2)
push(3)
pop()
push(4) 
pop()
Output: 3, 4

Example 2:-

Input: 
pop()
push(4)
push(5)
pop()
Output: -1, 5

time complexity is O(N)


class MyStack
{
    int top;
int arr[] = new int[1000];
 
    MyStack()
{
top = -1;
}
 
//Function to push an integer into the stack.
    void push(int a)
{
    // Your code here
    top++;
    arr[top] = a;
} 
 
    //Function to remove an item from top of the stack.
int pop()
{
        // Your code here
        if(top==-1)
        return -1;
        return arr[top--];
}
}
