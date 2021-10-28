package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static File doc = new File ("symptoms.txt");
	static List<String> list = new ArrayList<String>();
	static Map<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String[] args) throws IOException {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
		readSymptomDataFromFile.getSymptoms(doc, list); 
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.count(list, map); 
		Writer writer = new Writer();
		writer.writer(map); 
	}
}