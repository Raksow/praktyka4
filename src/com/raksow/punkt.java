package com.raksow;

public class punkt
{
    int x;
    int y;

    punkt()
    {
        this.x = 0;
        this.y = 0;
    }

    punkt(int a, int b)
    {
        this.x = a;
        this.y = b;
    }

    public double odleglosc(int x, int y)
    {
        double sqrt = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y) * (this.y - y));
        return sqrt;
    }

    public double odleglosc(punkt x)
    {
        //double sqrt = Math.sqrt((this.x - x.x)*(this.x - x.x) + (this.y - x.y) * (this.y - x.y));
        //this.odleglosc(x.x, x.y);
        return this.odleglosc(x.x, x.y);
    }
}
