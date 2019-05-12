package com.lixun.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.activation.FileDataSource;

public class FileOutputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream is = new FileInputStream("d:/xun.txt");
		byte[] a = new byte[(int) new File("d:/xun.txt").length()];
		is.read(a);
		for (byte b : a) {
			System.out.println(Integer.toHexString(b & 0xff));
		}
		
		FileOutputstream.copyFile("d:/src.txt", "d:/des.txt");
	}

	public static void copyFile(String src, String des) throws IOException{
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(des);
		byte[] buf = new byte[2*1024];
		int b = 0;
		while((b = in.read(buf, 0, buf.length)) != -1){
			out.write(buf, 0, b);
		}
		in.close();
		out.close();
	}
}
