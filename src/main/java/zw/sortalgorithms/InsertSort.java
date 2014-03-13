package zw.sortalgorithms;

public class InsertSort extends SortAlgorithms {
	@Override
	public void sort() {
		times = 0;
		for (int i = 1; i < orginal.length; i++) {
			int insertValue = orginal[i];
			int j = i -1;
			while (j >= 0 &&orginal[j] > insertValue) {
				orginal[j+1] = orginal[j];
				times++;
				j--;
			}
			orginal[j+1] = insertValue;
		}
//		times = 0;
//		for (int i = 1; i < orginal.length; i++) {
//			int insertValue = orginal[i];
//			int j = i-1;
//			while(j >= 0 && orginal[j] > insertValue) {
//				times++;
//				orginal[j+1]=orginal[j];
//				j--;
//			}
//			orginal[j+1]=insertValue;
//		}
	}
}
