class PalindromeWay2{
    public static void main(String[] args){
        boolean Palindrome = true;
        String s = "cghk";
        int n = s.length();
        
        for(int i = 0;i<n/2;i++){
            System.out.println(i);
            if(s.charAt(i) != s.charAt(n-i-1)){
                Palindrome = false;
                break;
            }
        }
            if(Palindrome){
                System.out.println(" yes");
            }else{
                System.out.println("No");
            }
        }
    }
