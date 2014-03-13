package zw.sortalgorithms;

/**
 * ð������
 * @author zhaowei1
 *
 */
public class BubbleSort extends SortAlgorithms {

	@Override
	public void sort() {
		times = 0;
		for (int i = 0; i < orginal.length; i++) {
			for (int j = 0; j < orginal.length - i - 1; j ++) {
				if (orginal[j] > orginal[j+1]) {
					swap(orginal, j, j+1);
				}
				times++;
			}
		}

	}

}
