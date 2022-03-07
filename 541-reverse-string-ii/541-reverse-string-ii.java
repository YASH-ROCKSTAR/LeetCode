// class Solution {
//     public String reverseStr(String s, int k) {
//         char[] ch=s.toCharArray();
//         String rev="";
//         for(int i=0;i<ch.length;i+=2*k){
//             int l=i , j=Math.min(i+k-1,ch.length-1);
//                while(i<j){
//                    char temp=ch[l];
//                    ch[l]=ch[j];
//                    ch[j]=temp;
//                    l++;
//                    j--;
//                }
//         }
//         return new String(ch);
        
//     }
// }
class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }
}