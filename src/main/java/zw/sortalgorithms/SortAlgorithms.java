package zw.sortalgorithms;

public abstract class SortAlgorithms {
	protected static int orginal[];
	protected static int times;
	
	/*
	 * ��ʼ������������
	 */
	public void initArray(){
		orginal = new int[]{1,9,6,6,8,0};
//		orginal = new int[]{15,9,8,1,4,11,7,12,13,6,5,3,16,2,10,14};
//		orginal = new int[]{1,2,3,4,5,6};
		orginal = new int[]{6,5,4,3,2,1};
	}
	
	/*
	 * ��ӡ�������
	 */
	public void printSortedArray(){
		System.out.print("Change " + times + " times.\r\nThe order is:");
		for (int i = 0; i < orginal.length; i++) {
			System.out.print(orginal[i] + " ");
		}
		System.out.print("\r\n");
	}
	
	// ����������Ԫ��λ��
	protected void swap(int array[], int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	
	public abstract void sort();
}
