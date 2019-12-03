package com.resolve.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resolve.model.Counter;


@Service
public class ReadNumberService {
	
	
	
	public List<String> readNumber(String countNumber) {
		List<String> readNumStr = null;
		
		String[] cnArray = countNumber.split("");
		ArrayList<String> reverseArray = new ArrayList<String>();
		ArrayList<String> reverseArray2 = new ArrayList<String>();
		ArrayList<String> readArray = new ArrayList<String>();
		ArrayList<String> countZero = new ArrayList<String>();
		ArrayList<String> countZero2 = new ArrayList<String>();
		ArrayList<String> countZero3 = new ArrayList<String>();
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
			Integer compareNum = Integer.parseInt(reverseArray.get(i));

			if(reverseArray.size() == 1 ) {
				
				if(compareNum==0 ) {readArray.add(i, "영");}
				if(compareNum==1 ) {readArray.add(i, "일");}
				if(compareNum==2 ) {readArray.add(i, "이");}
				if(compareNum==3 ) {readArray.add(i, "삼");}
				if(compareNum==4 ) {readArray.add(i, "사");}
				if(compareNum==5 ) {readArray.add(i, "오");}
				if(compareNum==6 ) {readArray.add(i, "육");}
				if(compareNum==7 ) {readArray.add(i, "칠");}
				if(compareNum==8 ) {readArray.add(i, "팔");}
				if(compareNum==9 ) {readArray.add(i, "구");}
			}
			
			if(reverseArray.size() >= 2 && (i==0 || (i%4)==0)) {
				if(compareNum==1 && (reverseArray.size() == 5)) {readArray.add(i, "");}
				else if(compareNum==1 ) {readArray.add(i, "일");}
				if(compareNum==0 ) {readArray.add(i, "");}
				if(compareNum==2 ) {readArray.add(i, "이");}
				if(compareNum==3 ) {readArray.add(i, "삼");}
				if(compareNum==4 ) {readArray.add(i, "사");}
				if(compareNum==5 ) {readArray.add(i, "오");}
				if(compareNum==6 ) {readArray.add(i, "육");}
				if(compareNum==7 ) {readArray.add(i, "칠");}
				if(compareNum==8 ) {readArray.add(i, "팔");}
				if(compareNum==9 ) {readArray.add(i, "구");}
			}
			
			if(reverseArray.size() >= 2 && (i==1 || (i%4)==1) ) {
				if(compareNum==1 && (i==8 || i==12)) {readArray.add(i, "일");}
				else if(compareNum==1 ) {readArray.add(i, "십");} 
				if(compareNum==0 ) {readArray.add(i, "");}
				if(compareNum==2 ) {readArray.add(i, "이십");}
				if(compareNum==3 ) {readArray.add(i, "삼십");}
				if(compareNum==4 ) {readArray.add(i, "사십");}
				if(compareNum==5 ) {readArray.add(i, "오십");}
				if(compareNum==6 ) {readArray.add(i, "육십");}
				if(compareNum==7 ) {readArray.add(i, "칠십");}
				if(compareNum==8 ) {readArray.add(i, "팔십");}
				if(compareNum==9 ) {readArray.add(i, "구십");}
			}
			
			if(reverseArray.size() >= 2 && (i==2 || (i%4)==2) ) {
				
				if(compareNum==0 ) {readArray.add(i, "");}
				if(compareNum==1 ) {readArray.add(i, "백");}
				if(compareNum==2 ) {readArray.add(i, "이백");}
				if(compareNum==3 ) {readArray.add(i, "삼백");}
				if(compareNum==4 ) {readArray.add(i, "사백");}
				if(compareNum==5 ) {readArray.add(i, "오백");}
				if(compareNum==6 ) {readArray.add(i, "육백");}
				if(compareNum==7 ) {readArray.add(i, "칠백");}
				if(compareNum==8 ) {readArray.add(i, "팔백");}
				if(compareNum==9 ) {readArray.add(i, "구백");}
			}
			
			if(reverseArray.size() >= 2 && (i==3 || (i%4)==3) ) {
				
				if(compareNum==0 ) {readArray.add(i, "");}
				if(compareNum==1 ) {readArray.add(i, "천");}
				if(compareNum==2 ) {readArray.add(i, "이천");}
				if(compareNum==3 ) {readArray.add(i, "삼천");}
				if(compareNum==4 ) {readArray.add(i, "사천");}
				if(compareNum==5 ) {readArray.add(i, "오천");}
				if(compareNum==6 ) {readArray.add(i, "육천");}
				if(compareNum==7 ) {readArray.add(i, "칠천");}
				if(compareNum==8 ) {readArray.add(i, "팔천");}
				if(compareNum==9 ) {readArray.add(i, "구천");}
			}
			
			//if(i==1 || i==5 || i==9) {readArray.add(i, "십");}
			//if(i==2 || i==6 || i==10) {readArray.add(i+1, "백");}
			
			//if(cnArray.length > 2 ) {readArray.add(i,reverseArray.get(i));}
			
		}
		Integer thirteen = 0;
		Integer ninth = 0;
		Integer fourth = 0;
		
		 
		
		
		if(9 > reverseArray.size() && reverseArray.size() >=5) {
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
				readArray.add(8, "억");
				
			} else {
				readArray.add(9, "억 "); 
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
				
			} else {
				readArray.add(9, "억 "); 
			}
			
			for (int j = 8; j < 12; j++) {
				thirteen = Integer.parseInt(reverseArray.get(j));
				if(thirteen==0) {
				countZero3.add(reverseArray.get(j));}
			}
			if(countZero3.size()==4) {
				readArray.remove(9);
			}
			if(countZero.size()==4 && countZero2.size()==4 && countZero3.size()==4) {
				readArray.add(12, "조");
				
			} else if (  !(countZero3.size()==4 ) && !(countZero2.size()==4) ) {
				readArray.add(14, "조 ");
			} else {
				readArray.add(13, "조 ");
			}

				
		}
		
		

		 
		for (String reverse : readArray) {
			System.out.print(" "+reverse);
		}
		    System.out.println();
		    
	    for (int i = readArray.size() -1; i >= 0 ; i--) {
			
			reverseArray2.add(readArray.get(i));
		}    
	    
	    for (String reverse : reverseArray2) {
			System.out.print(reverse);
		}
	    	System.out.print("원");
	
		
	    	readNumStr = reverseArray2;
		
		return readNumStr;
	}

}
