package com.pk.collections;

import java.io.Serializable;

public class Student01 implements Serializable{
		private static final long serialVersionUID = 1L;
		
		private int sno;
		private String sname;
		private String course;
		private double fee;
		
		public Student01() {
			//no-op
		}

		public int getSno() {
			return sno;
		}

		public void setSno(int sno) {
			this.sno = sno;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public double getFee() {
			return fee;
		}

		public void setFee(double fee) {
			this.fee = fee;
		}

		@Override
		public boolean equals(Object obj) {

			if(obj instanceof Student01 s)
				return this.course.equals(s.course) &&
						this.sno == s.sno; 
				
			return false;
		}
		
		@Override
		public String toString() {
			return "Student("+sno+", "+ sname +", "+ course +", "+fee+")";
		}
		
}
