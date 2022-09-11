/**
 *
 */
package cn.itcast.ssm.common.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import cn.itcast.ssm.common.file.MyFileUtils;
import cn.itcast.ssm.common.str.MyStrUtils;

/**
 * @author Think
 *
 */
public class MyLog5j {
	public static BufferedWriter s_log5j = null;
	public  static void initLog5j(String logPath,String fileNm, String enCode) throws Throwable {
		File file = new File(logPath);
		file.mkdirs();
		s_log5j = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(logPath + fileNm), enCode));
	}

	public static void closeLog5j() throws Throwable {
		// TODO Auto-generated method stub
		if (s_log5j != null) {
			s_log5j.close();
			s_log5j=null;
		}
	}

	public static void write(String str) {
		MyFileUtils.writeWithbBlank(s_log5j, str, 0);
	}


	public static String addlrBracketsM(String str,boolean isBlankNotPrint) {

		if (MyStrUtils.isEmpty(str)) {
			if (isBlankNotPrint) {
				return "";
			}
		}
		return "[" + str + "]";
	}

	/**
	 * @param writer
	 * @param line
	 */
	public static void writeLine(BufferedWriter writer, String line) throws Throwable {
		try {
			writer.write(line);
			writer.newLine();
			writer.flush();
		} catch (Throwable e) {
			throw e;
		}
		
	}

	/**
	 * @param writer
	 * @throws IOException 
	 */
	public static void close(BufferedWriter writer) throws Throwable {
		// TODO Auto-generated method stub
		try {
			if (writer!=null) {
				writer.close();
				writer=null;
			}
		} catch (Throwable e) {
			throw e;
		}

	}
}
