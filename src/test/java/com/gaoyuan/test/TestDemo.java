package com.gaoyuan.test;

import java.net.Socket;
import java.util.Date;

import org.junit.Test;

import com.gaoyuan.Utils.DateUtil;
import com.gaoyuan.Utils.FileUtil;
import com.gaoyuan.Utils.StreamUtil;

public class TestDemo {
	//调用时间测试方法测试
	@Test
	public void date() {
		Date date = DateUtil.getDateByInitMonth(new Date());
		System.out.println(date);
	}
	//调用文件结尾方法测试方法
	@Test
	public void file() {
		String e = FileUtil.getExtendName("aaa.jsp");
		System.out.println(e);
	}
	
	@Test
	public void stream(Socket socket) {
		StreamUtil.closeAll(socket);
	}
	
}
