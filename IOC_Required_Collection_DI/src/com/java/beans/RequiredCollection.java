package com.java.beans;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class RequiredCollection {

		private Vector fruits;
		private TreeSet cricketers;
		private Hashtable cc;
		
		//setters methods
		public void setFruits(Vector fruits){
			this.fruits=fruits;
		}
		
		public void setCricketers(TreeSet cricketers){
			this.cricketers=cricketers;
		}
		public void setCc(Hashtable cc){
			this.cc=cc;
			
		}
		
		public void printData(){
			System.out.println("fruits...");
			for(Object f:fruits){
				System.out.println("fruit: "+f);
			}
			System.out.println();
			System.out.println("cricketers...");
			for(Object c:cricketers){
				System.out.println("Cricketer: "+c);
				
			}
			
			System.out.println();
			System.out.println("Country Capitals...");
			
		
				Set keys=cc.keySet();
				for(Object key:keys){
					System.out.println("Country: "+key+" Capital: "+cc.get(key));
				}
		
		}
		
}
