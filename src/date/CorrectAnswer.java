package date;
/**
 * �������ַ�������洢�����Ծ�Ĵ�
 * @author ������ 2017.08.09
 *
 */
public class CorrectAnswer {
	/**
	 * �洢�Ծ�һ�Ĵ�
	 */
	static final char[] answer1 = {'A','C','B','B','C','A','C','A','A','B','D','D','D','A','B','D','D','B','C','B'};
	/**
	 * �洢�Ծ���Ĵ�
	 */
	static final char[] answer2 = {'B','D','C','D','D','D','D','B','A','D','D','A','C','D','B','C','A','A','B','D'};
	/**
	 * �洢�Ծ����Ĵ�
	 */
	static final char[] answer3 = {'D','A','D','B','A','C','C','B','C','D','A','B','C','A','D','D','B','D','B','B'};
	/**
	 * ͨ��setFile()�������丳ֵ��������������ͨ������file������������
	 * 
	 */
	static char[] answer = answer1;
	/**
	 * ����ChoiceItem�л�ȡ���ַ����ж�fileָ��file1,file2����file3
	 * @param fileName   ChoiceItem�л�ȡ��item�� 
	 */
	public static void setAnswer(String fileName) {
		switch (fileName) {
		case "�Ծ�һ":
			answer = answer1;
			break;
		case "�Ծ��":
			answer = answer2;
			break;
		case "�Ծ���":
			answer = answer3;
			break;
		default:
			break;
		}
	}
	/**
	 * 
	 * @param i ��ʾ��ǰ��ţ���� = i + 1����ֵ
	 * @return ���ص�ǰiֵʱ��file��ĳ��ֵ���ȵ�ǰ��Ŀ�Ĵ�
	 */
	public static char getAnswer(int i) {
		return answer[i];
	}
}
