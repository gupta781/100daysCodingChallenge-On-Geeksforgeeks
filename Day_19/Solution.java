Question:- Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.
push1 : pushes element into first stack.
push2 : pushes element into second stack.
pop1 : pops element from first stack and returns the popped element. If first stack is empty, it should return -1.
pop2 : pops element from second stack and returns the popped element. If second stack is empty, it should return -1.

Example 1:-

Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output:
3 4 -1

Example 2:-

Input:
push1(1)
push2(2)
pop1()
push1(3)
pop1()
pop1()
Output:
1 3 -1

time complexity is O(N)

class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    void push1(int x)
    {
        top1++;
        arr[top1]=x;
      
    }
    void push2(int x)
    {
        top2--;
        arr[top2] = x;
       
    }
    int pop1()
    {
        if(top1==-1){
            return -1;
        }
        else
        return arr[top1--];
    }
    int pop2()
    { 
        if(top2==size) return -1;
        else return arr[top2++];

    }
}