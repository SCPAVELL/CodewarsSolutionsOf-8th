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
   	}}}
   

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

  [Lario and Muigi Pipe Problem](https://www.codewars.com/kata/56b29582461215098d00000f/train/java)

  	public static int[] pipeFix(int[] numbers) {
		int min = numbers[0];
		int max = numbers[numbers.length - 1];
		int size = max - min + 1;
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = i + min;
		}
		return result;
  }

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
		return count;
  		}
   	 }


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
		return sb.toString();
  }


 [Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right](https://www.codewars.com/kata/57faf7275c991027af000679/train/java)

 	 public static String remove(String s, int n) {
		for (int i = 0; i < n; i++) {
			s = s.replaceFirst("!", "");
		}
		return s;
  }

  
  
[max diff - easy](https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095/train/java)

	public static int maxDiff(int[] lst) {
	    if (lst.length<2) return 0;
	    java.util.Arrays.sort(lst);
	    return lst[lst.length-1] - lst[0]; 
     }


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
		return "Automorphic";
  }


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
	    return winner;}

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


[Help the Fruit Guy](https://www.codewars.com/kata/557af4c6169ac832300000ba/train/java)

	public static String[] removeRotten(String[] fruitBasket) {
	 
	  if(fruitBasket == null || fruitBasket.length <= 0) return new String[0];
	   
	   for(int i = 0; i < fruitBasket.length; i++){
	     fruitBasket[i] = fruitBasket[i].replaceAll("rotten", "").toLowerCase();
	     }
	   return fruitBasket;
	 
	 }


[Row Weights](https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9/train/java)

	public static int[] rowWeights(final int[] weights) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < weights.length; i++) {
			if (i % 2 == 0) {
				a += weights[i];
			} else {
				b += weights[i];
			}
		}
		return new int[] { a, b };
	}


[Basic subclasses - Adam and Eve](https://www.codewars.com/kata/547274e24481cfc469000416/train/java)

	static Human[] create() {
		return new Human[] { new Man(), new Woman() };
	}
	}
	
	interface Human {
	}
	
	class Man implements Human {
	}
	
	class Woman implements Human {
	}


