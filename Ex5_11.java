/* Author Stetson Serna
Date 11/15/18
*/
class Ex5_11 {
	public static void main(String[] args) {
	int count=0;	
	int num=100;
		do{	
			if(num%5==0^num%6==0) {
				System.out.print(num+" ");
				count++;
		}
			if(count==10) {
				System.out.println();
				count=0;
			}
			num++;
		
		}
		while (num <= 200);
	}
}