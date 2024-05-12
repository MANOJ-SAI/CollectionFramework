# CollectionFramework

### Main specifications of Collections data structures

| Collections    | Default Capacity | Initial Capacity | Allow Duplicates | Allow NULL values | Insertion Order | Sorted Order |                                  Random Access Elements |                                   Synchronized |                                                        Good At |
|----------------|:----------------:|-----------------:|------------------|:-----------------:|----------------:|-------------:|--------------------------------------------------------:|-----------------------------------------------:|---------------------------------------------------------------:|
| Vector         |        10        |               10 | Yes              |        Yes        |             Yes |           No |                                                     Yes |                                            Yes |      Multi threading and Exponentially data increase scenarios |
| Stack          |        10        |               10 | Yes              |        Yes        |             Yes |           No | Yes,But we don't use that because stack follow the LIFO |                                            Yes |                                  for LIFO scenarios(REDO,UNDO) |
| ArrayList      |        0         |               10 | Yes              |        Yes        |             Yes |           No |                                                     Yes | No, we can use explicit method to synchronized |              Good at adding elements and retrieval of elements |
| LinkedList     |        0         |                0 | Yes              |        Yes        |             Yes |           No |                                                     Yes |                                             No | Used for data manipulation purpose(easily remove the elements) |
| Priority Queue |        11        |               11 | Yes              |        No         |              No |           No |                                                      No |                                             No |                                    Used for priority scenarios |
| HashSet        |        0         |               16 | No               |        Yes        |              No |           No |                                                      No |                                             No |                                                                |
| LinkedHashSet  |        16        |               16 | No               |        Yes        |             Yes |           No |                                                      No |                                             No |                                                                |
| TreeSet        |        0         |                0 | No               |        No         |              No |          Yes |                                                      No |                                             No |                                                                |

### Default Capacity: 

    The capacity is calculated at when the object is created before adding elements into the collection.

### Initial Capacity:

    The capacity is calculated at when we add an element into the collection.