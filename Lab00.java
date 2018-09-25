public class Lab00
{
    public static void main(String[] args)
    {
        int x = 5;
        String y = "hello";
        double z = 9.8;
        
        System.out.println("x: " + x + " y: " + y + " z: " + z);
        
        int[] nums = {3, 6, -1, 2};
        for (int num : nums)
            System.out.println(num);
        
        int numFound = char_count(y, 'l');
        System.out.println("Found: " + numFound);
        
        for (int i=1; i<11; i++)
            System.out.print(i + " ");
        
        System.out.println();
         
    }
    public static int char_count(String string, char character)
    {
        int count = 0;
        for (int i=0; i < string.length(); i++)
            if (string.charAt(i)==character){
                count++;
            }
       return count;
    }
}