package class_and_object;

public class DynamicArray
{
    private int data[];
    private int nextIndex;

    public DynamicArray()
    {
        data = new int[5];
        nextIndex = 0;
    }

    public int size()
    {
        return nextIndex;
    }

    public void add(int element)
    {
        if (nextIndex == data.length)
        {
            restructure();
        }
        data[nextIndex] = element;
        nextIndex++;
    }

    private void restructure()
    {
        int temp[] = data;
        data = new int[data.length * 2];
        for (int i = 0; i<temp.length; i++)
        {
            data[i] = temp[i];
        }
    }

    public void set(int index , int element)
    {
        if (index > nextIndex)
        {
            return;
        }
        if (index < nextIndex)
        {
            data[index] =element;
        }
        else
        {
            add(element);
        }
    }

    public int get(int index)
    {
        if (index >= nextIndex)
        {
            // error out
            return -1;
        }
        return data[index];
    }

    public boolean isEmpty()
    {
        if (size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int removeLast()
    {
        if (size()==0)
        {
            // error out
            return -1;
        }
        int value = data[nextIndex - 1];
        data[nextIndex -1] = 0;
        nextIndex--;
        return value;
    }
}
class DynamicArrayUse
{
    public static void main(String args[])
    {
        DynamicArray d = new DynamicArray();

        for (int i = 0; i<100; i++)
        {
            d.add(i + 10);
        }

        System.out.println(d.size());

        d.set(4,10);
        System.out.println(d.get(3));
        System.out.println(d.get(4));

        while (!d.isEmpty())
        {
            System.out.println(d.removeLast());
            System.out.println("Size = " + d.size());
        }
    }
}
