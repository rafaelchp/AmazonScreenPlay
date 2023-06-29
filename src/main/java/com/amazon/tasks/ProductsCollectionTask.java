package com.amazon.tasks;
/*
 * @(#) ProductsCollectionTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.interactions.ClickRamdom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductsCollectionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickRamdom.click()
        );
    }

    public static Performable on(){
        return instrumented(ProductsCollectionTask.class);
    }
}
