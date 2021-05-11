package com.tyht.test;

public class EcmDef {

	public static void main(String[] args) {
		EcmDef test = new EcmDef();
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			int n = test.ecm(i, j);
			System.out.println(n);
		} catch(NumberFormatException e){
			System.out.println("number format ");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("");
		} catch(ArithmeticException e) {
			
		} catch(EcDef e) {
			System.out.println(e.getMessage());
		}
	}

	public int ecm(int i, int j) throws EcDef{
		if(i < 0 || j < 0) {
			throw new EcDef("分母或分子为负！");
		}
		return i/j;
	}
}