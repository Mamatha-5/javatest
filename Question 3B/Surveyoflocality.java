package org.mamatha;
import java.util.*;
public class Surveyoflocality 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<Integer,Locality> mapValue = new HashMap<Integer,Locality>();

		System.out.println("Enter the Number of users in locality");

      
		int num = sc.nextInt();

		for(int i=1; i<=num; i++)
		{
			mapValue.put(i, new Locality());
		}

		//System.out.println("The Values are: "+mapValue.toString());

		for(Map.Entry<Integer, Locality> entry:mapValue.entrySet()){    
			int key=entry.getKey();  
			Locality b=entry.getValue();  
			System.out.println(key+" Data:");  
			System.out.println("Name: " + b.name + "\nMember Type: " + b.type);    
		}

		System.out.println(Locality.countMembers());
	}
}