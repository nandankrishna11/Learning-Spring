package com.first;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	@Bean
	public Object getObject() {
		return new Object();
	}
	
	@Bean
	public Exception getException() {
		return new Exception();
	}
	
	 @Bean
	    public ArrayList<String> getNames() {

	        ArrayList<String> names = new ArrayList<>();

	        names.add("Nandan");
	        names.add("Rahul");
	        names.add("Arjun");
	        names.add("Kiran");
	        names.add("Vivek");

	        return names;
	 }
	        
	        
	        
	     // =========================================================
	        // VECTOR
	        // =========================================================

	        @Bean
	        public Vector<String> getVector() {

	            Vector<String> names = new Vector<>();

	            names.add("Nandan");
	            names.add("Rahul");
	            names.add("Arjun");
	            names.add("Kiran");
	            names.add("Vivek");

	            return names;
	        }


	        // =========================================================
	        // HASHSET
	        // =========================================================

	        @Bean
	        public HashSet<String> getHashSet() {

	            HashSet<String> names = new HashSet<>();

	            names.add("Nandan");
	            names.add("Rahul");
	            names.add("Arjun");
	            names.add("Kiran");
	            names.add("Vivek");

	            return names;
	        }


	        // =========================================================
	        // LINKEDHASHSET
	        // =========================================================

	        @Bean
	        public LinkedHashSet<String> getLinkedHashSet() {

	            LinkedHashSet<String> names = new LinkedHashSet<>();

	            names.add("Nandan");
	            names.add("Rahul");
	            names.add("Arjun");
	            names.add("Kiran");
	            names.add("Vivek");

	            return names;
	        }


	        // =========================================================
	        // TREESET
	        // =========================================================

	        @Bean
	        public TreeSet<String> getTreeSet() {

	            TreeSet<String> names = new TreeSet<>();

	            names.add("Nandan");
	            names.add("Rahul");
	            names.add("Arjun");
	            names.add("Kiran");
	            names.add("Vivek");

	            return names;
	        }


	        // =========================================================
	        // HASHMAP
	        // =========================================================

	        @Bean
	        public HashMap<Integer, String> getHashMap() {

	            HashMap<Integer, String> students = new HashMap<>();

	            students.put(101, "Nandan");
	            students.put(102, "Rahul");
	            students.put(103, "Arjun");
	            students.put(104, "Kiran");
	            students.put(105, "Vivek");

	            return students;
	        }


	        // =========================================================
	        // LINKEDHASHMAP
	        // =========================================================

	        @Bean
	        public LinkedHashMap<Integer, String> getLinkedHashMap() {

	            LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

	            students.put(101, "Nandan");
	            students.put(102, "Rahul");
	            students.put(103, "Arjun");
	            students.put(104, "Kiran");
	            students.put(105, "Vivek");

	            return students;
	        }


	        // =========================================================
	        // TREEMAP
	        // =========================================================

	        @Bean
	        public TreeMap<Integer, String> getTreeMap() {

	            TreeMap<Integer, String> students = new TreeMap<>();

	            students.put(105, "Vivek");
	            students.put(103, "Arjun");
	            students.put(101, "Nandan");
	            students.put(104, "Kiran");
	            students.put(102, "Rahul");

	            return students;
	        }
	        
	  

	            // =========================================================
	            // LIST INTERFACE
	            // =========================================================

	            @Bean
	            public List<String> getList() {

	                List<String> names = new ArrayList<>();

	                names.add("Nandan");
	                names.add("Rahul");
	                names.add("Arjun");
	                names.add("Kiran");
	                names.add("Vivek");

	                return names;
	            }


	            // =========================================================
	            // SET INTERFACE
	            // =========================================================

	            @Bean
	            public Set<String> getSet() {

	                Set<String> names = new HashSet<>();

	                names.add("Nandan");
	                names.add("Rahul");
	                names.add("Arjun");
	                names.add("Kiran");
	                names.add("Vivek");

	                return names;
	            }


	            // =========================================================
	            // MAP INTERFACE
	            // =========================================================

	            @Bean
	            public Map<Integer, String> getMap() {

	                Map<Integer, String> students = new HashMap<>();

	                students.put(101, "Nandan");
	                students.put(102, "Rahul");
	                students.put(103, "Arjun");
	                students.put(104, "Kiran");
	                students.put(105, "Vivek");

	                return students;
	            }
	        }

