public class operator {

    public static void main(String[] args) {
        // Unary (++, --), Binary & Ternary
        // Binary => Arithmetic (+, -, *, /, %)
        // int a = 10, b = 3;
        // System.out.println("A : "+a+", B : "+b);
        // System.out.println("A + B : "+(a+b));
        // System.out.println("A - B : "+(a-b));
        // System.out.println("A * B : "+(a*b));
        // System.out.println("A / B : "+(a/b));
        // System.out.println("A % B : "+(a%b));

        // Binary => Assignment (+=, -=, *=, /=, %=)
        // int a = 10;
        // System.out.println("A : "+a);
        //
        // a += 3; // a = a+3 => a = 10+3 => a = 13
        // System.out.println("A : "+a);
        //
        // a -= 3; // a = a-3 => a = 13-3 => a = 10
        // System.out.println("A : "+a);
        //
        // a *= 3;
        // System.out.println("A : "+a);
        //
        // a /= 4;
        // System.out.println("A : "+a);
        //
        // a %= 4;
        // System.out.println("A : "+a);

        // AND : && / &
        // int a = 10, b = 20;
        // if(a==10 && b==20) {
        // System.out.println("A and B is 10 and 20.");
        // }else{
        // System.out.println("A and B is not 10 and 20.");
        // }

        // OR : || / |
        // int a = 101, b = 201;
        // if(a==10 || b==20) {
        // System.out.println("A and B is 10 and 20.");
        // }else{
        // System.out.println("A and B is not 10 and 20.");
        // }

        // NOT :

        // int a = 101;
        // if(!(a==10)){
        // System.out.println("A is not 10.");
        // }else{
        // System.out.println("A is 10.");
        // }

        // Unary : ++ (++a, a++), -- (--a, a--)
        // Pre : ++a, --a | Post : a++, a--

        int a = 10;
        System.out.println("A : " + a);

        ++a; // 11
        System.out.println("++A : " + a);

        // System.out.println("++A : "+(++a)); // 11

        a++; // 12
        System.out.println("A++ : " + a);
        // System.out.println("A++ : "+(a++)); // 11
        // System.out.println("A : "+a); // 12

        --a; // 11
        System.out.println("--A : " + a);

        a--; // 10
        System.out.println("A-- : " + a);
    }

}
