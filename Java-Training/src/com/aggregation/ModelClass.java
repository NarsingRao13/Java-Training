package com.aggregation;

import java.util.List;

public class ModelClass {
	private static List<Students> sList;
	private static List<Courses> cList;

	public static List<Students> getsList() {
		return sList;
	}

	public void setsList(Students ob) {
		sList.add(ob);
	}

	public static List<Courses> getcList() {
		return cList;
	}

	public static void setcList(Courses ob) {
		cList.add(ob);
	}
	
	
}
