import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		int [][] matrix1 = {{1,2,3},{2,3,4},{2,3,4}};
		int[][] matrix2 = {{1,2,3},{1,2,3},{2,3,4}};
		int temp=0;
		int[][] ans = new int[matrix1[0].length][matrix2[1].length];
		
		
		System.out.printf("Multiplicationt%n");
		
		for (int r = 0; r < matrix1[0].length; r++) {
			for (int c = 0; c < matrix1[1].length; c++) {
				ans[r][c] = matrix1[r][c] * matrix2[r][c];
			}
		}
		
		
		for (int i = 0; i<matrix1[1].length; i++) {
            for (int j = 0; j <matrix2[1].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.printf("%n");
		}

		;
		
		System.out.printf("%nDot product%n");
		
		for(int i=0;i<matrix1[0].length;i++) {
			for(int x=0;x<matrix2[1].length;x++) {
				temp=0;
				for(int y=0; y<matrix1[0].length;y++) {
					temp = temp +(matrix1[i][y]*matrix2[y][x]);
				}
				ans[i][x]=temp;
			}
		}
		
		
		for (int i = 0; i<matrix1[0].length; i++) {
            for (int j = 0; j <matrix2[1].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.printf("%n");
		}
		
    }
	
	
	
		
	
	}
