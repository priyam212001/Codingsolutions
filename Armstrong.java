class Main {
    public static boolean armstrong(int n){
        int ans=0;
        int size=0;
        int temp=n;
        while(temp!=0){
           temp=temp/10;
            size++;
        }
        temp=n;
        while(temp!=0){
            int rem=temp%10;
            temp=temp/10;
            ans+=Math.pow(rem,size);
        }
        if(ans==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=153;
        System.out.print(armstrong(n));
    }
}
