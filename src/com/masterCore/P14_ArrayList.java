package com.masterCore;

import java.util.ArrayList;
import java.util.Iterator;

public class P14_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		arrl.add(1);
		arrl.add(2);
		arrl.add(3);
		arrl.add(4);
		arrl.add(5);
		arrl.add(6);
		arrl.add(7);
		arrl.add(8);
		arrl.add(9);
		arrl.add(10);
		
		Iterator<Integer> itr = arrl.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
