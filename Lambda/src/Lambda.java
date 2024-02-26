public class Lambda {

    public static void main(String[] args) {

        //Function interface, içerisinde sadece bir tane abstract metodu olan interface’dir.
        //Functional interface’ler, lambda expression’ların kullanılabilmesi için tanımlanırlar.

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1 sınıfı");
            }
        };

        runnable1.run();

        Runnable runnable2 = () -> System.out.println("Runnable 2 sınıfı");
        runnable2.run();

        System.out.println("------------------");

        // Lambda kullanmadan matematik islemleri

        MathematicI sum = new MathematicI() {
            @Override
            public int transaction(int a, int b) {
                return a+b;
            }
        };

        MathematicI subtraction = new MathematicI() {
            @Override
            public int transaction(int a, int b) {
                return a-b;
            }
        };

        MathematicI multiply = new MathematicI() {
            @Override
            public int transaction(int a, int b) {
                return a*b;
            }
        };

        MathematicI division = new MathematicI() {
            @Override
            public int transaction(int a, int b) {
                return a/b;
            }
        };

        //Lambda kullanarak matematik islemleri
        MathematicI sumLambda = (a,b) -> a+b;
        MathematicI subtractionLambda= (a,b) -> a-b;
        MathematicI multiplyLambda = (a,b) -> a*b;
        MathematicI divisionLambda = (a,b) -> {
            if (b==0){
                b=1;
            }
            return a/b;
        };

        System.out.println(sumLambda.transaction(20,10));
        System.out.println(subtractionLambda.transaction(20,10));
        System.out.println(divisionLambda.transaction(20,10));
        System.out.println(multiplyLambda.transaction(20,10));

    }

}
