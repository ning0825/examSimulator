package date;
/**
 * 用三个字符型数组存储三份试卷的答案
 * @author 陈亚宁 2017.08.09
 *
 */
public class CorrectAnswer {
	/**
	 * 存储试卷一的答案
	 */
	static final char[] answer1 = {'A','C','B','B','C','A','C','A','A','B','D','D','D','A','B','D','D','B','C','B'};
	/**
	 * 存储试卷二的答案
	 */
	static final char[] answer2 = {'B','D','C','D','D','D','D','B','A','D','D','A','C','D','B','C','A','A','B','D'};
	/**
	 * 存储试卷三的答案
	 */
	static final char[] answer3 = {'D','A','D','B','A','C','C','B','C','D','A','B','C','A','D','D','B','D','B','B'};
	/**
	 * 通过setFile()方法给其赋值，方便其他方法通过调用file访问三个数组
	 * 
	 */
	static char[] answer = answer1;
	/**
	 * 根据ChoiceItem中获取的字符串判断file指向file1,file2或者file3
	 * @param fileName   ChoiceItem中获取的item名 
	 */
	public static void setAnswer(String fileName) {
		switch (fileName) {
		case "试卷一":
			answer = answer1;
			break;
		case "试卷二":
			answer = answer2;
			break;
		case "试卷三":
			answer = answer3;
			break;
		default:
			break;
		}
	}
	/**
	 * 
	 * @param i 表示当前题号（题号 = i + 1）的值
	 * @return 返回当前i值时，file的某个值，既当前题目的答案
	 */
	public static char getAnswer(int i) {
		return answer[i];
	}
}
