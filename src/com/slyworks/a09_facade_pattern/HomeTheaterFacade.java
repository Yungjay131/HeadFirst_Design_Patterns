package com.slyworks.a09_facade_pattern;

public class HomeTheaterFacade {
    //region Vars
    //TODO:good place for Dependency Injection
    private Amplifier amp;
    private Tuner tuner;
    private DVDPlayer dvd;
    private CDPlayer cdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;
    //endregion


    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DVDPlayer dvd,
                             CDPlayer cdPlayer,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie){
        System.out.println("About to watch a movie");
        popper.on();
        popper.pop();

        lights.dim();

        screen.down();

        projector.down();
        projector.wideScreenMode();

        amp.on();
        amp.setDVD();
        amp.setSurroundSound();
        amp.setVolume(5);

        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting the movie theater down...");

        popper.off();

        lights.on();

        screen.up();

        projector.off();

        amp.off();

        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
