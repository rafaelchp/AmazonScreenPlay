package com.amazon.interactions;
/*
 * @(#) ClickRamdom.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.utils.EscrituraExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.amazon.ui.CatalogUI.LBL_NAME_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ClickRamdom implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LBL_NAME_PRODUCT.resolveAllFor(actor);
        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());

        String productName = listProducts.get(indexRandom).getText();
        EscrituraExcel.escrituraExcel("src/test/resources/Data/Data.xlsx",productName,1,1);
        listProducts.get(indexRandom).click();

    }

    public static Performable click(){
        return  instrumented(ClickRamdom.class);
    }
}
