public class Reverse_String
{
    public String reverse_string(String string)
    {
        char char_array[] = string.toCharArray();
        int left=0,right=char_array.length-1;
        while(left<right)
        {
            char temp = char_array[left];
            char_array[left]=char_array[right];
            char_array[right]=temp;
            left++;
            right--;
        }
        return new String(char_array);
    }
    public boolean palindrome(int no)
    {
        int sum=0,num=no;
        while(no!=0)
        {
            sum=(sum*10)+(no%10);
            no=no/10;
        }
        if(sum==num)
            return true;
        return false;
    }

}
