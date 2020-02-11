import java.util.Scanner;
public class Main {
	 private static Scanner sc;
	public int add(int num1,int num2) {
		    return(num1+num2);
	      }
	 public int sub(int num1,int num2) {
		    return(num1-num2);
		  }
	 public int mul(int num1,int num2) {
		    return(num1*num2);
		  }
	 public int div(int num1,int num2) {
		    return(num1/num2);
		  }
	 public int exponent(int num1,int num2) {
		    int k=num1;
		    int l=(int)num2;
		    for(int i=0;i<l;i++) {
		    	k*=k;
		    }
		    return k;
		  }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("+, -, *, /,^ ");
        char op = sc.next().charAt(0);
        int r = 0;
        Main c=new Main();
        System.out.println("choice is:"+op);
        switch(op)
        {
            case '+':
                r = c.add(num1,num2);
                break;
            case '-':
                r = c.sub(num1,num2);
                break;
            case '*':
                r = c.mul(num1,num2);
                break;
            case '/':
                r = c.div(num1,num2);
                break;
            case '^':
            	r=c.exponent(num1,num2);
           
                return;
        }
        System.out.printf("%d %c %d= %d", num1, op, num2,r);
    }
}