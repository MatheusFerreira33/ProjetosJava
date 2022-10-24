package AluraJava_9;

class Greeter {

    String getGreeting() {
        return "Goodbye, Mars!";
    }

    public static void main(String [] args){

        Greeter g = new Greeter();

        
        System.out.println("Hello World");
        System.out.println( g.getGreeting());
    }

}
