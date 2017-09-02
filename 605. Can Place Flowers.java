class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		List<Integer> tmp = new ArrayList<>();
		int count = 0;
		int sum = 0;
		if (flowerbed.length == 1 && flowerbed[0] == 0) {
			sum = 1;
		} else {
			for (int i = 0; i < flowerbed.length; i++) {
				if(i==0||i==flowerbed.length-1) {
					if (flowerbed[0] == 0 || flowerbed[flowerbed.length - 1] == 0) {
						count++;
					}
				}
				if (flowerbed[i] == 0) {
					count++;
				} else if (count != 0) {
					tmp.add(count);
					System.out.println(count);
					count = 0;
				}
			}
			if(count!=0){
				tmp.add(count);
				System.out.println(count);
			}
			for (int j = 0; j < tmp.size(); j++) {
				if (tmp.get(j) % 2 != 0 && tmp.get(j) > 2) {
					sum += tmp.get(j) / 2;
				} else if (tmp.get(j) % 2 == 0 && tmp.get(j) > 2) {
					sum += (tmp.get(j) - 1) / 2;
				}
			}
		}
		boolean res = false;
		if (n <= sum) {
			res = true;
		}
		return res;
	}
}