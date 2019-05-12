package com.lixun.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("d:/xulie.txt");
		if(!file.exists())
			file.createNewFile();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
		Student s = new Student("Tom", "ÖÐ¹ú", 12);
		
		out.writeObject(s);
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		Student stu = (Student)in.readObject();
		System.out.println(stu);
	}

}
