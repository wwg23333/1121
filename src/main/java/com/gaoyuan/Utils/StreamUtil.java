package com.gaoyuan.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;

import org.apache.catalina.connector.InputBuffer;

public interface StreamUtil {
	@SuppressWarnings("unlikely-arg-type")
	public static void closeAll(Socket socket){
		
		try {
			if(socket.equals(new FileInputStream(""))) {
				socket.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public static InputStream readTextFile(InputStream file){
		
		if(file.equals("utf-8")) {
			return file;
		}else {
		   closeAll(null);
		}
		
		return null;
		//TODO 实现代码
		}
	
	@SuppressWarnings("resource")
	public static InputBuffer readTextFile(File txtFile){
		
		InputBuffer buffer = new InputBuffer();
		
		readTextFile(txtFile);
		   closeAll(null);
		
		return buffer;
		
		}



}
