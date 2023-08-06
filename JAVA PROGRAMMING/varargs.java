public class varargs
 {
    static void vaTest(int... v) {
        System.out.println("(int ... v): " + v.length + " Contents");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("(boolean ... v): " + v.length + " Contents");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String mac, int... v) {
        System.out.println("(String mac, int ... v): " + mac + v.length + " Contents");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(10, 20, 30, 410, 102);
        vaTest(true, false, true);
        vaTest("Subhajit: ", 14, 15, 13);
    }
}
