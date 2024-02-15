package Recurssion;

public class su {
	public static void sub(String str,String ans) {
		if(ans.length()==str.length()) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<str.length();i++) {
		sub(str,ans+str.charAt(i));
	}
	}
	public static void main(String args[]) {
		String str="abc";
		sub(str,"");
	}
}
