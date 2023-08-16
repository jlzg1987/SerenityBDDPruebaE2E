package com.ecommer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {

    private final String url;

    public OpenPage(String url) {
        this.url = url;
    }

    public static OpenPage loadPageWithUrl(String url) {
        return instrumented(OpenPage.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
                // Puedes agregar más acciones aquí si es necesario
        );
    }
}
