package com.example.demo;

public class Reception {

    private static final String ONE_SPACE = " ";

    public String get(String name) {
        // TODO Auto-generated method stub
        //return String.join(" ","Hello" + name);
        //return "Hello".concat(ONE_SPACE).concat(name);
        
        //StringBuilder builder = new StringBuilder();
        //builder.append("Hello")
        //.append(ONE_SPACE)
        //.append(name);
        //return builder.toString();
        
        return String.format("Hello %s",name);
    }    
    

}
