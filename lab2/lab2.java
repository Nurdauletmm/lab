class lab2 {

    void show1() {
        System.out.println("Бұл fclass1 класы");
    }

    static void main(String[] args) {
        fclass2 obj = new lab2();
        obj.show1();
        obj.show3();
        obj.show2();
    }
}

class fclass3 extends fclass1 {
    void show3() {
        System.out.println("Бұл fclass3 класы");
    }
}

class fclass2 extends fclass3 {
    void show2() {
        System.out.println("Бұл fclass2 класы");
    }
}
