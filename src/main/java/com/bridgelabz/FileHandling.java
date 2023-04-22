package com.bridgelabz;

import java.io.*;

public class FileHandling {

	public static void main(String[] args) throws IOException {

		File f1 = new File("abc.txt");
		File f2 = new File("pqr.txt");
		File f3 = new File("mno.txt");
		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		System.out.println(f1.exists());
		f1.delete();
		System.out.println("f1 exist "+f1.exists());
		File dir = new File("dir");
		dir.mkdir();
		File f4 = new File("dir/mk.txt");
		File f5 = new File("dir/mili.txt");
		File f6 = new File("dir/milind.txt");
		f4.createNewFile();
		f5.createNewFile();
		f6.createNewFile();
		String fileList[] = dir.list();
		System.out.println("List of files and directories inside dir ");
		for(String fl : fileList) {
			System.out.println(fl);
		}
		
		
		
		
		
		
	}

}
