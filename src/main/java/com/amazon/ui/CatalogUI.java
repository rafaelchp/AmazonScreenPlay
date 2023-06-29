package com.amazon.ui;
/*
 * @(#) CatalogUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class CatalogUI {
    public static final Target LBL_NAME_PRODUCT= Target.the("products collection")
            .locatedBy("//h2/a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal' and not(@is-empty)]");

}
