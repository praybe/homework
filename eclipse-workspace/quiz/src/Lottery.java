
public class Lottery {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for (int i =0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45+1);
			
			for(int j = 0 ; j < i ; j++) {
				if(lotto[i] == lotto [j]) {  //�� �� �κ� ������.. �ؿ� �� ���� �־��µ�... �׷����� ��� �ȳ��� 
				i--;
				break;
				}
			}		
			
		}
		
		for (int i =0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
			
		}
		
		
	}

}