[Disarium Number (Special Numbers Series #3)](https://www.codewars.com/kata/5a53a17bfd56cb9c14000003/train/java)

	public static String disariumNumber(int number){
	        int sum = 0;
	        char[] arr = String.valueOf(number).toCharArray();
	        
	        for (int i = 0; i < arr.length; i++)  
	          sum += Math.pow(arr[i]-'0', i+1);
	        
	        return sum == number ? "Disarium !!" : "Not !!"; 
	    }

[The old switcheroo](https://www.codewars.com/kata/55d410c492e6ed767000004f/solutions)

	public static String vowel2Index(String s) {
	      StringBuilder sb = new StringBuilder();
	      for (int i = 0; i < s.length(); i++) {
	        if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1) sb.append(s.charAt(i));
	        else sb.append(i + 1);
	      }
	      return sb.toString();
	  }


[Strings Mix](https://www.codewars.com/kata/5629db57620258aa9d000014/solutions)

	   public static String mix(String s1, String s2) {
	    
	        List<String> finalStr = new ArrayList();
	
	        for (char c = 'a'; c <= 'z'; c++) {
	            String s1_char = s1.replaceAll("[^"+c+"]+","");
	            String s2_char = s2.replaceAll("[^"+c+"]+","");
	
	            int s1_length = s1_char.length();
	            int s2_length = s2_char.length();
	
	            if(s1_length>1 || s2_length>1){
	                if(s1_length == s2_length){
	                    finalStr.add("=:"+s1_char);
	                }
	                if(s1_length>s2_length){
	                    finalStr.add("1:"+s1_char);
	                }
	                if(s1_length<s2_length){
	                    finalStr.add("2:"+s2_char);
	                }
	            }
	        }
	        Comparator<String> length = (x,y) -> y.length()-x.length();
	        Comparator<String> type_value = (x,y) -> Character.compare(x.charAt(0),y.charAt(0));
	
	        return finalStr.stream().sorted(length.thenComparing(type_value)).collect(Collectors.joining("/"));
	    }


[Largest Elements](https://www.codewars.com/kata/53d32bea2f2a21f666000256/train/java)

	     public static int[] largest(int n, int[] arr) {
			Arrays.sort(arr);
			return Arrays.copyOfRange(arr, arr.length - n, arr.length);
	
		}
  
[Largest Elements](https://www.codewars.com/kata/53d32bea2f2a21f666000256/train/java)

	  public static int[] largest(int n, int[] arr) {
	    int [] array= arr.clone();
	        Arrays.sort(array);
	        int [] output = new int[n];
	        int i2=0;
	        for(int i=arr.length-n; i<arr.length;i++){
	            output[i2]=array[i];
	            i2++;
	        }
	
	        return output;
	   }


[English beggars](https://www.codewars.com/kata/59590976838112bfea0000fa/train/java)

	 public static int[] beggerBounty;
	
	    public static int[] beggars(int[] values, int n) {
	
	        beggerBounty = new int[n];
	
	        if(n == 0) return beggerBounty;
	        int nextBegger = 0;
	        for (int i = 0; i < values.length; i++) {
	            beggerBounty[nextBegger] += values[i];
	            nextBegger++;
	            if (nextBegger > n-1) nextBegger = 0;
	        }
	
	        return beggerBounty;
	  }


[Multi-tap Keypad Text Entry on an Old Mobile Phone](https://www.codewars.com/kata/54a2e93b22d236498400134b/train/java)

	public static int presses(String phrase) {
		char[][] keypad = { { '1' }, { 'A', 'B', 'C', '2' }, { 'D', 'E', 'F', '3' }, { 'G', 'H', 'I', '4' },
				{ 'J', 'K', 'L', '5' }, { 'M', 'N', 'O', '6' }, { 'P', 'Q', 'R', 'S', '7' }, { 'T', 'U', 'V', '8' },
				{ 'W', 'X', 'Y', 'Z', '9' }, { '*' }, { ' ', '0' }, { '#' } };
		char[][] keypad2 = { { '1', 'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W', '*', ' ', '#' },
				{ 'B', 'E', 'H', 'K', 'N', 'Q', 'U', 'X', '0' }, { 'C', 'F', 'I', 'L', 'O', 'R', 'V', 'Y' },
				{ '2', '3', '4', '5', '6', 'S', '8', 'Z' }, { '7', '9' } };

		String[] keypad3 = { "1ADGJMPTW* #", "BEHKNQUX0", "CFILORVY", "23456S8Z", "79" };

		int result = 0;
		String[] phraseArray = phrase.toUpperCase().split("");
		for (int i = 0; i < keypad3.length; i++) {
			for (String phraseLetter : phraseArray) {
				if (keypad3[i].contains(phraseLetter)) {
					result += (i + 1);
				}
			}
		}
		return result;
	}

	// jcniebla's solution
	static String[] keys = { "1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#" };

	public static int otherPresses(String phrase) {
		int nPresses = 0;

		for (char c : phrase.toUpperCase().toCharArray())
			for (String s : keys)
				nPresses += s.indexOf(c) + 1;
		return nPresses;
	}

[Number of People in the Bus](https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java)

	public static int countPassengers(ArrayList<int[]> stops) {
	    int result = 0;
		 for(int i = 0; i < stops.size();i++) {
			 result += stops.get(i)[0];
			 result -= stops.get(i)[1];
    		}
		 return result;
	  }


[Color Ghost](https://www.codewars.com/kata/5648b12ce68d9daa6b000099/GHOST/java)

	private String[] m_colorCodes = new String[]{"white" , "yellow" , "purple" , "red"};
		private String m_color = "";
		
		public Ghost(){
			m_color = m_colorCodes[new Random().nextInt(m_colorCodes.length)];
		}
		
		public String getColor(){
			return m_color;
		}


[Sort the odd](https://www.codewars.com/kata/5648b12ce68d9daa6b000099/GHOST/java)

	  public static int[] sortArray(int[] array) {
	    if (array.length == 0)
	      return array;
	      
	    for (int i=0; i<array.length; i++) {
	      if (array[i] % 2 != 0) {
	        for (int j=0; j<i; j++) {
	          if (array[j] % 2 != 0 && array[j] > array[i]) {
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	          }
	        }
	      }
	    }
	    
	    return array;
	  }


[Square into Squares. Protect trees!](https://www.codewars.com/kata/54eb33e5bc1a25440d000891/train/java)


	public String decompose(long n) {
	    return decomposer("", n - 1, n * n).strip();
	  }
	  
	  public String decomposer(String res, long n, long total){
	    if(total == 0) return res;
	    if(n == 0 || total < 0) return null;
	    
	    String x = decomposer( String.valueOf(n) + " " + res , n - 1, total - (n * n));
	    String y = decomposer(res, n - 1, total);
	    //System.out.println(x + ", " + y);
	    return x == null ? y: x;
	  }

[Binomial Expansion](https://www.codewars.com/kata/540d0fdd3b6532e5c3000b5b/solutions)

	import java.util.Arrays;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.util.stream.Collectors;

	public class KataSolution {
	
		public static int nOverK(int n, int k) {
			if (n < k)
				return 0;
			if (k == 0 || k == n)
				return 1;
			return nOverK(n - 1, k - 1) + nOverK(n - 1, k);
		}
	
		public static String expand(String expr) {
	
			Matcher m = Pattern.compile("(\\-?\\d*)([a-z])([+-])(\\-?\\d+)\\D+(\\d+)").matcher(expr);
			m.find();
			int p = Integer.parseInt(m.group(5));
			String[] str = new String[p + 1];
			int a = m.group(1).length() == 0 ? 1 : m.group(1).equals("-") ? -1 : Integer.parseInt(m.group(1));
			int b = (m.group(3).equals("-") ? -1 : 1) * Integer.parseInt(m.group(4));
			for (int i = 0; i <= p; i++) {
				long f = (long) (nOverK(p, i) * Math.pow(a, p - i) * (i == 0 ? 1 : Math.pow(b, i)));
				if (f != 0) {
					str[i] = p - i == 0 ? f + ""
							: (f == 1 ? "" : f == -1 ? "-" : f) + m.group(2) + (p - i != 1 ? "^" + (p - i) : "");
				}
			}
			return Arrays.stream(str).filter(s -> s != null).collect(Collectors.joining("+")).replaceAll("\\+\\-", "\\-");
		}
	}



   [Line Safari - Is that a line?](https://www.codewars.com/kata/59c5d0b0a25c8c99ca000237/train/java)

	import java.util.*;
	import java.util.stream.*;
	import java.awt.Point;
	
	public class Dinglemouse {

	/*
	 * **************** * HELPER CLASS * ****************
	 */
	private static class Pos extends Point {
		protected Pos(int x, int y) {
			super(x, y);
		}

		protected Pos(Pos p) {
			super(p);
		}

		protected Pos add(Pos p) {
			return new Pos(x + p.x, y + p.y);
		}

		protected boolean isVert() {
			return y == 0;
		}

		protected char getChar() {
			return posSet.contains(this) ? g[x][y] : 'Z';
		}

		protected boolean isValidComingFrom(Pos move) {
			char c = getChar();
			return c == '-' && move.x == 0 || c == '|' && move.y == 0 || c == 'X' || c == '+';
		}

		@Override
		public String toString() {
			return String.format("(%d,%d)", x, y);
		}
	}
	/* **************** */

	private static Pos[] MOVES = Arrays
			.stream(new int[][] { new int[] { -1, 0 }, new int[] { 1, 0 }, new int[] { 0, 1 }, new int[] { 0, -1 } })
			.map(p -> new Pos(p[0], p[1])).toArray(Pos[]::new);

	private static Map<Boolean, List<Pos>> TURNS = new HashMap<Boolean, List<Pos>>() {
		{
			put(false, Arrays.asList(new Pos(1, 0), new Pos(-1, 0))); // move is horizontal => go up or down
			put(true, Arrays.asList(new Pos(0, 1), new Pos(0, -1))); // move is verical => go left or right
		}
	};

	private static char[][] g;
	private static List<Pos> startEnd;
	private static Set<Pos> posSet;

	public static boolean line(final char[][] grid) {

		g = grid;
		posSet = new HashSet<Pos>();
		startEnd = new ArrayList<Pos>();

		for (int x = 0; x < grid.length; x++)
			for (int y = 0; y < grid[x].length; y++) {
				Pos p = new Pos(x, y);
				if (g[x][y] == 'X')
					startEnd.add(p);
				if ("-|+X".contains("" + g[x][y]))
					posSet.add(p);
			}

		boolean isValidPath = startEnd.size() == 2; // Two and only Two 'X' (already required by the description,
													// but...)
		if (isValidPath) {
			for (int i = 0; i < 2; i++) { // Check coming from one point and the other at the second iteration
				Collections.reverse(startEnd); // Invert the starting and ending points
				isValidPath = seekPath();
				if (isValidPath)
					break;
			}
		}
		return isValidPath;
	}

	private static boolean seekPath() {

		Set<Pos> validPosSet = new HashSet<Pos>(); // Set of all the positions that will be contained in the valid path
													// (possibly) found
		Stack<Pos> queue = new Stack<Pos>(), // Store the position of the corners
				whichDir = new Stack<Pos>(), // Store the direction to use to do the next step, coming from the position
												// in "queue" at the same level in the stack
				localPath = new Stack<Pos>(); // Collect the current path (backtracking)

		int count = 0; // Number of valid paths found

		Pos fromPos = new Pos(startEnd.get(0)), move = null;

		for (Pos m : MOVES)
			if (fromPos.add(m).isValidComingFrom(m))
				if (move != null)
					return false; // Line is invalid because amibguous
				else
					move = new Pos(m); // Store the direction along which to move

		validPosSet.add(fromPos);
		whichDir.push(move);
		queue.push(fromPos);
		localPath.push(fromPos);

		if (move != null) {

			while (!queue.isEmpty() && count < 2) {

				fromPos = queue.pop();
				move = whichDir.pop();

				final Pos pos = fromPos.add(move);
				final char posChar = pos.getChar();

				while (!localPath.peek().equals(fromPos))
					localPath.pop(); // Track back the correct point in the local path

				if (validPosSet.contains(pos) || localPath.contains(pos)) // Cannot traverse two times the same position
																			// (would mean 2 valid paths, which is not
																			// allowed)
					continue;

				localPath.push(pos);

				if (posChar == 'X') {
					count++; // Update the number of valid paths found
					validPosSet.addAll(localPath); // Archive the positions in the grid of this valid path

				} else if (posChar == '-' || posChar == '|') {
					if (pos.isValidComingFrom(move)) { // Go ahead only if next char in the grid is valid
						queue.push(pos);
						whichDir.push(move);
					}

				} else if (posChar == '+') { // Accumulate the directions/informations to check when a corner is
												// found...
					List<Pos> virageDeLaMort = TURNS.get(move.isVert()).stream().filter(p -> {
						Pos np = pos.add(p);
						return !localPath.contains(np) && np.isValidComingFrom(p);
					}).collect(Collectors.toList());
					if (virageDeLaMort.size() == 1) { // Add to the queue only when the turn is fully determined (<=> on
														// direction possible or the second one has already been
														// traversed and so isn't "reachable" anymore)
						queue.push(pos);
						whichDir.push(virageDeLaMort.get(0));
					}
				}
			}
		}
		return count == 1 && posSet.stream().filter(p -> !validPosSet.contains(p)).count() == 0; // Found only one valid
																									// path and all the
																									// characters of the
																									// grid have been
																										// traversed
		}
	}
