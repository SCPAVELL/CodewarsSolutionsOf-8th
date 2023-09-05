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

	}
 }
 
[Small enough? - Beginner](https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java)

  public static boolean smallEnough(int[] a, int limit){
    Arrays.sort(a);
    return a[a.length-1] <= limit;
  }
