package com.gaoyuan.Utils;

public interface FileUtil {
	public static String getExtendName(String fileName){
		if(fileName.endsWith(".jsp")) {
			return ".jsp";
		}
		return fileName;
		}

}
