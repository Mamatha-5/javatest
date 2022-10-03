package org.mamatha;
import java.util.*;   
public class Locality 
	{ 
		String name;
		static int colgate; 
		static int pepsodent;
		static int patanjali;
		static int dabur;
		static String a="same values";
		int choice,m;                                                      
		static int countchild,countmen,countwomen;
		int memberType;
		String type;
		Scanner scan = new Scanner(System.in);

		public Locality() {
			System.out.println("Enter Your Name");
			this.name=scan.next();
			System.out.println("Type 1 for children or 2 for men or 3 for women");
			this.memberType=scan.nextInt();
			if(memberType==1) {
				this.type="children";
				countchild++;
				System.out.println("enter which 1 for colgate 2 for pepsodent 3 for patanjali 4 for dabur");
				choice=scan.nextInt();
				paste(choice);
			} 
			
			if(memberType==3) {
				this.type="women";
				countwomen++;
				System.out.println("enter which 1 for colgate 2 for pepsodent 3 for patanjali 4 for dabur");
				choice=scan.nextInt();
				paste(choice);
			}
			
			if(memberType==2) {
				this.type="men";
				countmen++;
				System.out.println("enter which 1 for colgate 2 for pepsodent 3 for patanjali 4 for dabur");
				choice=scan.nextInt();
				paste(choice);
			}}
		
		public void paste(int ch) {
			switch(ch) {
			case 1: colgate++;
			break;
			case 2: pepsodent++;
			break;
			case 3: patanjali++;
			break;
			case 4: dabur++;
			break;
			}
		}

		public static String countMembers() {
			if(colgate>pepsodent && colgate>patanjali && colgate>dabur) {
				a="max is colgate";
			}
			if(pepsodent>colgate && pepsodent>patanjali && pepsodent>dabur) {
				a="max is pepsodent";
			}
			if(patanjali>colgate&& patanjali>pepsodent && patanjali>dabur) {
				a="max is patanjali";
			}
			if(dabur>colgate && dabur>patanjali&& dabur>pepsodent) {
				a="max is dabur";
			}

	return "Number of children: "+countchild+"\nNumber of women: "+countwomen+"\nNumber of men: "+countmen+"\ncolgate: "+colgate+"\npepsodent: "+pepsodent+"\npatanjali: "+patanjali+"\ndabur: "+dabur+"\nmaximum is :"+a;
	}  
	}


