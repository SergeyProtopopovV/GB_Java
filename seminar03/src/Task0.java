public class Task0 {

    public static void main(String[] args) {
        isEqual(s1, s6);
//            List list = new ArrayList<String>();
//            list.add(1);
//            list.add("djahfo");
//            list.add(2);
//        System.out.println(list);
//        List list = new ArrayList();
//        list.add(1);
//        list.add("hello");
//        list.add(null);
//        System.out.println(list);
//        System.out.println(s1.hashCode());
//        s1 = s1.substring(1, 3);
//        System.out.println(s1.hashCode());
    }

    Object object = new Object();
    static String s1 = "hello";
    static String s2 = "hello";

    static String s3 = s1;
    static String s4 = "h" + "e" + "l" + "l" + "o"; //"hello"
    static String s5 = new String("hello");
    static String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});


    public static void change() {
        s1 = "ok";
    }
    public static void isEqual(String arg0, String arg1) {
//        s1 = s1 + "ldfjghoaergb";
        if (arg0 == arg1) {
//            "a" == "a"; //false
            System.out.println("Равны как ссылки");
        } else if (arg0 != arg1) {
            System.out.println("Не равны как ссылки");
        }
        if (arg0.equals(arg1)) {
            System.out.println("Равны как значения");
        } else if (!arg0.equals(arg1)) {
            System.out.println("Не равны как значения");

        }
    }

}