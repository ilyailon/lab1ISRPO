package com.company;

class Fraction {
    private int num;
    private int denom;

    Fraction() {
        this.num = 0;
        this.denom = 1;
    }

    Fraction(int n) {
        this.num = n;
        this.denom = 1;
    }

    Fraction(int n, int m) throws Exception {
        if (m == 0) {
            throw new Exception("Знаменатель равен нулю");
        } else {
            this.num = n;
            this.denom = m;
        }
    }

    public void cut() {
        int a = Math.abs(this.denom);
        int b = Math.abs(this.num);

        while(a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        this.num /= a;
        this.denom /= a;
    }

    public byte compare(Fraction fr) {
        if (this.num * fr.denom < fr.num * this.denom) {
            return -1;
        } else {
            return (byte)(this.num * fr.denom == fr.num * this.denom ? 0 : 1);
        }
    }

    public Fraction sum(Fraction fr) {
        Fraction res = new Fraction();
        res.num = this.num * fr.denom + fr.num * this.denom;
        res.denom = Math.abs(this.denom * fr.denom);
        res.cut();
        return res;
    }

    public void print() {
        System.out.printf("%d/%d\n", this.num, this.denom);
    }
}
