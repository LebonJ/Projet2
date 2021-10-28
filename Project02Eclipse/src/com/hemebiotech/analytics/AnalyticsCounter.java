package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
/**
 * 
 * @param list
 * @param map
 * @return 
 */

	public void count (List<String> list, Map<String, Integer> map) {
		for (String symptom : list) {
			Integer value = map.get(symptom);
			if ( value == null) {
				map.put(symptom, 1);

			} else {
				map.put(symptom, value+1);
			}
		}
	}

}