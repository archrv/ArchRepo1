package org.somejavaprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserdefinedMap {

	public static void main(String[] args) {
		Map<Integer, String> umap = new LinkedHashMap<Integer, String>();
		umap.put(10, "Core Java");
		umap.put(20, "C++");
		umap.put(30, "Selenium");
		umap.put(40, "Cucumber");
		Set<Entry<Integer, String>> e = umap.entrySet();
		for (Entry<Integer, String> entry : e) {
			System.out.println("Hence prints key & value in separate lines.....");
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		

	}

}
