class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ss=new StringBuilder(address.length());
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                ss.append("[.]");
            }else{
                ss.append(address.charAt(i));
            }
        }
        return ss.toString();
    }
}