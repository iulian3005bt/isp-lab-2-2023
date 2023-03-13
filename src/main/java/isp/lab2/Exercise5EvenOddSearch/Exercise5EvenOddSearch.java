package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        int[] m = new int[2];
        m[0]=-2_147_483_648;
        m[1]=2_147_483_647;
        String[] lineVector;
        int[] a;
        //"spargem" string-ul in mai multe string-uri separate prin ,
        lineVector = input.split(",");

        a = new int[lineVector.length]; //declaram lungimea vectorului
        //transformam string-urile in int-uri
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(lineVector[i]);
            if (a[i] > m[0] && a[i] % 2 == 0)
                m[0] = a[i];
            else if (a[i] < m[1] && a[i] % 2 == 1)
                m[1] = a[i];
        }


        return m;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
