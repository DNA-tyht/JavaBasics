package com.tyht.project.ui;

import com.tyht.project.bean.Customer;
import com.tyht.project.service.CustomerList;
import com.tyht.project.util.CMUtility;

/**
*@Description CustomerView为主模块，负责菜单的显示和处理用户操作
*@author 脱氧核糖 Email:tyhtwork@163.com
*@version
*@date 2021年3月13日下午9:45:51
*
 */
public class CustomerView {

	private CustomerList customerList = new CustomerList(10);
	
	public CustomerView() {
		Customer customer = new Customer("张三", '男', 18, "13812341234", "zhang@qq.com");
		customerList.addCustomer(customer);
	}
	/**
	*@Description 显示《客户信息管理软件》的方法
	*@author 脱氧核糖
	*@date 2021年3月14日下午12:02:11
	*
	 */
	public void enterMianMenu() {
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("-----------------客户信息管理软件----------------");
	        System.out.println("                  1 添加客户");
	        System.out.println("                  2 修改客户");
	        System.out.println("                  3 删除客户");
	        System.out.println("                  4 客户列表");
	        System.out.println("                  5 退   出");
	        System.out.println("");
	        System.out.print("                清选择(1-5): ");
	        
	        char menu = CMUtility.readMenuSelection();
	        switch(menu) {
	        case '1':
	        	this.addNewCustomer();
	        	break;
	        case '2':
	        	this.modifyCustomer();
	        	break;
	        case '3':
	        	this.deleteCustomer();
	        	break;
	        case '4':
	        	this.listAllCustomers();
	        	break;
	        case '5':
	        	System.out.print("确认是否退出(Y/N): ");
                char isExit = CMUtility.readConfirmSelection();
                if(isExit == 'Y'){
                    isFlag = false;
                }
	        	break;
	        }
		}
	}
	/**
	*@Description 添加客户的操作
	*@author 脱氧核糖
	*@date 2021年3月14日下午12:00:40
	*
	 */
	private void addNewCustomer() {
		System.out.println("---------------------------添加客户---------------------------");
		System.out.print("姓名: ");
		String name = CMUtility.readString(10);
		System.out.print("性别: ");
		char gender = CMUtility.readChar();
		System.out.print("年龄: ");
		int age = CMUtility.readInt();
		System.out.print("电话: ");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱: ");
		String email= CMUtility.readString(30);
		
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.addCustomer(customer);
		if(isSuccess) {
			System.out.println("---------------------------添加成功---------------------------");
		}
		else
			System.out.println("---------------------------添加失败---------------------------");
	}
	/**
	*@Description 修改客户的操作
	*@author 脱氧核糖
	*@date 2021年3月14日下午12:00:57
	*
	 */
	private void modifyCustomer() {
		System.out.println("---------------------------修改客户---------------------------");
		boolean isFalg = true;
		int number = -1;
		Customer cust = new Customer();
		while(isFalg) {
			System.out.print("请选择待修改的客户编号(-1退出): ");
			number = CMUtility.readInt();
			if(number != -1) {
				cust = customerList.getCustomer(number - 1);
				if(cust == null) {
					System.out.println("无法找到指定客户");
				}
				else
					isFalg = false;
			}
			else
				return;
		}
		
		System.out.print("姓名(" + cust.getName() + "): ");
		String name = CMUtility.readString(10, cust.getName());
		System.out.print("性别(" + cust.getGender() + "): ");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄(" + cust.getAge() + "): ");
	    int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话(" + cust.getPhone() + "): ");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.print("邮箱(" + cust.getEmail() + "): ");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer newcust = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.replaceCustomer(number - 1, newcust);
		if(isSuccess)
			System.out.println("---------------------------修改成功---------------------------");
		else
			System.out.println("---------------------------修改失败---------------------------");
	}
	/**
	*@Description 删除客户的操作
	*@author 脱氧核糖
	*@date 2021年3月14日下午12:01:16
	*
	 */
	private void deleteCustomer() {
		System.out.println("---------------------------删除客户---------------------------");
		boolean isFalg = true;
		int number = -1;
		Customer cust = new Customer();
		while(isFalg) {
			System.out.print("请选择待修改的客户编号(-1退出): ");
			number = CMUtility.readInt();
			if(number == -1) {
				return;
			}
			cust = customerList.getCustomer(number - 1);
			if(cust == null) {
				System.out.println("无法找到指定客户");
			}
			else
				isFalg = false;
		}
		System.out.print("确认是否删除(Y/N): ");
        char isDelete = CMUtility.readConfirmSelection();
        if(isDelete == 'Y'){
            customerList.deleteCustomer(number - 1);
        }
	}
	/**
	*@Description 显示客户列表的操作
	*@author 脱氧核糖
	*@date 2021年3月14日下午12:01:30
	*
	 */
	private void listAllCustomers() {
		System.out.println("---------------------------客户列表---------------------------");
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("没有客户记录");
		}
		else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomer();
			for(int i = 0; i < custs.length; i++) {
				System.out.println((i + 1) + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + 
						"\t" + custs[i].getAge() + "\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
			}
		}
		System.out.println("-------------------------客户列表完成-------------------------");
	}
	
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMianMenu();	
	}
}
