class Stack{
	static final int MAX=10;
	int top;
	int a[]=new int[MAX];
	
	Stack()
	{
		top=-1;
		
	}
	
	//underflow
	boolean isEmpty()
	{
		return (top<0); //top==-1
		
	}
	
	//insertion in stack
	boolean push(int x)
	{
		if(top>=(MAX-1))
		{
			System.out.println("Stack overflow");
			return false;
		}
		a[++top]=x;
		return true;
	}
	
	//deletion in stack
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
		    return 0;
		}
		
		return a[top--];
	}
	
	//peek in stack
	int peek()
	{
		return (top<0)?0:a[top];
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty Stack");
			
		}
		else
			System.out.println("Stack elements are:");
			show(top);//top ki position 
			System.out.println();
	}
	  void show(int index)
	  {
		  if(index<0)//base condition
		   return ;
	   System.out.println(a[index]+"");
	   show(index-1);//recursive call
	  }
}
class Stack1{
	 
	static void reverse(stringBuffer str)
	{
		int n=str.length();
		Stack s1=new Stack(n);
	    
		//push characters in stack
		for (int i=0;i<n;i++)
			s1.push(str.charAt(i));
		
		//pop one by one character and print
		for(int i=0;i<n;i++)
		{
			char ch=(char)s1.pop();
			str.setCharAt(i,ch);
		}
	}
	 
public static void main(String args[])
 {
	 Stack s1=new Stack();
	StringBuffer s= new StringBuffer("CDAC MUMBAI");
	reverse(s);
	System.out.println("reverse string:");
	 
	
	
	
	
	
 }

}