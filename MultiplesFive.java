package array;

public class MultiplesFive {

	public static void main(String[] args) {
	             int s=0;int index=0;
	             int end=100;
	          int arraysize=(end-s)/5+1;
	            int arr[]=new int[arraysize];
	            for(int i=s;i<=end;i++) {
	            	if(i%5==0) {
	            		arr[index]=i;
	            		index++;
	            	}
	            }
	            System.out.println("Multiples of 5 from 1 to 100:");
	            
	            for(int i=0;i<arr.length;i++) {
	            	System.out.print(arr[i]+" ") ;
	            }

	}

	}

