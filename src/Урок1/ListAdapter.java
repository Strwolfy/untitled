package Урок1;

class ListAdapter implements BetaList
{
    private AlphaList list;
    ListAdapter(AlphaList list)
    {
        this.list = list;
    }

    public int getValue(int index)
    {
        return this.list.get(index);
    }

    public void setValue(int index, int value)
    {
        this.list.set(index, value);
    }

    public int getSize()
    {
        return this.list.count();
    }

    public void setSize(int newSize)
    {
        if (newSize > this.list.count())
        {
            while (this.list.count() < newSize)
            {
                this.list.add(null);
            }
        }
        if (newSize < this.list.count())
        {
            while (this.list.count() > newSize)
            {
                list.remove(list.count() - 1);
            }
        }
    }
}
