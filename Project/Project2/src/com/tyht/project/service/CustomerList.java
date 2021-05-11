package com.tyht.project.service;

import com.tyht.project.bean.Customer;

/**
*@Description CustomerList为Customer对象的管理模块
*内部用数组管理一组Customer对象
*并提供相应的增删改查方法供CustomerView调用
*@author 脱氧核糖 Email:tyhtwork@163.com
*@version
*@date 2021年3月13日下午9:42:00
*
 */
public class CustomerList {

	private Customer[] customers;
	private int total;
	
	/**
	 * 用来初始化customers数组的构造器
	 * @param totalCustomer 指定数组的长度
	 * 
	 */
	public CustomerList(int totalCustomer) {
		total = 0;
		customers = new Customer[totalCustomer];
	}
   /**
	*@Description 将指定的客户添加到数组中
	*@author 脱氧核糖
	*@date 2021年3月14日上午11:32:03
	*@param customer
	*@return true:添加成功 false:添加失败
	*
	 */
	public boolean addCustomer(Customer customer) {
		boolean falg = false;
		if(total < customers.length) {
			falg = true;
			customers[total] = customer;
			total++;
		}
		return falg;
	}
	/**
	*@Description 指定索引位置的客户信息
	*@author 脱氧核糖
	*@date 2021年3月14日上午11:36:11
	*@param index
	*@param cust
	*@return true:修改成功 false:修改失败
	*
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		boolean falg = false;
		if(index >= 0 && index < total) {
			falg = true;
			customers[index] = cust;
		}
		return falg;
	}
	/**
	*@Description 删除指定索引位置上的客户
	*@author 脱氧核糖
	*@date 2021年3月14日上午11:44:24
	*@param index
	*@return true:删除成功 false:删除失败
	*
	 */
	public boolean deleteCustomer(int index) {
		boolean falg = false;
		if(index >= 0 && index < total) {
			for(int i = 0; i < total - 1; i++) {
				customers[i] = customers[i + 1];
			}
			customers[total - 1] = null;
			falg = true;
			total--;
		}
		return falg;
	}
	/**
	*@Description 获取所有的客户信息
	*@author 脱氧核糖
	*@date 2021年3月14日上午11:50:37
	*@return
	*
	 */
	public Customer[] getAllCustomer() {
		Customer[] custs = new Customer[total];
		for(int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	/**
	*@Description 获取指定索引位置上的客户
	*@author 脱氧核糖
	*@date 2021年3月14日上午11:53:47
	*@param index
	*@return
	*
	 */
	public Customer getCustomer(int index) {
		if(index >= 0 && index < total) {
			return customers[index];
		}
		else
			return null;
	}
	/**
	*@Description 获取存储的客户数量
	*@author 脱氧核糖
	*@date 2021年3月14日上午11:55:38
	*@return
	*
	 */
	public int getTotal() {
		return total;
	}
}
