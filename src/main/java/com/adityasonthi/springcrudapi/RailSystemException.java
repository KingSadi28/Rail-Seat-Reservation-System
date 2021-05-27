package com.adityasonthi.springcrudapi;

public class RailSystemException extends Exception
{
    private final String detail;
    public RailSystemException(String a)
    {
        detail = a;
    }

    @Override
    public String toString(){
        return "RailSystemException -> " + detail;
    }
}