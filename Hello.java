package com.test.pojo;

public class Hello {

    private String str;
    private int num;
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public int getNum(){
        return num;
    }
    public void setInt(int num){
        this.num = 5;
    }
    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
