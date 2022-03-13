class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int current = 0;
        while (current < s.length()) {
            switch (s.charAt(current)) {
                case 'I' :
                    if (current == s.length() - 1) sum += 1;
                    else if (s.charAt(current + 1) == 'V' || s.charAt(current + 1) == 'X') sum -= 1;
                    else sum += 1;
                    break;
                case 'V' :
                    sum += 5;
                    break;
                case 'X' :
                    if (current == s.length() - 1) sum += 10;
                    else if (s.charAt(current + 1) == 'L' || s.charAt(current + 1) == 'C') sum -= 10;
                    else sum += 10;
                    break;
                case 'L' :
                    sum += 50;
                    break;
                case 'C' :
                    if (current == s.length() - 1) sum += 100;
                    else if (s.charAt(current + 1) == 'D' || s.charAt(current + 1) == 'M') sum -= 100;
                    else sum += 100;
                    break;
                case 'D' :
                    sum += 500;
                    break;
                case 'M' :
                    sum += 1000;
                    break;
            }
            current++;
        }
        return sum;
    }
}