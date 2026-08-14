# Hash-structures in Java

- A hashtable in java, is like a dictionary in python, a set of key-value pairs, which can be iterated through
- A hashtable can be initialised of fixed value, by copying the values of an existing data structure or just dynamically initialised with no preset values or length
- In hashtable, keys and values cannot be null
- Hashset is like a hashtable but for only one set of values. It doesnt have any keys, kinda like an array with hashmap engine
- Java also supports hashmaps, a ds which is fairly similar to hashtables, but it allows for one key(atmost) and all values to be null, and is a lil faster

**Syntax:**

```java
HashMap<Integer, String> hashmapName = new HashMap<>();
HashMap<Integer, String> hashmapName = new HashMap<>(10);//can store 10 key-value pairs
HashSet<Integer> hashsetName = new HashSet<>();
HashSet<Integer> hashsetName = new HashSet<>(100);
HashSet<Integer> hashsetName = new HashSet<>(nums); //copies values from nums array into the hashset
HashTable<Integer, String> hashtableName = new HashTable<>();
```

- Hashning is like indexing things so that searching becomes easier
- Hashmaps use an array to store the keys and using a special function, generate a unique code for every key, which is then used as index of its value
- Everytime a new key value pair is put inside a hashmap, there are a ton of processes that happen, which maps the key to the value.
