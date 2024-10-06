package lab1;

class MySecondClass{

    private int k1;
    private int k2;


    MySecondClass(int a, int b){
        this.k1 = a;
        this.k2 = b;
    }

    public int getK1() {
        return k1;
    }

    public int getK2() {
        return k2;
    }

    public void setK1(int k1) {
        this.k1 = k1;
    }

    public void setK2(int k2) {
        this.k2 = k2;
    }

    public int subtraction(){
        return k1 - k2;
    }
}

