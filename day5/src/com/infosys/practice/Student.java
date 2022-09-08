package com.infosys.practice;

public class Student {
private int roll;
private String name;
private String subjects[];
private int scores[];
private char grade;

public char getGrade() {
    float sum=0;
	float avg=0;
	for(int score : scores)
	{
		sum+=score; // sum=sum+score
	}
	avg=sum/3;
	if(avg>80) {
		grade='A';
	}
	else if(avg>=70 && avg<=80) {
		grade='B';
	}
	else
	{
		grade='C';
	}
	return grade;
}

public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String[] getSubjects() {
	return subjects;
}
public void setSubjects(String[] subjects) {
	this.subjects = subjects;
}
public int[] getScores() {
	return scores;
}
public void setScores(int[] scores) {
	this.scores = scores;
}


}
