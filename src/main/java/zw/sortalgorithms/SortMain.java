package zw.sortalgorithms;

public class SortMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortAlgorithms sortAlgorithem;
//		sortAlgorithem = new InsertSort();  // ��������
//		sortAlgorithem = new MedianSort();  // ��ֵ����
		sortAlgorithem = new HeapSort();  // ������
//		sortAlgorithem = new BubbleSort(); // ð������
		sortAlgorithem.initArray();
		sortAlgorithem.sort();
		sortAlgorithem.printSortedArray();
	}
}
