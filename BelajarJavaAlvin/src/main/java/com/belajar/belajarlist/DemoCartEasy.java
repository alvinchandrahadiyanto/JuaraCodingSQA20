package com.belajar.belajarlist;

import java.util.ArrayList;

public class DemoCartEasy {
    public static void main(String[] args) {
        int total = 0;
        Tiket t1 = new Tiket("TKT001", 100, 1300);
        t1.setQty(10);

        Tiket t2 = new Tiket("TKT002", 50, 4000);
        t2.setQty(600);

        ArrayList<Tiket> tikets = new ArrayList<Tiket>();

        tikets.add(t1);
        tikets.add(t2);

        tikets.get(1).setQty(300);

        for (Tiket t: tikets) {
            total = total + t.subtotal();
        }

        System.out.println(total);
    }
}
