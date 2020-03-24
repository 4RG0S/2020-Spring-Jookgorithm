import java.util.Scanner;

public class Main1004 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main1004 main = new Main1004();
		
		// ���� �� ��ŭ Ƚ���� ����
		int n = input.nextInt();
		int[] result = new int[n];
		
		for(int i=0;i<n;i++) {
			
			//�����
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			
			//��ǥ��
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			
			int count = input.nextInt();
			
			//���� �߽ɰ� ������
			int[] x = new int[count];
			int[] y = new int[count];
			int[] radius = new int[count];
			
			for(int j=0;j<count;j++) {
				x[j] = input.nextInt();
				y[j] = input.nextInt();
				radius[j] = input.nextInt();
				
				//double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));

				//������� ���� �߽ɰ��� �Ÿ�
				double distance1 = Math.sqrt(Math.pow(x1-x[j], 2) + Math.pow(y1-y[j], 2));
				
				//��ǥ���� ���� �߽ɰ��� �Ÿ�
				double distance2 = Math.sqrt(Math.pow(x2-x[j], 2) + Math.pow(y2-y[j], 2));
				
				if((distance1<radius[j] && distance2>radius[j]) || (distance1>radius[j] && distance2<radius[j])) {
					result[i] += 1;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(result[i]);
		}
	}
}
