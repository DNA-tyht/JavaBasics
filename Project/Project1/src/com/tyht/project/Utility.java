package com.tyht.project;

import java.util.Scanner;

public class Utility {

	private static Scanner scanner = new Scanner(System.in);
	
	//用户输入菜单数字
    public static char readMenuSelection(){
        char c;
        while(true){
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if(c != '1' && c != '2' && c != '3' && c != '4'){
                System.out.println("选择错误,请重新输入: ");
            }
            else
                break;
        }
        return c;
    }
    
    //用户输入收入支出金额(输入位数不超过四位)
    public static int readNumber(){
        int n;
        while(true){
            String str = readKeyBoard(4);
            try{
                n = Integer.parseInt(str);
                break;
            }
            catch(NumberFormatException e){
                System.out.println("数字输入错误,请重新输入: ");
            }
        }
        return n;
    }
    
    //用户输入收入支出的说明(输入字符不超过8位)
    public static String readString(){
        String str = readKeyBoard(8);
        return str;
    }
    
    //用户选择退出确认
    public static char readConfirmSelection(){
        char c;
        while(true){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }
            else
                System.out.println("选择错误,请重新输入: ");
        }
        return c;
    }
    
    public static String readKeyBoard(int limit) {
    	String line = "";
    	while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if(line.length() < 1 || line.length() > limit){
                System.out.println("输入错误,长度不大于" + limit);
                continue;
            }
            else
                break;
        }
    	return line;
    }
}
