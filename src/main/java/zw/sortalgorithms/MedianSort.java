package zw.sortalgorithms;

/**
 * ��������
 * @author zhaowei1
 *
 */
public class MedianSort extends SortAlgorithms{
	@Override
	public void sort() {
		times = 0;
		medianSort(orginal, 0, orginal.length - 1);
	}
	
	private void medianSort(int[] a, int left, int right) {
		// ������ֻ��С��2��Ԫ�أ��������ٻ��֣��ݹ����
		if (left >= right) {
			return;
		}
		// �õ��м�Ԫ�ص�λ����Ϊ��ֵ
		int midPosition = left + (right - left + 1)/2;  
		int midNumber = a[midPosition];
		swap(a, right, midPosition);  // ����ֵԪ�������ұߵ�Ԫ�ػ���
		int count = left;
		// �����ң���С�ڵ�����ֵ��Ԫ�����η��������������
		for (int i = left; i < right; i++) {
			times++;
			if (a[i] <= midNumber) {
				swap(a, i, count);
				count++;
			}
		}
		/**
		 * ����ֵԪ�ظ�����С�ڵ����������������
		 * [[С�ڵ���midNumber], midNumber, [����midNumber]]
		 */
		swap(a, right, count);  
		
		// ����ֵ�����ҷ���ݹ����ϲ���
		medianSort(a, left, count-1);  // �����
		medianSort(a, count + 1, right);  // �ҷ���
		
	}
}
