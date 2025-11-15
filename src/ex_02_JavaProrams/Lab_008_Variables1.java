package ex_02_JavaProrams;

public class Lab_008_Variables1 {
    static void main(String[] args) {
        // variable is defined by data type followed by = variable name = variable value

        byte age = 65 ;
        short age1 = 65;
           // byte = type of cotainer
        // age =identifier / variable name
        // 65 = variable value / literal
        // which one we should use max age of person and it range of where eg 122 lies betwwn byte -128 to 127 so we sould use byte to save memory
       age1= 122;
       // can we change the value ? yes it will show the new value
        System.out.println(age1);
    }
}
