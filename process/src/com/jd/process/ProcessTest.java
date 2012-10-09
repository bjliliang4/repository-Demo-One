package com.jd.process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ProcessTest {

	/**
	 * @author bjliliang4
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		StringBuffer buffer=new StringBuffer();
		File file=new File("D:/bsys.txt");
		String line=null;
	    try {//输入流，注意就行了
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			 while((line=bufferedReader.readLine())!=null){
				//buffer.append(line+System.getProperty("line.separator"));
				buffer.append(line+System.getProperty("line.separator"));
			 };
			/* bufferedReader.close();
			 PrintWriter printWriter=new PrintWriter("D:/bsys.txt");
			 printWriter.write("WRITER---------LILIALNG"+"\r\n");
			 printWriter.flush();
			 printWriter.close();
			 
		String str=	 buffer.toString();
			 //System.out.println(str);
			  * 
*/		
			//输出流
			 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\cdliliang.java")));
				writer.write(buffer.toString());
				writer.flush();
				writer.close();
				bufferedReader.close();
	    
	    
	    } catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}finally{

		}
		


	}

}
