package ex_File;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class ex_fileTest1 {

	/*
		file 클래스 예제(메소드 사용 예제)
		- 자바에서 파일이나 디렉토리를 다룰 수 있게 제공해주는 클래스이다.
		작성일 : 1209
	*/
	
	public static class ImageNameFilter implements FilenameFilter {

		@Override
		public boolean accept(File dir, String name) {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("C 드라이브의 전체 파일 출력");
		File file = new File("C:\\");
		String[] files = file.list();
		for(String fileName : files) {
			File subFile = new File(file, fileName);
			if(file.isDirectory()) {
				System.out.println("디렉토리 이름 : " + fileName);
			}
			else {
				System.out.println("파일 이름: " + fileName + ", 파일 크기 : " + subFile.length() + "byte");
			}
		}
		System.out.println("C드라이브의 이미지 파일만 출력");
		String[] imageFiles = file.list(new ImageNameFilter());
		for(String fileName: imageFiles) {
			File subFile = new File(file,fileName);
			System.out.println("파일 이름: " + fileName + ", 파일 크기 : " + subFile.length() + "byte" + ", 파일경로 : " + subFile.getAbsolutePath());
			
		}
		File makeFile = new File("C:\\data\\testFile.txt");
		try {
			makeFile.createNewFile();
		} catch(IOException e){
			e.printStackTrace();
		}
		if(makeFile.exists()) {
			System.out.println("makeFile이 생성된다.");
		}
		
		File renameFile = new File("C:\\data\\testFile2.txt");
		makeFile.renameTo(renameFile);
		if(renameFile.exists()) {
			System.out.println("makeFile의 이름이 변경됨");
		}
		
		if(renameFile.delete()) {
			System.out.println("renameFile이 제거됨");
		}
	}

}
