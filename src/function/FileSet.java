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
 * ѡ�񼰶�ȡ�ļ�����
 * @author ������ 2017.08.09
 *
 */
public class FileSet implements Runnable {
	
	static FileSet fileSet = new FileSet(new File("src\\testPaper\\�Ծ�һ.txt"));
	
	FileReader fr;
	BufferedReader br;
	String line = null;
	boolean flag2 = true;
    File file = new File("src\\testPaper\\�Ծ�һ.txt");
	
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
		case "�Ծ�һ":
			fileSet = new FileSet(new File("src\\testPaper\\�Ծ�һ.txt"));
			break;
		case "�Ծ��":
			fileSet = new FileSet(new File("src\\testPaper\\�Ծ��.txt"));
			break;
		case "�Ծ���":
			fileSet = new FileSet(new File("src\\testPaper\\�Ծ���.txt"));
			break;
		default:
			break;
		}
	}
	
	public void run() {
			
			try {
				line = br.readLine();
				
				if(line == null)
					JOptionPane.showMessageDialog(SystemGui.fSystem, "������ϣ�����ܷ�Ϊ" + User.user.getScore());
				
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
