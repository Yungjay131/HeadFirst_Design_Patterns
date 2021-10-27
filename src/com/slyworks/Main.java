package com.slyworks;

import com.slyworks.a01_strategy_pattern.Duck;
import com.slyworks.a01_strategy_pattern.MallardDuck;
import com.slyworks.a02_observer_pattern.CurrentConditionsDisplay;
import com.slyworks.a02_observer_pattern.ForecastDisplay;
import com.slyworks.a02_observer_pattern.StatisticsDisplay;
import com.slyworks.a02_observer_pattern.WeatherData;
import com.slyworks.a03_decorator_pattern.*;
import com.slyworks.a04_simple_factory.*;
import com.slyworks.a07_command_pattern.*;
import com.slyworks.a08_adapter_pattern.part_one.DuckBehaviour;
import com.slyworks.a08_adapter_pattern.part_one.MallardDuck2;
import com.slyworks.a08_adapter_pattern.part_one.TurkeyBehaviourAdapter;
import com.slyworks.a08_adapter_pattern.part_one.WildTurkey;
import com.slyworks.a09_facade_pattern.*;
import com.slyworks.a10_template_method_pattern.Coffee;
import com.slyworks.a10_template_method_pattern.Tea;
import com.slyworks.a11_iterator_pattern.*;
import com.slyworks.a12_composite_pattern.Menu2;
import com.slyworks.a12_composite_pattern.MenuComponent;
import com.slyworks.a12_composite_pattern.MenuItem2;
import com.slyworks.a12_composite_pattern.MenuPresenter2;
import com.slyworks.a13_state_pattern.GumballMachine;
import com.slyworks.a14_proxy_pattern.protection_proxy.HandlerUtil;
import com.slyworks.a14_proxy_pattern.protection_proxy.PersonBean;
import com.slyworks.a14_proxy_pattern.protection_proxy.PersonBeanImpl;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
       //testStrategyPattern();
       //testObserverPattern();
       //testDecoratorPattern();
       //testSimpleFactory();
       //testCommandPattern();
       //testAdapterPattern1();
       //testFacadePattern();
       //testTemplateMethodPattern();
       //testIteratorPattern();
       //testCompositePattern();
        //testStatePattern();
        testProxyPattern();
    }

    static void testStrategyPattern(){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

       ((MallardDuck) mallard).changeFlyBehaviour();
       mallard.performFly();
    }

    static void testObserverPattern(){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //changing the weatherStation readings to change the Observers
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

    static void testDecoratorPattern(){
        //base beverage
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription()
                .concat(String.valueOf(beverage.cost()) )
                .concat(" Naira"));

        Beverage beverage2 = new DarkRoast();

        //'wrapping' the various components around the 'darkRoast'
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription()
                .concat(String.valueOf(beverage2.cost()) )
                .concat(" Naira"));

        //same thing starting out with a base of houseBlend
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription()
                .concat(String.valueOf(beverage3.cost()) )
                .concat(" Naira"));

    }

    static void testSimpleFactory(){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza(Type.CHEESE);
        Pizza pizza2 = chicagoPizzaStore.orderPizza(Type.PEPPERONI);

        var string = "a ".concat(pizza.getName()).concat(" was ordered");
        var string2 = "a ".concat(pizza2.getName()).concat(" was ordered");

        System.out.println(string);
        System.out.println(string2);
    }

    static void testFactoryMethodPattern(){ }

    static void testSingletonPattern(){ }

    static void testCommandPattern(){
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remote.setCommand( 0, lightOnCommand, lightOffCommand );
        remote.setCommand( 1, garageDoorOpenCommand, garageDoorCloseCommand );
        remote.setCommand( 2, stereoOnCommand, stereoOffCommand );

        //testing Lambdas, works if the interface is a SAM interface
        Light bedroomLight = new Light();
        //remote.setCommand(3, ()->{ bedroomLight.on(); }, ()->{ bedroomLight.off(); } );
       // remote.setCommand(4, bedroomLight::on, bedroomLight::off);

        /*Command stereoWithCD = ()->{
            stereo.on();
            stereo.setCD();
            stereo.setVolume(10);
        }*/
        remote.onButtonPress(0);



        /*
        * This pattern is also useful for
        * -queueing request
        * -logging requests:keeping ahistory of commands executed and
        *                   they can be called like a stack
        * -for atomic operations where if one fails all fail
        *
        * */
    }

    static void testAdapterPattern1(){
       MallardDuck2 duck = new MallardDuck2();

       WildTurkey turkey = new WildTurkey();

       DuckBehaviour turkeyAdapter = new TurkeyBehaviourAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

    static void testAdapterPattern2(){
        //testing the EnumeratorAdapter
        Vector<String> vector = new Vector<>();

    }

    static void testFacadePattern(){
       //instantiate components here

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(
                        new Amplifier(),
                        new Tuner(),
                        new DVDPlayer(),
                        new CDPlayer(),
                        new Projector(),
                        new TheaterLights(),
                        new Screen(),
                        new PopcornPopper() );

        homeTheaterFacade.watchMovie("SmallVille");
        homeTheaterFacade.endMovie();
    }

    static void testTemplateMethodPattern(){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println();
        System.out.println();

        //testing hooks
        System.out.println("testing Template Method Pattern with hooks");
        Tea tea = new Tea();
        tea.prepareRecipe();

    }

    static void testIteratorPattern(){
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new BreakfastMenu());
        menus.add(new DinerMenu());
        menus.add(new CafeMenu());

        MenuPresenter menuPresenter = new MenuPresenter( menus );

        menuPresenter.printMenu();
    }

    static void testCompositePattern(){
        MenuComponent breakfastMenu = new Menu2("BREAKFAST MENU", "breakfast");
        MenuComponent dinerMenu = new Menu2("DINER MENU", "lunch");
        MenuComponent cafeMenu = new Menu2("CAFE MENU", "dinner");

        MenuComponent dessertMenu = new Menu2("DESSERT MENU", "dessert");

        MenuComponent allMenus = new Menu2("ALL MENUS", "All Menus combined");

        allMenus.add(breakfastMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //TODO:add individual menu menuItems

        //testing node and leaves concept
        MenuItem2 menuItem = new MenuItem2(
                "Pasta",
                "Spaghetti and Sardine",
                true,
                550 );
        MenuItem2 menuItem2 = new MenuItem2(
                "Beans",
                "Beans and bread",
                true,
                300 );

        //adding to the node a new leaf
        dessertMenu.add(menuItem2);

        dinerMenu.add(menuItem);
        dinerMenu.add(dessertMenu);

        MenuPresenter2 menuPresenter = new MenuPresenter2(allMenus);
        menuPresenter.printMenu();
    }

    static void testStatePattern(){
       var gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine.getCurrentState());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.getCurrentState());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.getCurrentState());
    }

    static void testProxyPattern(){
        //testing in MRemoteImpl for RemoteProxy
        //for Protection Proxy
        var handler = new HandlerUtil();

        String[] interests = {"football", "watching movies"};
        String[] interests2 = {"reading", "talking with friends"};
        PersonBean joe = new PersonBeanImpl.Builder("male", "joe")
                                           .interests(interests)
                                           .build();

        PersonBean ownerProxy = handler.getOwnerProxy(joe);

        System.out.println("Name is "+ ownerProxy.getName());

        ownerProxy.setInterests(null);

        try{
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("can't set rating as User");
        }

        System.out.println("rating is "+ ownerProxy.getHotOrNotRating());

        /*==============================================================*/
        PersonBean nonOwnerProxy = handler.getNonOwnerProxy(joe);

        System.out.println("Name is "+ nonOwnerProxy.getName());

        try{
            nonOwnerProxy.setInterests(interests2);
        }catch (Exception e){
            System.out.println("can't set user interests as non-user");
        }

        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non-owner proxy");
        System.out.println("rating is "+ ownerProxy.getHotOrNotRating());
    }
}
