package dslab7queue;

/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Updated by      Linda Yang
    
    Date Modified   10/12/2014 - changed to use Queue

    For Sample Output, see below
*/
public class RunTestQueueWithCarV2 {
    public static void main(String[] args)
        {
        runMe();
    }
    
    public static void runMe()
    {

        TestQueueGenericV2<Car> testQueueCarV2 = new TestQueueGenericV2<Car>();

        Car[] arrayOfCarsToAdd = {
                    new Car(2013,"Honda Accord"),
                    new Car(1998,"Camry"),
                    new Car(1994,"Explorer"),
                    new Car(2013,"Zoom Zoom"),
                    new Car(2013,"Acura"),
                    new Car(2007,"Neon") };

        testQueueCarV2.test ( arrayOfCarsToAdd, new Car(2019,"Kia Soul") );
    }    
}
/*
Expected Output:
run:

Display Queue Size on startup
Size: 0 -good

===========
<<Start adds:
Adding: [Car 2013 Honda Accord] 	added...now size is 1 -good
Adding: [Car 1998 Camry] 	added...now size is 2 -good
Adding: [Car 1994 Explorer] 	added...now size is 3 -good
Adding: [Car 2013 Zoom Zoom] 	added...now size is 4 -good
Adding: [Car 2013 Acura] 	added...now size is 5 -good
Adding: [Car 2007 Neon] 	added...now size is 6 -good
Stopped adding>>
===========


Display Queue size after adds
Size: 6 -good

About to remove 1 item......removed: <[Car 2013 Honda Accord]> exp:{[Car 2013 Honda Accord]} 	size: 5 -good

Display Queue size after 1 remove
Size: 5 -good

===========
<<Start removing:
About to remove......removed: <[Car 1998 Camry]> exp:{[Car 1998 Camry]} 	size: 4 -good
About to remove......removed: <[Car 1994 Explorer]> exp:{[Car 1994 Explorer]} 	size: 3 -good
About to remove......removed: <[Car 2013 Zoom Zoom]> exp:{[Car 2013 Zoom Zoom]} 	size: 2 -good
About to remove......removed: <[Car 2013 Acura]> exp:{[Car 2013 Acura]} 	size: 1 -good
About to remove......removed: <[Car 2007 Neon]> exp:{[Car 2007 Neon]} 	size: 0 -good
Stopped removing>>
===========

Display Queue size after remove all
Size: 0 -good

attempt to remove 1 item from an empty Queue:
remove?Can't remove  - EmptyQueue exception  -good

Display Queue size after 1 remove
Size: 0 -good

Display queue size after 1 additional add
Size: 1 -good

remove the additional item...removed: <[Car 2019 Kia Soul]> exp:{[Car 2019 Kia Soul]} 	size: 0 -good

Display queue size after 1 remove
Size: 0 -good
BUILD SUCCESSFUL (total time: 0 seconds)

*/
