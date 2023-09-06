# My first steps in Java

[Two fighters, one winner.](https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java)

	static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

		while (fighter1.health > 0 && fighter2.health > 0) {
			if (firstAttacker.equals(fighter1.name)) {
				fighter2.health -= fighter1.damagePerAttack;
				firstAttacker = fighter2.name;
			} else if (firstAttacker.equals(fighter2.name)) {
				fighter1.health -= fighter2.damagePerAttack;
				firstAttacker = fighter1.name;
			}
		}

		if (fighter1.health <= 0) {
			return fighter2.name;
		} else {
			return fighter1.name;
		}

	} }
 
[Small enough? - Beginner](https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java)

  	static boolean smallEnough(int[] a, int limit){
    Arrays.sort(a);
    return a[a.length-1] <= limit;}


[Grasshopper - Check for factor](https://www.codewars.com/kata/55cbc3586671f6aa070000fb/train/java)

	static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;}


 [Grasshopper - Array Mean](https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java)

	static int findAverage(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum / nums.length;}

[The Supermarket Queue](https://www.codewars.com/kata/57b06f90e298a7b53d000a86/solutions/java)

	static int solveSuperMarketQueue(int[] customers, int n) {
		int[] result = new int[n];
		  for(int i = 0; i < customers.length; i++){
	    	result[0] += customers[i];
	    	Arrays.sort(result);
	    }
		  return result[n-1];}
  
