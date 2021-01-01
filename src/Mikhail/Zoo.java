package Mikhail;

import java.util.ArrayList;
class Zoo<T extends Cat>
{
    T cat;

    T getCat()
    {
        return cat;
    }

    void setCat (T cat)
    {
        this.cat = cat;
    }

    String getCatName()
    {
        return this.cat.getName();
    }
}
