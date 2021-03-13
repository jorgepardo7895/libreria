package libreria;

public class Ejercicio {

	public static void main(String[] args) {
		int[]nums1=new int[(int)(Math.random()*11)];
		int[]nums2=new int[(int)(Math.random()*11)];
		int errores=0, vueltas=0;
		if (nums1.length>nums2.length) {
			vueltas=nums2.length;
		}else {
			vueltas=nums1.length;
		}
		for (int i = 0; i < vueltas; i++) {
			try {
				nums1[i]=(int)(Math.random()*11);
				nums2[i]=(int)(Math.random()*3);
				try {
					System.out.println(nums1[i]+" / "+nums2[i]+" = "+nums1[i]/nums2[i]);
				}catch(ArithmeticException exc) {
					errores++;
				}
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex.toString());
			}
		}
		System.out.println("Ha habido: "+errores+" errores.");
	}
}