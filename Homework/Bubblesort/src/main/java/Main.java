import java.util.*;

public class Main {

    public static void main(String[] args) {

        Sales[] sales = new Sales[5];

        sales[1] = new Sales("Representative 1", 2, 1000, 10000);
        sales[3] = new Sales("Representative 2", 10, 8500, 85000);
        sales[4] = new Sales("Representative 3", 6, 5000, 50000);
        sales[2] = new Sales("Representative 4", 5, 2300, 33000);
        sales[0] = new Sales("Representative 5", 8, 7500, 55000);

        for (int i=0; i<sales.length; i++)
        {
            for (int j=i+1; j<sales.length; j++)
            {
                int temp;
                int maxSale;
                if (sales[i].m_sales < sales[j].m_sales)
                {
                    if (sales[i].m_quota < sales[j].m_quota)
                    {
                        if (sales[i].m_worth < sales[j].m_worth)
                        {
                            temp = sales[i].m_worth;
                            sales[i].m_worth = sales[j].m_worth;
                            sales[j].m_worth = temp;
                        }
                    }
                }
            }
        }

        System.out.println("The representative with the highest sales revenue is " + sales[0].m_rep + " with " + sales[0].m_sales + " sales, " + "a quota of " + sales[0].m_quota + " and a worth of " + sales[0].m_worth);

    }

}