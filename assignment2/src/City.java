public class City
{
    String name;
    int population;
    City(String name ,int population ){
        this.name = name;
        this.population = population;
    }

    public static void main(String[] args) {

        City cities[] = new City[5];
        cities[0] = new City("mumbai" , 10000000);
        cities[1] = new City("delhi" , 20000000);
        cities[2] = new City("pune" , 3000000);
        cities[3] = new City("kolkata" , 70000000);
        cities[4] = new City("banglore" , 500000000);

        for(int i =0 ;i<5;i++)
        {
            System.out.println("city:"+cities[i].name+" population:"+String.valueOf(cities[i].population));
        }
    }
}
