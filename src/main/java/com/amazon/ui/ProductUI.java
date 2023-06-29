package com.amazon.ui;
/*
 * @(#) ProductUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductUI {
    public static final Target LBL_ARTICLE= Target.the("Product name")
            .located(By.id("productTitle"));
}
