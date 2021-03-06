
package er.extensions.foundation;

import er.erxtest.ERXTestCase;

/** Tests of the public API of the ERXMutableArray class.
 *
 * This source file is automatically generated. The method names may be improved, and re-naming tests has no ill effect.
 * Feel free to add tests or change tests to demonstrate what should be the "contracted" behavior of the class.
 *
 * @author ray@ganymede.org, Ray Kiddy
 */
public class ERXMutableArrayTest extends ERXTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testERXMutableArrayConstuctorNull() {
        // public er.extensions.foundation.ERXMutableArray();
    }

    public void testERXMutableArrayConstuctorCollection() {
        // public er.extensions.foundation.ERXMutableArray(java.util.Collection);
    }

    public void testERXMutableArrayConstuctorNSArray() {
        // public er.extensions.foundation.ERXMutableArray(com.webobjects.foundation.NSArray);
    }

    public void testERXMutableArrayConstuctorInt() {
        // public er.extensions.foundation.ERXMutableArray(int);
    }

    public void testERXMutableArrayConstuctorObject() {
        // public er.extensions.foundation.ERXMutableArray(java.lang.Object);
    }

    public void testERXMutableArrayConstuctorObjectLangArray() {
        // public er.extensions.foundation.ERXMutableArray(java.lang.Object[]);
    }

    public void testERXMutableArrayConstuctorObjectLangArrayRange() {
        // public er.extensions.foundation.ERXMutableArray(java.lang.Object[], com.webobjects.foundation.NSRange);
    }

    public void testERXMutableArrayConstuctorVectorRange() {
        // public er.extensions.foundation.ERXMutableArray(java.util.Vector, com.webobjects.foundation.NSRange, boolean);
    }

    public void testToBlobNSArray() {
        // public static com.webobjects.foundation.NSData toBlob(com.webobjects.foundation.NSArray);
    }

    public void testToBlobNSMutableArray() {
        // public static com.webobjects.foundation.NSData toBlob(com.webobjects.foundation.NSMutableArray);
    }

    public void testFromBlobNSData() {
        // public static com.webobjects.foundation.NSArray fromBlob(com.webobjects.foundation.NSData);
    }

    public void testFromPropertyList() {
        // public static com.webobjects.foundation.NSArray fromPropertyList(java.lang.String);
    }

    public void testToPropertyListArray() {
        // public static java.lang.String toPropertyList(com.webobjects.foundation.NSArray);
    }

    public void testToBlob() {
        // public com.webobjects.foundation.NSData toBlob();
    }

    public void testToPropertyList() {
        // public java.lang.String toPropertyList();
    }

    public void testMutableClone() {
        // public er.extensions.foundation.ERXMutableArray mutableClone();
    }

    public void testToStringArray() {
        // public java.lang.String[] toStringArray();
    }

    public void testSynchronizedArray() {
        // public static com.webobjects.foundation.NSMutableArray synchronizedArray();
    }

    public void testSynchronizedArrayWithNSArray() {
        // public static com.webobjects.foundation.NSArray synchronizedArray(com.webobjects.foundation.NSArray);
    }

    public void testSynchronizedArrayWithNSMutableArray() {
        // public static com.webobjects.foundation.NSMutableArray synchronizedArray(com.webobjects.foundation.NSMutableArray);
    }

    public void testMutableCloneToNSMutableArray() {
        // public com.webobjects.foundation.NSMutableArray mutableClone();
    }

    // Test com.webobjects.foundation.NSMutableArray Functionality:

    public void testSetOperatorForKey() {
        // public static void setOperatorForKey(java.lang.String, com.webobjects.foundation.NSArray$Operator);
    }

    public void testOperatorForKey() {
        // public static com.webobjects.foundation.NSArray$Operator operatorForKey(java.lang.String);
    }

    public void testRemoveOperatorForKey() {
        // public static void removeOperatorForKey(java.lang.String);
    }

    public void testSetArray() {
        // public void setArray(com.webobjects.foundation.NSArray);
    }

    public void testAddObject() {
        // public void addObject(java.lang.Object);
    }

    public void testAddObjects() {
        // public void addObjects(java.lang.Object[]);
    }

    public void testReplaceObjectAtIndex() {
        // public java.lang.Object replaceObjectAtIndex(java.lang.Object, int);
    }

    public void testReplaceObjectAtIndexSwitched() {
        // public void replaceObjectAtIndex(int, java.lang.Object);
    }

    public void testInsertObjectAtIndex() {
        // public void insertObjectAtIndex(java.lang.Object, int);
    }

    public void testRemoveObjectAtIndex() {
        // public java.lang.Object removeObjectAtIndex(int);
    }

    public void testRemoveAllObjects() {
        // public void removeAllObjects();
    }

    public void testSortUsingComparator() {
    // Should be sortArrayUsingComparator
        // public void sortUsingComparator(com.webobjects.foundation.NSComparator)       throws com.webobjects.foundation.NSComparator$ComparisonException;
    }

    public void testAddObjectsFromArray() {
        // public void addObjectsFromArray(com.webobjects.foundation.NSArray);
    }

    public void testReplaceObjectsInRange() {
        // public void replaceObjectsInRange(com.webobjects.foundation.NSRange, com.webobjects.foundation.NSArray, com.webobjects.foundation.NSRange);
    }

    public void testRemoveLastObject() {
        // public java.lang.Object removeLastObject();
    }

    public void testRemoveObject() {
        // public boolean removeObject(java.lang.Object);
    }

    public void testRemoveObjectRange() {
        // public boolean removeObject(java.lang.Object, com.webobjects.foundation.NSRange);
    }

    public void testRemoveIdenticalObject() {
        // public boolean removeIdenticalObject(java.lang.Object);
    }

    public void testRemoveIdenticalObjectRange() {
        // public boolean removeIdenticalObject(java.lang.Object, com.webobjects.foundation.NSRange);
    }

    public void testRemoveObjects() {
        // public void removeObjects(java.lang.Object[]);
    }

    public void testRemoveObjectsInArray() {
        // public void removeObjectsInArray(com.webobjects.foundation.NSArray);
    }

    public void testRemoveObjectsInRange() {
        // public void removeObjectsInRange(com.webobjects.foundation.NSRange);
    }

    public void testRemoveRange() {
        // protected void removeRange(int, int);
    }

    public void testMoveObjectAtIndexToIndex() {
        // public void _moveObjectAtIndexToIndex(int, int);
    }

    // Test com.webobjects.foundation.NSArray Functionality:

    public void testObjectNoCopy() {
        // protected java.lang.Object[] objectsNoCopy();
    }

    public void testCount() {
        // public int count();
    }

    public void testObjectAtIndex() {
        // public java.lang.Object objectAtIndex(int);
    }

    public void testArrayByAddingArray() {
        // public com.webobjects.foundation.NSArray arrayByAddingObject(java.lang.Object);
    }

    public void testArrayByAddingObjectsFromArray() {
        // public com.webobjects.foundation.NSArray arrayByAddingObjectsFromArray(com.webobjects.foundation.NSArray);
    }

    public void testObjects() {
        // public java.lang.Object[] objects();
    }

    public void testObjectsRange() {
        // public java.lang.Object[] objects(com.webobjects.foundation.NSRange);
    }

    public void testVector() {
        // public java.util.Vector vector();
    }

    public void testArrayList() {
        // public java.util.ArrayList arrayList();
    }

    public void testContainsObject() {
        // public boolean containsObject(java.lang.Object);
    }

    public void testFirstObjectCommonWithArray() {
        // public java.lang.Object firstObjectCommonWithArray(com.webobjects.foundation.NSArray);
    }

    public void testgetObjects() {
        // public void getObjects(java.lang.Object[]);
    }

    public void testGetObjectsRange() {
        // public void getObjects(java.lang.Object[], com.webobjects.foundation.NSRange);
    }

    public void testIndexOfObject() {
        // public int indexOfObject(java.lang.Object);
    }

    public void testIndexofObjectRange() {
        // public int indexOfObject(java.lang.Object, com.webobjects.foundation.NSRange);
    }

    public void testIndexOfIdenticalObject() {
        // public int indexOfIdenticalObject(java.lang.Object);
    }

    public void testIndexOfIdenticalObjectRange() {
        // public int indexOfIdenticalObject(java.lang.Object, com.webobjects.foundation.NSRange);
    }

    public void testSubarrayWithRange() {
        // public com.webobjects.foundation.NSArray subarrayWithRange(com.webobjects.foundation.NSRange);
    }

    public void testLastObject() {
        // public java.lang.Object lastObject();
    }

    public void testIsEqualToArray() {
        // public boolean isEqualToArray(com.webobjects.foundation.NSArray);
    }

    public void testEquals() {
        // public boolean equals(java.lang.Object);
    }

    public void testObjectEnumerator() {
        // public java.util.Enumeration objectEnumerator();
    }

    public void testReverseObjectEnumerator() {
        // public java.util.Enumeration reverseObjectEnumerator();
    }

    public void testSortedArrayUsingSelector() {
        // public com.webobjects.foundation.NSArray sortedArrayUsingSelector(com.webobjects.foundation.NSSelector)       throws com.webobjects.foundation.NSComparator$ComparisonException;
    }

    public void testSortedArrayUsingComparator() {
        // public com.webobjects.foundation.NSArray sortedArrayUsingComparator(com.webobjects.foundation.NSComparator)       throws com.webobjects.foundation.NSComparator$ComparisonException;
    }

    public void testComponentsJoinedByString() {
        // public java.lang.String componentsJoinedByString(java.lang.String);
    }

    public void testComponentsSeparatedByString() {
        // public static com.webobjects.foundation.NSArray componentsSeparatedByString(java.lang.String, java.lang.String);
    }

    public void testMutableComponentsSeparatedByString() {
        // public static com.webobjects.foundation.NSMutableArray _mutableComponentsSeparatedByString(java.lang.String, java.lang.String);
    }

    public void testValueForKey() {
        // public java.lang.Object valueForKey(java.lang.String);
    }

    public void testTakeValueForKey() {
        // public void takeValueForKey(java.lang.Object, java.lang.String);
    }

    public void testValueForKeyPath() {
        // public java.lang.Object valueForKeyPath(java.lang.String);
    }

    public void testTakeValueForKeyPath() {
        // public void takeValueForKeyPath(java.lang.Object, java.lang.String);
    }

    public void testClassForCoder() {
        // public java.lang.Class classForCoder();
    }

    public void testDecodeObject() {
        // public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder);
    }

    public void testEncodeWithCoder() {
        // public void encodeWithCoder(com.webobjects.foundation.NSCoder);
    }

    public void testMakeObjectsPerformSelector() {
        // public void makeObjectsPerformSelector(com.webobjects.foundation.NSSelector, java.lang.Object[]);
    }

    public void testShallowHashCode() {
        // public int _shallowHashCode();
    }

    public void testHashCode() {
        // public int hashCode();
    }

    public void testClone() {
        // public java.lang.Object clone();
    }

    public void testImmutableClone() {
        // public com.webobjects.foundation.NSArray immutableClone();
    }

    public void testToString() {
        // public java.lang.String toString();
    }

    public void testMustRecomputeHash() {
        // protected boolean _mustRecomputeHash();
    }

    public void testSetMustRecomputeHash() {
        // protected void _setMustRecomputeHash(boolean);
    }

    public void testEmptyArray() {
        // public static final com.webobjects.foundation.NSArray emptyArray();
    }

    public void testAddAtInt() {
        // public void add(int, java.lang.Object);
    }

    public void testAdd() {
        // public boolean add(java.lang.Object);
    }

    public void testAddAll() {
        // public boolean addAll(java.util.Collection);
    }

    public void testAddAllAtInt() {
        // public boolean addAll(int, java.util.Collection);
    }

    public void testContains() {
        // public boolean contains(java.lang.Object);
    }

    public void testIterator() {
        // public java.util.Iterator iterator();
    }

    public void testToArray() {
        // public java.lang.Object[] toArray();
    }

    public void testToArrayLangArray() {
        // public java.lang.Object[] toArray(java.lang.Object[]);
    }

    public void testContainsAllCollection() {
        // public boolean containsAll(java.util.Collection);
    }

    public void testListIterator() {
        // public java.util.ListIterator listIterator();
    }

    public void testListIteratorWithInt() {
        // public java.util.ListIterator listIterator(int);
    }

    public void testGet() {
        // public java.lang.Object get(int);
    }

    public void testSetAtInt() {
        // public java.lang.Object set(int, java.lang.Object);
    }

    public void testIndexOf() {
        // public int indexOf(java.lang.Object);
    }

    public void testLastIndexOf() {
        // public int lastIndexOf(java.lang.Object);
    }

    public void testIsEmpty() {
        // public boolean isEmpty();
    }

    public void testSize() {
        // public int size();
    }

    public void testRemoveAtInt() {
        // public java.lang.Object remove(int);
    }

    public void testRemoveWithObject() {
        // public boolean remove(java.lang.Object);
    }

    public void testClear() {
        // public void clear();
    }

    public void testRetainsAll() {
        // public boolean retainAll(java.util.Collection);
    }

    public void testRemoveAll() {
        // public boolean removeAll(java.util.Collection);
    }

    public void testSubList() {
        // public java.util.List subList(int, int);
    }
}
