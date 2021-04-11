package DocFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DocFileMain {
	public static void main(String[] args) {
		String filePath = args[0];
		// nếu chạy không thì chương trình báo lỗi phải chọn run as -> runconfigutiin -> argument -> truyền vào gì thì truyền tương tự cách nhau space
		File file = new File(filePath);
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(file);
			buffer = new BufferedReader(fileReader);
			String line;
			while((line = buffer.readLine()) != null) {
				System.out.println("-> "+line);
			}
		}catch(IOException e){  
			e.printStackTrace();
		}finally {
			
			try {
				if (fileReader != null) fileReader.close();
				if(buffer !=null) buffer.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
