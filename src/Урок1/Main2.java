package Урок1;

public class Main2 {
    public static void main(String[] args)
    {
        AlphaList listAlpha = AlphaListManager.createList();
        BetaList listBeta = new ListAdapter(listAlpha);
        //BetaSaveManager.saveList(listBeta);
    }
}
