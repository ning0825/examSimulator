package function;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import date.User;
import ui.SystemGui;

/**
 * 选择及读取文件的类
 * @author 陈亚宁 2017.08.09
 *
 */
public class FileSet implements Runnable {
	
	static FileSet fileSet = new FileSet(new File("src\\testPaper\\试卷一.txt"));
	
	FileReader fr;
	BufferedReader br;
	String line = null;
	boolean flag2 = true;
    File file = new File("src\\testPaper\\试卷一.txt");
	
	public FileSet(File file) {
		// TODO Auto-generated constructor stub
		try {
			this.file = file;
			fr = new FileReader(file);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public  void select(String item) {
		switch (item) {
		case "试卷一":
			fileSet = new FileSet(new File("src\\testPaper\\试卷一.txt"));
			break;
		case "试卷二":
			fileSet = new FileSet(new File("src\\testPaper\\试卷二.txt"));
			break;
		case "试卷三":
			fileSet = new FileSet(new File("src\\testPaper\\试卷三.txt"));
			break;
		default:
			break;
		}
	}
	
	public void run() {
			
			try {
				line = br.readLine();
				
				if(line == null)
					JOptionPane.showMessageDialog(SystemGui.fSystem, "答题完毕，你的总分为" + User.user.getScore());
				
				while(line != null && flag2) {
					if(line.contains("**"))
						flag2 = false;
					else {
						SystemGui.taPaper.append(line + "\n");
						line = br.readLine();
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
			}	
	}
}
