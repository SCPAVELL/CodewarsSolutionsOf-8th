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
			return fighter1.name;   }
	}
 }
 
[Small enough? - Beginner](https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java)

  	static boolean smallEnough(int[] a, int limit){
	    Arrays.sort(a);
	    return a[a.length-1] <= limit;
     }


[Grasshopper - Check for factor](https://www.codewars.com/kata/55cbc3586671f6aa070000fb/train/java)

	static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
	}


 [Grasshopper - Array Mean](https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java)

	static int findAverage(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum / nums.length;
  }

[The Supermarket Queue](https://www.codewars.com/kata/57b06f90e298a7b53d000a86/solutions/java)

	static int solveSuperMarketQueue(int[] customers, int n) {
		int[] result = new int[n];
		  for(int i = 0; i < customers.length; i++){
	    	result[0] += customers[i];
	    	Arrays.sort(result);
	    }
		  return result[n-1];
    }



  [Descending Order](https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java)
  
  	static int sortDesc(final int num) {
		String array[] = String.valueOf(num).split("");
		Arrays.sort(array, Collections.reverseOrder());
		return Integer.valueOf(String.join("", array));
  }


   [Find the unique number](https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java)
   
	static double findUniq(double arr[]) {
		Arrays.sort(arr);
		return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
  }

  [Predict your age!](https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/java)

  	static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
		int sum = 0;
		int[] age = new int[] { age1, age2, age3, age4, age5, age6, age7, age8 };

		for (int predict : age) {
			predict = (int) Math.pow(predict, 2);
			sum += predict;
		}
		return (int) Math.sqrt(sum) / 2;
  }

 
  [The Wide-Mouthed frog!](https://www.codewars.com/kata/57ec8bd8f670e9a47a000f89/solutions/java)

  	static String mouthSize(String animal) {
    	return animal.equalsIgnoreCase("alligator") ? "small" : "wide";  
     }


[Area of a Circle](https://www.codewars.com/kata/537baa6f8f4b300b5900106c/train/java)

    	static double area(double radius) {
		if (radius > 0) {
			return Math.PI * Math.pow(radius, 2);
		} else {
			throw new IllegalArgumentException();
   	}
   }

[Greet Me](https://www.codewars.com/kata/535474308bb336c9980006f2/train/java)

 	static String greet(String name) {
		String print = name.toLowerCase();
		return "Hello " + print.substring(0, 1).toUpperCase() + print.substring(1) + "!";
  }


[Find the next perfect square!](https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java)

	static long findNextSquare(long sq) {
		long root = (long) Math.sqrt(sq);
		return root * root == sq ? (root + 1) * (root + 1) : -1;
  }


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
	    return nb;
     }

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
		return (double) Math.round(S * 1000) / 1000;
  }

  [Consonant value](https://www.codewars.com/kata/59c633e7dcc4053512000073/train/java)

  	static int solve(final String s) {
		  return  Arrays.stream(s.split("[aeiou]+"))
	                .mapToInt(t->t.chars().sum()-t.length()*96)
	                .max()
	                .getAsInt(); 
		 }

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


 [Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right](https://www.codewars.com/kata/57faf7275c991027af000679/train/java)

 	 public static String remove(String s, int n) {
		for (int i = 0; i < n; i++) {
			s = s.replaceFirst("!", "");
		}
		return s;}

  
  
[max diff - easy](https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095/train/java)

	public static int maxDiff(int[] lst) {
	    if (lst.length<2) return 0;
	    java.util.Arrays.sort(lst);
	    return lst[lst.length-1] - lst[0];  }


[Equal Sides Of An Array](https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java)

	public static int findEvenIndex(int[] arr) {
	   int sum = 0, cSum = 0;
	    for (int i = 0; i < arr.length; i++) sum += arr[i];
	    for(int i = 0; i < arr.length; i++){
	      if (cSum == sum - arr[i]) return i;
	      cSum += arr[i];
	      sum -= arr[i];
	    }
	    return -1; 
     }


[Grasshopper - Summation](https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java)

	public static int summation(int n) {
            int runningTotal = 0;
            for (int i=1; i<=n; i++){ 
		runningTotal += i;
 		}
        return runningTotal; 
	}


 
[Training JS #7: if..else and ternary operator](https://www.codewars.com/kata/57202aefe8d6c514300001fd/train/java)

	public static int saleHotdogs(final int n) {
		if (n < 5) {
			return n * 100;
		} else if (n >= 5 && n < 10) {
			return n * 95;
		} else {
			return n * 90;}}


[Dashatize it](https://www.codewars.com/kata/58223370aef9fc03fd000071/train/java)
	
 	public static String dashatize(int num) {
		return String.valueOf(num)
				.replace("([13579])", "-$1-")
				.replace("--", "-")
				.replace("^-|-$", "");  }


[Tidy Number (Special Numbers Series #9)](https://www.codewars.com/kata/5a87449ab1710171300000fd/train/java)
	
 	public static boolean tidyNumber(int number) {
		int[] n = String.valueOf(number).chars().toArray();
		return IntStream.range(0, n.length - 1).allMatch(i -> n[i] - n[i + 1] <= 0);}	
 	
   
[A Strange Trip to the Market](https://www.codewars.com/kata/55ccdf1512938ce3ac000056/solutions/java)

	public static boolean isLockNessMonster(String s) {
		return s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty");
	}

 [A Rule of Divisibility by 13](https://www.codewars.com/kata/564057bc348c7200bd0000ff/solutions/java)

 	public static long thirt(long n) {
		int[] numbers = { 1, 10, 9, 12, 3, 4 };
		while (n > 99) {
			long nr = 0;
			int i = 0;
			while (n > 0) {
				nr += n % 10 * numbers[i++ % 6];
				n /= 10;
			}
			n = nr;
		}
		return n;
	}



 [Automorphic Number (Special Numbers Series #6)](https://www.codewars.com/kata/5a58d889880385c2f40000aa/solutions/java)

 	public static String autoMorphic(int number) {
		int square = number * number;
		while (number > 0) {
			if (number % 10 != square % 10) {
				return "Not!!";
			}
			number /= 10;
			square /= 10;
		}
		return "Automorphic";}


   [String ends with?](https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java)

   	public static boolean solution(String str, String ending) {
		return str.endsWith(ending);
	}


  [Exes and Ohs](https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java)

  	public static boolean getXO (String str) {
	    int exCount = (int) str.chars().mapToObj(c -> (char) c).filter(a -> Character.toLowerCase(a) == 'x').count();
	    int ohCount = (int) str.chars().mapToObj(c -> (char) c).filter(a -> Character.toLowerCase(a) == 'o').count();
	    return exCount == ohCount;  
     }

[Strong Number (Special Numbers Series #2)](https://www.codewars.com/kata/5a4d303f880385399b000001/train/java)

	public static String isStrongNumber(int num) {
	       return String.valueOf(num).chars()
	                .map(i-> IntStream.range(1, i-'0'+1).reduce(1, (p, v)->p*v))
	                .sum() == num ? "STRONG!!!!" : "Not Strong !!";
	    }


[Going to the cinema](https://www.codewars.com/kata/562f91ff6a8b77dfe900006e/train/java)

	public static int movie(int card, int ticket, double perc) {
        int i = 0;
        double system1 = 0;
        double system2 = card;
        while (Math.ceil(system2) >= system1) {
            i++;
            system1 += ticket;
            system2 += ticket * Math.pow(perc, visits);
        }
        return visits;
    }

[Highest Scoring Word](https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/solutions)

 	public static String high(String s) {    
	    String winner = "";
	    int highScore = 0;
	    
	    for (String word : s.split(" ")) {
	        int score = 0;
	        for (char c : word.toCharArray()) {
	          score += c - 'a' + 1;
	        }
	        if (score > highScore) {          
	          winner = word;
	          highScore = score;
	        }
	    }
	    
	    return winner;
	  }

[Pythagorean Triple](https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java)

	public int pythagoreanTriple(int[] triple){
		 return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;    
	}

[Maximum Triplet Sum (Array Series #7)](https://www.codewars.com/kata/5aa1bcda373c2eb596000112/solutions/java)

 	public static int maxTriSum(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			set.add(numbers[i]);
		}
		Optional<Integer> sumSet = set.stream().sorted(Comparator.reverseOrder()).limit(3).reduce((a, b) -> a + b);
		set.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		return sumSet.isPresent() ? sumSet.get() : 0;
	}

[Help the bookseller !](https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/java)

  	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		String result = "";
		int count = 0;
		boolean emptyResult = true;
		for (String letter : lstOf1stLetter) {
			int sum = 0;
			for (String art : lstOfArt) {
				String[] artArray = art.split(" ");
				String title = artArray[0];
				int price = Integer.parseInt(artArray[1]);

				if (title.startsWith(letter)) {
					sum += price;
				}
			}

			if (sum > 0)
				emptyResult = false;

			result += String.format("(%s : %d)", letter, sum);
			count++;
			if (count < lstOf1stLetter.length && result.length() > 0)
				result += " - ";
		}
		return emptyResult ? "" : result;
	}

	// Abbe's solution
	private static class Book {
		public final String category;
		public final String code;
		public final int quantity;

		public Book(String label) {
			category = label.substring(0,1);
			code = label.split(" ")[0].substring(1);
			quantity = Integer.parseInt(label.split(" ")[1]);
		}
	}

	public static String otherStockSummary1(String[] lstOfArt, String[] lstOf1stLetter) {
		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
			return "";
		Map<String, Integer> categoryCounts = Arrays.stream(lstOfArt)
				.map(Book::new)
				.collect(Collectors.groupingBy(book -> book.category, Collectors.summingInt(book -> book.quantity)));
		return Arrays.stream(lstOf1stLetter)
				.map(initial -> String.format("(%s : %d)",
						initial, categoryCounts.getOrDefault(initial, 0)))
				.collect(Collectors.joining(" - "));
	}

	// mstream's solution
	public static String otherStockSummary2(String[] lstOfArt, String[] lstOf1stLetter) {
		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
			return "";
		}
		Map<String, Integer> map = new HashMap(lstOf1stLetter.length);
		for (String book : lstOfArt) {
			String category = book.substring(0, 1);
			Integer quantity = Integer.valueOf(book.substring(book.indexOf(" ") + 1));
			if (!map.containsKey(category)) {
				map.put(category, quantity);
			} else {
				map.put(category, quantity + map.get(category));
			}
		}
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = Arrays.asList(lstOf1stLetter).iterator();
		while(it.hasNext()) {
			String category = it.next();
			int quantity = map.containsKey(category) ? map.get(category) : 0;
			sb.append(String.format("(%s : %d)", category, quantity));
			if (it.hasNext()) {
				sb.append(" - ");
			}
		}
		return sb.toString();
	}


[Leonardo Dicaprio and Oscars](https://www.codewars.com/kata/56d49587df52101de70011e4/solutions/java)

	public static String leo(final int oscar){
	    if (oscar == 88) {
	      return "Leo finally won the oscar! Leo is happy";
	    } else if (oscar == 86) {
	      return "Not even for Wolf of wallstreet?!";
	    } else if (oscar < 88) {
	      return "When will you give Leo an Oscar?";
	    } else {
	      return "Leo got one already!";
	    }
	  }

[Find the Integral](https://www.codewars.com/kata/59811fd8a070625d4c000013/train/java)

 	public static String integrate(int coefficient, int exponent) {
		int i = exponent + 1;
		String print = Integer.toString(coefficient / i);
		return print + "x^" + i;
	}

 [longest_palindrome](https://www.codewars.com/kata/54bb6f887e5a80180900046b/solutions)

 	public static int longestPalindrome(final String s) {
		int max = 0, slen = s.length();
		for (int len = slen; len > max; len--) {
			for (int i = 0; i + len <= slen; i++) {
				String sub = s.substring(i, i + len);
				if (new StringBuilder(sub).reverse().toString().equals(sub)) {
					max = len;
					break;
				}
			}
		}
		return max;
	}

 [Tribonacci Sequence](https://www.codewars.com/kata/556deca17c58da83c00002db/train/java)

 	public double[] tribonacci(double[] s, int n) {
		if (s.length == 0 || n <= 0) {
			return new double[0];
		}
		List<Double> resultList = new ArrayList<>();

		if (n > 3) {
			resultList.add(s[0]);
			resultList.add(s[1]);
			resultList.add(s[2]);
			for (int i = 3; i < n; i++) {
				double nextElement = resultList.get(i - 3) + resultList.get(i - 2) + resultList.get(i - 1);
				resultList.add(nextElement);
			}
		} else {
			for (int i = 0; i < n; i++) {
				resultList.add(s[i]);
			}
		}
		return resultList.stream().mapToDouble(j -> j).toArray();
		}


 [Multiples of 3 or 5](https://www.codewars.com/kata/514b92a657cdc65150000006/train/java)

  	public int solution(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	
[Convert string to camel case](https://www.codewars.com/kata/517abf86da9663f1d2000003/solutions/java)

	static String toCamelCase(String s) {
		StringBuilder result = new StringBuilder();
		boolean capitalize = false;

		for (char c : s.toCharArray()) {
			if (c == '-' || c == '_') {
				capitalize = true;
			} else {
				if (capitalize) {
					c = Character.toUpperCase(c);
					capitalize = false;
				}

				result.append(c);
			}
		}

		return result.toString();
	}

[Digits explosion](https://www.codewars.com/kata/585b1fafe08bae9988000314/solutions/java)

 	public static String explode(String digits) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < digits.length(); ++i) {
	      
	      if (digits.substring(i, i + 1).equals("0")) {
	        continue;
	      }
	      
	      for (int j = 1; j <= Integer.valueOf(digits.substring(i, i + 1)); ++j) {
	        sb.append(digits.charAt(i));
	      }
	      
	    }
	    
	    return sb.toString();
  		}

[Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)

 	public boolean isPalindrome(int x) {
		int invert = 0;
		int copyX = x;
		
		if (x < 0) {
			return false;
		} else if (x % 10 == 0 && x != 0) {
			return false;
		}else {
			while(copyX != 0) {
				invert = invert * 10 + copyX % 10;
				copyX = copyX / 10;
			}
		}
		return x == invert;
		
	}

 [1512. Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/description/)

 	public int numIdenticalPairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = 0;
		for (int num : nums) {
			if (map.containsKey(num)) {
				res += map.get(num);
			}
			map.put(num, map.getOrDefault(num, 0) + 1); 
		}

		return res;
	}

 [From A to Z](https://www.codewars.com/kata/6512b3775bf8500baea77663/solutions/java)

	public static String gimmeTheLetters(String s) {
		StringBuilder string = new StringBuilder();
		int firstCharCode = (int) s.charAt(0);
		int lastCharCode = (int) s.charAt(2);
		for (int i = firstCharCode; i <= lastCharCode; i++) {
			string.append((char) i);
		}
		return string.toString();
	}


 [Integers: Recreation One](https://www.codewars.com/kata/55aa075506463dac6600010d/train/java)

	public static String listSquared(long m, long n) {
			List<String> listSqu = new ArrayList<String>();
			for (long i = m; i <= n; i++) {
				int sum = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						sum += Math.pow(j, 2);
					}
				}
				if ((int) Math.sqrt(sum) == Math.sqrt(sum)) {
					List a = new ArrayList();
					a.add(i);
					a.add(sum);
					listSqu.add(a.toString());
				}
			}
			return listSqu.toString();
		}



 [Gap in Primes](https://www.codewars.com/kata/561e9c843a2ef5a40c0000a4/train/java)

class GapInPrimes {

	public static long[] gap(int g, long m, long n) {
		long[] primes = generator(m, n);
		for (int i = 0; i < primes.length - 1; i++) {
			if (primes[i] >= m && primes[i] == primes[i + 1] - g) {
				return Arrays.copyOfRange(primes, i, i + 2);
			}
		}
		return null;
	}

	private static long[] generator(long m, long n) {

		long[] primes = new long[(int) (n - m)];
		int numPrimes = 0;
		boolean prime = true;
		for (int i = (int) m; i < (int) n; i++) {
			prime = true;
			for (int j = 2; j < Math.sqrt((double) i) + 1; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				primes[numPrimes] = (long) i;
				numPrimes++;
			}
		}
		return Arrays.copyOfRange(primes, 0, numPrimes);
	}

	private static long[] seive(long m, long n) {

		long[] primes = new long[(int) n / 2 + 1];
		long j = 3;
		long newJ = 0;
		primes[0] = 1;
		primes[1] = 2; // add special case primes
		for (int i = 2; i <= (int) (n + 1) / 2; i++) {// populate array with odd numbers
			primes[i] = (long) (2 * i) - 1;
		}
		while (j < n) {
			for (int i = (int) n / 2; primes[i] > j; i--) {
				if (primes[i] % j == 0) {
					primes[i] = 0;
				} else if (primes[i] > j) {
					newJ = primes[i];
				} else
					continue;
			}
			Arrays.sort(primes);
			if (j == newJ) {
				j++;
			} else
				j = newJ;
		}
		for (int index = 0; index < n / 2 + 1; index++) {
			if (primes[index] >= m) {
				primes = Arrays.copyOfRange(primes, index, (int) n / 2 + 1);
				break;
			}
		}
		return primes;
	}
}


 [Easy Line](https://www.codewars.com/kata/56e7d40129035aed6c000632/train/java)

	BigInteger answer = BigInteger.valueOf(0);
		for (int i = 0; i <= n; i++) {
			answer = answer.add(binomi(n, i).pow(2));
		}
		return answer;
	}

	static BigInteger binomi(int n, int k) {
		BigInteger res = BigInteger.valueOf(1);

		if (k > n - k)
			k = n - k;

		for (int i = 0; i < k; ++i) {
			res = res.multiply(BigInteger.valueOf(n - i));
			res = res.divide(BigInteger.valueOf(i + 1));
		}

		return res;
	}


[Maximum Product](https://www.codewars.com/kata/5a4138acf28b82aa43000117/solutions/java)

	 public int adjacentElementsProduct(int[] array) {
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < array.length - 1; i++) {
			sum = Math.max(sum, array[i] * array[i + 1]);
		}
		return sum;
	}


[V A P O R C O D E](https://www.codewars.com/kata/5966eeb31b229e44eb00007a/solutions/java)

	public static String vaporcode(String s) {
		String[] print = s.split("");
		String sol = "";
		for (int i = 0; i < print.length; i++) {
			if (!print[i].matches(" ")) {
				sol += print[i].toUpperCase() + "  ";
			}
		}
		return sol.trim();
	}

[N-Parasitic Numbers Ending in N](https://www.codewars.com/kata/55df87b23ed27f40b90001e5/solutions/java)

	public static String calculateSpecial(int lastDigit, int radix) {
		String xyz = "";
		int divider = lastDigit * radix - 1;
		int rest = lastDigit;
		do {
			rest *= radix;
			xyz += Integer.toString(rest / divider, radix);
			rest %= divider;
		} while (rest != lastDigit);
		return xyz;
	}


[What's a Perfect Power anyway?](https://www.codewars.com/kata/54d4c8b08776e4ad92000835/train/java)

	public class PerfectPower {
		public static int[] isPerfectPower(int n) {
			int upperBound = (int) Math.sqrt(n);
			int tempN = n;
			int j = 0;
			for (int i = 2; i <= upperBound; i++) {
				while (tempN % i == 0 && tempN > 1) {
					tempN = tempN / i;
					j++;
				}
				if (tempN == 1) {
					return new int[] { i, j };
				}
				tempN = n;
				j = 0;
			}
			return null;

		}
	}

[Unlucky Days](https://www.codewars.com/kata/56eb0be52caf798c630013c0/train/java)

	public static int unluckyDays(int year) {
			int days = 0;
	
			for (int i = 1; i < 13; i++) {
				LocalDate date = LocalDate.of(year, i, 13);
				if (date.getDayOfWeek().compareTo(DayOfWeek.FRIDAY) == 0) {
					days++;
				}
			}
			return days;
		}


[Did she say hallo?](https://www.codewars.com/kata/56a4addbfd4a55694100001f/train/java)

	  public static boolean validateHello(String greetings) {
			final String[] languages = new String[] { "hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc" };
			for (String language : languages) {
				if (greetings.toLowerCase().contains(language))
					return true;
			}
			return false;
		}


[extract portion of file name](https://www.codewars.com/kata/597770e98b4b340e5b000071/train/java)

  	public static String extractFileName(String dirtyFileName) {
		int underScore = dirtyFileName.indexOf("_");
		int dot = dirtyFileName.lastIndexOf(".");
		return dirtyFileName.substring(underScore + 1, dot);
	}

[Array plus array](https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/solutions/java)

	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i] + arr2[i];
		}
		return sum;
	}


[Find the Slope](https://www.codewars.com/kata/55a75e2d0803fea18f00009d/solutions/java)

	 public String slope(int[] points) {
		try {
			return "" + (points[3] - points[1]) / (points[2] - points[0]);
		} catch (Exception e) {
			return "undefined";
		}
	}


[Localize The Barycenter of a Triangle](https://www.codewars.com/kata/5601c5f6ba804403c7000004/solutions/java)

 	public static double[] barTriang(double[] x, double[] y, double[] z) {
		double[] res = new double[2];

		res[0] = (double) ((int) Math.round((x[0] + y[0] + z[0]) / 3 * 10000)) / 10000;
		res[1] = (double) ((int) Math.round((x[1] + y[1] + z[1]) / 3 * 10000)) / 10000;

		return res;
	}

[Bouncing Balls](https://www.codewars.com/kata/5544c7a5cb454edb3c000047/solutions/java)

	 public static int bouncingBall(double h, double bounce, double window) {
		int count = 1;
		double bounceHight = h * bounce;
		if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
			return -1;
		} else {

			while (bounceHight > window) {
				count += 2;
				bounceHight = bounceHight * bounce;
			}
		}
		return count;

	}

[DNA to RNA Conversion](https://www.codewars.com/kata/5556282156230d0e5e000089/train/java)

	public String dnaToRna(String dna) {

		String print = dna.replace("T", "U");
		return print;
	}
