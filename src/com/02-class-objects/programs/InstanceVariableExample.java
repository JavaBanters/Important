class InstanceVariableExample {

    // Declared Instance Variable
    public String name;
    public int i;
    public Integer I;
    public InstanceVariableExample()
    {
        // Default Constructor
        // initializing Instance Variable
        this.name = "James Bond";
    }

    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
        InstanceVariableExample name = new InstanceVariableExample();


        System.out.println("My name is: " + name.name);
        System.out.println("Default value for int is "
                + name.i);


        System.out.println("Default value for Integer is "
                + name.I);
    }
}