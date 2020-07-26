package doublehashing;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class DoubleHashing {

    public static void main(String[] args) {

        HashTable hashTable = new HashTable();

     	hashTable.add(25); 
     	hashTable.add(26); 
     	hashTable.add(16);       
     	hashTable.add(11); 
     
        System.out.println(hashTable.toString());
    }

}
