package com.amazon.questions;
/*
 * @(#) ProductValidationQuestion.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.utils.Excel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.amazon.ui.ProductUI.LBL_ARTICLE;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductValidationQuestion implements Question<Boolean> {
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Search");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        WebElementFacade product = LBL_ARTICLE.resolveFor(actor);
        String nameProduct = product.getText();


        return (data.get(0).get("Validation")).equals(nameProduct);
    }

    public static Question<Boolean> from(){
        return  new ProductValidationQuestion();
    }
}
