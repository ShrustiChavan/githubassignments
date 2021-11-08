1)  public class Armstrong {

    public static void main(String[] args) {                                            step1: start

        int number = 153, originalNumber, remainder, result = 0;                        step2:declare and initialize the variables number=153,originalNumber,remainder,result =0

        originalNumber = number;                                                        step3: compare originalNumber with the armstrong number

        while (originalNumber != 0)                                                     step4:repeat until (originalNumber!=0)
        {
            remainder = originalNumber % 10;                                                    remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);                                                   result += Math.pow(remainder, 3);
            originalNumber /= 10;                                                               originalNumber /= 10;
        }                                                                                         
                                                                                         step5:if result == number

        if(result == number)                                                                      print"Armstrong number"
            System.out.println(number + " is an Armstrong number.");                               
        else                                                                                   else
            System.out.println(number + " is not an Armstrong number.");                           print"not Armstrong number"
    }

}

2)  public class Armstrong
   {
     public ststic void main(String[] args)
     {
       for(int k=100;k<=1000;k++)
       { int n=k;
         int d=0;
         int s=0;
         
         while(n>0)
       {
          d= n%10;
          s= s+(d*d*d);
          n=n/10;
       }
      if(k==s)
      {
        system.out.println(k+"is Armstrong number");
      }
     }
    }
   }
3)
import java.util.*;
public class intrest {

	public static void main(String[] args) {
		double p,n,r,si,ci;
		System.out.println("enter the intrest type 1.simple\n2.compound intrest");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 1 :System.out.println("enter principle: ");
				p=sc.nextDouble();
				System.out.println("enter duration in years: ");
				n=sc.nextDouble();
				System.out.println("enter Intrest rate: ");
				r=sc.nextDouble();
				si=p*n*r;
				System.out.println("simple intrest is: "+si);
				break;
		case 2 :System.out.println("enter principle: ");
				p=sc.nextDouble();
				System.out.println("enter duration in years: ");
				n=sc.nextDouble();
				System.out.println("enter Intrest rate: ");
				r=sc.nextDouble();
				ci=p*n*r;
		break;
		}
	}

}
4)class MyClass{
   public static void main(String[] args)
   {
      int a = 89;
      int b= 56;
      int c= 30;
     if((a>35)&&(b>35)&&(c>35))
     {
 	 System.out.println("student pass");
      }
	else if ((a>b)&&(b>c))
	{ 
	  System.out.println("promoted");
	}
	else
	 System.out.println("Fail");
	}
	}	
5)
import java.util.*;
public class Tax {

	public static void main(String args[]) {
		double sal,t = 0;
		System.out.println("enter your annual income :");
		Scanner sc = new Scanner(System.in);
			sal = sc.nextDouble();
			
			if(sal>0&&sal<=180000)
				System.out.println("SLOT A NO TAX LIABILITY");
			else
				if(sal>18000&&sal<=300000) {
					t = sal*0.10;
					System.out.println("SLOT B TAX LIABILITY:Rs."+t);
				}
					else
						if(sal>300000&&sal<=500000) 
						{
							  t=sal*0.20;
							System.out.println("SLOT C TAX LIABILITY:Rs."+t);
						}
						else
							if(sal>500000&&sal<=1000000)
									{
								t=sal*0.30;
								System.out.println("SLOT D TAX LIABILITY:Rs."+t);
									}
									
									sc.close();
	}
}
6) import java.util.Scanner;
public class Login_page {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sp=" ";
        System.out.println("Enter the Username");
        String uname = sc.nextLine();
        if((uname.contains(sp)) || uname.length()<4){
            System.out.println("Invalid Username");
            return;
        }

        System.out.println("Enter the Password");
        String upass = sc.nextLine();
        if((upass.contains(sp)) || upass.length()<8){
            System.out.println("Invalid Password");
            return;
        }

        System.out.println(uname+" you are Registered Successfully");

        System.out.println("Enter the Username");
        String lname = sc.nextLine();
        System.out.println("Enter the Password");
        String lpass = sc.nextLine();

        if(uname.equals(lname) && upass.equals(lpass)){
            System.out.println("Welcome "+lname+" you have Logged-in Successfully");
        }
        else{
            System.out.println("Username or password Mismatch");
        }
    }
}

output:
Enter the Username
Jack
Enter the Password
12345678
Jack you are Registered Successfully
Enter the Username
Jack
Enter the Password
12345678
Welcome Jack you have Logged-in Successfully

7)
import java.util.*;
public class searching {
	public static void main(String args[]) {
		int ele=0;
		int a=0;
		int[] array = new int[15];
		for(int i=0;i<15;i++) {
			System.out.println("enter element :");
			Scanner sc = new Scanner(System.in);
			ele=sc.nextInt();
			array[i]=ele;
		}
		for(int i=0;i<15;i++) {
			if(array[i]==19)
				a++;
		}
		if(a==1)
			System.out.println("Element Found....");
		else
			System.out.println("unable to find element");
		System.exit(1);
	}
}

8)

public class sorting {
	public static void main(String args[]) {
		int i=0,a=0,temp=0;
		int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}; 
		for(i=0;i<15;i++)
		{
			for(int j=i+1;j<15;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	for(i=0;i<15;i++) {
		System.out.println(array[i]);
	}

}
}

9) 

class BubbleSort
{
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}

	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}

