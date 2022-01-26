package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
int range=8;
int firNum = 0;
int secNum=1; 

int result1 ;
System.out.println(firNum);
System.out.println(secNum);
for(int i=2;i<range;i++) {
		        
		//int result1 = firNum+secNum;


	result1 = firNum+secNum;
			System.out.println(result1);
			firNum=secNum;
			secNum=result1;
		
			
		}

	}

}
