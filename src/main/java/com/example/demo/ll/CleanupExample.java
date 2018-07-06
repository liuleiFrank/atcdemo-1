package com.example.demo.ll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import lombok.Cleanup;

public class CleanupExample {
	
//	public static void main(String[] args) throws IOException {
//		
//		@Cleanup InputStream inputStream=new FileInputStream(args[0]);
//		@Cleanup OutputStream outputStream=new FileOutputStream(args[1]);
//		
//		byte[] b=new byte[10000];
//		
//		while (true) {
//			int r=inputStream.read(b);
//			if(r==-1)
//				break;
//			
//			outputStream.write(b, 0, r);
//			
//		}
//		
//		
//	}
}
