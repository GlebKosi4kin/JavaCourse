package project;
public class Book{
    public int pages;
    public String oblozh;
    public String aname;
    public int buys;

    public void getValues(int _pages, String _oblozh, String _aname, int _buys){
        pages = _pages;
        oblozh = _oblozh;
        aname = _aname;
        buys = _buys;

    }

    public String setValues(){
        String res = ("Кол-во страниц: " + pages + ". Обложка: " + oblozh + ". Имя автора:" + aname + ". Покупки: " + buys);
        return res;
    }
}
