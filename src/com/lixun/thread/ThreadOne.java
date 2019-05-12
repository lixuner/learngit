package com.lixun.thread;

class DeadThread extends Thread {
	public DeadThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		if ("张三".equals(Thread.currentThread().getName())) {
			synchronized ("电池") {
				System.out.println("张三拿到了电池，准备去拿遥控器!!");
				synchronized ("遥控器") {
					System.out.println("张三拿到了遥控器，就可以开启空调了...");
				}
			}
		} else if ("李四".equals(Thread.currentThread().getName())) {
			synchronized ("遥控器") {
				System.out.println("李四拿到了遥控器，准备去拿电池!!");
				synchronized ("电池") {
					System.out.println("李四拿到了电池，可以开空调进行享用 了....");
				}
			}
		}
	}
}

public class ThreadOne {

	public static void main(String[] args) {
		DeadThread thread1 = new DeadThread("张三");
		DeadThread thread2 = new DeadThread("李四");

		thread1.start();
		thread2.start();
	}
}
