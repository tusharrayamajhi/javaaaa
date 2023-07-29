public class string {
    public static boolean ispalindrom(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void sortpath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                x++;
            } else if (str.charAt(i) == 'w') {
                x--;
            } else if (str.charAt(i) == 'n') {
                y++;
            } else if (str.charAt(i) == 's') {
                y--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        System.out.println((float) Math.sqrt(x2 + y2));
    }

    public static void largeststr(String arr[]) {
        String large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (large.compareToIgnoreCase(arr[i]) < 0) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }

    public static void toupper(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void stringcompression(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1&&str.charAt(i) == str.charAt(i+1)){
                count++;i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
        }
        System.out.println(newstr);
    }

    public static void main(String args[]) {
        // String str[] = {"bannana","apple","mango"};
        // String name = "my name is tushar";
        // toupper(name);
        String str = "aabbcdeeeafff";
        stringcompression(str);
    }
}
