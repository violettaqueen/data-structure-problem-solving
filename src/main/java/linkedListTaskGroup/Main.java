package linkedListTaskGroup;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        PhoneBookLinkedList phoneBook = new PhoneBookLinkedList();

        Contact contact1 = new Contact("Violetta", "Queen", "202-570=6126", "v@gmail.com");
        Contact contact5 = new Contact("Kathy", "Queen", "202-570=6126", "v@gmail.com");
        Contact contact4 = new Contact("Kevin", "Li", "kevin@gmail.com", "234567");
        Contact contact6 = new Contact("Stephanie", "Li", "kevin@gmail.com", "234567");
        Contact contact2 = new Contact("Mike", "Smith", "mike@gmail.com", "9876532");
        Contact contact7 = new Contact("Mike", "Smith", "mike@gmail.com", "9876532");
        Contact contact3 = new Contact("Yasemin", "Smith", "yasemin@gmail.com", "4567890");
        Contact contact8 = new Contact("Yasemin", "Smith", "yasemin@gmail.com", "4567890");

        phoneBook.addEnd(contact1);
        phoneBook.addEnd(contact2);
        phoneBook.addEnd(contact3);
        phoneBook.addEnd(contact4);
        phoneBook.addEnd(contact5);
        phoneBook.addEnd(contact6);
        phoneBook.addEnd(contact7);

        System.out.println(phoneBook);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9));
        List<Integer> bigNumber = nums.stream().filter(n -> n > 4).limit(3).collect(Collectors.toList());
        System.out.println(bigNumber);

        Optional<Integer> isOdd = bigNumber.stream().filter(n -> n % 2 != 0).findAny();  //5
        System.out.println(isOdd);

        //System.out.println(phoneBook.findByLastName("Queen").toString());

        System.out.println(phoneBook.findByLastName("Queen").contact);

        System.out.println(phoneBook.getSize());

        phoneBook.deleteAllMatchingLastName("Smith");
        phoneBook.deleteByFirstName("Kevin");

        List<PhoneNode> listAll = phoneBook.findAll();
        for (PhoneNode phoneNode : listAll){
            System.out.println(phoneNode.contact);
        }


    }





        //return listAll;
    }





