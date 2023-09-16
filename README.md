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



  [Descending Order](https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java)
  
  	static int sortDesc(final int num) {
		String array[] = String.valueOf(num).split("");
		Arrays.sort(array, Collections.reverseOrder());
		return Integer.valueOf(String.join("", array));}


   [Find the unique number](https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java)
   
	static double findUniq(double arr[]) {
		Arrays.sort(arr);
		return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];	}

  [Predict your age!](https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/java)

  	static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
		int sum = 0;
		int[] age = new int[] { age1, age2, age3, age4, age5, age6, age7, age8 };

		for (int predict : age) {
			predict = (int) Math.pow(predict, 2);
			sum += predict;
		}
		return (int) Math.sqrt(sum) / 2;}


  [The Wide-Mouthed frog!](https://www.codewars.com/kata/57ec8bd8f670e9a47a000f89/solutions/java)

  	static String mouthSize(String animal) {
    	return animal.equalsIgnoreCase("alligator") ? "small" : "wide";  }


[Area of a Circle](https://www.codewars.com/kata/537baa6f8f4b300b5900106c/train/java)

    	static double area(double radius) {
		if (radius > 0) {
			return Math.PI * Math.pow(radius, 2);
		} else {
			throw new IllegalArgumentException();}}

[Greet Me](https://www.codewars.com/kata/535474308bb336c9980006f2/train/java)

 	static String greet(String name) {
		String print = name.toLowerCase();
		return "Hello " + print.substring(0, 1).toUpperCase() + print.substring(1) + "!";}


[Find the next perfect square!](https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java)

	static long findNextSquare(long sq) {
		long root = (long) Math.sqrt(sq);
		return root * root == sq ? (root + 1) * (root + 1) : -1;}


  [Most digits](https://www.codewars.com/kata/58daa7617332e59593000006/solutions/java)

  	static int findLongest(int[] numbers) {
		int max = 0, nb = 0;
	    for (int i = 0; i < numbers.length; i++) {
	      int n = Math.abs(numbers[i]);
	      int nbDig = String.valueOf(n).length();
	      if (nbDig > max) {
	        max = nbDig;
	        nb = numbers[i];
	      }
	    }
	    return nb;}


[Minimize Sum Of Array (Array Series #1)](https://www.codewars.com/kata/5a523566b3bfa84c2e00010b/solutions)

      static int minSum(int[] passed) {
		int min = 0;
		for (int i = 0; i < passed.length / 2; i++)
			min += passed[i] * passed[passed.length - 1 - i];
		return min;}

  [Break camelCase](https://www.codewars.com/kata/5208f99aee097e6552000148/train/java)

  	static String camelCase(String input) {
		String[] r = input.split("(?=\\p{Upper})");
		return (String.join(" ", r));}

[Welcome!](https://www.codewars.com/kata/577ff15ad648a14b780000e7/train/java)

	static String greet(String language) {
		HashMap<String, String> map = new HashMap<>();
		map.put("english", "Welcome");
		map.put("czech", "Vitejte");
		map.put("danish", "Velkomst");
		map.put("dutch", "Welkom");
		map.put("estonian", "Tere tulemast");
		map.put("finnish", "Tervetuloa");
		map.put("flemish", "Welgekomen");
		map.put("french", "Bienvenue");
		map.put("german", "Willkommen");
		map.put("irish", "Failte");
		map.put("italian", "Benvenuto");
		map.put("latvian", "Gaidits");
		map.put("lithuanian", "Laukiamas");
		map.put("polish", "Witamy");
		map.put("spanish", "Bienvenido");
		map.put("swedish", "Valkommen");
		map.put("welsh", "Croeso");

		if (map.containsKey(language)) {
			return map.get(language);}
		return map.get("english");}


  [Calculate the area of a regular n sides polygon inside a circle of radius r](https://www.codewars.com/kata/5a58ca28e626c55ae000018a/train/java)

  	static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
		double S = circleRadius * circleRadius / 2 * numberOfSides * Math.sin(Math.PI * 2 / numberOfSides);
		return (double) Math.round(S * 1000) / 1000;}

  [Consonant value](https://www.codewars.com/kata/59c633e7dcc4053512000073/train/java)

  	static int solve(final String s) {
		  return  Arrays.stream(s.split("[aeiou]+"))
	                .mapToInt(t->t.chars().sum()-t.length()*96)
	                .max()
	                .getAsInt(); }

[Persistent Bugger.](https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java)

	static int persistence(long n) {
		int count = 0;
		while (n >= 10) {
			n = getMultiplyOfDigits(n);
			count++;
		}
		return count;
	}

	public static long getMultiplyOfDigits(long n) {
		int result = (int) n % 10;

		while ((n /= 10) > 0) {
			result *= n % 10;
		}
		return result;}

  [Alphabet war](https://www.codewars.com/kata/59377c53e66267c8f6000027/train/java)

  	static String alphabetWar(String fight) {
		int sumLeft = 0;
		int sumRight = 0;
		String[] num = fight.split("");

		for (int i = 0; i < num.length; i++) {
			if (num[i].equals("w")) {
				sumLeft += 4;
			} else if (num[i].equals("p")) {
				sumLeft += 3;
			} else if (num[i].equals("b")) {
				sumLeft += 2;
			} else if (num[i].equals("s")) {
				sumLeft += 1;
			} else if (num[i].equals("m")) {
				sumRight += 4;
			} else if (num[i].equals("q")) {
				sumRight += 3;
			} else if (num[i].equals("d")) {
				sumRight += 2;
			} else if (num[i].equals("z")) {
				sumRight += 1;
			}}
		if (sumLeft > sumRight) {
			return "Left side wins!";
		} else if (sumLeft < sumRight) {
			return "Right side wins!";
		} else {
			return "Let's fight again!";
		}}


  [Find the position!](https://www.codewars.com/kata/5808e2006b65bff35500008f/solutions/java)

  	static String position(char alphabet){
   	 return "Position of alphabet: " + ((int) alphabet - 96); }


 [Factorial](https://www.codewars.com/kata/57a049e253ba33ac5e000212/solutions/java)

 	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;}


  [Number of Decimal Digits](https://www.codewars.com/kata/58fa273ca6d84c158e000052/train/java)

  	static int Digits(long n) {
	    String siz = String.valueOf(n);
		return  siz.length();  }


  [Sum of a sequence](https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java)
  
	public static int sequenceSum(int start, int end, int step) {
		int sum = 0;
		for (int i = start; i <= end; i += step) {
			sum += i;
		}
		return sum;}

  [Thinkful - Number Drills: Blue and red marbles](https://www.codewars.com/kata/5862f663b4e9d6f12b00003b/train/java)

  	public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
		return (double)(blueStart - bluePulled) / (redStart - redPulled + blueStart - bluePulled); }


  [Lario and Muigi Pipe Problem](https://www.codewars.com/kata/56b29582461215098d00000f/train/java)

  	public static int[] pipeFix(int[] numbers) {
		int min = numbers[0];
		int max = numbers[numbers.length - 1];
		int size = max - min + 1;
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = i + min;
		}
		return result;}

  [Sum of Odd Cubed Numbers](https://www.codewars.com/kata/580dda86c40fa6c45f00028a/train/java)

  	public static int cubeOdd(int arr[]) {
		int rv = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			rv = (int) Math.pow(arr[i], 3);
			if (rv % 2 != 0) {
				count += rv;
			}
		}
		return count;}}


[Filter the number](https://www.codewars.com/kata/55b051fac50a3292a9000025/train/java)
	
 	public static long filterString(final String value) {
        	return Long.parseLong(value.replaceAll("[^0-9]", ""));}


[Stringy Strings](https://www.codewars.com/kata/563b74ddd19a3ad462000054)

	public static String stringy(int size) {
		int last = 1;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < size; i++) {
			sb.append(last);
			last = last == 0 ? 1 : 0;
		}
		return sb.toString();}

  
  
