package assignmentDay3;

public class ArraySum {
	public static void main(String[] args) {
		int firstArrayMatrix[][]= {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][]= {{2,2,2},{2,2,2}};
		System.out.println("Matrix 1");
		for(int i=0;i<firstArrayMatrix.length;i++) {
			for(int j=0;j<=firstArrayMatrix.length;j++)
			{
				System.out.print(firstArrayMatrix[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("Matrix 2");
		for(int i=0;i<secondArrayMatrix.length;i++) {
			for(int j=0;j<=secondArrayMatrix.length;j++)
			{
				System.out.print(secondArrayMatrix[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("Sum Matrix");
		for(int i1=0;i1<firstArrayMatrix.length;i1++) {
			for(int j=0;j<=firstArrayMatrix.length;j++)
			{
				System.out.print(firstArrayMatrix[i1][j]+secondArrayMatrix[i1][j]+" ");
			}
		System.out.println();
		}
	}
}
