package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Writer {

	public void writer(Map<String, Integer> map) throws IOException {
		Map<String, Integer> map2 = new TreeMap<String, Integer>(map);
		File result = new File("results.out"); 
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Entry<String, Integer> entry : map2.entrySet()) {
			String symptom = entry.getKey();
			Integer value = entry.getValue();
			writer.write(symptom + " = " + value + System.getProperty("line.separator"));
			System.out.println(symptom + " = " + value);
		}
		writer.close();
	}
}