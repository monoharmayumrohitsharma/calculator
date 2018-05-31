/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
class calculator {

    public calculator() {
    }

    int add(int i, int i0) {
        int sum=i+i0;
        return sum;
    }

    int substract(int i, int i0) {
        int sub = i-i0;
        return sub;
    }

    int multiply(int i, int i0) {
        int mul = i*i0;
        return mul;
    }

    int division(int i, int i0) {
        if(i0==0)
        {
            //throw new UnsupportedOperationException("divide by Zero"); 
            return 0;
            
        }   
        else
            return i/i0;
    }

   
}
