package com.lixun.thread;

class DeadThread extends Thread {
	public DeadThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		if ("����".equals(Thread.currentThread().getName())) {
			synchronized ("���") {
				System.out.println("�����õ��˵�أ�׼��ȥ��ң����!!");
				synchronized ("ң����") {
					System.out.println("�����õ���ң�������Ϳ��Կ����յ���...");
				}
			}
		} else if ("����".equals(Thread.currentThread().getName())) {
			synchronized ("ң����") {
				System.out.println("�����õ���ң������׼��ȥ�õ��!!");
				synchronized ("���") {
					System.out.println("�����õ��˵�أ����Կ��յ��������� ��....");
				}
			}
		}
	}
}

public class ThreadOne {

	public static void main(String[] args) {
		DeadThread thread1 = new DeadThread("����");
		DeadThread thread2 = new DeadThread("����");

		thread1.start();
		thread2.start();
	}
}
