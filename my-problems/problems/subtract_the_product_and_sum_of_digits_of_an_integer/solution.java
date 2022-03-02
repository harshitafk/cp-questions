class Solution {
    public int subtractProductAndSum(int n) {
        int mult = 1;
	      int add = 0;

	while (n!= 0) {
		mult *= n % 10;
		add += n % 10;

		n /= 10;
	}

	return mult - add;
    }
}