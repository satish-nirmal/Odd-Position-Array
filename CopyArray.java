
public class CopyArray {

	
	public static void main(String[] args) {
		
		
	int	array[]=new int[10];
array[0]=1;
array[1]=5;
array[2]=10;
array[3]=29;
array[4]=17;
array[5]=20;
array[6]=50;
array[7]=60;
array[8]=70;
array[9]=80;
int a[]=new int[10];
for(int i=0;i<array.length;i++) {
a[i]=array[i];
	}
System.out.println("array is ");

for(int i=0;i<array.length;i++) {
	
	System.out.println(array[i]);
	}
System.out.println("copy array is");
for(int i=0;i<a.length;i++) {

System.out.println(a[i]);
	}


	}
	
	
}
