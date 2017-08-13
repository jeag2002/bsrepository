package com.bs.jni.ini;


public class MainJNI {
	public native String getDateCreationFile(String path);

	static{
		System.loadLibrary("datefile");
	}

	public static void main(String[] args) throws Exception{
		String path = "c:\\MDS.log";
		MainJNI jni = new MainJNI();
		System.out.println(" la fecha de creacion de " + path  + " es " + jni.getDateCreationFile(path));
	}


}
