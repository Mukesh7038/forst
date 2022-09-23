package StarProgramm;

public class StarTriangle {

	public static void main(String[] args) {
	
            
		char a='A';
		char b='A';
		int p=1;
		int space=4;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<p;j++) {
				System.out.print(a+" ");
				a++;
			}
			for(int j=1;j==1;j++) {
				System.out.print(b);
			}
			System.out.println();
			a='A';
			if(i<=4) {
				space--;
				p++;
			}
			else
			{
				space++;
				p--;
			}
		}
	}
}  