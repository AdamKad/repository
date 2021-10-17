
public class zad1_lab3 {

    public static void main(String[] args) {
        int[] tab1 = {1, 2,3,4,5,6};
        int[] tab2 = {-1,3,2,0,4,1};

        int[] wynik = duplicate(tab1, tab2);
        printTab(wynik);
    }

    public static int[] duplicate(int[] number, int[] times){
        int counter = 0;
        for(int i  = 0; i < number.length && i < times.length; i++)
        {
            counter +=  times[i] > 0 ? times[i] : 0;
        }

        int[] newTab = new int[counter];

        counter = 0;
        for(int i = 0; i < number.length && i < times.length; i++)
        {
            for(int j = 0; j < times[i] && times[i] > 0; j++)
            {
                newTab[counter++] = number[i];
            }
        }

        return newTab;
    }

    public static void printTab(int[] tab)
    {
        System.out.print("[");
        for(int i = 0; i < tab.length; i++)
        {
            System.out.print(tab[i] + (i != tab.length-1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
