package com.treeSet;

import java.util.Objects;

/**
 * Created by jiangqin on 17/3/7.
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;
    public Item(String aDescription, int aPartNumber)
    {
        description = aDescription;
        partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[description=" + description + ",partNumber="+partNumber+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass()!=obj.getClass()) return false;
        Item other = (Item)obj;
        return Objects.equals(description,other.description) && partNumber == other.partNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,partNumber);
    }

    @Override
    public int compareTo(Item o) {
        int diff = Integer.compare(partNumber,o.partNumber);
        return diff !=0?diff:description.compareTo(o.description);
    }
}
