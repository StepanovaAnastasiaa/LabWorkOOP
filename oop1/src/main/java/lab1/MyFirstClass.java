package lab1;
class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(78, 45);
        System.out.println(o.subtraction());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setK1(i);
                o.setK2(j);
                System.out.print(o.subtraction());
                System.out.print(" ");


            }
        }


    }
}