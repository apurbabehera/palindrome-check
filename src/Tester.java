import java.util.Scanner;

class Tester{
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
    	String revStr = "";
    	char[] charStrArr = str.toCharArray();
    	for(int i=charStrArr.length-1; i>=0; i--) {
    		revStr = revStr + charStrArr[i]; 
    	}
    	if (revStr.equals(str)) {
    		return true;
    	}
        return false;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string to check:");
		String str = sc.nextLine();
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
		sc.close();
	}
}
