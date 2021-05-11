package com.tyht.inter;

public class USBTest {
	
	public static void main(String[] args) {
		Computer com = new Computer();
		Flash flash = new Flash();
		com.teansferData(flash);
	}
}

class Computer{
	public void teansferData(USB usb) {
		usb.start();
		System.out.println("传输数据");
		usb.stop();
	}
}

class Flash implements USB{
	public void start() {
		System.out.println("U盘开始工作");
	}
	public void stop() {
		System.out.println("U盘结束工作");
	}
}

interface USB{
	void start();
	void stop();
}