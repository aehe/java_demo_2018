package com.example.demo;

class Main {    
//    private OnAddListener listener;
    
//    public Main (OnAddListener listener) {
//        this.listener = listener;
//    }
    
    public void add(OnAddListener listener, int a, int b) {
        if (a==0)
        {
           listener.onFailure();
        }
        listener.onSuccess(a+b);
    }
}

interface OnAddListener {
    void onSuccess(int result);
    void onFailure();
}

public class Calculator implements OnAddListener {
    public static void main(String[] args) {
       Calculator calc = new Calculator();
       calc.start();         
    }
    
    private void start() {
        Main main = new Main();
        main.add(this, 1,2);
    }

    @Override
    public void onSuccess(int result) {
        // TODO Auto-generated method stub
        System.out.println(result);
        
    }

    @Override
    public void onFailure() {
        // TODO Auto-generated method stub
        
    }
}
