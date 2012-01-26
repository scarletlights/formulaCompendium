package com.onb.formula.area;

class Circle {
	
	//pi
	private static final double PI = 3.1415169;
	private static final double RADIUS = 10;
	
	private double diameter;

	private void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	private double getDiameter() {
		return this.diameter;
	}
	
	private double computeArea(double diameter) {
		return diameter * diameter * PI;
	}

	private static final double d = 20;
	
	public double getRadius(){
		return this.radius;
	}
}
