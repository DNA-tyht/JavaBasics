package com.tyht.project.util;

import java.util.*;
/**
*@Description CMUtility工具类
*将不同的方法封装，直接调用方法使用它的功能
*@author 脱氧核糖 Email:tyhtwork@163.com
*@version
*@date 2021年3月13日下午9:47:30
*
 */
public class CMUtility {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	*@Description 用于界面菜单的选择
	*@author 脱氧核糖
	*@date 2021年3月14日下午12:10:56
	*@return
	*
	 */
	public static char readMenuSelection() {
		char c;
        while(true){
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if(c != '1' && c != '2' && c != '3' && c != '4' && c != '5'){
                System.out.print("选择错误,请重新输入: ");
            }
            else
                break;
        }
        return c;
	}
	/**
	*@Description 用于输入客户用户性别
	*@author 脱氧核糖
	*@date 2021年3月14日下午12:11:23
	*@return
	*
	 */
	public static char readChar() {
		String str = readKeyBoard(1, false);
		return str.charAt(0);
	}
	
	public static char readChar(char defaulValue) {
		String str = readKeyBoard(1, true);
		return (str.length() == 0) ? defaulValue : str.charAt(0);
	}
	/**
	*@Description 用于输入客户年龄
	*@author 脱氧核糖
	*@date 2021年3月14日下午1:47:33
	*@return
	*
	 */
	public static int readInt() {
		int n;
		while(true) {
			String str = readKeyBoard(2, false);
			try {
				//将String转换为int类型
				n = Integer.parseInt(str);
				break;
			} catch(NumberFormatException e) {
				System.out.print("数字输入错入,清重新输入: ");
			}
		}
		return n;
	}
	public static int readInt(int defaulValue) {
		int n;
		while(true) {
			String str = readKeyBoard(2, true);
			try {
				if(str.length() == 0)
					n = defaulValue;
				else
					n = Integer.parseInt(str);
				break;
			} catch(NumberFormatException e) {
				System.out.print("数字输入错入,清重新输入: ");
			}
		}
		return n;
	}
	/**
	*@Description 用于输入客户姓名,邮箱,电话
	*@author 脱氧核糖
	*@date 2021年3月14日下午12:52:32
	*@param limit
	*@return
	*
	 */
	public static String readString(int limit) {
		return readKeyBoard(limit, false);
	}
	
	public static String readString(int limit, String defaulValue) {
		return readKeyBoard(limit, true).length() == 0 ? defaulValue : readKeyBoard(limit, true);
	}
	
	public static char readConfirmSelection(){
        char c;
        while(true){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }
            else
                System.out.print("选择错误,请重新输入: ");
        }
        return c;
    }
	
	//是否允许空白输入
	public static String readKeyBoard(int limit, boolean blankReturn) {
		String line = "";
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			if(line.length() == 0) {
				if(blankReturn)
					return line;
				else
					continue;
			}
			if(line.length() < 1 || line.length() >limit) {
				System.out.print("输入长度错误,请重新输入: ");
				continue;
			}
			break;
		}
		return line;
	}
	
	public static String readKeyBoard(int limit) {
    	String line = "";
    	while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if(line.length() < 1 || line.length() > limit){
                System.out.print("输入错误,长度不大于" + limit);
                continue;
            }
            else
                break;
        }
    	return line;
    }
}