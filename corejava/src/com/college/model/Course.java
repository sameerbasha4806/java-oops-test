package com.college.model;

public class Course {
		private String courseCode;
		private String courseTitle;
		private double courseFee;
		
		public Course(String courseCode,String courseTitle,double courseFee) {
			super();
			this.courseCode=courseCode;
			this.courseTitle=courseTitle;
			this.courseFee=courseFee;
		}
		
		public String getCourseCode() {
			return courseCode;
		}
		public void setCourseCode(String courseCode) {
			this.courseCode=courseCode;
		}
		
		public String getCourseTitle() {
			return courseTitle;
		}
		public void setCourseTitle() {
			this.courseTitle=courseTitle;
		}
		
		public double getCourseFee() {
			return courseFee;
		}
		public void setCourseFee(double courseFee) {
			this.courseFee=courseFee;
		}
	}



