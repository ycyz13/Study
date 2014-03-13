package zw.sortalgorithms;

public class HeapSort extends SortAlgorithms{
	@Override
	public void sort() {
		// ��ʼ����
		buildHeap(orginal);
		for (int i = orginal.length -1; i > 0; i--) {
			// ���������Ƴ��ĩβ����ŵ��ѵĶ��ˣ���ά�ִ�ѵ�����
			swap(orginal, 0, i);
			heapify(orginal, 0, i);
		}
	}
	
	private void buildHeap(int[]a) {
		for (int i = a.length/2 -1; i >= 0; i--) {
			heapify(a, i, a.length);
		}
	}
	
	/**
	 * 
	 * @param a
	 * @param idx
	 * @param max
	 */
	private void heapify(int[] a, int idx, int max) {
		int left = idx*2 + 1;
		int right = idx*2 + 2;
		int largest = idx;
		if (left < max && a[left] > a[largest]) {
			largest = left;
		}
		if (right < max && a[right] > a[largest]){
			largest = right;
		}
		
		if (idx != largest) {
			times++;
			swap(a, idx, largest);
			heapify(a, largest, max);
		}
	}
}
