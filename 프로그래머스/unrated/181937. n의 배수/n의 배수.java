class Solution {
    public int solution(int num, int n) {
        if(2<=num && num<=100 && 2<=n && n<=9){
        if(num%n==0) {
            System.out.println(num + "은 " + n + "의 배수이므로 1을 return합니다.");
            return 1;
        }
        else {
            System.out.println(num + "은 " + n + "의 배수가 아니므로 0을 return합니다.");
            return 0;
        }
    }
        return -1;
}
}