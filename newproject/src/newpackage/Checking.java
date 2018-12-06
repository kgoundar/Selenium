package newpackage;

public class Checking {

	public static void main(String[] args) {
		
		int[] array1 = new int[] {1, 2, 7, 8, 9, 9, 11, 7, 20, 20};
		int[] array2 = new int[array1.length];
		int dupfind = 0;
		int j = 0;

		for (int i = 0; i < (array1.length); i++)
		{
			dupfind = array1[i];
			
			//System.out.println("Dupfind is " + dupfind);
			
			for (int b = i+1; b < (array1.length); b++) {
				
				if (dupfind == array1[b]) {
					
					array2[j] = dupfind;
					//System.out.println("second array:" + array2[j]);
					j++;
							
				}
						
			}

		}
		
		
		for (int a = 0; a < j; a++) {
			
			System.out.println(array2[a]);
			
		}
		
				
	}
}
