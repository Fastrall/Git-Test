/* ���� ����� ����? ��������...
1. � ������ Solution ������� public ����������� ����� Idea
2. � ������ Idea ������� ����� public String getDescription(), ������� ����� ���������� ����� �������� �����
3. � ������ Solution �������� ����������� ����� public void printIdea(Idea idea), ������� ����� ��������
�� ����� �������� ���� - ��� ��, ��� ���������� ����� getDescription
*/

public class Solution
{
    public static void main(String[] args)
    {
        printIdea(new Idea());
    }

    public static class Idea
    {
    	public static String getDescription()
    	{
    		return "rrety";
    	}        
    }
    public static void printIdea(Idea idea)
    {
    	System.out.println(Idea.getDescription());
    }    
}
