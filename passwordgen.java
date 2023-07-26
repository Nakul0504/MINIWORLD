import java.util.Scanner;
import java.util.Random;
class passwordgen {
    public static void main(String[] args) {
        String capalpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallalpha="abcdefghijklmnopqrstuvwxyz";
		String nums="1234567890";
		String symbols="#@$&*";
		String result="";
		Scanner sr=new Scanner(System.in);
		Random random = new Random();
		Boolean iscap=false,issmall=false,isnum=false,issym=false;
		int count=0;
		
		
		
		System.out.println("Welcome to Online Password Generator ...\n");
		System.out.println("PRESS yes OR no FOR THE FOLLOWING QUESTIONS..\n");
		
		
		System.out.println("1)Do you like to add CAPITAL APLHABETS:");
		String select=sr.nextLine();
		if(select.equals("yes")){
			iscap=true;
			result=result.concat(capalpha);
			count++;
		}
		System.out.println("2)Do you like to add SMALL APLHABETS:");
		select=sr.nextLine();
		if(select.equals("yes")){
			issmall=true;
			result=result.concat(smallalpha);
			count++;
		}
		System.out.println("3)Do you like to add NUMBERS:");
		select=sr.nextLine();
		if(select.equals("yes")){
			isnum=true;
			result=result.concat(nums);
			count++;
		}
		System.out.println("4)Do you like to add SYMBOLS:");
		select=sr.nextLine();
		if(select.equals("yes")){
			issym=true;
			result=result.concat(symbols);
			count++;
		}
		System.out.println("Enter your desired password length :\n");
		int length=Integer.parseInt(sr.nextLine());
		if(length<1 || length<count){
		    throw new ArithmeticException("Please enter a valid length for processing... ");
		}
		char output[]=new char[length];
		int i=0;
	     if(iscap){
		        output[i]=capalpha.charAt(random.nextInt(capalpha.length()));
		        i++;
		    }
		    if(issmall){
		        output[i]=smallalpha.charAt(random.nextInt(smallalpha.length()));
		        i++;
		    }
		    if(isnum){
		        output[i]=nums.charAt(random.nextInt(nums.length()));
		        i++;
		    }
		    if(issym){
		        output[i]=symbols.charAt(random.nextInt(symbols.length()));
		        i++;
		    }
		for(int j=count;j<length;j++)
		{
		    output[j]=result.charAt(random.nextInt(result.length()));
		}
		System.out.println("The Generated Password is :");
		System.out.println(output);
    }
}