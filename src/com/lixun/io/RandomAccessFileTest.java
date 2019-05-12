package com.lixun.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		File demo = new File("demo");
		if(!demo.exists())
			demo.mkdir();
		File file = new File(demo, "demo.txt");
		if(!file.exists())
			file.createNewFile();
		
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.write('a');
		raf.write('b');
		
		int a = 0x7ffff;
		System.out.println(a);
		raf.writeInt(a);
		
		raf.writeChar('жа');
		System.out.println(raf.getFilePointer());
		
		raf.writeInt(127);;
		raf.seek(0);
		byte[] bytes = new byte[(int) file.length()];
		System.out.println(file.length());
		raf.read(bytes);
		System.out.println(Arrays.toString(bytes));
		System.out.println("==="+new String(bytes));
		raf.close();
		System.out.println(0xff);
	}
}
