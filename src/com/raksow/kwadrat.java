package com.raksow;

public class kwadrat
{
    int bok;

    public int pole()
    {
        return this.bok * this.bok;
    }

    public int obwod()
    {
        return this.bok * 4;
    }

    kwadrat(int bok)
    {
        this.bok = bok;
    }
}
