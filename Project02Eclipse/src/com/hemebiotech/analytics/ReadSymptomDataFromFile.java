package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader{

	public void getSymptoms(File doc, List<String> list) {
		if(doc != null) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(doc));
				String line = null;
				while ((line = br.readLine()) != null) {
					list.add(line);
				}
				br.close();
			} catch (IOException e) {
				System.err.println("File not found"); 
			}
		}
	}
}