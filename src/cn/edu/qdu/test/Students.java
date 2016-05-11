package cn.edu.qdu.test;

public class Students {
	private int stuNo;
	private double score;

	public Students(int stuNo,double score) {
		super();
		this.stuNo = stuNo;
		this.score = score;		
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Students [stuNo=" + stuNo + ", score=" + score + "]";
	}
//	public int compareTo(Object o){
//		int res=0;
//		if(this.stuNo>((Students) o).stuNo){
//			res=1;
//		}else if(this.stuNo==((Students) o).stuNo){
//			res=0;
//		}else{
//			res=-1;
//		}return res;
//	}

}
