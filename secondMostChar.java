import java.util.*;
import java.io.*;

class secondMostChar
{
	public static void main(String[] args) {
		String s="abccc#@@";
		int max=0;
		char key='a';
		int min=0;
		HashMap<Character,Integer> set=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
		    char c=s.charAt(i);
		    if(set.containsKey(c)){
		    	set.put(c,set.get(c)+1);
		        if(set.get(c)>=max){ 
		            max=set.get(c);
		        }else if(set.get(c)>=min && set.get(c)<max){
		        	min=set.get(c);
		        	key=c;
		        }
		    }
		    else
		   		set.put(s.charAt(i),1);
		}
		System.out.println("Second Most Char occured is : "+key);
		System.out.println("Occured "+set.get(key)+" Times");
	}
}




