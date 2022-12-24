class HelloWorld{

    private static int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args){
        System.out.print("Testing");
        int x = 1;
        int y = 2;
        int z = x+y;
        System.out.print(add(x,y));
    }
}