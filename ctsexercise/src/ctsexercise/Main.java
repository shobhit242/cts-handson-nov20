package ctsexercise;






import java.io.IOException;
import java.util.*;
import java.util.*;


	
	public class Main {
	
		
	
	public static void main(String[] args)throws Exception {
		
		
		HashMap<String,List> map=new HashMap<String,List>();
		List<String> list=new ArrayList<String>();
		list.add("ashish");
		list.add("varun");
		List<String> list1=new ArrayList<String>();
		list1.add("edward");
		list1.add("sujith");
		List<String> list2=new ArrayList<String>();
		list2.add("tarun");
		list2.add("raj");
		map.put("cs",list);
	
		map.put("ec",list1);
	
		map.put("mech",list2);
		
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(map.get(s));
		
	}}


