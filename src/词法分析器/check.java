package �ʷ�������;
import java.util.Scanner;
public class check {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		String [] str=new String [24];
		str[0]="#";str[1]="begin";str[2]="if";str[3]="then";str[4]="while";
		str[5]="do";str[6]="end";str[7]=" ";str[8]="*";str[9]="/";str[10]="+";
		str[11]="-";str[12]=":";str[13]=":=";str[14]=" ";str[15]=">";
		str[16]="<>";str[17]="<=";str[18]="<";str[19]=">=";str[20]="=";
		str[21]=";";str[22]="(";str[23]=")";
		
       
    		boolean b1=true;
    		Scanner sc=new Scanner(System.in);
    		System.out.println("�������ַ���:");
    		String str1=sc.nextLine();
    		System.out.println("Ԥ����:ȥ���ո�");
    		String str2 = str1.replaceAll(" ", ""); 
    		System.out.println(str2);
    		System.out.println("Ԥ����:��ȡ��Ч�ַ�");
    		String[] str3=str2.split("\\.");
    		String str4=str3[0];
    		if(str4.length()==0) {
    			System.out.println("�ʷ���������:����Ч�ַ�");
    			System.exit(0);
    		}
    		
    		System.out.println(str4);
    		System.out.println("Ԥ����:ȥ��ע��");
    		String[] str5=str4.split("//");
    		String str6=str5[0];
    		if(str6.length()==0) {
    			System.out.println("�ʷ���������:����Ч�ַ�");
    			System.exit(0);
    		}
    		System.out.println(str6);

    		for(String s:str) {
    			if(s.equals(str6)) {
    				System.out.println("�ʷ���������:���Ǳ�����");
    				b1=false;
    				break;
    			}
    		}
    		if(b1) {
    		boolean b0=true;
    		boolean b3=true;
    		char chars[]=str6.toCharArray();
    		 if(chars[0]>='1'&&chars[0]<='9') {

    			
    			for(char c:chars) {
                           if(c>='0'&&c<='9') {
    					
    				}else {
    					b0=false;
    				}
    			}
    			if(b0) {
    				System.out.println("�ʷ���������:���ǳ���");
    			}
    			if(!b0) {
    				System.out.println("�ʷ���������:���ǷǷ��ַ�");
    			}
    		}else if(chars[0]=='0') {

    			for(char c:chars) {
                    if(c>='0'&&c<='9') {
    				
    			}else {
    				b0=false;
    			}
    		}
    			if(b0) {
    				System.out.println("�ʷ���������:���Ǳ��");
    			}
    			if(!b0) {
    				System.out.println("�ʷ���������:���ǷǷ��ַ�");
    			}
    		}else if(chars[0]>='a'&&chars[0]<='z'||chars[0]>='A'&&chars[0]<='Z')
    		{
    			for(char c:chars) {
    				if(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9') {
    					
    				}else {
    					b3=false;
    				}
    			}
    			if(b3) {
    				System.out.println("�ʷ���������:���Ǳ�ʶ��");
    			}
    			if(!b3) {
    				System.out.println("�ʷ���������:���ǷǷ��ַ�");
    			}
    		}else  {
    			System.out.println("�ʷ���������:���ǷǷ��ַ�");
    		}
    		
    		}
        
		
	}

}
