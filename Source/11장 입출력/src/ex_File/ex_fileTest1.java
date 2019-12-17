package ex_File;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class ex_fileTest1 {

	/*
		file Ŭ���� ����(�޼ҵ� ��� ����)
		- �ڹٿ��� �����̳� ���丮�� �ٷ� �� �ְ� �������ִ� Ŭ�����̴�.
		�ۼ��� : 1209
	*/
	
	public static class ImageNameFilter implements FilenameFilter {

		@Override
		public boolean accept(File dir, String name) {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("C ����̺��� ��ü ���� ���");
		File file = new File("C:\\");
		String[] files = file.list();
		for(String fileName : files) {
			File subFile = new File(file, fileName);
			if(file.isDirectory()) {
				System.out.println("���丮 �̸� : " + fileName);
			}
			else {
				System.out.println("���� �̸�: " + fileName + ", ���� ũ�� : " + subFile.length() + "byte");
			}
		}
		System.out.println("C����̺��� �̹��� ���ϸ� ���");
		String[] imageFiles = file.list(new ImageNameFilter());
		for(String fileName: imageFiles) {
			File subFile = new File(file,fileName);
			System.out.println("���� �̸�: " + fileName + ", ���� ũ�� : " + subFile.length() + "byte" + ", ���ϰ�� : " + subFile.getAbsolutePath());
			
		}
		File makeFile = new File("C:\\data\\testFile.txt");
		try {
			makeFile.createNewFile();
		} catch(IOException e){
			e.printStackTrace();
		}
		if(makeFile.exists()) {
			System.out.println("makeFile�� �����ȴ�.");
		}
		
		File renameFile = new File("C:\\data\\testFile2.txt");
		makeFile.renameTo(renameFile);
		if(renameFile.exists()) {
			System.out.println("makeFile�� �̸��� �����");
		}
		
		if(renameFile.delete()) {
			System.out.println("renameFile�� ���ŵ�");
		}
	}

}
