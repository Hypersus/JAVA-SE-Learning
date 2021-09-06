public class CodeBlock {
    //Anonymous code block
    {
        System.out.println("This is an anonymous code block");
    }
    //Static code block
    static{
        System.out.println("This is a static code block");
    }
    //No-arg constructor
    public CodeBlock() {
        System.out.println("This is a no-arg constructor");
    }
    //Parameterized constructor
    public CodeBlock(int a){
        System.out.println("This is a parameterized constructor");
    }

    public static void main(String[] args) {
        CodeBlock codeBlock = new CodeBlock();
        System.out.println("-----------------------------");
        CodeBlock codeBlock1 = new CodeBlock(1);

    }
}
