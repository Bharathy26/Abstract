package com.common;

public class Phone extends Vivo {

	@Override
	public void vivoName() {
		// TODO Auto-generated method stub
		System.out.println("vivo y21");
	}

	@Override
	public void vivoModel() {
		// TODO Auto-generated method stub
		System.out.println("y21");
	}

	@Override
	public void vivoRam() {
		// TODO Auto-generated method stub
	System.out.println("8gb");
	}

	@Override
	public void lavaName() {
		// TODO Auto-generated method stub
		System.out.println("lava m21");
	}

	@Override
	public void lavaCharger() {
		// TODO Auto-generated method stub
		System.out.println("44 ahms");
	}

	@Override
	public void lavaRam() {
		// TODO Auto-generated method stub
		System.out.println("4gb");
	}

	@Override
	public void soniName() {
		// TODO Auto-generated method stub
		System.out.println("soni456");
	}

	@Override
	public void soniInternalStorage() {
		// TODO Auto-generated method stub
		System.out.println("6gb");
	}

	@Override
	public void soniExpandable() {
		// TODO Auto-generated method stub
		System.out.println("2gb expandable");
	}

	@Override
	public void realModel() {
		// TODO Auto-generated method stub
		System.out.println("realme24");
	}

	@Override
	public void realProcessor() {
		// TODO Auto-generated method stub
		System.out.println("snapdragon 680");
	}

	@Override
	public void realRam() {
		// TODO Auto-generated method stub
		System.out.println("4gb for realme");
	}
public static void main(String[] args) {
	Phone p=new Phone();
	p.lavaCharger();
	p.lavaCharger();
	p.lavaName();
	p.realModel();
	p.realProcessor();
	p.realRam();
	p.soniExpandable();
	p.soniInternalStorage();
	p.soniName();
	p.vivoModel();
	p.vivoName();
	p.vivoRam();
	}}


