package com.resolve.counter;

import java.util.ArrayList;

public class Countermain {

	public static void main(String[] args) {
		String countNumber = new String("11000000011000");
		
		
		
		String[] cnArray = countNumber.split("");
		ArrayList<String> reverseArray = new ArrayList<String>();
		ArrayList<String> reverseArray2 = new ArrayList<String>();
		ArrayList<String> readArray = new ArrayList<String>();
		ArrayList<String> countZero = new ArrayList<String>();
		ArrayList<String> countZero2 = new ArrayList<String>();
		ArrayList<String> countZero3 = new ArrayList<String>();
		Integer compareNum = 0;
		for (String strArray : cnArray) {
			System.out.print(" "+strArray);
		}
			System.out.println();
		
		for (int i = cnArray.length -1; i >= 0 ; i--) {
			if(!(cnArray[i].equals(",")))
			reverseArray.add(cnArray[i]);
		}
		
		for (String reverse : reverseArray) {
			System.out.print(" "+reverse);
		}
		    System.out.println();
		    
		for (int i = 0; i < reverseArray.size(); i++) {
			compareNum = Integer.parseInt(reverseArray.get(i));
			String[] readNum = {"영","일","이","삼","사","오","육","칠","팔","구"};
			
			
			if(reverseArray.size() == 1 ) {
				
				for (int j = 0; j< readNum.length; j++) {
					if(compareNum==j ) {readArray.add(i, readNum[j]);}
				}

			}
			
			if(reverseArray.size() >= 2 &&  (i%4)==0 ) {
				if(compareNum==1 && (reverseArray.size() == 5) && i==4)  {readArray.add(i, "");}
				else if(compareNum==1 ) {readArray.add(i, "일");}
				if(compareNum==0 ) {readArray.add(i, "");}

				for (int j = 2; j< readNum.length; j++) {
					if(compareNum==j ) {readArray.add(i, readNum[j]);}
				}
			}
			
			if(reverseArray.size() >= 2 && (i%4)==1 ) {
				if(compareNum==1 && (i==8 || i==12)) {readArray.add(i, "일");}
				else if(compareNum==1 ) {readArray.add(i, "십");} 
				if(compareNum==0 ) {readArray.add(i, "");}
				
				for (int j = 2; j< readNum.length; j++) {
					if(compareNum==j ) {readArray.add(i, readNum[j]+"십");}
				}
			}
			
			if(reverseArray.size() >= 2 && (i%4)==2 ) {
				
				if(compareNum==0 ) {readArray.add(i, "");}
				if(compareNum==1 ) {readArray.add(i, "백");}
				
				for (int j = 2; j< readNum.length; j++) {
					if(compareNum==j ) {readArray.add(i, readNum[j]+"백");}
				}
			}
			
			if(reverseArray.size() >= 2 && (i%4)==3 ) {
				
				if(compareNum==0 ) {readArray.add(i, "");}
				if(compareNum==1 ) {readArray.add(i, "천");}
				
				for (int j = 2; j< readNum.length; j++) {
					if(compareNum==j ) {readArray.add(i, readNum[j]+"천");}
				}
			}
			
			//if(i==1 || i==5 || i==9) {readArray.add(i, "십");}
			//if(i==2 || i==6 || i==10) {readArray.add(i+1, "백");}
			
			//if(cnArray.length > 2 ) {readArray.add(i,reverseArray.get(i));}
			
		}
		Integer thirteen = 0;
		Integer ninth = 0;
		Integer fourth = 0;
		
		 
		
		
		if(5 > reverseArray.size() ) {
			for (int j = 0; j < reverseArray.size(); j++) {
				fourth = Integer.parseInt(reverseArray.get(j));
				if(fourth==0) {
				countZero.add(reverseArray.get(j));}
			}
			if(countZero.size()==4) {
				if(compareNum==0 ) {readArray.add(3, "영");} 
           				
			}
			if(countZero.size()==3) {
				if(compareNum==0 ) {readArray.add(2, "영");} 
           				
			}
			if(countZero.size()==2) {
				if(compareNum==0 ) {readArray.add(1, "영");} 
           				
			}
		}
		
		
		
		if(9 > reverseArray.size() && reverseArray.size() >=5) {
			for (int j = 0; j < 4; j++) {
				fourth = Integer.parseInt(reverseArray.get(j));
				if(fourth==0) {
				countZero.add(reverseArray.get(j));}
			}
			if(countZero.size()==4) {
				if(compareNum==0 ) {readArray.add(4, "영");} else
				readArray.add(4, "만");
			} else {
				readArray.add(4, "만 ");
			}
		}
		
		if(13 > reverseArray.size() && reverseArray.size() >=9 ) {
			for (int j = 0; j < 4; j++) {
				fourth = Integer.parseInt(reverseArray.get(j));
				if(fourth==0) {
				countZero.add(reverseArray.get(j));}
			}
			
			if(countZero.size()==4) {
				
				readArray.add(4, "만");
			} else {
				readArray.add(4, "만 ");
			}
			
			for (int j = 4; j < 8; j++) {
				ninth = Integer.parseInt(reverseArray.get(j));
				if(ninth==0) {
				countZero2.add(reverseArray.get(j));}
			}
			if(countZero2.size()==4) {
				readArray.remove(4);
			}
			if(countZero.size()==4 && countZero2.size()==4) {
				if(compareNum==0 ) {readArray.add(8, "영");} else
				readArray.add(8, "억");
				
			} else if(countZero.size()==4 && !(countZero2.size()==4)){
				readArray.add(9, "억 "); 
			} else if(!(countZero.size()==4) && !(countZero2.size()==4)){
				readArray.add(9, "억 "); 
			} else {
				readArray.add(8, "억 "); 
			}
			
			if( (readArray.get(5).equals("일") && readArray.get(6).equals("") && readArray.get(7).equals("") && readArray.get(8).equals(""))) {
				readArray.set(5, "");
			}
			
			
		}
		
		if(17 > reverseArray.size() && reverseArray.size() >=13 ) {
			
			for (int j = 0; j < 4; j++) {
				fourth = Integer.parseInt(reverseArray.get(j));
				if(fourth==0) {
				countZero.add(reverseArray.get(j));}
			}
			
			if(countZero.size()==4) {
				readArray.add(4, "만");
			} else {
				readArray.add(4, "만 ");
			}
			
			for (int j = 4; j < 8; j++) {
				ninth = Integer.parseInt(reverseArray.get(j));
				if(ninth==0) {
				countZero2.add(reverseArray.get(j));}
			}
			if(countZero2.size()==4) {
				readArray.remove(4);
			}
			if(countZero.size()==4 && countZero2.size()==4) {
				readArray.add(8, "억");
				
			} else if(countZero.size()==4 && !(countZero2.size()==4)){
				readArray.add(9, "억 "); 
			} else if(!(countZero.size()==4) && !(countZero2.size()==4)){
				readArray.add(9, "억 "); 
			} else {
				readArray.add(8, "억 "); 
			}
			
			for (int j = 8; j < 12; j++) {
				thirteen = Integer.parseInt(reverseArray.get(j));
				if(thirteen==0) {
				countZero3.add(reverseArray.get(j));}
			}
			if(countZero3.size()==4 && (readArray.get(8).equals("억") || readArray.get(8).equals("억 "))) {
				readArray.remove(8);
			}

			if(countZero3.size()==4 && readArray.get(9).equals("억 ")) {
				readArray.remove(9);
			}
			if(countZero.size()==4 && countZero2.size()==4 && countZero3.size()==4) {
				if(compareNum==0 ) {readArray.add(12, "영");} else 
				readArray.add(12, "조");
				
			} else if (  !(countZero3.size()==4 ) && !(countZero2.size()==4) ) {
				readArray.add(14, "조 ");
			} else if (  !(countZero.size()==4 ) && countZero2.size()==4 && countZero3.size()==4 ) {
				readArray.add(12, "조 ");
			} else {
				readArray.add(13, "조 ");
			}
			if( (readArray.get(5).equals("일") && readArray.get(6).equals("") && readArray.get(7).equals("") && readArray.get(8).equals(""))) {
				readArray.set(5, "");
			}
			
				
		}
		
		

		 
		for (String reverse : readArray) {
			System.out.print("."+reverse);
		}
		    System.out.println();
	   
		for (int i = readArray.size() -1; i >= 0 ; i--) {
			reverseArray2.add(readArray.get(i));
		}    
	    
	    for (String reverse : reverseArray2) {
			System.out.print(reverse);
		}
	    	System.out.print("원");
	}
	
	

}
