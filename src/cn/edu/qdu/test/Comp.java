package cn.edu.qdu.test;

import java.util.Comparator;

public class Comp implements Comparator{
	private double score;

	public int compare(Object o1,Object o2) {
		int res=0;
		if(((Students) o1).getScore()>((Students) o2).getScore()){
			res=1;
		}else if(((Students) o1).getScore()==((Students) o2).getScore()){
			res=0;
		}else{
			res=-1;
		}return res;
	}
	}

