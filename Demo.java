package third_type_conversion;
public class Demo{

    public static void main(String[] args) {
        
        double num1=10;
        int num2 = (int)num1;
        System.out.println("Original value:"+num1);
        System.out.println("Converted value:"+num2);

        double num3 =3.14;
        int num4= (int)num3;
        System.out.println("Original value:"+num3);
        System.out.println("Converted value:"+num4);

        int zip =5000031;
        //String
        String str_zip=String.valueOf(zip);
    System.out.println("Original Value:"+zip);
     System.out.println("Converted Value:"+str_zip);
      System.out.println(str_zip+5);

      String str_zip_new="500081";
      int zip_new=Integer.parseInt(str_zip_new);
        System.out.println("Original Value:"+str_zip_new);
     System.out.println("Converted Value:"+zip_new);
      System.out.println(zip_new+5);



        

    }

}