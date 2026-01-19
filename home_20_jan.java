public class home_20_jan {

    public static void main(String[] args) {
       int[] array = {5, 1, 9, 3, 7};

int max = Integer.MIN_VALUE;
int secondMax = Integer.MIN_VALUE;

for (int num : array) {
    if (num > max) {
        secondMax = max;
        max = num;
    } else if (num > secondMax && num != max) {
        secondMax = num;
    }
}

System.out.println(secondMax);
    }
}

 class secondEx {
    public static void main(String[] args) {
      int[] array1 = {4, -2, 7, -9, 0, -1};

int count = 0;
for (int num : array1) {
    if (num < 0) count++;
}

int[] array2 = new int[count];

int index = 0;
for (int num : array1) {
    if (num < 0) {
        array2[index++] = num;
    }
}

for (int num : array2) {
    System.out.print(num + " ");
}
    }
}

class thirdEx {
    public static void main(String[] args) {

    int[] array = {3, 5, -2, 7, -9, 4};

    int lastNegativeIndex = -1;

for (int i = 0; i < array.length; i++) {
    if (array[i] < 0) {
        lastNegativeIndex = i;
    }
}

if (lastNegativeIndex == -1) {
    System.out.println("no negative numbers");
} else {
    System.out.println("last negative number = " 
        + array[lastNegativeIndex]);
    System.out.println("index = " + lastNegativeIndex);
}
    
}

}

class forthEx {
    public static void main(String[] args) {
        int number = 6556;
int original = number;
int reversed = 0;

while (number > 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number /= 10;
}

if (original == reversed) {
    System.out.println("Polindromic number");
} else {
    System.out.println("not a polindromic number");
}
    }
}
// ??????
class fifthEx {
    public static void main(String[] args) {
    int[] array = {67, 89, 7, 8, 5};

int result = 0;

for (int num : array) {
    result = result * 10 + num;
}

System.out.println(result);
    }

}