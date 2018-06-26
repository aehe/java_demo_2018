package com.example.demo;

public class FizzBuzz {
    
    public static void main( String[] args )
    {
        int[] datas = {1,2,3,4,5};

//      //do
//      int length = datas.length;
//      for(int i=0;i<length; i++) {
//          System.out.println(datas[i]);
//      }

        //do
        int i=0;
        for (int data : datas){
            System.out.println(data);
            i++;
        }
    }
	
    private String result;
    
	public String say(int input) {
		
		result = String.valueOf(input);
		
		if(input ==15) {
			result = "FizzBuzz";
		}
		else if(mod_OK(input,3)) {
            result = "Fizz";
        }
		else if(mod_OK(input,5)) {
            result = "Buzz";
        }
		
		return result;
		
		
//		switch(input)
//		{
//			case 3:
//		    	return "Fizz";
//		    case 5:
//		    	return "Buzz";	
//		    case 6:
//		    	return "Fizz";
//		    case 9:
//		    	return "Fizz";
//		    case 10:
//		    	return "Buzz";
//		    case 15:
//		    	return "FizzBuzz";
//		}
//		
//		return ""+ input;
		
	}

	private boolean mod_OK(int input, int i) {
        return input % i == 0;
    }

}
