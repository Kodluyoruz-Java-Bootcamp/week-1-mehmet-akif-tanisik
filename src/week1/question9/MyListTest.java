package week1.question9;

public class MyListTest {

    public static void main(String[] args) {

        MyList list = new MyList();

        System.out.println("Initial capacity: " + list.getMaxCapacity() );
        System.out.println("Adding 'Mehmet' to the list:");
        list.add("Mehmet");
        System.out.println("Current capacity after adding 'Mehmet': " + list.getMaxCapacity());
        list.print();

        System.out.println("\nAdding 5 different Strings which starts with letter 'C-c'");
        System.out.println(" 'Cem','cemil','ceyhun','Caner','Cebrail' will be added to the list");
        list.add("Cem");
        list.add("cemil");
        list.add("ceyhun");
        list.add("Caner");
        list.add("Cebrail");


        System.out.println("Current capacity after adding 5 different Strings: " + list.getMaxCapacity());
        list.print();

        System.out.println("\nAdding one more String which starts with letter 'C-c'");
        System.out.println("'Ceren' will be added to the list");
        list.add("Ceren");
        System.out.println("Current capacity after adding 'Ceren' to the list: " + list.getMaxCapacity());
        list.print();
    }



}
