class Recursion5{

static int fib(int n){
if(n<=1)
{
	return n ;
}
else 
{
	return fib(n-1)+fib(n-2);
}
}
public static void main(String [] args){
 int num=10;
for (int i=1;i<=num;i++){
System.out.print(fib(i)+" ");
}

}
}

// dry run 
//fib(3)=fib(2)+fib(1)
//fib(1)+fib(0)
//https://www.mathsisfun.com/games/towerofhanoi.html
